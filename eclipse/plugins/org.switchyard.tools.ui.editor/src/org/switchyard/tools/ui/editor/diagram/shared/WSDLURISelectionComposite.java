/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.diagram.shared;

import java.net.URI;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.ui.editor.impl.SwitchyardSCAEditor;
import org.switchyard.tools.ui.editor.util.OpenFileUtil;

/**
 * @author bfitzpat
 * 
 */
@SuppressWarnings("restriction")
public class WSDLURISelectionComposite {

    private static final String WSDL = "wsdl";

    // change listeners
    private ListenerList _changeListeners;

    private Composite _panel;
    private Text _mWSDLInterfaceURIText;
    private String _sWSDLURI = null;
    private Interface _interface = null;
    private SOAPBindingType _binding = null;
    private String _errorMessage = null;
    private Text _mWSDLPortText;
    private Label _portLabel;
    private String _bindingPort = null;
    private GridData _rootGridData = null;
    private boolean _canEdit = true;
    private boolean _inUpdate = false;
    private boolean _openOnCreate = false;

    private Button _browseBtnWorkspace;
    private Button _browseBtnFile;
    private Link _newWSDLLink;

    /**
     * Constructor.
     */
    public WSDLURISelectionComposite() {
        // empty
    }

    /**
     * @param parent composite parent
     * @param style any style bits
     */
    public void createContents(Composite parent, int style) {

        _panel = new Composite(parent, style);
        GridLayout gl = new GridLayout();
        gl.numColumns = 3;
        _panel.setLayout(gl);
        if (_rootGridData != null) {
            _panel.setLayoutData(_rootGridData);
        }

        _newWSDLLink = new Link(_panel, SWT.NONE);
        String message = "<a>WSDL URI:</a>";
        _newWSDLLink.setText(message);
        _newWSDLLink.setEnabled(_canEdit);
        // link.setSize(400, 100);
        _newWSDLLink.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String oldResult = _mWSDLInterfaceURIText.getText().trim();
                IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
                IPath wsdlPath = modelFile.getParent().getParent().getProjectRelativePath();
                wsdlPath = wsdlPath.append(oldResult);
                IProject project = SwitchyardSCAEditor.getActiveEditor().getModelFile().getProject();
                if (project.exists(wsdlPath)) {
                    IResource wsdlFile = project.findMember(wsdlPath);
                    OpenFileUtil.openFile(wsdlFile);
                } else {
                    String result = getPathToNewWSDL(_panel.getShell(), wsdlPath, _openOnCreate);
                    if (result != null) {
                        _mWSDLInterfaceURIText.setText(result);
                        handleModify();
                        fireChangedEvent(_newWSDLLink);
                    }
                }
            }
        });
        _mWSDLInterfaceURIText = new Text(_panel, SWT.BORDER);
        if (_interface != null && _interface instanceof WSDLPortType) {
            _mWSDLInterfaceURIText.setText(((WSDLPortType) _interface).getInterface());
        }
        _mWSDLInterfaceURIText.setEnabled(_canEdit);
        _mWSDLInterfaceURIText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    handleModify();
                    fireChangedEvent(_mWSDLInterfaceURIText);
                }
            }
        });
        GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
        // uriGD.horizontalSpan = 2;
        _mWSDLInterfaceURIText.setLayoutData(uriGD);

        _browseBtnWorkspace = new Button(_panel, SWT.PUSH);
        _browseBtnWorkspace.setText("Workspace...");
        _browseBtnWorkspace.setEnabled(_canEdit);
        GridData btnGD = new GridData();
        _browseBtnWorkspace.setLayoutData(btnGD);
        _browseBtnWorkspace.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                String result = selectResourceFromWorkspace(_panel.getShell(), WSDL);
                if (result != null) {
                    _mWSDLInterfaceURIText.setText(result);
                    handleModify();
                    fireChangedEvent(_browseBtnWorkspace);
                }
            }
        });

        _portLabel = new Label(_panel, SWT.NONE);
        _portLabel.setText("Port:");
        _mWSDLPortText = new Text(_panel, SWT.BORDER);
        _mWSDLPortText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                if (!_inUpdate) {
                    _bindingPort = _mWSDLPortText.getText().trim();
                    handleModify();
                    fireChangedEvent(_mWSDLPortText);
                }
            }
        });

        GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
        portGD.horizontalSpan = 2;
        _mWSDLPortText.setLayoutData(portGD);

        setVisibilityOfPortControls(this._binding != null);

        // _mWSDLInterfaceURIText.setText("MyService.wsdl");
        // _sWSDLURI = _mWSDLInterfaceURIText.getText();
    }

    private void setVisibilityOfPortControls(boolean flag) {
        _portLabel.setVisible(flag);
        _mWSDLPortText.setVisible(flag);
    }

    private void handleModify() {
        _sWSDLURI = _mWSDLInterfaceURIText.getText().trim();
        if (_interface != null && _interface instanceof WSDLPortType) {
            if (_interface.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        ((WSDLPortType) _interface).setInterface(_sWSDLURI);
                    }
                });

            } else {
                ((WSDLPortType) _interface).setInterface(_sWSDLURI);
            }
        } else if (_binding != null) {
            if (_binding.eContainer() != null) {
                TransactionalEditingDomain domain = SwitchyardSCAEditor.getActiveEditor().getEditingDomain();
                domain.getCommandStack().execute(new RecordingCommand(domain) {
                    @Override
                    protected void doExecute() {
                        _binding.setWsdl(_sWSDLURI);
                        if (_binding.getContextMapper() == null) {
                            ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
                            _binding.setContextMapper(contextMapper);
                        }
                        if (_bindingPort != null && _bindingPort.trim().length() > 0) {
                            try {
                                Integer.parseInt(_bindingPort);
                                _binding.setSocketAddr(":" + _bindingPort);
                            } catch (NumberFormatException nfe) {
                                _binding.setSocketAddr(null);
                            }
                        }
                    }
                });
            } else {
                _binding.setWsdl(_sWSDLURI);
                if (_binding.getContextMapper() == null) {
                    ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
                    _binding.setContextMapper(contextMapper);
                }
                if (_bindingPort != null && _bindingPort.trim().length() > 0) {
                    try {
                        Integer.parseInt(_bindingPort);
                        _binding.setSocketAddr(":" + _bindingPort);
                    } catch (NumberFormatException nfe) {
                        _binding.setSocketAddr(null);
                    }
                }
            }
        }
        validate();
    }

    private void validate() {
        this._errorMessage = null;
        String uriString = _mWSDLInterfaceURIText.getText();

        if (uriString == null || uriString.trim().length() == 0) {
            _errorMessage = "No uri specified";
        } else if (uriString.trim().length() < uriString.length()) {
            _errorMessage = "No spaces allowed in uri";
        } else {
            try {
                URI.create(uriString);
            } catch (IllegalArgumentException e) {
                _errorMessage = "Invalid URI";
            }
        }

        String portString = _bindingPort;
        if (portString != null && portString.trim().length() > 0) {
            try {
                Integer.parseInt(_bindingPort);
            } catch (NumberFormatException nfe) {
                _errorMessage = "Port must be a valid integer";
            }
        }
    }

    /**
     * @return wsdl URI string
     */
    public String getWSDLURI() {
        return this._sWSDLURI;
    }

    /**
     * @return interface
     */
    public Interface getInterface() {
        return _interface;
    }

    /**
     * @return SOAP Binding
     */
    public SOAPBindingType getBinding() {
        return _binding;
    }

    /**
     * @param cInterface interface
     */
    public void setInterface(Interface cInterface) {
        this._interface = cInterface;
        if (_mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
            WSDLPortType wPortType = (WSDLPortType) this._interface;
            _inUpdate = true;
            if (wPortType.getInterface() != null) {
                _mWSDLInterfaceURIText.setText(wPortType.getInterface());
            } else {
                _mWSDLInterfaceURIText.setText("MyService.wsdl");
            }
            _inUpdate = false;
        }
    }

    /**
     * @return string error message
     */
    public String getErrorMessage() {
        return _errorMessage;
    }

    /**
     * If we changed, fire a changed event.
     * 
     * @param source
     */
    private void fireChangedEvent(Object source) {
        ChangeEvent e = new ChangeEvent(source);
        // inform any listeners of the resize event
        if (this._changeListeners != null) {
            Object[] listeners = this._changeListeners.getListeners();
            for (int i = 0; i < listeners.length; ++i) {
                ((ChangeListener) listeners[i]).stateChanged(e);
            }
        }
    }

    /**
     * Add a change listener.
     * 
     * @param listener new listener
     */
    public void addChangeListener(ChangeListener listener) {
        if (this._changeListeners == null) {
            this._changeListeners = new ListenerList();
        }
        this._changeListeners.add(listener);
    }

    /**
     * Remove a change listener.
     * 
     * @param listener to remove
     */
    public void removeChangeListener(ChangeListener listener) {
        this._changeListeners.remove(listener);
    }

    /**
     * @return panel
     */
    public Composite getcPanel() {
        return _panel;
    }

    /**
     * @param switchYardBindingType binding
     */
    public void setcBinding(SOAPBindingType switchYardBindingType) {
        this._binding = switchYardBindingType;
        _sWSDLURI = _binding.getWsdl();
        _bindingPort = _binding.getSocketAddr();
        if (_mWSDLInterfaceURIText != null && !_mWSDLInterfaceURIText.isDisposed()) {
            _inUpdate = true;
            _mWSDLInterfaceURIText.setText(_binding.getWsdl());
            _inUpdate = false;
        }
        if (_mWSDLPortText != null && !_mWSDLPortText.isDisposed()) {
            _inUpdate = true;
            _bindingPort = _binding.getSocketAddr();
            if (_bindingPort.startsWith(":")) {
                _bindingPort = _bindingPort.substring(1);
            }
            _mWSDLPortText.setText(_bindingPort);
            _inUpdate = false;
        }
        setVisibilityOfPortControls(this._binding != null);
    }

    /**
     * @return string port
     */
    public String getsBindingPort() {
        return _bindingPort;
    }

    /**
     * @param flag open on create? true/false
     */
    public void setOpenOnCreate(boolean flag) {
        this._openOnCreate = flag;
    }

    /**
     * @param rootGridData the _rootGridData to set
     */
    public void setRootGridData(GridData rootGridData) {
        this._rootGridData = rootGridData;
    }

    private static String selectResourceFromWorkspace(Shell shell, final String extension) {

        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        IJavaProject javaProject = null;
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                javaProject = JavaCore.create(modelFile.getProject());
            }
        }
        FindResourceDialog dialog = null;
        if (javaProject == null) {
            dialog = new FindResourceDialog(shell, ResourcesPlugin.getWorkspace().getRoot());
        } else {
            dialog = new FindResourceDialog(shell, javaProject.getProject());
        }
        dialog.setTitle("Select WSDL from Project");
        dialog.setInitialPattern("*.wsdl");
        dialog.open();
        Object[] result = dialog.getResult();
        if (result == null || result.length == 0 || !(result[0] instanceof IResource)) {
            return null;
        }
        IJavaElement element = JavaCore.create((IResource) result[0]);
        IResource resource = null;
        if (element != null && element.exists()) {
            try {
                resource = element.getCorrespondingResource();
            } catch (JavaModelException e) {
                e.fillInStackTrace();
            }
        } else {
            resource = ((IResource) result[0]);
        }
        IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(modelFile);
        IResource pkgresource = root.getResource();
        if (pkgresource == null) {
            IJavaElement parent = root.getParent();
            pkgresource = parent.getResource();
        }
        if (resource instanceof IFile) {
            pkgresource = ((IFile) resource).getParent();
        }
        if (pkgresource instanceof IFolder) {
            IFolder folder = (IFolder) pkgresource;
            IFolder parent = (IFolder) folder.getParent();
            IPath outpath  = resource.getProjectRelativePath()
                    .makeRelativeTo(parent.getProjectRelativePath());
            return outpath.toPortableString();
        }

        return null;
    }

    private static String getPathToNewWSDL(final Shell shell, final IPath path, boolean _openWhenFinish) {
        NewWSDLFileWizard newWizard = new NewWSDLFileWizard();
        IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
        IFile modelFile = SwitchyardSCAEditor.getActiveEditor().getModelFile();
        if (modelFile != null) {
            if (modelFile.getProject() != null) { //$NON-NLS-1$
                IJavaProject javaProject = JavaCore.create(modelFile.getProject());
                IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(modelFile);
                selectionToPass = new StructuredSelection(folder);
            }
        }
        if (path != null) {
            newWizard.setStartingFileName(path.lastSegment());
        }
        newWizard.setOpenOnFinish(_openWhenFinish);
        newWizard.init(PlatformUI.getWorkbench(), selectionToPass);
        WizardDialog dialog = new WizardDialog(shell, newWizard);
        if (dialog.open() == Window.OK) {
            return newWizard.getCreatedFilePath();
        }
        return null;
    }

    /**
     * @return flag
     */
    public boolean canEdit() {
        return _canEdit;
    }

    /**
     * @param canEdit flag
     */
    public void setCanEdit(boolean canEdit) {
        this._canEdit = canEdit;
        if (this._mWSDLInterfaceURIText != null && !this._mWSDLInterfaceURIText.isDisposed()) {
            this._mWSDLInterfaceURIText.setEnabled(_canEdit);
        }
        if (this._newWSDLLink != null && !this._newWSDLLink.isDisposed()) {
            this._newWSDLLink.setEnabled(_canEdit);
        }
        if (this._browseBtnFile != null && !this._browseBtnFile.isDisposed()) {
            this._browseBtnFile.setEnabled(_canEdit);
        }
        if (this._browseBtnWorkspace != null && !this._browseBtnWorkspace.isDisposed()) {
            this._browseBtnWorkspace.setEnabled(_canEdit);
        }
    }

}
