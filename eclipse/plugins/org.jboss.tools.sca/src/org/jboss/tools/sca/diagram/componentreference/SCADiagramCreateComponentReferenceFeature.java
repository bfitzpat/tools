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
package org.jboss.tools.sca.diagram.componentreference;

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.jboss.tools.sca.Activator;
import org.jboss.tools.sca.ImageProvider;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;
import org.jboss.tools.sca.util.ExampleUtil;

public class SCADiagramCreateComponentReferenceFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create component reference";
    private static final String USER_QUESTION = "Enter new component reference name";

    public SCADiagramCreateComponentReferenceFeature(IFeatureProvider fp) {
    	super (fp, "Component Reference", "Create component reference");
    }
    
	@Override
	public boolean canCreate(ICreateContext context) {
		ContainerShape targetContainer = context.getTargetContainer();
		// check if user wants to add to a Component
		if (targetContainer instanceof Component) {
			return true;
		} 
		if (getBusinessObjectForPictogramElement(targetContainer) instanceof Component) {
			return true;
		}
		return false;
	}

	@Override
	public Object[] create(ICreateContext context) {
		
        // ask user for new component reference name
        String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newClassName == null || newClassName.trim().length() == 0) {
            return EMPTY;
        }

        ComponentReference newCReference = null;

		try {
			ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
			Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
			newCReference = mh.createComponentReference((Component)o);
			newCReference.setName(newClassName);
		} catch (IOException e) {
			Activator.logError(e);
		}
        // do the add
        addGraphicalRepresentation(context, newCReference);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		// return newly created business object(s)
        return new Object[] { newCReference };
	}

	@Override
	public String getCreateImageId() {
		return ImageProvider.IMG_16_COMPONENT_REFERENCE;
	}

}
