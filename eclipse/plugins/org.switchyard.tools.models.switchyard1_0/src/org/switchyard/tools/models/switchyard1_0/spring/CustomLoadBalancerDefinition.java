/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Load Balancer Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.CustomLoadBalancerDefinition#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCustomLoadBalancerDefinition()
 * @model extendedMetaData="name='customLoadBalancerDefinition' kind='empty'"
 * @generated
 */
public interface CustomLoadBalancerDefinition extends LoadBalancer {
	/**
     * Returns the value of the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' attribute.
     * @see #setRef(String)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getCustomLoadBalancerDefinition_Ref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='ref'"
     * @generated
     */
	String getRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.CustomLoadBalancerDefinition#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
	void setRef(String value);

} // CustomLoadBalancerDefinition
