/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.camel;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

import org.jboss.tools.switchyard.model.spring.RouteDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelImplementationType#getRoute <em>Route</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelImplementationType#getJava <em>Java</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelImplementationType()
 * @model extendedMetaData="name='CamelImplementationType' kind='elementOnly'"
 * @generated
 */
public interface CamelImplementationType extends Implementation {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(RouteDefinition)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelImplementationType_Route()
	 * @model containment="true"
	 * @generated
	 */
	RouteDefinition getRoute();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelImplementationType#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(RouteDefinition value);

	/**
	 * Returns the value of the '<em><b>Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java</em>' containment reference.
	 * @see #setJava(JavaDSLType)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelImplementationType_Java()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='java' namespace='##targetNamespace'"
	 * @generated
	 */
	JavaDSLType getJava();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelImplementationType#getJava <em>Java</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java</em>' containment reference.
	 * @see #getJava()
	 * @generated
	 */
	void setJava(JavaDSLType value);

} // CamelImplementationType
