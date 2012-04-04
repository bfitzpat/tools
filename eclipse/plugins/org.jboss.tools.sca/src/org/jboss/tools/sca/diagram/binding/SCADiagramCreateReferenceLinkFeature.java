package org.jboss.tools.sca.diagram.binding;

import java.util.ArrayList;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

public class SCADiagramCreateReferenceLinkFeature extends
AbstractCreateConnectionFeature {

	public SCADiagramCreateReferenceLinkFeature(IFeatureProvider fp) {
		super(fp, "Reference", "Create Reference");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {
			
			Object source = getEClass(context.getSourceAnchor());
			Object target = getEClass(context.getTargetAnchor());
			System.out.println("Source=" + source);
			System.out.println("Target=" + target);
			if (source != null && target != null) {
				if (source instanceof Service && target instanceof Component) {
					Service service = (Service) source;
					Component component = (Component) target;
					if (service != null && component != null && service != component) {
						return true;
					}
				}
				if (source instanceof Component && target instanceof Component) {
					return true;
				}
			}
		}
		return false;


	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		if (getEClass(context.getSourceAnchor()) != null) {
			return true;
		}
		return true;

	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		Object source = getEClass(context.getSourceAnchor());
		Object target = getEClass(context.getTargetAnchor());
		
		if (source instanceof Service && target instanceof Component) {

			// get EClasses which should be connected
			Service src = (Service) getEClass(context.getSourceAnchor());
			Component tgt = (Component) getEClass(context.getTargetAnchor());
	
			if (source != null && target != null) {
				// create new business object 
				ComponentReference eReference = createComponentReference(src, tgt);
	
				// add connection for business object
				AddConnectionContext addContext =
						new AddConnectionContext(context.getSourceAnchor(), context
								.getTargetAnchor());
				addContext.setNewObject(eReference);
				newConnection =
						(Connection) getFeatureProvider().addIfPossible(addContext);
			}
		} else if (source instanceof Component && target instanceof Component) {
			// get EClasses which should be connected
			Component src = (Component) getEClass(context.getSourceAnchor());
			Component tgt = (Component) getEClass(context.getTargetAnchor());
	
			if (source != null && target != null) {
				// create new business object 
				ComponentReference eReference = createComponentReference(src, tgt);
	
				// add connection for business object
				AddConnectionContext addContext =
						new AddConnectionContext(context.getSourceAnchor(), context
								.getTargetAnchor());
				addContext.setNewObject(eReference);
				newConnection =
						(Connection) getFeatureProvider().addIfPossible(addContext);
			}
		}

		return newConnection;
	}

	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private Object getEClass(Anchor anchor) {
		if (anchor != null) {
			Object object =
					getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof Service || object instanceof Component) {
				return object;
			}
		}
		return null;
	}

	/**
	 * Creates a Binding between a service and a components.
	 */
	private ComponentReference createComponentReference(Service source, Component target) {

		ComponentReference eReference = ScaFactory.eINSTANCE.createComponentReference();
		eReference.setName(source.getName());
		ArrayList<String> targetRef = new ArrayList<String>();
		targetRef.add(target.getName());
		target.getReference().add(eReference);
		getDiagram().eResource().getContents().add(eReference);
		return eReference;
	}

	private ComponentReference createComponentReference (Component source, Component target) {
		ComponentReference eReference = ScaFactory.eINSTANCE.createComponentReference();
//		ComponentReference eReference = ScaFactory.eINSTANCE.createComponentReference();
		eReference.setName(source.getName());
		target.getReference().add(eReference);
		getDiagram().eResource().getContents().add(eReference);
		return eReference;
	}
}
