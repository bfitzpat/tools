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

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizard;

public class SCADiagramAddComponentReferenceWizard extends BaseWizard {

	private SCADiagramAddComponentReferenceStartPage startPage = null;
	private SCADiagramAddComponentReferenceJavaPage javaPage = null;
	private SCADiagramAddComponentReferenceWSDLPage wsdlPage = null;
	
	public SCADiagramAddComponentReferenceWizard() {
		super();
		initPages();
		setWindowTitle("New Component Reference");
	}
	
	private void initPages() {
		startPage = new SCADiagramAddComponentReferenceStartPage("start");
		javaPage = new SCADiagramAddComponentReferenceJavaPage(startPage, "java");
		wsdlPage = new SCADiagramAddComponentReferenceWSDLPage(startPage, "wsdl");
	}
	
	@Override
	public boolean performFinish() {
		if (startPage != null && startPage.getComponentReferenceName() != null) {
			return true;
		}
		return false;
	}

	@Override
	public void addPages() {
		addPage(startPage);
		addPage(javaPage);
		addPage(wsdlPage);
	}

	public String getComponentReferenceName() {
		if (startPage != null) 
			return startPage.getComponentReferenceName();
		return null;
	}

	public Interface getInterface() {
		if (startPage != null) 
			return startPage.getInterface();
		return null;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.equals(startPage)) {
			Interface interfaceToTest = startPage.getInterface();
			if (interfaceToTest instanceof JavaInterface) {
				javaPage.refresh();
				return javaPage;
			} else if (interfaceToTest instanceof WSDLPortType) {
				wsdlPage.refresh();
				return wsdlPage;
			}
		}
		return super.getNextPage(page);
	}
}
