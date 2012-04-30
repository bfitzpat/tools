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
package org.jboss.tools.sca.diagram.component;

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.jboss.tools.sca.Activator;
import org.jboss.tools.sca.ImageProvider;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;
import org.jboss.tools.sca.diagram.component.wizards.SCADiagramAddComponentWizard;
import org.jboss.tools.switchyard.model.camel.CamelImplementationType;
import org.jboss.tools.switchyard.model.camel.CamelPackage;

/**
 * @author bfitzpat
 *
 */
public class SCADiagramCreateComponentFeature extends AbstractCreateFeature {

    /**
     * @param fp feature provider
     */
    public SCADiagramCreateComponentFeature(IFeatureProvider fp) {
        super(fp, "Component", "Create component");
    }

    @Override
    public boolean canCreate(ICreateContext context) {
        ContainerShape targetContainer = context.getTargetContainer();
        // check if user wants to add to a diagram
        if (targetContainer instanceof Composite) {
            return true;
        }
        if (getBusinessObjectForPictogramElement(targetContainer) instanceof Composite) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] create(ICreateContext context) {

        Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
        Composite composite = (Composite) o;
        Component newComponent = null;
        String newComponentName = null;
        Implementation newImplementation = null;
        SCADiagramAddComponentWizard wizard = new SCADiagramAddComponentWizard();
        wizard.setDiagram(getDiagram());
        wizard.setComponent(null);
        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        WizardDialog wizDialog = new WizardDialog(shell, wizard);
        int rtn_code = wizDialog.open();
        if (rtn_code == Window.OK) {
            newComponentName = wizard.getComponentName();
            newImplementation = wizard.getImplementation();
        } else {
            return EMPTY;
        }
        // // ask user for component name
        // String newComponentName = ExampleUtil.askString(TITLE, USER_QUESTION,
        // "");
        // if (newComponentName == null || newComponentName.trim().length() ==
        // 0) {
        // return EMPTY;
        // }

        try {
            ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
            newComponent = mh.createComponent(composite);
            newComponent.setName(newComponentName);
            if (newImplementation != null) {
                // do something with it
                if (newImplementation instanceof CamelImplementationType) {
                    newComponent.getImplementationGroup().set(
                            CamelPackage.eINSTANCE.getDocumentRoot_ImplementationCamel(), newImplementation);
                }
            }
        } catch (IOException e) {
            Activator.logError(e);
        }

        // do the add
        addGraphicalRepresentation(context, newComponent);

        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);

        // return newly created business object(s)
        return new Object[] {newComponent };
    }

    @Override
    public String getCreateImageId() {
        return ImageProvider.IMG_16_COMPONENT;
    }

}
