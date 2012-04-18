/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.hornetq.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.jboss.tools.switchyard.model.hornetq.*;
import org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.tools.switchyard.model.hornetq.HornetQPackage
 * @generated
 */
public class HornetQAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static HornetQPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HornetQAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = HornetQPackage.eINSTANCE;
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
	protected HornetQSwitch<Adapter> modelSwitch =
		new HornetQSwitch<Adapter>() {
            @Override
            public Adapter caseBindingType(BindingType object) {
                return createBindingTypeAdapter();
            }
            @Override
            public Adapter caseConfigType(ConfigType object) {
                return createConfigTypeAdapter();
            }
            @Override
            public Adapter caseConnectorType(ConnectorType object) {
                return createConnectorTypeAdapter();
            }
            @Override
            public Adapter caseDiscoveryGroupType(DiscoveryGroupType object) {
                return createDiscoveryGroupTypeAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseOperationSelectorType(OperationSelectorType object) {
                return createOperationSelectorTypeAdapter();
            }
            @Override
            public Adapter casePropertiesType(PropertiesType object) {
                return createPropertiesTypeAdapter();
            }
            @Override
            public Adapter casePropertyType(PropertyType object) {
                return createPropertyTypeAdapter();
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
            public Adapter caseSca_OperationSelectorType(org.eclipse.soa.sca.sca1_1.model.sca.OperationSelectorType object) {
                return createSca_OperationSelectorTypeAdapter();
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
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.BindingType <em>Binding Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.BindingType
     * @generated
     */
	public Adapter createBindingTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.ConfigType <em>Config Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.ConfigType
     * @generated
     */
	public Adapter createConfigTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.ConnectorType <em>Connector Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.ConnectorType
     * @generated
     */
	public Adapter createConnectorTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.DiscoveryGroupType <em>Discovery Group Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.DiscoveryGroupType
     * @generated
     */
	public Adapter createDiscoveryGroupTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.DocumentRoot
     * @generated
     */
	public Adapter createDocumentRootAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.OperationSelectorType <em>Operation Selector Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.OperationSelectorType
     * @generated
     */
	public Adapter createOperationSelectorTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.PropertiesType
     * @generated
     */
	public Adapter createPropertiesTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.hornetq.PropertyType <em>Property Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.hornetq.PropertyType
     * @generated
     */
	public Adapter createPropertyTypeAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType
     * @generated
     */
    public Adapter createSwitchYardBindingTypeAdapter() {
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
    public Adapter createSca_OperationSelectorTypeAdapter() {
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

} //HornetQAdapterFactory
