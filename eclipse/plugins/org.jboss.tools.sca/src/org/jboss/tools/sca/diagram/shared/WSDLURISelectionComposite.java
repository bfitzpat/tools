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
package org.jboss.tools.sca.diagram.shared;

import java.net.URI;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
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

public class WSDLURISelectionComposite {

	// change listeners
	private ListenerList changeListeners;

	private Composite cPanel;
	private Text mWSDLInterfaceURIText;
	private String sWSDLURI = null;
	private Interface cInterface = null;
	private SOAPBindingType cBinding = null;
	private String errorMessage = null;
	private Text mWSDLPortText;
	private Label mPortLabel;
	private String sBindingPort = null;

	public WSDLURISelectionComposite() {
		// empty
	}
	
	public void createContents(Composite parent, int style) {
		
		// TODO: Add support for choosing an existing WSDL in the project (relative path)
		// TODO: Add support for importing a WSDL from the file system (into the project, ends up being relative path)
		// TODO: Add support for creating a new WSDL in the project (ends up being relative path)
		
		cPanel = new Composite(parent, style);
		GridLayout gl = new GridLayout();
		gl.numColumns = 3;
		cPanel.setLayout(gl);
		//  name
		new Label(cPanel, SWT.NONE).setText("WSDL URI:");
		mWSDLInterfaceURIText = new Text(cPanel, SWT.BORDER);
		if (cInterface != null && cInterface instanceof WSDLPortType) {
			mWSDLInterfaceURIText.setText(((WSDLPortType)cInterface).getInterface());
		}
		mWSDLInterfaceURIText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleModify();
				fireChangedEvent(mWSDLInterfaceURIText);
			}
		});
		GridData uriGD = new GridData(GridData.FILL_HORIZONTAL);
		uriGD.horizontalSpan = 2;
		mWSDLInterfaceURIText.setLayoutData(uriGD);
	
		mPortLabel = new Label(cPanel, SWT.NONE);
		mPortLabel.setText("Port:");
		mWSDLPortText = new Text(cPanel, SWT.BORDER);
		mWSDLPortText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				sBindingPort = mWSDLPortText.getText().trim();
				handleModify();
				fireChangedEvent(mWSDLPortText);
			}
		});
	
		GridData portGD = new GridData(GridData.FILL_HORIZONTAL);
		portGD.horizontalSpan = 2;
		mWSDLPortText.setLayoutData(portGD);
		
		setVisibilityOfPortControls(this.cBinding != null);
	}
	
	private void setVisibilityOfPortControls ( boolean flag ) {
		mPortLabel.setVisible(flag);
		mWSDLPortText.setVisible(flag);
	}

	private void handleModify() {
		sWSDLURI = mWSDLInterfaceURIText.getText().trim();
		if (cInterface != null && cInterface instanceof WSDLPortType) {
			((WSDLPortType)cInterface).setInterface(sWSDLURI);
		}
		if (cBinding != null) {
			cBinding.setWsdl(sWSDLURI);
			if (sBindingPort != null && sBindingPort.trim().length() > 0) {
				try {
					Integer.parseInt(sBindingPort);
					cBinding.setSocketAddr(sBindingPort);
				} catch (NumberFormatException nfe) {
					cBinding.setSocketAddr(null);
				}
			}
			ContextMapperType contextMapper = SwitchyardFactory.eINSTANCE.createContextMapperType();
			cBinding.setContextMapper(contextMapper);
		}
		validate();
	}

	private void validate() {
		this.errorMessage = null;
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

		String portString = sBindingPort;
		if (portString != null && portString.trim().length() > 0) {
			try {
				Integer.parseInt(sBindingPort);
			} catch (NumberFormatException nfe) {
				errorMessage = "Port must be a valid integer";
			}
		}
	}

	public String getWSDLURI() {
		return this.sWSDLURI;
	}

	public Interface getInterface() {
		return cInterface;
	}

	public void setInterface(Interface cInterface) {
		this.cInterface = cInterface;
		if (mWSDLInterfaceURIText != null && !mWSDLInterfaceURIText.isDisposed())
			mWSDLInterfaceURIText.setText(((WSDLPortType)this.cInterface).getInterface());		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * If we changed, fire a changed event.
	 * 
	 * @param source
	 */
	private void fireChangedEvent(Object source) {
		ChangeEvent e = new ChangeEvent(source);
		// inform any listeners of the resize event
		Object[] listeners = this.changeListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((ChangeListener) listeners[i]).stateChanged(e);
		}
	}

	/**
	 * Add a change listener
	 * 
	 * @param listener
	 */
	public void addChangeListener(ChangeListener listener) {
		if (this.changeListeners == null) {
			this.changeListeners = new ListenerList();
		}
		this.changeListeners.add(listener);
	}

	/**
	 * Remove a change listener.
	 * 
	 * @param listener
	 */
	public void removeChangeListener(ChangeListener listener) {
		this.changeListeners.remove(listener);
	}

	public Composite getcPanel() {
		return cPanel;
	}

	public void setcBinding( SOAPBindingType switchYardBindingType) {
		this.cBinding = switchYardBindingType;
		if (mWSDLInterfaceURIText != null && !mWSDLInterfaceURIText.isDisposed())
			mWSDLInterfaceURIText.setText(cBinding.getWsdl());		
		setVisibilityOfPortControls(this.cBinding != null);
	}

	public String getsBindingPort() {
		return sBindingPort;
	}
}
