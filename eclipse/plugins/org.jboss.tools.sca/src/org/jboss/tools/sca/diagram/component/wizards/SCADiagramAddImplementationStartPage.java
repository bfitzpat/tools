package org.jboss.tools.sca.diagram.component.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.Interface;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.switchyard.model.bean.BeanFactory;
import org.jboss.tools.switchyard.model.bean.BeanImplementationType;
import org.jboss.tools.switchyard.model.camel.CamelFactory;
import org.jboss.tools.switchyard.model.camel.CamelImplementationType;

public class SCADiagramAddImplementationStartPage extends BaseWizardPage {

    private ListViewer listViewer;
    private Implementation cImplementation = null;

    /**
     * List width in characters.
     */
    private final static int LIST_WIDTH = 60;

    /**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;

    protected SCADiagramAddImplementationStartPage(String pageName) {
		super(pageName);
		setTitle("Create a New Component");
		setDescription("Specify the name and implementation type details for the new component.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		composite.setLayout(gl);
		
		Label listLabel = new Label(composite, SWT.NONE);
		listLabel.setText("Implementation Type:");
		GridData labelGD = new GridData(GridData.FILL_HORIZONTAL);
		labelGD.horizontalSpan = 2;
		listLabel.setLayoutData(labelGD);

        listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.horizontalSpan = 2;
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(parent.getFont());
        ArrayList<Implementation> typeList = new ArrayList<Implementation>();
		getInterfaceTypes(typeList);
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
            	Implementation interfaceType = (Implementation) element;
            	if (interfaceType instanceof CamelImplementationType)
            		return "Camel";
            	else if (interfaceType instanceof BeanImplementationType)
            		return "Bean (NYI)";
            	else
            		return "";
            }
        });
        listViewer.setContentProvider(new IStructuredContentProvider() {
        	public Object[] getElements(Object inputElement) {
        		if (inputElement instanceof List<?>) { 
        			List<?> v = (List<?>)inputElement;
        			return v.toArray();
        		}
        		return new Object[0];
        	}

        	public void dispose() {
        	}

        	public void inputChanged(
        			Viewer viewer,
        			Object oldInput,
        			Object newInput) {
        	}
        });
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
				if (!ssel.isEmpty() && ssel.getFirstElement() instanceof Implementation) {
					cImplementation = (Implementation) ssel.getFirstElement();
					handleModify();
				}
				
			}
		});
        listViewer.setInput(typeList);

        setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public Implementation getImplementation(){
		return this.cImplementation;
	}
	
	private void handleModify() {
		validate();
	}

	private void validate() {
		String errorMessage = null;
//		String cpName = mComponentName.getText();
//
//		if (cpName == null || cpName.trim().length() == 0) {
//			errorMessage = "No name specified";
//		}
//		else if (cpName.trim().length() < cpName.length() ) {
//			errorMessage = "No spaces allowed in name";
//		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}
	
	private void getInterfaceTypes ( List<Implementation> types ) {
		Implementation camelImplementationType = CamelFactory.eINSTANCE.createCamelImplementationType();
		types.add(camelImplementationType);
		Implementation beanImplementation = BeanFactory.eINSTANCE.createBeanImplementationType();
		types.add(beanImplementation);
	}
	
//	private void getImplementationTypes ( List<Implementation> types ) {
//		
//		Implementation beanImplementation = BeanFactory.eINSTANCE.createBeanImplementationType();
//		types.add(beanImplementation);
//
//		Implementation soapImplementation = SOAPFactory.eINSTANCE.createSOAPBindingType().eClass();
//		types.add(soapImplementation);
//
//		EClass implementationTypeEClass = null;
//		EList<EClass> superTypes = BeanFactory.eINSTANCE.createBeanImplementationType().eClass().getEAllSuperTypes();
//		for (EClass eClass : superTypes) {
//			if (eClass.getName().contentEquals(Implementation.class.getSimpleName())) {
//				implementationTypeEClass = eClass;
//				break;
//			}
//		}
//		for (EClassifier eclassifier : implementationTypeEClass.getEPackage().getEClassifiers() ) {
//			if (eclassifier instanceof EClass) {
//				EClass eclass = (EClass)eclassifier;
//				if (eclass.getESuperTypes().contains(implementationTypeEClass)) {
//					types.add(eclass);
//				}
//			}
//		}
//	}
	
}
