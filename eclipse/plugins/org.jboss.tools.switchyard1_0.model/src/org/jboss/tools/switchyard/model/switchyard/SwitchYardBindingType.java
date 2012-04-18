/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.switchyard;

import org.eclipse.soa.sca.sca1_1.model.sca.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Yard Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getMessageComposer <em>Message Composer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getSwitchYardBindingType()
 * @model abstract="true"
 *        extendedMetaData="name='SwitchYardBindingType' kind='elementOnly'"
 * @generated
 */
public interface SwitchYardBindingType extends Binding {
	/**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getSwitchYardBindingType_ContextMapper()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
	ContextMapperType getContextMapper();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
	void setContextMapper(ContextMapperType value);

	/**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getSwitchYardBindingType_MessageComposer()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
	MessageComposerType getMessageComposer();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
	void setMessageComposer(MessageComposerType value);

} // SwitchYardBindingType
