/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Identified Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOptionalIdentifiedDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='optionalIdentifiedDefinition' kind='elementOnly'"
 * @generated
 */
public interface OptionalIdentifiedDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOptionalIdentifiedDefinition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionDefinition getDescription();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionDefinition value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOptionalIdentifiedDefinition_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // OptionalIdentifiedDefinition
