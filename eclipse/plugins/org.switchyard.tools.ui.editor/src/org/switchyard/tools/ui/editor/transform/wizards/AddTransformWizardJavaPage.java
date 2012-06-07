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
package org.switchyard.tools.ui.editor.transform.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.transform.JavaTransformType1;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.BaseWizardPage;
import org.switchyard.tools.ui.editor.diagram.internal.wizards.IRefreshablePage;

/**
 * @author bfitzpat
 * 
 */
public class AddTransformWizardJavaPage extends BaseWizardPage implements IRefreshablePage {

    private AddTransformWizardStartPage _startPage = null;
    private JavaTransformComposite _javaComposite = null;

    /**
     * @param start Start page reference
     * @param pageName String for name
     */
    public AddTransformWizardJavaPage(AddTransformWizardStartPage start, String pageName) {
        this(pageName);
        this._startPage = start;
    }

    protected AddTransformWizardJavaPage(String pageName) {
        super(pageName);
        setTitle("Specify Java Transform Details");
        setDescription("Specify pertinent details for your Java transform.");
    }

    @Override
    public void createControl(Composite parent) {
        _javaComposite = new JavaTransformComposite();
        if (_startPage != null && _startPage.getTransform() != null
                && _startPage.getTransform() instanceof JavaTransformType1) {
            _javaComposite.setTransform((JavaTransformType1) _startPage.getTransform());
        }
        _javaComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_javaComposite.getErrorMessage());
                setPageComplete(_javaComposite.getErrorMessage() == null);
            }
        });
        _javaComposite.createContents(parent, SWT.NONE);

        setControl(_javaComposite.getPanel());

        setErrorMessage(null);
    }

    @Override
    public boolean getSkippable() {
        if (this._startPage != null && this._startPage.getTransform() != null
                && _startPage.getTransform() instanceof JavaTransformType1) {
            return false;
        }
        return true;
    }

    @Override
    public void refresh() {
        if (_startPage != null && _startPage.getTransform() instanceof JavaTransformType1) {
            if (_javaComposite != null && _javaComposite.getPanel() != null) {
                _javaComposite.setTransform((JavaTransformType1) _startPage.getTransform());
                _javaComposite.validate();
                setPageComplete(_javaComposite.getErrorMessage() == null);
                setErrorMessage(null);
            }
        }
    }

    @Override
    public boolean isPageComplete() {
        return _javaComposite.getErrorMessage() == null && _javaComposite.getTransform() != null;
    }
}
