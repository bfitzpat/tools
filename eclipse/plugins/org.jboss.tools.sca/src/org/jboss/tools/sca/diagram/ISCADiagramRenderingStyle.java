package org.jboss.tools.sca.diagram;

import org.eclipse.graphiti.util.IPredefinedRenderingStyle;

public interface ISCADiagramRenderingStyle extends IPredefinedRenderingStyle {
	
	public static final String COMPOSITE_ID = "sca-composite";
	public static final String COMPONENT_ID = "sca-component";
	public static final String SERVICE_ID = "sca-service";
	public static final String REFERENCE_ID = "sca-reference";

}
