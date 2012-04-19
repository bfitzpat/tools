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
package org.jboss.tools.sca.diagram.connections;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.jboss.tools.sca.ImageProvider;

public class SCADiagramCreateComponentServiceLinkFeature extends
AbstractCreateConnectionFeature {

	public SCADiagramCreateComponentServiceLinkFeature(IFeatureProvider fp) {
		super(fp, "Component Service reference (dotted)", "Create Component Service reference");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {
			
			Object source = getAnchorObject(context.getSourceAnchor());
			Object target = getAnchorObject(context.getTargetAnchor());
			if (source != null && target != null) {
				if (source instanceof Service && target instanceof Component) {
					return true;
				}
				if (source instanceof Component && target instanceof Service) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a service or component
		if (getAnchorObject(context.getSourceAnchor()) != null) {
			return true;
		}
		return true;

	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		Object source = getAnchorObject(context.getSourceAnchor());
		Object target = getAnchorObject(context.getTargetAnchor());
		
		if (source != null && target != null) {
			// add connection for business object
			AddConnectionContext addContext =
					new AddConnectionContext(context.getSourceAnchor(), context
							.getTargetAnchor());
			
			Anchor sourceAnchor = context.getSourceAnchor();
			
			ComponentService cs = 
					(ComponentService) getFeatureProvider().getBusinessObjectForPictogramElement(
							sourceAnchor.getLink().getPictogramElement());
			Service service = (Service) target;
			cs.setName(service.getName());
			addContext.setNewObject(cs);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	private Object getAnchorObject(Anchor anchor) {
		if (anchor != null) {
			Object object =
					getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof Service || object instanceof Component) {
				return object;
			}
		}
		return null;
	}

	@Override
	public String getCreateImageId() {
		return ImageProvider.IMG_16_CONNECTION;
	}

}
