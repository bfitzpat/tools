/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tidy Markup Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.TidyMarkupDataFormat#getDataObjectType <em>Data Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getTidyMarkupDataFormat()
 * @model extendedMetaData="name='tidyMarkupDataFormat' kind='empty'"
 * @generated
 */
public interface TidyMarkupDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Data Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Type</em>' attribute.
	 * @see #setDataObjectType(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getTidyMarkupDataFormat_DataObjectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='dataObjectType'"
	 * @generated
	 */
	String getDataObjectType();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.TidyMarkupDataFormat#getDataObjectType <em>Data Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Type</em>' attribute.
	 * @see #getDataObjectType()
	 * @generated
	 */
	void setDataObjectType(String value);

} // TidyMarkupDataFormat
