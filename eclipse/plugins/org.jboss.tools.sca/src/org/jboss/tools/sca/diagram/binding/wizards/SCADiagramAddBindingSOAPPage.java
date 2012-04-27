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
package org.jboss.tools.sca.diagram.binding.wizards;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.sca.diagram.internal.wizards.IRefreshablePage;
import org.jboss.tools.sca.diagram.shared.WSDLURISelectionComposite;
import org.jboss.tools.switchyard.model.soap.SOAPBindingType;

public class SCADiagramAddBindingSOAPPage extends BaseWizardPage  implements IRefreshablePage {

	private SCADiagramAddBindingStartPage startPage = null;
	private WSDLURISelectionComposite uriComposite = null;

	public SCADiagramAddBindingSOAPPage ( SCADiagramAddBindingStartPage start, String pageName) {
		this(pageName);
		this.startPage = start;
	}
	
	protected SCADiagramAddBindingSOAPPage(String pageName) {
		super(pageName);
		setTitle("Specify SOAP Binding Details");
		setDescription("Specify pertinent details for your SOAP Binding.");
	}

	@Override
	public void createControl(Composite parent) {
		uriComposite = new WSDLURISelectionComposite();
		if (startPage != null && startPage.getBinding() != null && startPage.getBinding() instanceof SOAPBindingType) {
			uriComposite.setcBinding((SOAPBindingType) startPage.getBinding());
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

	public String getBindingURI() {
		return this.uriComposite.getWSDLURI();
	}
	
	public String getBindingPort() {
		return  this.uriComposite.getsBindingPort();
	}

	@Override
	public boolean getSkippable() {
		if (this.startPage != null && this.startPage.getBinding() != null) {
			if (startPage.getBinding() instanceof SOAPBindingType) {
				return false;
			} else {
				return true;
			}
		}
		return super.getSkippable();
	}

	@Override
	public void refresh() {
		if (startPage != null && startPage.getBinding() instanceof SOAPBindingType) {
			if (uriComposite != null && uriComposite.getcPanel() != null) {
				uriComposite.setcBinding((SOAPBindingType) startPage.getBinding());
			}
		}
	}
}
