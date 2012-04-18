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
package org.jboss.tools.sca.diagram.componentservice;

import java.io.IOException;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.jboss.tools.sca.Activator;
import org.jboss.tools.sca.ImageProvider;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;
import org.jboss.tools.sca.util.ExampleUtil;

public class SCADiagramCreateComponentServiceFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create component service";
    private static final String USER_QUESTION = "Enter new component service name";

    public SCADiagramCreateComponentServiceFeature(IFeatureProvider fp) {
    	super (fp, "Component Service", "Create component service");
    }
    
	@Override
	public boolean canCreate(ICreateContext context) {
		ContainerShape targetContainer = context.getTargetContainer();
		// check if user wants to add to a component
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
        // ask user for component service name
        String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
        if (newClassName == null || newClassName.trim().length() == 0) {
            return EMPTY;
        }

        ComponentService newCService = null;
		try {
			ModelHandler mh = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
			Object o = getBusinessObjectForPictogramElement(context.getTargetContainer());
			newCService = mh.createComponentService((Component)o);
			newCService.setName(newClassName);
		} catch (IOException e) {
			Activator.logError(e);
		}

        // do the add
        addGraphicalRepresentation(context, newCService);

		// activate direct editing after object creation
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		// return newly created business object(s)
        return new Object[] { newCService };
	}

	@Override
	public String getCreateImageId() {
		return ImageProvider.IMG_16_COMPONENT_SERVICE;
	}

}
