/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Converter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.ConverterList#getConverter <em>Converter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getConverterList()
 * @model extendedMetaData="name='converterList' kind='elementOnly'"
 * @generated
 */
public interface ConverterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Converter</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ConverterEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converter</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getConverterList_Converter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConverterEntry> getConverter();

} // ConverterList
