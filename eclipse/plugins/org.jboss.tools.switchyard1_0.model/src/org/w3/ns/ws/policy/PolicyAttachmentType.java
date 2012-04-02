/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.ns.ws.policy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getPolicyReference <em>Policy Reference</em>}</li>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3.ns.ws.policy.PolicyAttachmentType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType()
 * @model extendedMetaData="name='PolicyAttachment_._type' kind='elementOnly'"
 * @generated
 */
public interface PolicyAttachmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference.
	 * @see #setAppliesTo(AppliesToType)
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_AppliesTo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AppliesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliesToType getAppliesTo();

	/**
	 * Sets the value of the '{@link org.w3.ns.ws.policy.PolicyAttachmentType#getAppliesTo <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To</em>' containment reference.
	 * @see #getAppliesTo()
	 * @generated
	 */
	void setAppliesTo(AppliesToType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.ws.policy.PolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Policy' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PolicyType> getPolicy();

	/**
	 * Returns the value of the '<em><b>Policy Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.ws.policy.PolicyReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Reference</em>' containment reference list.
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_PolicyReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolicyReference' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PolicyReferenceType> getPolicyReference();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.w3.ns.ws.policy.PolicyPackage#getPolicyAttachmentType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PolicyAttachmentType
