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
package org.jboss.tools.sca.diagram.componentreference.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.sca.diagram.internal.wizards.IRefreshablePage;
import org.jboss.tools.sca.diagram.shared.WSDLURISelectionComposite;

public class SCADiagramAddComponentReferenceWSDLPage extends BaseWizardPage implements IRefreshablePage {

	private WSDLURISelectionComposite uriComposite = null;
	private SCADiagramAddComponentReferenceStartPage startPage = null;

	public SCADiagramAddComponentReferenceWSDLPage ( SCADiagramAddComponentReferenceStartPage start, String pageName) {
		this(pageName);
		this.startPage = start;
	}
	
	protected SCADiagramAddComponentReferenceWSDLPage(String pageName) {
		super(pageName);
		setTitle("Specify WSDL Path");
		setDescription("Specify the URI for the WSDL.");
	}

	@Override
	public void createControl(Composite parent) {
		uriComposite = new WSDLURISelectionComposite();
		if (startPage != null && startPage.getInterface() != null) {
			uriComposite.setInterface(startPage.getInterface());
		}
		uriComposite.addChangeListener(new ChangeListener(){
			@Override
			public void stateChanged(ChangeEvent arg0) {
				setErrorMessage(uriComposite.getErrorMessage());
				setPageComplete(uriComposite.getErrorMessage() == null);
			}
		});
		uriComposite.createContents(parent, SWT.NONE);
		
        setControl(uriComposite.getcPanel());

		setErrorMessage(null);
	}

	public String getWSDLURI() {
		return this.uriComposite.getWSDLURI();
	}
	
	@Override
	public boolean getSkippable() {
		if (this.startPage != null && this.startPage.getInterface() != null) {
			if (startPage.getInterface() instanceof WSDLPortType) {
				return false;
			} else {
				return true;
			}
		}
		return super.getSkippable();
	}

	@Override
	public void refresh() {
		if (startPage != null && startPage.getInterface() instanceof WSDLPortType) {
			if (uriComposite != null && uriComposite.getcPanel() != null) {
				uriComposite.setInterface(startPage.getInterface());
			}
		}
	}

}
