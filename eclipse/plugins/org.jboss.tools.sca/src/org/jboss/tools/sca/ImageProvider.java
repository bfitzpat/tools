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
package org.jboss.tools.sca;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

public class ImageProvider extends AbstractImageProvider {

	private static final String dot16 = ".16";
	private static final String ICONS_16 = "icons/16/";

	public static final String PREFIX = ImageProvider.class.getPackage().getName() + ".";

	public static final String IMG_16_COMPOSITE = PREFIX + Composite.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_IMPLEMENTATION_TYPE = PREFIX + Implementation.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_COMPONENT = PREFIX + Component.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_SERVICE = PREFIX + Service.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_REFERENCE = PREFIX + Reference.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_COMPONENT_SERVICE = PREFIX + ComponentService.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_COMPONENT_REFERENCE = PREFIX + ComponentReference.class.getSimpleName().toLowerCase() + dot16;
	public static final String IMG_16_CONNECTION = PREFIX + "connection" + dot16;
	
	public static final String IMG_16_CHAIN = PREFIX + "binding" + dot16;
	public static final String IMG_16_PLUS = PREFIX + "plus" + dot16;

	@Override
	protected void addAvailableImages() {
		addImageFilePath(IMG_16_COMPOSITE, ICONS_16 + "Composite.gif");
		addImageFilePath(IMG_16_COMPONENT, ICONS_16 + "Component.gif");
		addImageFilePath(IMG_16_SERVICE, ICONS_16 + "Service.gif");
		addImageFilePath(IMG_16_REFERENCE, ICONS_16 + "Reference.gif");
		addImageFilePath(IMG_16_COMPONENT_SERVICE, ICONS_16 + "Service.gif");
		addImageFilePath(IMG_16_COMPONENT_REFERENCE, ICONS_16 + "Reference.gif");
		addImageFilePath(IMG_16_CONNECTION, ICONS_16 + "Wire.gif");
		addImageFilePath(IMG_16_CHAIN, ICONS_16 + "chain_small.png");
		addImageFilePath(IMG_16_PLUS, ICONS_16 + "plus.png");
		addImageFilePath(IMG_16_IMPLEMENTATION_TYPE, ICONS_16 + "ImplementationType.gif");
	}

}
