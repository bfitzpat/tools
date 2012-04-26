/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.XPathExpression#getResultType <em>Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getXPathExpression()
 * @model extendedMetaData="name='xPathExpression' kind='simple'"
 * @generated
 */
public interface XPathExpression extends NamespaceAwareExpression {
	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see #setResultType(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getXPathExpression_ResultType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resultType'"
	 * @generated
	 */
	String getResultType();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.XPathExpression#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(String value);

} // XPathExpression
