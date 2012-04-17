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
package org.jboss.tools.sca.diagram.service;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.jboss.tools.sca.diagram.StyleUtil;

public class SCADiagramAddServiceFeature extends AbstractAddShapeFeature {

	public SCADiagramAddServiceFeature( IFeatureProvider fp ) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a Service
		if (context.getNewObject() instanceof Service ) {
			
			if (getBusinessObjectForPictogramElement(context.getTargetContainer()) instanceof Composite) {
				return true;
			}
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Service addedService = null;
		if (context.getNewObject() instanceof Service) {
			addedService = (Service) context.getNewObject();
		}
		ContainerShape targetContainerShape = null;
		if (context.getTargetContainer() instanceof ContainerShape) 
			targetContainerShape = (ContainerShape) context.getTargetContainer();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		
		ContainerShape containerShape = peCreateService.createContainerShape(targetContainerShape, true);

	    // check whether the context has a size (e.g. from a create feature)
        // otherwise define a default size for the shape
        int width = context.getWidth() <= 0 ? StyleUtil.SERVICE_WIDTH : context.getWidth();
        int height = context.getHeight() <= 0 ? StyleUtil.SERVICE_HEIGHT : context.getHeight();
 
        Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
        gaService.setLocationAndSize(invisibleRectangle,
                context.getX() , context.getY(), width + StyleUtil.SERVICE_INVISIBLE_RECT_RIGHT, height);

        Polygon p = null;
        // create service
		{
			// arrow through points: top-middle, bottom-right, bottom-left
			p = gaService.createPolygon(invisibleRectangle, StyleUtil.LARGE_RIGHT_ARROW);
			p.setForeground(manageColor(StyleUtil.BRIGHT_ORANGE));
			p.setBackground(manageColor(StyleUtil.GREEN));
			p.setLineWidth(2);
	        p.setParentGraphicsAlgorithm(invisibleRectangle);

			gaService.setLocationAndSize(p,
					0, 0, width, height);

			Graphiti.getPeService().setPropertyValue(p, "sca-type", "service");

			// create link and wire it
			link(containerShape, addedService);

			ChopboxAnchor anchor = 
					peCreateService.createChopboxAnchor(containerShape);
			anchor.setActive(true);
			link(anchor, addedService);
		}
		// SHAPE WITH TEXT
		{
			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(), p,
					addedService.getName());
			text.setForeground(manageColor(StyleUtil.BLACK));
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
			text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
			Font font = text.getFont();
			font = gaService.manageFont(getDiagram(), font.getName(), font.getSize(), false, true);
//			text.getFont().setBold(true);
			gaService.setLocationAndSize(text, 5, 0, width - 15, height);

		}

		return containerShape;

	}

}
