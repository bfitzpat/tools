/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.AbstractCamelProducerTemplateFactoryBean;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camel Producer Template Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelProducerTemplateFactoryBeanImpl#getDefaultEndpoint <em>Default Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.AbstractCamelProducerTemplateFactoryBeanImpl#getMaximumCacheSize <em>Maximum Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCamelProducerTemplateFactoryBeanImpl extends AbstractCamelFactoryBeanImpl implements AbstractCamelProducerTemplateFactoryBean {
	/**
     * The default value of the '{@link #getDefaultEndpoint() <em>Default Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultEndpoint()
     * @generated
     * @ordered
     */
	protected static final String DEFAULT_ENDPOINT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDefaultEndpoint() <em>Default Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDefaultEndpoint()
     * @generated
     * @ordered
     */
	protected String defaultEndpoint = DEFAULT_ENDPOINT_EDEFAULT;

	/**
     * The default value of the '{@link #getMaximumCacheSize() <em>Maximum Cache Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumCacheSize()
     * @generated
     * @ordered
     */
	protected static final int MAXIMUM_CACHE_SIZE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMaximumCacheSize() <em>Maximum Cache Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaximumCacheSize()
     * @generated
     * @ordered
     */
	protected int maximumCacheSize = MAXIMUM_CACHE_SIZE_EDEFAULT;

	/**
     * This is true if the Maximum Cache Size attribute has been set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	protected boolean maximumCacheSizeESet;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AbstractCamelProducerTemplateFactoryBeanImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getAbstractCamelProducerTemplateFactoryBean();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDefaultEndpoint() {
        return defaultEndpoint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDefaultEndpoint(String newDefaultEndpoint) {
        String oldDefaultEndpoint = defaultEndpoint;
        defaultEndpoint = newDefaultEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__DEFAULT_ENDPOINT, oldDefaultEndpoint, defaultEndpoint));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMaximumCacheSize() {
        return maximumCacheSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaximumCacheSize(int newMaximumCacheSize) {
        int oldMaximumCacheSize = maximumCacheSize;
        maximumCacheSize = newMaximumCacheSize;
        boolean oldMaximumCacheSizeESet = maximumCacheSizeESet;
        maximumCacheSizeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE, oldMaximumCacheSize, maximumCacheSize, !oldMaximumCacheSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void unsetMaximumCacheSize() {
        int oldMaximumCacheSize = maximumCacheSize;
        boolean oldMaximumCacheSizeESet = maximumCacheSizeESet;
        maximumCacheSize = MAXIMUM_CACHE_SIZE_EDEFAULT;
        maximumCacheSizeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE, oldMaximumCacheSize, MAXIMUM_CACHE_SIZE_EDEFAULT, oldMaximumCacheSizeESet));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSetMaximumCacheSize() {
        return maximumCacheSizeESet;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__DEFAULT_ENDPOINT:
                return getDefaultEndpoint();
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
                return getMaximumCacheSize();
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
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__DEFAULT_ENDPOINT:
                setDefaultEndpoint((String)newValue);
                return;
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
                setMaximumCacheSize((Integer)newValue);
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
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__DEFAULT_ENDPOINT:
                setDefaultEndpoint(DEFAULT_ENDPOINT_EDEFAULT);
                return;
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
                unsetMaximumCacheSize();
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
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__DEFAULT_ENDPOINT:
                return DEFAULT_ENDPOINT_EDEFAULT == null ? defaultEndpoint != null : !DEFAULT_ENDPOINT_EDEFAULT.equals(defaultEndpoint);
            case SpringPackage.ABSTRACT_CAMEL_PRODUCER_TEMPLATE_FACTORY_BEAN__MAXIMUM_CACHE_SIZE:
                return isSetMaximumCacheSize();
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
        result.append(" (defaultEndpoint: ");
        result.append(defaultEndpoint);
        result.append(", maximumCacheSize: ");
        if (maximumCacheSizeESet) result.append(maximumCacheSize); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AbstractCamelProducerTemplateFactoryBeanImpl
