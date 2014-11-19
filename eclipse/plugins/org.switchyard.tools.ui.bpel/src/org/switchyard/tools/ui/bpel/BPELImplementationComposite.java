/*************************************************************************************
 * Copyright (c) 2013 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.bpel;

import javax.xml.namespace.QName;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.soa.sca.sca1_1.model.sca.BPELImplementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.PlatformResourceAdapterFactory;
import org.switchyard.tools.ui.common.ClasspathResourceSelectionDialog;
import org.switchyard.tools.ui.editor.property.AbstractChangeAwareModelComposite;
import org.switchyard.tools.ui.editor.property.ICompositeContainer;

/**
 * @author bfitzpat
 * 
 */
public class BPELImplementationComposite extends AbstractChangeAwareModelComposite<Component> {

    private Composite _panel;
    private BPELImplementation _implementation;
//    private Link _newBPELLink;
    private Text _bpelFileText;
    private Button _browseBPELButton;
    private IProject _project;
    private boolean _updating;

    /**
     * Constructor.
     * @param container Composite container
     * @param parent Parent we're adding to
     * @param style Any style bits to pass along
     */
    public BPELImplementationComposite(ICompositeContainer container, Composite parent, int style) {
        super(Component.class, container, parent, style);

        final FormToolkit factory = getWidgetFactory();
        _panel = this;
        _panel.setLayout(new GridLayout(3, false));

//        _newBPELLink = new Link(_panel, SWT.NONE);
//        factory.adapt(_newBPELLink, false, false);
//        _newBPELLink.setText("<a>" + Messages.BPELImplementationComposite_newBPELFileLinkLabel + "</a>"); //$NON-NLS-1$ //$NON-NLS-2$
//        _newBPELLink.addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent event) {
//                openFile();
//            }
//
//        });

        factory.createLabel(_panel, Messages.BPELImplementationComposite_newBPELFileLinkLabel);
        
        _bpelFileText = factory.createText(_panel, "", SWT.READ_ONLY); //$NON-NLS-1$
        _bpelFileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        _bpelFileText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent event) {
                handleModify(_bpelFileText);
            }
        });

        _browseBPELButton = factory.createButton(_panel, Messages.BPELImplementationComposite_browseBPELFileButton, SWT.PUSH);
        _browseBPELButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent event) {
                handleBrowse();
            }

        });

        adaptChildren(this);
    }
    
    protected void handleModify(Control control) {
        final QName newValue = _bpelFileText.getText().length() == 0 ? null : QName.valueOf(_bpelFileText
                .getText());
        if (!_updating
                && ((newValue == null && _implementation.getProcess() != null) || (newValue != null && !newValue
                        .equals(_implementation.getProcess())))) {
            wrapOperation(new Runnable() {
                public void run() {
                    _implementation.setProcess(newValue);
                }
            });
        }
    }

    @Override
    public void refresh() {
        _implementation = null;
        final Component bo = getTargetObject();
        if (bo != null) {
            _implementation = (BPELImplementation) ((Component) bo).getImplementation();
            _project = PlatformResourceAdapterFactory.getContainingProject(_implementation);
        }
        _updating = true;
        try {
            if (_implementation != null && _implementation.getProcess() != null && _bpelFileText != null) {
                _bpelFileText.setText(_implementation.getProcess().toString());
            } else {
                handleModify(_bpelFileText);
            }
        } finally {
            _updating = false;
        }
    }

//    private void openFile() {
//        final IFile resource = BPELResourceAdapterFactory.getFileForObject(_implementation, _project);
//        if (resource != null) {
//            try {
//                final IWorkbench wb = PlatformUI.getWorkbench();
//                final IWorkbenchPage activePage = wb.getActiveWorkbenchWindow().getActivePage();
//                IDE.openEditor(activePage, resource);
//            } catch (PartInitException e) {
//                Activator.getDefault().getLog().log(e.getStatus());
//            }
//        }
//    }

    private void handleBrowse() {
        IContainer container;
        if (_project == null) {
            container = ResourcesPlugin.getWorkspace().getRoot();
        } else {
            container = _project.getProject();
        }
        ClasspathResourceSelectionDialog dialog = new ClasspathResourceSelectionDialog(_panel.getShell(), container,
                "bpel"); //$NON-NLS-1$
        if (dialog.open() == SelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0 && result[0] instanceof IFile) {
                IFile bpelFile = (IFile) result[0];

                if (_implementation == null) {
                    _implementation = ScaFactory.eINSTANCE.createBPELImplementation();
                }

                // load process
                final QName processName = Activator.getDefault().getProcessForFile(bpelFile);
                wrapOperation(new Runnable() {
                    public void run() {
                        _implementation.setProcess(processName);
                    }
                });

                // update the text box, which should trigger a validate
                _bpelFileText.setText(processName.toString());
                handleModify(_bpelFileText);
                fireChangedEvent(_bpelFileText);
            }
        }
    }

}
