/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.WhenDefinition#getAnyAttribute2 <em>Any Attribute2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getWhenDefinition()
 * @model extendedMetaData="name='whenDefinition' kind='elementOnly'"
 * @generated
 */
public interface WhenDefinition extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Any Attribute2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute2</em>' attribute list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getWhenDefinition_AnyAttribute2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':86' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute2();

} // WhenDefinition
