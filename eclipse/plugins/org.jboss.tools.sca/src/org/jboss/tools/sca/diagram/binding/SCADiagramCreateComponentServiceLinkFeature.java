package org.jboss.tools.sca.diagram.binding;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

public class SCADiagramCreateComponentServiceLinkFeature extends
AbstractCreateConnectionFeature {

	public SCADiagramCreateComponentServiceLinkFeature(IFeatureProvider fp) {
		super(fp, "Component Service reference", "Create Component Service reference");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {
			
			Object source = getEClass(context.getSourceAnchor());
			Object target = getEClass(context.getTargetAnchor());
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
		
		if (source != null && target != null) {
			// add connection for business object
			AddConnectionContext addContext =
					new AddConnectionContext(context.getSourceAnchor(), context
							.getTargetAnchor());
			ComponentService cs = getComponentServiceFromEndpoints(source, target);
			addContext.setNewObject(cs);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}

		return newConnection;
	}

	private ComponentService getComponentServiceFromEndpoints ( Object source, Object target) {
		Service service = null;
		Component component = null;
		if (source instanceof Service)
			service = (Service) source;
		else if (target instanceof Service)
			service = (Service) target;
		if (source instanceof Component) 
			component = (Component) source;
		else if (target instanceof Component)
			component = (Component) target;
		if (component != null && service !=  null) {
			EList<ComponentService> cservices = component.getService();
			for (ComponentService componentService : cservices) {
				if (componentService.getName().contentEquals(service.getName())) {
					return componentService;
				}
			}
		}
		return null;
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
}
