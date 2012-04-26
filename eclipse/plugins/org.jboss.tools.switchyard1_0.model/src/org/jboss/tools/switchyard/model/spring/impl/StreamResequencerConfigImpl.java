/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jboss.tools.switchyard.model.spring.SpringPackage;
import org.jboss.tools.switchyard.model.spring.StreamResequencerConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Resequencer Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.impl.StreamResequencerConfigImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.impl.StreamResequencerConfigImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamResequencerConfigImpl extends ResequencerConfigImpl implements StreamResequencerConfig {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * This is true if the Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityESet;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected long timeout = TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamResequencerConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getStreamResequencerConfig();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		boolean oldCapacityESet = capacityESet;
		capacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY, oldCapacity, capacity, !oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacity() {
		int oldCapacity = capacity;
		boolean oldCapacityESet = capacityESet;
		capacity = CAPACITY_EDEFAULT;
		capacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY, oldCapacity, CAPACITY_EDEFAULT, oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacity() {
		return capacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(long newTimeout) {
		long oldTimeout = timeout;
		timeout = newTimeout;
		boolean oldTimeoutESet = timeoutESet;
		timeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeout() {
		long oldTimeout = timeout;
		boolean oldTimeoutESet = timeoutESet;
		timeout = TIMEOUT_EDEFAULT;
		timeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeout() {
		return timeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				return getCapacity();
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				return getTimeout();
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
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				setTimeout((Long)newValue);
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
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				unsetCapacity();
				return;
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				unsetTimeout();
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
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__CAPACITY:
				return isSetCapacity();
			case SpringPackage.STREAM_RESEQUENCER_CONFIG__TIMEOUT:
				return isSetTimeout();
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
		result.append(" (capacity: ");
		if (capacityESet) result.append(capacity); else result.append("<unset>");
		result.append(", timeout: ");
		if (timeoutESet) result.append(timeout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StreamResequencerConfigImpl
