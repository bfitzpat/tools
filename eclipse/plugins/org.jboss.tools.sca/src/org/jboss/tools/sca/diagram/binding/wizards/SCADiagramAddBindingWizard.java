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

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.jboss.tools.switchyard.model.soap.SOAPBindingType;
import org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType;

public class SCADiagramAddBindingWizard extends Wizard {

	private SCADiagramAddBindingStartPage startPage = null;
	private SCADiagramAddBindingSOAPPage soapPage = null;
	
	public SCADiagramAddBindingWizard() {
		super();
		initPages();
		setWindowTitle("New Binding");
	}
	
	private void initPages() {
		startPage = new SCADiagramAddBindingStartPage("start");
		soapPage = new SCADiagramAddBindingSOAPPage(startPage, "soap");
	}
	
	@Override
	public boolean performFinish() {
		if (startPage != null && startPage.getBinding() != null) {
			return true;
		}
		return false;
	}

	@Override
	public void addPages() {
		addPage(startPage);
		addPage(soapPage);
	}

	public SwitchYardBindingType getBinding() {
		if (startPage != null) 
			return startPage.getBinding();
		return null;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.equals(startPage)) {
			SwitchYardBindingType bindingToTest = startPage.getBinding();
			if (bindingToTest instanceof SOAPBindingType) {
				soapPage.refresh();
				return soapPage;
			}
		}
		return super.getNextPage(page);
	}
}
