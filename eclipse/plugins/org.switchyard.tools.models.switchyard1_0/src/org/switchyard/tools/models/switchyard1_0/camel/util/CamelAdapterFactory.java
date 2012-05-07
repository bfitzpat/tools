/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType;


import org.switchyard.tools.models.switchyard1_0.camel.*;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public class CamelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static CamelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CamelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CamelPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CamelSwitch<Adapter> modelSwitch =
		new CamelSwitch<Adapter>() {
            @Override
            public Adapter caseCamelAtomBindingType(CamelAtomBindingType object) {
                return createCamelAtomBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelBindingType(CamelBindingType object) {
                return createCamelBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelDirectBindingType(CamelDirectBindingType object) {
                return createCamelDirectBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelFileBindingType(CamelFileBindingType object) {
                return createCamelFileBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelImplementationType(CamelImplementationType object) {
                return createCamelImplementationTypeAdapter();
            }
            @Override
            public Adapter caseCamelMockBindingType(CamelMockBindingType object) {
                return createCamelMockBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelOperationSelectorType(CamelOperationSelectorType object) {
                return createCamelOperationSelectorTypeAdapter();
            }
            @Override
            public Adapter caseCamelSedaBindingType(CamelSedaBindingType object) {
                return createCamelSedaBindingTypeAdapter();
            }
            @Override
            public Adapter caseCamelTimerBindingType(CamelTimerBindingType object) {
                return createCamelTimerBindingTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseFileConsumerType(FileConsumerType object) {
                return createFileConsumerTypeAdapter();
            }
            @Override
            public Adapter caseFileProducerType(FileProducerType object) {
                return createFileProducerTypeAdapter();
            }
            @Override
            public Adapter caseJavaDSLType(JavaDSLType object) {
                return createJavaDSLTypeAdapter();
            }
            @Override
            public Adapter caseXMLDSLType(XMLDSLType object) {
                return createXMLDSLTypeAdapter();
            }
            @Override
            public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
                return createCommonExtensionBaseAdapter();
            }
            @Override
            public Adapter caseBinding(Binding object) {
                return createBindingAdapter();
            }
            @Override
            public Adapter caseSwitchYardBindingType(SwitchYardBindingType object) {
                return createSwitchYardBindingTypeAdapter();
            }
            @Override
            public Adapter caseImplementation(Implementation object) {
                return createImplementationAdapter();
            }
            @Override
            public Adapter caseOperationSelectorType(OperationSelectorType object) {
                return createOperationSelectorTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType <em>Atom Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelAtomBindingType
     * @generated
     */
	public Adapter createCamelAtomBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType
     * @generated
     */
	public Adapter createCamelBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType <em>Direct Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelDirectBindingType
     * @generated
     */
	public Adapter createCamelDirectBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType <em>File Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelFileBindingType
     * @generated
     */
	public Adapter createCamelFileBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType <em>Implementation Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelImplementationType
     * @generated
     */
	public Adapter createCamelImplementationTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType <em>Mock Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelMockBindingType
     * @generated
     */
	public Adapter createCamelMockBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType <em>Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelOperationSelectorType
     * @generated
     */
	public Adapter createCamelOperationSelectorTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType <em>Seda Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelSedaBindingType
     * @generated
     */
	public Adapter createCamelSedaBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType <em>Timer Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelTimerBindingType
     * @generated
     */
	public Adapter createCamelTimerBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.DocumentRoot
     * @generated
     */
	public Adapter createDocumentRootAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType <em>File Consumer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.FileConsumerType
     * @generated
     */
	public Adapter createFileConsumerTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.FileProducerType <em>File Producer Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.FileProducerType
     * @generated
     */
	public Adapter createFileProducerTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType <em>Java DSL Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.JavaDSLType
     * @generated
     */
	public Adapter createJavaDSLTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType <em>XMLDSL Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.camel.XMLDSLType
     * @generated
     */
    public Adapter createXMLDSLTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase
     * @generated
     */
	public Adapter createCommonExtensionBaseAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Binding <em>Binding</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Binding
     * @generated
     */
	public Adapter createBindingAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType
     * @generated
     */
	public Adapter createSwitchYardBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.Implementation <em>Implementation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.Implementation
     * @generated
     */
	public Adapter createImplementationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType <em>Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType
     * @generated
     */
	public Adapter createOperationSelectorTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //CamelAdapterFactory
