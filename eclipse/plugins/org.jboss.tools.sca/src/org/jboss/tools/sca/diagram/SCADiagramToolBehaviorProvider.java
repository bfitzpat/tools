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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.StackEntry;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.jboss.tools.sca.ImageProvider;
import org.jboss.tools.switchyard.model.hornetq.BindingType;
import org.jboss.tools.switchyard.model.soap.SOAPBindingType;

public class SCADiagramToolBehaviorProvider extends DefaultToolBehaviorProvider {

	public SCADiagramToolBehaviorProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
		IFeatureProvider featureProvider = getFeatureProvider();
		Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
		if (bo instanceof Service) {
			Service service = (Service) bo;
			if (!service.getBinding().isEmpty()) {
				EList<Binding> bindings = service.getBinding();
				ArrayList<IDecorator> decorators = new ArrayList<IDecorator>();
				for (Binding binding : bindings) {
					IDecorator imageRenderingDecorator =
							new ImageDecorator( ImageProvider.IMG_16_CHAIN );
					String text = binding.getClass().getSimpleName();
					if (binding instanceof SOAPBindingType) {
						SOAPBindingType soapBinding = (SOAPBindingType) binding;
						text = "SOAP Binding:\n";
						text = text + soapBinding.getUri() + "\n";
						text = text + soapBinding.getWsdl();
					} else if (binding instanceof BindingType) {
						BindingType hornetQBinding = (BindingType) binding;
						text = "HornetQ Binding:\n";
						text = text + hornetQBinding.getUri();
					}
					imageRenderingDecorator
						.setMessage(text);
					decorators.add(imageRenderingDecorator);
				}
				return decorators.toArray(new IDecorator[decorators.size()]);
			}
		}
		return super.getDecorators(pe);
	}

	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
		PictogramElement pe = ga.getPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		if (bo instanceof Composite) {
			String name = ((Composite)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		} else if (bo instanceof Component) {
			String name = ((Component)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		} else if (bo instanceof Service) {
			String name = ((Service)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		} else if (bo instanceof ComponentService) {
			String name = ((ComponentService)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		} else if (bo instanceof ComponentReference) {
			String name = ((ComponentReference)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		} else if (bo instanceof Reference) {
			String name = ((Reference)bo).getName();
			if (name != null && !name.isEmpty()) {
				return name;
			}
		}
		return super.getToolTip(ga);
	}

	@Override
    public IPaletteCompartmentEntry[] getPalette() {
        List<IPaletteCompartmentEntry> ret =
            new ArrayList<IPaletteCompartmentEntry>();

        // add compartments from super class
        IPaletteCompartmentEntry[] superCompartments =
            super.getPalette();
//
//        for (int i = 0; i < superCompartments.length; i++)
//            ret.add(superCompartments[i]);

        // add connections
        ret.add(superCompartments[0]);
        
        // add new compartment for composites
        PaletteCompartmentEntry compositeEntry =
            new PaletteCompartmentEntry("Composites", ImageProvider.IMG_16_COMPOSITE);
        ret.add(compositeEntry);

        // add new compartment for components
        PaletteCompartmentEntry componentEntry =
            new PaletteCompartmentEntry("Components", ImageProvider.IMG_16_COMPONENT);
        ret.add(componentEntry);

        // add new compartment for services
        PaletteCompartmentEntry servicesEntry =
            new PaletteCompartmentEntry("Services", ImageProvider.IMG_16_SERVICE);
        ret.add(servicesEntry);

        // add new compartment for anything else
        PaletteCompartmentEntry miscEntry =
            new PaletteCompartmentEntry("Other", null);
        ret.add(miscEntry);

        // add all create-features to the new stack-entry
        IFeatureProvider featureProvider = getFeatureProvider();

        ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
        for (ICreateFeature cf : createFeatures) {
            ObjectCreationToolEntry objectCreationToolEntry = 
                   new ObjectCreationToolEntry(cf.getCreateName(),
                     cf.getCreateDescription(), cf.getCreateImageId(),
                        cf.getCreateLargeImageId(), cf);
            if (cf.getCreateName().contains("Composite"))
            	compositeEntry.addToolEntry(objectCreationToolEntry);
            else if (cf.getCreateName().contains("Component"))
            	componentEntry.addToolEntry(objectCreationToolEntry);
            else if (cf.getCreateName().contains("Service"))
            	servicesEntry.addToolEntry(objectCreationToolEntry);
            else
            	miscEntry.addToolEntry(objectCreationToolEntry);
        }
      
//        // add all create-connection-features to the new stack-entry
//        ICreateConnectionFeature[] createConnectionFeatures =
//             featureProvider.getCreateConnectionFeatures();
//        for (ICreateConnectionFeature cf : createConnectionFeatures) {
//            ConnectionCreationToolEntry connectionCreationToolEntry = 
//                new ConnectionCreationToolEntry(cf.getCreateName(), cf
//                  .getCreateDescription(), cf.getCreateImageId(),
//                    cf.getCreateLargeImageId());
//                        connectionCreationToolEntry.addCreateConnectionFeature(cf);
//            stackEntry.addCreationToolEntry(connectionCreationToolEntry);
//        }

        return ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
    }

}
