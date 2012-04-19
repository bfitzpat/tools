package org.jboss.tools.sca.diagram.service;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;
import org.jboss.tools.sca.core.ModelHandler;
import org.jboss.tools.sca.core.ModelHandlerLocator;
import org.jboss.tools.sca.diagram.di.DIImport;

public class SCADiagramCustomPromoteServiceFeature extends
		AbstractCustomFeature {

	private boolean hasDoneChanges = false;

    public SCADiagramCustomPromoteServiceFeature(IFeatureProvider fp) {
		super(fp);
	}

    @Override
	public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
            	Component component = (Component) bo;
            	if (!component.getService().isEmpty()) {
            		ComponentService cservice = component.getService().get(0);
            		Shape[] shapes = 
            				DIImport.findShapesWithName(getFeatureProvider(), getDiagram(), cservice.getName());
            		if (shapes != null && shapes.length > 0) {
	            		for (int i = 0; i < shapes.length; i++) {
							Object testObj = getFeatureProvider().getBusinessObjectForPictogramElement(shapes[i]);
							if (testObj instanceof Service) {
								Service service = (Service) testObj;
								service.setPromote(cservice);
								this.hasDoneChanges = true;
							}
						}
            		} else {
            			try {
            				ContainerShape componentShape = (ContainerShape) pes[0];
            				Composite composite = (Composite) component.eContainer();
							ModelHandler handler = ModelHandlerLocator.getModelHandler(getDiagram().eResource());
							Service newService = handler.createService(composite);
							newService.setName(cservice.getName());
							newService.setPromote(cservice);
							
							ContainerShape cshape = 
									(ContainerShape) getFeatureProvider().
										getPictogramElementForBusinessObject(composite);
							
							AddContext addServiceContext = new AddContext();
							addServiceContext.setNewObject(newService);
							addServiceContext.setTargetContainer(cshape);
							addServiceContext.setX(0);
							addServiceContext.setY(0);

							IAddFeature addServiceFeature = getFeatureProvider().getAddFeature(addServiceContext);
							if (addServiceFeature.canAdd(addServiceContext)) {
								Shape serviceShape = (Shape) addServiceFeature.add(addServiceContext);

								String referencedShapeName = cservice.getName();
								Anchor targetAnchor = null;
								Anchor sourceAnchor = null;
								Anchor[] anchors = DIImport.findAnchorsWithName(getFeatureProvider(), getDiagram(), referencedShapeName);
								for (Anchor anchor : anchors) {
									Object anchorObj = getFeatureProvider().getBusinessObjectForPictogramElement(anchor);
									if (anchorObj instanceof ComponentService) {
										ComponentService cservice2 = (ComponentService) anchorObj;
										if (cservice2.getName().contentEquals(referencedShapeName)) {
											targetAnchor = anchor;
										}
									}
									if (anchorObj instanceof Service) {
										Service service = (Service) anchorObj;
										if (service.getName().contentEquals(referencedShapeName)) {
											sourceAnchor = anchor;
										}
									}
								}
								if (sourceAnchor != null && targetAnchor != null) {
									if (sourceAnchor.getParent() != targetAnchor.getParent()) {
										// 	now define the connection between the componentservice and the new service shape
										AddConnectionContext addReferenceContext = new AddConnectionContext(sourceAnchor, targetAnchor);
										ArrayList<String> targetRef = new ArrayList<String>();
										targetRef.add(referencedShapeName);
										addReferenceContext.setNewObject(cservice);
										addReferenceContext.setTargetContainer(cshape);
						
										IAddFeature addConnectionFeature = getFeatureProvider().getAddFeature(addReferenceContext);
										if (addConnectionFeature != null && addConnectionFeature.canAdd(addReferenceContext)) {
											addConnectionFeature.add(addReferenceContext);
										}
									}
								}
							}
							
						} catch (IOException e) {
							e.printStackTrace();
						}
            			
            		}
            	}
            }
        }
	}

	@Override
	public String getDescription() {
		return "Promote Component Service";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof Component) {
            	Component component = (Component) bo;
            	if (!component.getService().isEmpty()) {
            		return true;
            	}
            }
        }

		return false;
	}

	@Override
	public String getName() {
		return "Promote Component Service";
	}

	@Override
	public boolean hasDoneChanges() {
		return this.hasDoneChanges;
	}

}
