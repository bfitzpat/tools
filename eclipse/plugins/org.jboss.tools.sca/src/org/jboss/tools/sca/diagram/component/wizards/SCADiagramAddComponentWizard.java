package org.jboss.tools.sca.diagram.component.wizards;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizard;
import org.jboss.tools.switchyard.model.camel.CamelImplementationType;

public class SCADiagramAddComponentWizard extends BaseWizard {

	private SCADiagramAddComponentStartPage startPage = null;
	private SCADiagramAddComponentImplementationCamelPage camelPage = null;
	
	public SCADiagramAddComponentWizard() {
		super();
		initPages();
		setWindowTitle("New Component");
	}
	
	private void initPages() {
		startPage = new SCADiagramAddComponentStartPage("start");
		camelPage = new SCADiagramAddComponentImplementationCamelPage(startPage, "camel");
	}
	
	@Override
	public boolean performFinish() {
		if (startPage != null && startPage.getComponentName() != null) {
			return true;
		}
		return false;
	}

	@Override
	public void addPages() {
		addPage(startPage);
		addPage(camelPage);
	}

	public String getComponentName() {
		if (startPage != null) 
			return startPage.getComponentName();
		return null;
	}

	public Implementation getImplementation() {
		if (startPage != null) 
			return startPage.getImplementation();
		return null;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.equals(startPage)) {
			Implementation interfaceToTest = startPage.getImplementation();
			if (interfaceToTest instanceof CamelImplementationType) {
				camelPage.refresh();
				return camelPage;
			}
		}
		return super.getNextPage(page);
	}
}
