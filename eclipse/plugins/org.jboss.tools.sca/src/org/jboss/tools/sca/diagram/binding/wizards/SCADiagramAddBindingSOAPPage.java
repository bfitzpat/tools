package org.jboss.tools.sca.diagram.binding.wizards;

import java.net.URI;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.jboss.tools.switchyard.model.soap.SOAPBindingType;
import org.jboss.tools.switchyard.model.switchyard.ContextMapperType;
import org.jboss.tools.switchyard.model.switchyard.SwitchyardFactory;

public class SCADiagramAddBindingSOAPPage extends WizardPage {

	private Text mWSDLURIText;
	private String sBindingURI = null;
	private Text mWSDLPortText;
	private String sBindingPort = null;
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

		new Label(composite, SWT.NONE).setText("WSDL URI:");
		mWSDLURIText = new Text(composite, SWT.BORDER);
		mWSDLURIText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				sBindingURI = mWSDLURIText.getText().trim();
				handleModify();
			}
		});

		mWSDLURIText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		new Label(composite, SWT.NONE).setText("WSDL Port:");
		mWSDLPortText = new Text(composite, SWT.BORDER);
		mWSDLPortText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				sBindingPort = mWSDLPortText.getText().trim();
				handleModify();
			}
		});

		mWSDLPortText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public String getBindingURI() {
		return this.sBindingURI;
	}
	
	public String getBindingPort() {
		return this.sBindingPort;
	}

	private void handleModify() {
		SOAPBindingType binding = (SOAPBindingType) startPage.getBinding();
		binding.setWsdl(sBindingURI);
		if (sBindingPort != null && sBindingPort.trim().length() > 0) {
			try {
				Integer.parseInt(sBindingPort);
				binding.setSocketAddr(sBindingPort);
			} catch (NumberFormatException nfe) {
				binding.setSocketAddr(null);
			}
		}
		ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
		binding.setContextMapper(contextMapper);
		validate();
	}

	private void validate() {
		String errorMessage = null;
		String uriString = sBindingURI;

		if (uriString == null || uriString.trim().length() == 0) {
			errorMessage = "No URI specified";
		}
		else if (uriString.trim().length() < uriString.length() ) {
			errorMessage = "No spaces allowed in URI";
		} else {
			try {
				URI.create(uriString);
			} catch (IllegalArgumentException e) {
				errorMessage = "Invalid URI";
			}
		}
		
		String portString = sBindingPort;
		if (portString != null && portString.trim().length() > 0) {
			try {
				Integer.parseInt(sBindingPort);
			} catch (NumberFormatException nfe) {
				errorMessage = "Port must be a valid integer";
			}
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}
	
}
