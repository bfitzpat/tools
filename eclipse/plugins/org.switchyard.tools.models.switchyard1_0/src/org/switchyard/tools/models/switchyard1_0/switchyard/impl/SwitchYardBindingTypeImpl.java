/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.BindingImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Yard Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl#getMessageComposer <em>Message Composer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SwitchYardBindingTypeImpl extends BindingImpl implements SwitchYardBindingType {
	/**
     * The cached value of the '{@link #getContextMapper() <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getContextMapper()
     * @generated
     * @ordered
     */
	protected ContextMapperType contextMapper;

	/**
     * The cached value of the '{@link #getMessageComposer() <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMessageComposer()
     * @generated
     * @ordered
     */
	protected MessageComposerType messageComposer;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SwitchYardBindingTypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ContextMapperType getContextMapper() {
        return contextMapper;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetContextMapper(ContextMapperType newContextMapper, NotificationChain msgs) {
        ContextMapperType oldContextMapper = contextMapper;
        contextMapper = newContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER, oldContextMapper, newContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setContextMapper(ContextMapperType newContextMapper) {
        if (newContextMapper != contextMapper) {
            NotificationChain msgs = null;
            if (contextMapper != null)
                msgs = ((InternalEObject)contextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            if (newContextMapper != null)
                msgs = ((InternalEObject)newContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER, null, msgs);
            msgs = basicSetContextMapper(newContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER, newContextMapper, newContextMapper));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MessageComposerType getMessageComposer() {
        return messageComposer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetMessageComposer(MessageComposerType newMessageComposer, NotificationChain msgs) {
        MessageComposerType oldMessageComposer = messageComposer;
        messageComposer = newMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER, oldMessageComposer, newMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMessageComposer(MessageComposerType newMessageComposer) {
        if (newMessageComposer != messageComposer) {
            NotificationChain msgs = null;
            if (messageComposer != null)
                msgs = ((InternalEObject)messageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            if (newMessageComposer != null)
                msgs = ((InternalEObject)newMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetMessageComposer(newMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER, newMessageComposer, newMessageComposer));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
                return getContextMapper();
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
                return getMessageComposer();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER:
                return contextMapper != null;
            case SwitchyardPackage.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER:
                return messageComposer != null;
        }
        return super.eIsSet(featureID);
    }

} //SwitchYardBindingTypeImpl
