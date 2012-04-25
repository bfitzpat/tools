/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.camel;

import java.math.BigInteger;

import org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mock Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelMockBindingType#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelMockBindingType()
 * @model extendedMetaData="name='CamelMockBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelMockBindingType extends SwitchYardBindingType {
	/**
	 * Returns the value of the '<em><b>Report Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Group</em>' attribute.
	 * @see #setReportGroup(BigInteger)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelMockBindingType_ReportGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='reportGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getReportGroup();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelMockBindingType#getReportGroup <em>Report Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Group</em>' attribute.
	 * @see #getReportGroup()
	 * @generated
	 */
	void setReportGroup(BigInteger value);

} // CamelMockBindingType
