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
 * A representation of the model object '<em><b>Dynamic Router Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#isIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#getUriDelimiter <em>Uri Delimiter</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#getAnyAttribute3 <em>Any Attribute3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getDynamicRouterDefinition()
 * @model extendedMetaData="name='dynamicRouterDefinition' kind='elementOnly'"
 * @generated
 */
public interface DynamicRouterDefinition extends NoOutputExpressionNode {
	/**
	 * Returns the value of the '<em><b>Ignore Invalid Endpoints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Invalid Endpoints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Invalid Endpoints</em>' attribute.
	 * @see #isSetIgnoreInvalidEndpoints()
	 * @see #unsetIgnoreInvalidEndpoints()
	 * @see #setIgnoreInvalidEndpoints(boolean)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getDynamicRouterDefinition_IgnoreInvalidEndpoints()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ignoreInvalidEndpoints'"
	 * @generated
	 */
	boolean isIgnoreInvalidEndpoints();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#isIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Invalid Endpoints</em>' attribute.
	 * @see #isSetIgnoreInvalidEndpoints()
	 * @see #unsetIgnoreInvalidEndpoints()
	 * @see #isIgnoreInvalidEndpoints()
	 * @generated
	 */
	void setIgnoreInvalidEndpoints(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#isIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreInvalidEndpoints()
	 * @see #isIgnoreInvalidEndpoints()
	 * @see #setIgnoreInvalidEndpoints(boolean)
	 * @generated
	 */
	void unsetIgnoreInvalidEndpoints();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#isIgnoreInvalidEndpoints <em>Ignore Invalid Endpoints</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Invalid Endpoints</em>' attribute is set.
	 * @see #unsetIgnoreInvalidEndpoints()
	 * @see #isIgnoreInvalidEndpoints()
	 * @see #setIgnoreInvalidEndpoints(boolean)
	 * @generated
	 */
	boolean isSetIgnoreInvalidEndpoints();

	/**
	 * Returns the value of the '<em><b>Uri Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Delimiter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Delimiter</em>' attribute.
	 * @see #setUriDelimiter(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getDynamicRouterDefinition_UriDelimiter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='uriDelimiter'"
	 * @generated
	 */
	String getUriDelimiter();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition#getUriDelimiter <em>Uri Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Delimiter</em>' attribute.
	 * @see #getUriDelimiter()
	 * @generated
	 */
	void setUriDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute3</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute3</em>' attribute list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getDynamicRouterDefinition_AnyAttribute3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':39' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute3();

} // DynamicRouterDefinition
