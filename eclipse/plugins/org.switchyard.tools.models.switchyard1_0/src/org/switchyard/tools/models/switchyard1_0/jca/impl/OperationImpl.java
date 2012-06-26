/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.jca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.jca.InteractionSpec;
import org.switchyard.tools.models.switchyard1_0.jca.JcaPackage;
import org.switchyard.tools.models.switchyard1_0.jca.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl#getInteractionSpec <em>Interaction Spec</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.jca.impl.OperationImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
    /**
     * The cached value of the '{@link #getInteractionSpec() <em>Interaction Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionSpec()
     * @generated
     * @ordered
     */
    protected InteractionSpec interactionSpec;

    /**
     * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected FeatureMap any;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute()
     * @generated
     * @ordered
     */
    protected FeatureMap anyAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JcaPackage.Literals.OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionSpec getInteractionSpec() {
        return interactionSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteractionSpec(InteractionSpec newInteractionSpec, NotificationChain msgs) {
        InteractionSpec oldInteractionSpec = interactionSpec;
        interactionSpec = newInteractionSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcaPackage.OPERATION__INTERACTION_SPEC, oldInteractionSpec, newInteractionSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionSpec(InteractionSpec newInteractionSpec) {
        if (newInteractionSpec != interactionSpec) {
            NotificationChain msgs = null;
            if (interactionSpec != null)
                msgs = ((InternalEObject)interactionSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcaPackage.OPERATION__INTERACTION_SPEC, null, msgs);
            if (newInteractionSpec != null)
                msgs = ((InternalEObject)newInteractionSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcaPackage.OPERATION__INTERACTION_SPEC, null, msgs);
            msgs = basicSetInteractionSpec(newInteractionSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.OPERATION__INTERACTION_SPEC, newInteractionSpec, newInteractionSpec));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        if (any == null) {
            any = new BasicFeatureMap(this, JcaPackage.OPERATION__ANY);
        }
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JcaPackage.OPERATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, JcaPackage.OPERATION__ANY_ATTRIBUTE);
        }
        return anyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JcaPackage.OPERATION__INTERACTION_SPEC:
                return basicSetInteractionSpec(null, msgs);
            case JcaPackage.OPERATION__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case JcaPackage.OPERATION__ANY_ATTRIBUTE:
                return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
            case JcaPackage.OPERATION__INTERACTION_SPEC:
                return getInteractionSpec();
            case JcaPackage.OPERATION__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case JcaPackage.OPERATION__NAME:
                return getName();
            case JcaPackage.OPERATION__ANY_ATTRIBUTE:
                if (coreType) return getAnyAttribute();
                return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
            case JcaPackage.OPERATION__INTERACTION_SPEC:
                setInteractionSpec((InteractionSpec)newValue);
                return;
            case JcaPackage.OPERATION__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case JcaPackage.OPERATION__NAME:
                setName((String)newValue);
                return;
            case JcaPackage.OPERATION__ANY_ATTRIBUTE:
                ((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
            case JcaPackage.OPERATION__INTERACTION_SPEC:
                setInteractionSpec((InteractionSpec)null);
                return;
            case JcaPackage.OPERATION__ANY:
                getAny().clear();
                return;
            case JcaPackage.OPERATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case JcaPackage.OPERATION__ANY_ATTRIBUTE:
                getAnyAttribute().clear();
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
            case JcaPackage.OPERATION__INTERACTION_SPEC:
                return interactionSpec != null;
            case JcaPackage.OPERATION__ANY:
                return any != null && !any.isEmpty();
            case JcaPackage.OPERATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case JcaPackage.OPERATION__ANY_ATTRIBUTE:
                return anyAttribute != null && !anyAttribute.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (any: ");
        result.append(any);
        result.append(", name: ");
        result.append(name);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
