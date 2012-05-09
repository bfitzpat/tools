/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.apache.maven.model.Resource;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2e.core.project.MavenProjectUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.switchyard.tools.cxf.Java2WSDLOptions;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.common.ISwitchYardProject;
import org.switchyard.tools.ui.explorer.IComponentNode;
import org.switchyard.tools.ui.explorer.IComponentReference;
import org.switchyard.tools.ui.explorer.IComponentService;
import org.switchyard.tools.ui.explorer.IReferenceNode;
import org.switchyard.tools.ui.explorer.IServiceNode;
import org.switchyard.tools.ui.explorer.ISwitchYardNode;
import org.switchyard.tools.ui.operations.CreateWSDLFromJavaOperation;

/**
 * Java2WSDLWizard
 * 
 * <p/>
 * Wizard supporting WSDL file creation from a SwitchYard service.
 * 
 * @author Rob Cernich
 */
public class Java2WSDLWizard extends BasicNewResourceWizard {

    private Java2WSDLOptionsWizardPage _optionsPage;
    private WizardNewFileCreationPage _filePage;
    private IFile _wsdlFile;

    /**
     * Create a new Java2WSDLWizard.
     */
    public Java2WSDLWizard() {
        setNeedsProgressMonitor(true);
    }

    /**
     * @return the generated WSDL file.
     */
    public IFile getWSDLFile() {
        return _wsdlFile;
    }

    @Override
    public void addPages() {
        _filePage = new WizardNewFileCreationPage("NewWSDLFilePage", StructuredSelection.EMPTY) {
            @Override
            public void createControl(Composite parent) {
                super.createControl(parent);
                setPageComplete(validatePage());
            }

            // disable linking
            @Override
            protected void createAdvancedControls(Composite parent) {
            }

            @Override
            protected IStatus validateLinkedResource() {
                return Status.OK_STATUS;
            }

            @Override
            protected void createLinkTarget() {
            }
        };
        _filePage.setFileExtension("wsdl");
        _filePage.setTitle("New WSDL File");
        setFilePageDefaults();
        addPage(_filePage);

        _optionsPage = new Java2WSDLOptionsWizardPage();
        _optionsPage.init(getSelection());
        addPage(_optionsPage);
    }

    @Override
    public boolean performFinish() {
        final Java2WSDLOptions options = new Java2WSDLOptions();
        options.setLocationURI(_optionsPage.getLocationURI());
        options.setServiceInterface(_optionsPage.getServiceInterface());
        options.setTargetNamespace(_optionsPage.getTargetNamespace());
        options.setUseImportedSchema(_optionsPage.isUseImportedSchema());

        _wsdlFile = ResourcesPlugin.getWorkspace().getRoot()
                .getFile(_filePage.getContainerFullPath().append(_filePage.getFileName()));

        IRunnableWithProgress op = new IRunnableWithProgress() {
            @Override
            public void run(IProgressMonitor monitor) {
                try {
                    CreateWSDLFromJavaOperation op = new CreateWSDLFromJavaOperation(options, getWSDLFile());
                    op.run(monitor);
                    final IStatus status = op.getStatus();
                    Activator.getDefault().getLog().log(status);
                    if (status.getSeverity() > IStatus.INFO) {
                        getContainer().getShell().getDisplay().syncExec(new Runnable() {
                            @Override
                            public void run() {
                                ErrorDialog.openError(getContainer().getShell(), null,
                                        "An error occurred generating schema files associated with the WSDL.", status);
                            }
                        });
                    }
                } catch (final CoreException e) {
                    Activator.getDefault().getLog().log(e.getStatus());
                    getContainer().getShell().getDisplay().syncExec(new Runnable() {
                        @Override
                        public void run() {
                            ErrorDialog.openError(getContainer().getShell(), null,
                                    "An error occurred generating the WSDL.", e.getStatus());
                        }
                    });
                }
            }
        };

        try {
            getContainer().run(false, false, op);
            selectAndReveal(getWSDLFile());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        return true;
    }

    private void setFilePageDefaults() {
        IStructuredSelection selection = getSelection();
        if (selection == null || selection.isEmpty()) {
            return;
        }
        for (Object selected : selection.toList()) {
            if (selected instanceof IContainer) {
                _filePage.setContainerFullPath(((IContainer) selected).getFullPath());
                return;
            } else if (selected instanceof IFile) {
                IFile file = (IFile) selected;
                _filePage.setContainerFullPath(file.getParent().getFullPath());
                _filePage.setFileName(getBaseFileName(file.getName()));
                return;
            } else if (selected instanceof IJavaElement) {
                IJavaElement ije = (IJavaElement) selected;
                IResource javaResource = ije.getResource();
                if (javaResource != null) {
                    if (javaResource.getType() == IResource.FILE) {
                        _filePage.setContainerFullPath(javaResource.getParent().getFullPath());
                    } else {
                        _filePage.setContainerFullPath(javaResource.getFullPath());
                    }
                }
                int elementType = ije.getElementType();
                if (elementType == IJavaElement.TYPE) {
                    _filePage.setFileName(ije.getElementName());
                } else if (elementType == IJavaElement.COMPILATION_UNIT) {
                    IType primaryType = ((ICompilationUnit) ije).findPrimaryType();
                    if (primaryType == null) {
                        getBaseFileName(ije.getElementName());
                    } else {
                        _filePage.setFileName(primaryType.getElementName());
                    }
                }
            } else if (selected instanceof ISwitchYardNode) {
                ISwitchYardNode switchYardNode = (ISwitchYardNode) selected;
                ISwitchYardProject switchYardProject = switchYardNode.getRoot().getSwitchYardProject();
                MavenProject mavenProject = switchYardProject.getMavenProject();
                if (mavenProject == null) {
                    _filePage.setContainerFullPath(switchYardProject.getProject().getFullPath());
                } else {
                    IPath path = null;
                    IProject project = switchYardProject.getProject();
                    for (Resource resource : mavenProject.getResources()) {
                        path = MavenProjectUtils.getProjectRelativePath(project, resource.getDirectory());
                        if (path != null) {
                            path = project.getFullPath().append(path);
                            break;
                        }
                    }
                    if (path == null) {
                        path = project.getFullPath();
                    }
                    _filePage.setContainerFullPath(path);
                }
                if (switchYardNode instanceof IServiceNode || switchYardNode instanceof IReferenceNode
                        || switchYardNode instanceof IComponentNode || switchYardNode instanceof IComponentService
                        || switchYardNode instanceof IComponentReference) {
                    _filePage.setFileName(switchYardNode.getName());
                }
                return;
            }
        }
    }

    private String getBaseFileName(String name) {
        int dot = name.lastIndexOf('.');
        if (dot < 0) {
            return name;
        }
        return name.substring(0, dot);
    }

}
