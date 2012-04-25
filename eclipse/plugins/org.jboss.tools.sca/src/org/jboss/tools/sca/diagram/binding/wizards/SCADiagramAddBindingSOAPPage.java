package org.jboss.tools.sca.diagram.binding.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SCADiagramAddBindingSOAPPage extends WizardPage {

	private Text mBindingName;
	private String sBindingURI = null;
	private SCADiagramAddBindingStartPage startPage = null;

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
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		composite.setLayout(gl);

		new Label(composite, SWT.NONE).setText("URI:");
		mBindingName = new Text(composite, SWT.BORDER);
		mBindingName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleModify();
			}
		});

		mBindingName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public String getComponentServiceName() {
		return this.sBindingURI;
	}
	
	private void handleModify() {
		startPage.getBinding().setUri(sBindingURI);
		startPage.getBinding().setName(mBindingName.getText().trim());
		validate();
	}

	private void validate() {
		String errorMessage = null;
		String cpName = mBindingName.getText();

		if (cpName == null || cpName.trim().length() == 0) {
			errorMessage = "No name specified";
		}
		else if (cpName.trim().length() < cpName.length() ) {
			errorMessage = "No spaces allowed in name";
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}
	
}
