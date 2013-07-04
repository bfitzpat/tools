/**
 */
package org.switchyard.tools.models.switchyard1_0.transform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.TransformTypeImpl;

import org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType;
import org.switchyard.tools.models.switchyard1_0.transform.TransformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dozer Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.impl.DozerTransformTypeImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DozerTransformTypeImpl extends TransformTypeImpl implements DozerTransformType {
	/**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected String config = CONFIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DozerTransformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformPackage.Literals.DOZER_TRANSFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(String newConfig) {
		String oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.DOZER_TRANSFORM_TYPE__CONFIG, oldConfig, config));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformPackage.DOZER_TRANSFORM_TYPE__CONFIG:
				return getConfig();
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
			case TransformPackage.DOZER_TRANSFORM_TYPE__CONFIG:
				setConfig((String)newValue);
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
			case TransformPackage.DOZER_TRANSFORM_TYPE__CONFIG:
				setConfig(CONFIG_EDEFAULT);
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
			case TransformPackage.DOZER_TRANSFORM_TYPE__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
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
		result.append(" (config: ");
		result.append(config);
		result.append(')');
		return result.toString();
	}

} //DozerTransformTypeImpl
