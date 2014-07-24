/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.mqtt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.mqtt.MqttPackage
 * @generated
 */
public interface MqttFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MqttFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.mqtt.impl.MqttFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Additional Uri Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Additional Uri Parameters Type</em>'.
     * @generated
     */
    AdditionalUriParametersType createAdditionalUriParametersType();

    /**
     * Returns a new object of class '<em>Base Camel Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Base Camel Binding</em>'.
     * @generated
     */
    BaseCamelBinding createBaseCamelBinding();

    /**
     * Returns a new object of class '<em>Camel Mqtt Binding Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Camel Mqtt Binding Type</em>'.
     * @generated
     */
    CamelMqttBindingType createCamelMqttBindingType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Type</em>'.
     * @generated
     */
    ParameterType createParameterType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MqttPackage getMqttPackage();

} //MqttFactory
