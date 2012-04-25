/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.camel;

import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;

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
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(Object)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelImplementationType_Route()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='route' namespace='http://camel.apache.org/schema/spring'"
	 * @generated
	 */
	Object getRoute();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelImplementationType#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Object value);

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
