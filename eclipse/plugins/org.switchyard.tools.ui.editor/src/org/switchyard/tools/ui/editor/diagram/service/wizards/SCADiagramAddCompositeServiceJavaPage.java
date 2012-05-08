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
package org.switchyard.tools.ui.editor.diagram.service.wizards;

import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;
import org.switchyard.tools.ui.editor.diagram.shared.JavaInterfaceSelectionComposite;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramAddCompositeServiceJavaPage extends BaseWizardPage implements IRefreshablePage {

    private SCADiagramAddCompositeServiceStartPage _startPage = null;
    private SCADiagramAddInterfaceStartPage _intfcStartPage = null;
    private JavaInterfaceSelectionComposite _javaInterfaceComposite = null;

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddCompositeServiceJavaPage(SCADiagramAddCompositeServiceStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    /**
     * @param start start page
     * @param pageName page name
     */
    public SCADiagramAddCompositeServiceJavaPage(SCADiagramAddInterfaceStartPage start, String pageName) {
        this(pageName);
        this._intfcStartPage = start;
    }

    protected SCADiagramAddCompositeServiceJavaPage(String pageName) {
        super(pageName);
        setTitle("Specify Java Class");
        setDescription("Specify the fully qualified class name for the Java interface.");
    }

    @Override
    public void createControl(Composite parent) {
        _javaInterfaceComposite = new JavaInterfaceSelectionComposite();
        Interface intfc = getInterfaceFromStartPage();
        if (intfc instanceof JavaInterface) {
            _javaInterfaceComposite.setInterface(intfc);
        }
        _javaInterfaceComposite.createContents(parent, SWT.NONE);

        setControl(_javaInterfaceComposite.getcPanel());
    }

    /**
     * @return java interface string
     */
    public String getJavaInterfaceString() {
        return _javaInterfaceComposite.getInterfaceClassName();
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null || this._intfcStartPage != null) {
            Interface intfc = getInterfaceFromStartPage();
            if (intfc instanceof JavaInterface) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void refresh() {
        if (this._startPage != null || this._intfcStartPage != null) {
            Interface intfc = getInterfaceFromStartPage();
            if (intfc instanceof JavaInterface) {
                _javaInterfaceComposite.setInterface(intfc);
            }
        }
    }

    private Interface getInterfaceFromStartPage() {
        if (_startPage != null) {
            if (_startPage instanceof SCADiagramAddCompositeServiceStartPage) {
                SCADiagramAddCompositeServiceStartPage compositeSvcStart = (SCADiagramAddCompositeServiceStartPage) _startPage;
                return compositeSvcStart.getInterface();
            }
        } else if (_intfcStartPage != null) {
            if (_intfcStartPage instanceof SCADiagramAddInterfaceStartPage) {
                SCADiagramAddInterfaceStartPage compositeSvcStart = (SCADiagramAddInterfaceStartPage) _intfcStartPage;
                return compositeSvcStart.getInterface();
            }
        }
        return null;
    }
}

