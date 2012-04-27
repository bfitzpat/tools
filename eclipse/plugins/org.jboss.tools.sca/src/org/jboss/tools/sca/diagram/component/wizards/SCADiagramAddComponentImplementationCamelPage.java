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
package org.jboss.tools.sca.diagram.component.wizards;

import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.sca.diagram.internal.wizards.IRefreshablePage;
import org.jboss.tools.switchyard.model.camel.CamelImplementationType;
import org.jboss.tools.switchyard.model.spring.RouteDefinition;
import org.jboss.tools.switchyard.model.spring.SpringFactory;
import org.jboss.tools.switchyard.model.spring.ToDefinition;

public class SCADiagramAddComponentImplementationCamelPage extends BaseWizardPage implements IRefreshablePage {

	private Text mCamelRouteToText;
	private String sCamelRouteTo = null;
	private IWizardPage startPage = null;

	public SCADiagramAddComponentImplementationCamelPage ( IWizardPage start, String pageName) {
		this(pageName);
		this.startPage = start;
		
	}
	
	protected SCADiagramAddComponentImplementationCamelPage(String pageName) {
		super(pageName);
		setTitle("Specify Camel Implementation Details");
		setDescription("Specify the details for the Camel route.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 3;
		composite.setLayout(gl);
		// Component service name
		new Label(composite, SWT.NONE).setText("To:");
		mCamelRouteToText = new Text(composite, SWT.BORDER);
		mCamelRouteToText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleModify();
			}
		});
		mCamelRouteToText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
        setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public String getCamelRouteString() {
		return this.sCamelRouteTo;
	}
	
	private Implementation getImplementationFromStartPage() {
		if (startPage != null) {
			if (startPage instanceof SCADiagramAddComponentStartPage) {
				SCADiagramAddComponentStartPage componentStart = 
						(SCADiagramAddComponentStartPage) startPage;
				return componentStart.getImplementation();
			} else if (startPage instanceof SCADiagramAddImplementationStartPage) {
				SCADiagramAddImplementationStartPage implementationStart = 
						(SCADiagramAddImplementationStartPage) startPage;
				return implementationStart.getImplementation();
			}
		}
		return null;
	}
	
	private void handleModify() {
		sCamelRouteTo = mCamelRouteToText.getText().trim();
		validate();
		if (startPage != null) {
			Diagram diagram = null;
			if (getWizard() instanceof SCADiagramAddImplementationWizard) {
				diagram = ((SCADiagramAddImplementationWizard) getWizard()).getDiagram();
			} else if (getWizard() instanceof SCADiagramAddComponentWizard) {
				diagram = ((SCADiagramAddComponentWizard) getWizard()).getDiagram();
			}
			if (diagram != null) {
				ModelHandler mh;
				try {
					mh = ModelHandlerLocator.getModelHandler(diagram.eResource());
					Implementation impl = getImplementationFromStartPage();
					if (impl instanceof CamelImplementationType) {
						CamelImplementationType camelImpl = (CamelImplementationType) impl;
						RouteDefinition defn = camelImpl.getRoute();
						boolean alreadyExists = false;
						if (defn != null) {
							EList<ToDefinition> toDefs = defn.getTo();
							for (ToDefinition toDefinition : toDefs) {
								if (toDefinition.getUri().contentEquals(sCamelRouteTo)) {
									alreadyExists = true;
									break;
								}
							}
						}
						EList<ToDefinition> toDefs = null;
						if (!alreadyExists) {
							defn = mh.createRouteDefinition(camelImpl);
							toDefs = defn.getTo();
						} else {
							toDefs = defn.getTo();
						}
						if (defn != null && toDefs != null) {
							ToDefinition todef = SpringFactory.eINSTANCE.createToDefinition();
							todef.setUri(sCamelRouteTo);
							toDefs.add(todef);
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void validate() {
		String errorMessage = null;
		String cpName = mCamelRouteToText.getText();

		if (cpName == null || cpName.trim().length() == 0) {
			errorMessage = "No URI specified";
		}
		else if (cpName.trim().length() < cpName.length() ) {
			errorMessage = "No spaces allowed in To URI";
		} else {
			try {
				URI.create(cpName);
			} catch (IllegalArgumentException e) {
				errorMessage = "Invalid URI for To";
			}
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}
	
	@Override
	public boolean getSkippable() {
		if (startPage != null) {
			Implementation impl = getImplementationFromStartPage();
			if (impl instanceof CamelImplementationType) {
				return false;
			} else {
				return true;
			}
		}
		return super.getSkippable();
	}

	@Override
	public void refresh() {
		if (startPage != null) {
			Implementation impl = getImplementationFromStartPage();
			if (impl instanceof CamelImplementationType) {
				CamelImplementationType camelImpl = (CamelImplementationType) impl;
				if (camelImpl.getRoute() != null) {
					RouteDefinition defn = camelImpl.getRoute();
					if (!defn.getTo().isEmpty()) {
						mCamelRouteToText.setText(defn.getTo().get(0).getUri());
					}
				}
			}
		}
	}
}
