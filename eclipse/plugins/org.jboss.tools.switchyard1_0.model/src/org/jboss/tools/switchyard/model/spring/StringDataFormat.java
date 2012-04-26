/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Data Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.StringDataFormat#getCharset <em>Charset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getStringDataFormat()
 * @model extendedMetaData="name='stringDataFormat' kind='empty'"
 * @generated
 */
public interface StringDataFormat extends DataFormat {
	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getStringDataFormat_Charset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.StringDataFormat#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

} // StringDataFormat
