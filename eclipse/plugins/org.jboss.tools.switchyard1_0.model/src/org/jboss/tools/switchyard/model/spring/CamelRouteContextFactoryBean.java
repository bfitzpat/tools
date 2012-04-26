/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camel Route Context Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.CamelRouteContextFactoryBean#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getCamelRouteContextFactoryBean()
 * @model extendedMetaData="name='camelRouteContextFactoryBean' kind='elementOnly'"
 * @generated
 */
public interface CamelRouteContextFactoryBean extends IdentifiedType {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getCamelRouteContextFactoryBean_Route()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

} // CamelRouteContextFactoryBean
