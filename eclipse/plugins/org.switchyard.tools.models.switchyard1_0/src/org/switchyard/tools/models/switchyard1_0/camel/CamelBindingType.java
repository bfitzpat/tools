/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType#getConfigURI <em>Config URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelBindingType()
 * @model extendedMetaData="name='CamelBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelBindingType extends SwitchYardBindingType {

    /**
     * Returns the value of the '<em><b>Config URI</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config URI</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Config URI</em>' attribute.
     * @see #setConfigURI(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelBindingType_ConfigURI()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='element' name='feedURI' namespace='##targetNamespace'"
     * @generated
     */
    String getConfigURI();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelBindingType#getConfigURI <em>Config URI</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Config URI</em>' attribute.
     * @see #getConfigURI()
     * @generated
     */
    void setConfigURI(String value);
} // CamelBindingType
