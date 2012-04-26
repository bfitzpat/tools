package org.jboss.tools.sca.diagram.componentservice.wizards;

import java.net.URI;

import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.sca.diagram.internal.wizards.IRefreshablePage;

public class SCADiagramAddComponentServiceWSDLPage extends BaseWizardPage implements IRefreshablePage {

	private Text mWSDLInterfaceURIText;
	private String sWSDLURI = null;
	private SCADiagramAddComponentServiceStartPage startPage = null;

	public SCADiagramAddComponentServiceWSDLPage ( SCADiagramAddComponentServiceStartPage start, String pageName) {
		this(pageName);
		this.startPage = start;
	}
	
	protected SCADiagramAddComponentServiceWSDLPage(String pageName) {
		super(pageName);
		setTitle("Specify WSDL Path");
		setDescription("Specify the URI for the WSDL.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 3;
		composite.setLayout(gl);
		//  name
		new Label(composite, SWT.NONE).setText("WSDL URI:");
		mWSDLInterfaceURIText = new Text(composite, SWT.BORDER);
		if (startPage != null && startPage.getInterface() instanceof WSDLPortType) {
			mWSDLInterfaceURIText.setText(((WSDLPortType)startPage.getInterface()).getInterface());
		}
		mWSDLInterfaceURIText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleModify();
			}
		});
		mWSDLInterfaceURIText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
        setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public String getWSDLURI() {
		return this.sWSDLURI;
	}
	
	private void handleModify() {
		sWSDLURI = mWSDLInterfaceURIText.getText().trim();
		if (startPage != null && startPage.getInterface() instanceof WSDLPortType) {
			((WSDLPortType)startPage.getInterface()).setInterface(sWSDLURI);
		}
		validate();
	}

	private void validate() {
		String errorMessage = null;
		String uriString = mWSDLInterfaceURIText.getText();

		if (uriString == null || uriString.trim().length() == 0) {
			errorMessage = "No uri specified";
		}
		else if (uriString.trim().length() < uriString.length() ) {
			errorMessage = "No spaces allowed in uri";
		} else {
			try {
				URI.create(uriString);
			} catch (IllegalArgumentException e) {
				errorMessage = "Invalid URI";
			}
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
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
			mWSDLInterfaceURIText.setText(((WSDLPortType)startPage.getInterface()).getInterface());
		}
	}

}
