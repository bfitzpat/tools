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
package org.jboss.tools.sca.diagram.compositereference;

import java.io.IOException;

import org.jboss.tools.sca.util.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.jboss.tools.sca.Activator;
import org.jboss.tools.sca.ImageProvider;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;

public class SCADiagramCreateCompositeReferenceFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create composite reference";
    private static final String USER_QUESTION = "Enter new composite reference name";

    public SCADiagramCreateCompositeReferenceFeature(IFeatureProvider fp) {
    	super (fp, "Composite Reference", "Create composite reference");
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
		
        // ask user for composite reference name
        String newRefName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newRefName == null || newRefName.trim().length() == 0) {
            return EMPTY;
        }

        Reference newReference = null;

		try {
			ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
			Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
			newReference = mh.createCompositeReference((Composite)o);
			newReference.setName(newRefName);
		} catch (IOException e) {
			Activator.logError(e);
		}
        // do the add
        addGraphicalRepresentation(context, newReference);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		// return newly created business object(s)
        return new Object[] { newReference };
	}

	@Override
	public String getCreateImageId() {
		return ImageProvider.IMG_16_REFERENCE;
	}

}
