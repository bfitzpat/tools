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
package org.jboss.tools.sca.diagram;

import java.util.Collection;

import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class StyleUtil {
	
	public static final IColorConstant BLACK = new ColorConstant("000000"); // black
	public static final IColorConstant BRIGHT_ORANGE = new ColorConstant("FF6600"); // bright orange
	public static final IColorConstant LIGHT_BLUE = new ColorConstant("c7eafb"); //light blue
	public static final IColorConstant ORANGE = new ColorConstant("f69679"); // orange
	public static final IColorConstant GREEN = new ColorConstant("99cc99"); // green
	public static final IColorConstant PERIWINKLE_BLUE = new ColorConstant("6699ff"); // periwinkle
	
	public static final int SMALL_RIGHT_ARROW[] = new int[] {0,0, 15,0, 20,5, 15,10, 0,10, 3,5, 0,0 };
	public static final int SMALL_RIGHT_ARROW_WIDTH = 20;
	public static final int SMALL_RIGHT_ARROW_HEIGHT = 15;
	public static final int MEDIUM_RIGHT_ARROW[] = new int[] {0,0, 45,0, 50,15, 45,30, 0,30, 33,15, 0,0};
	public static final int MEDIUM_RIGHT_ARROW_WIDTH = 50;
	public static final int MEDIUM_RIGHT_ARROW_HEIGHT = 30;
	public static final int LARGE_RIGHT_ARROW[] = new int[] {0,0, 75,0, 100,25, 75,50, 0,50, 15,25, 0,0 };
	public static final int LARGE_RIGHT_ARROW_WIDTH = 100;
	public static final int LARGE_RIGHT_ARROW_HEIGHT = 75;
	
	public static final int COMPOSITE_WIDTH = 500;
	public static final int COMPOSITE_HEIGHT = 300;
	public static final int COMPOSITE_INVISIBLE_RECT_RIGHT = 40;
	public static final int COMPOSITE_EDGE = 10;
	
	public static final int COMPONENT_WIDTH = 100;
	public static final int COMPONENT_HEIGHT = 50;
	public static final int COMPONENT_INVISIBLE_RECT_RIGHT = 13;
	public static final int COMPONENT_EDGE = 10;
	
	public static final int SERVICE_WIDTH = 100;
	public static final int SERVICE_HEIGHT = 50;
	public static final int SERVICE_INVISIBLE_RECT_RIGHT = 10;

	public static final int COMPOSITE_REFERENCE_WIDTH = 100;
	public static final int COMPOSITE_REFERENCE_HEIGHT = 50;
	public static final int COMPOSITE_REFERENCE_INVISIBLE_RECT_RIGHT = 10;

	public static Style getStyleForComposite(Diagram diagram) {
        final String styleId = "Composite";
        Style style = findStyle(diagram, styleId);
        if (style ==null) {// style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram,
            		ORANGE));
            gaService.setRenderingStyle(style,
            		SCADiagramColoredAreas.getCompositeAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    public static Style getStyleForComponent(Diagram diagram) {
        final String styleId = "Component";
        Style style = findStyle(diagram, styleId);
        if (style ==null) {// style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram,
            		BRIGHT_ORANGE));
            gaService.setRenderingStyle(style,
            		SCADiagramColoredAreas.getComponentAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    public static Style getStyleForService(Diagram diagram) {
        final String styleId = "Service";
        Style style = findStyle(diagram, styleId);
        if (style ==null) {// style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram,
            		BRIGHT_ORANGE));
            gaService.setRenderingStyle(style,
            		SCADiagramColoredAreas.getServiceAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    public static Style getStyleForCompositeReference(Diagram diagram) {
        final String styleId = "CompositeReference";
        Style style = findStyle(diagram, styleId);
        if (style ==null) {// style not found - create new style
            IGaService gaService = Graphiti.getGaService();
            style = gaService.createStyle(diagram, styleId);
            style.setForeground(gaService.manageColor(diagram,
            		BLACK));
            gaService.setRenderingStyle(style,
            		SCADiagramColoredAreas.getReferenceAdaptions());
            style.setLineWidth(2);
        }

        return style;
    }

    // find the style with a given id in the style-container, can return null
    private static Style findStyle(StyleContainer styleContainer, String id) {
        // find and return style
        Collection<Style> styles = styleContainer.getStyles();
        if (styles != null) {
            for (Style style : styles) {
                if (id.equals(style.getId())) {
                    return style;
                }
            }
        }
       return null;
    }

}
