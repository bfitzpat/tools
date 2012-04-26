package org.jboss.tools.sca.diagram.componentservice.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizard;

public class SCADiagramAddComponentServiceWizard extends BaseWizard {

	private SCADiagramAddComponentServiceStartPage startPage = null;
	private SCADiagramAddComponentServiceJavaPage javaPage = null;
	private SCADiagramAddComponentServiceWSDLPage wsdlPage = null;
	
	public SCADiagramAddComponentServiceWizard() {
		super();
		initPages();
		setWindowTitle("New Component Service");
	}
	
	private void initPages() {
		startPage = new SCADiagramAddComponentServiceStartPage("start");
		javaPage = new SCADiagramAddComponentServiceJavaPage(startPage, "java");
		wsdlPage = new SCADiagramAddComponentServiceWSDLPage(startPage, "wsdl");
	}
	
	@Override
	public boolean performFinish() {
		if (startPage != null && startPage.getComponentServiceName() != null) {
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

	public String getComponentServiceName() {
		if (startPage != null) 
			return startPage.getComponentServiceName();
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
