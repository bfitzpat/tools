package org.jboss.tools.sca.diagram.composite;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;

public class SCADiagramUpdateCompositeFeature extends AbstractUpdateFeature {

	public SCADiagramUpdateCompositeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a Composite
		Object bo =
				getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Composite);
	}

	private Text findText (GraphicsAlgorithm root) {
		for (GraphicsAlgorithm ga : root.getGraphicsAlgorithmChildren()) {
			if (ga instanceof Text) {
				Text text = (Text) ga;
				return text;
			}
			if (ga.getGraphicsAlgorithmChildren().size() > 0) {
				return findText(ga);
			}
		}
		return null;
	}
	
	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			Text foundText = findText(cs.getGraphicsAlgorithm());
			if (foundText != null) {
				pictogramName = foundText.getValue();
			}
		}

		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Composite) {
			Composite eClass = (Composite) bo;
			businessName = eClass.getName();

			// update needed, if names are different
			boolean updateNameNeeded =
					((pictogramName == null && businessName != null) || 
							(pictogramName != null && !pictogramName.contentEquals(businessName)));
			if (updateNameNeeded) {
				return Reason.createTrueReason("Composite name is out of date");
			} else {
				return Reason.createFalseReason();
			}
		}

		return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Composite) {
			Composite eClass = (Composite) bo;
			businessName = eClass.getName();
		}

		// Set name in pictogram model
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					text.setValue(businessName);
					return true;
				}
			}
		}
		return false;
	}

}
