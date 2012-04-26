package org.jboss.tools.sca.diagram.binding.wizards;

import org.eclipse.jface.wizard.Wizard;
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
}
