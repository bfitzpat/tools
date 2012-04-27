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

import org.eclipse.graphiti.util.IPredefinedRenderingStyle;

public interface ISCADiagramRenderingStyle extends IPredefinedRenderingStyle {
	
	public static final String COMPOSITE_ID = "sca-composite";
	public static final String COMPONENT_ID = "sca-component";
	public static final String SERVICE_ID = "sca-service";
	public static final String REFERENCE_ID = "sca-reference";

}
