package org.jboss.tools.sca.diagram.componentservice.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;

public class SCADiagramAddComponentServiceWizard extends Wizard {

	private SCADiagramAddComponentServiceStartPage startPage = null;
	private SCADiagramAddComponentServiceJavaPage javaPage = null;
	
	public SCADiagramAddComponentServiceWizard() {
		super();
		initPages();
		setWindowTitle("New Component Service");
	}
	
	private void initPages() {
		startPage = new SCADiagramAddComponentServiceStartPage("start");
		javaPage = new SCADiagramAddComponentServiceJavaPage(startPage, "java");
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
}
