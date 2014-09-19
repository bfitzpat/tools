/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.quartz.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.camel.quartz.CamelQuartzBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.quartz.QuartzPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camel Quartz Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getCamelBindingName <em>Camel Binding Name</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getCron <em>Cron</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getTriggerRepeatCount <em>Trigger Repeat Count</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getTriggerRepeatInterval <em>Trigger Repeat Interval</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#isStateful <em>Stateful</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getTriggerStartTime <em>Trigger Start Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getTriggerEndTime <em>Trigger End Time</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.quartz.impl.CamelQuartzBindingTypeImpl#getTriggerTimeZone <em>Trigger Time Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CamelQuartzBindingTypeImpl extends BaseCamelBindingImpl implements CamelQuartzBindingType {
    /**
     * The default value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected static final String CAMEL_BINDING_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCamelBindingName() <em>Camel Binding Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCamelBindingName()
     * @generated
     * @ordered
     */
    protected String camelBindingName = CAMEL_BINDING_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCron()
     * @generated
     * @ordered
     */
    protected static final String CRON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCron() <em>Cron</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCron()
     * @generated
     * @ordered
     */
    protected String cron = CRON_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerRepeatCount() <em>Trigger Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerRepeatCount()
     * @generated
     * @ordered
     */
    protected static final Object TRIGGER_REPEAT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerRepeatCount() <em>Trigger Repeat Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerRepeatCount()
     * @generated
     * @ordered
     */
    protected Object triggerRepeatCount = TRIGGER_REPEAT_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerRepeatInterval() <em>Trigger Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerRepeatInterval()
     * @generated
     * @ordered
     */
    protected static final Object TRIGGER_REPEAT_INTERVAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerRepeatInterval() <em>Trigger Repeat Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerRepeatInterval()
     * @generated
     * @ordered
     */
    protected Object triggerRepeatInterval = TRIGGER_REPEAT_INTERVAL_EDEFAULT;

    /**
     * The default value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStateful()
     * @generated
     * @ordered
     */
    protected static final boolean STATEFUL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStateful()
     * @generated
     * @ordered
     */
    protected boolean stateful = STATEFUL_EDEFAULT;

    /**
     * This is true if the Stateful attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statefulESet;

    /**
     * The default value of the '{@link #getTriggerStartTime() <em>Trigger Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerStartTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar TRIGGER_START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerStartTime() <em>Trigger Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerStartTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar triggerStartTime = TRIGGER_START_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerEndTime() <em>Trigger End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerEndTime()
     * @generated
     * @ordered
     */
    protected static final XMLGregorianCalendar TRIGGER_END_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerEndTime() <em>Trigger End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerEndTime()
     * @generated
     * @ordered
     */
    protected XMLGregorianCalendar triggerEndTime = TRIGGER_END_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerTimeZone() <em>Trigger Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerTimeZone()
     * @generated
     * @ordered
     */
    protected static final String TRIGGER_TIME_ZONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTriggerTimeZone() <em>Trigger Time Zone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerTimeZone()
     * @generated
     * @ordered
     */
    protected String triggerTimeZone = TRIGGER_TIME_ZONE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CamelQuartzBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QuartzPackage.Literals.CAMEL_QUARTZ_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCamelBindingName() {
        return camelBindingName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCamelBindingName(String newCamelBindingName) {
        String oldCamelBindingName = camelBindingName;
        camelBindingName = newCamelBindingName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME, oldCamelBindingName, camelBindingName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCron() {
        return cron;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCron(String newCron) {
        String oldCron = cron;
        cron = newCron;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON, oldCron, cron));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTriggerRepeatCount() {
        return triggerRepeatCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerRepeatCount(Object newTriggerRepeatCount) {
        Object oldTriggerRepeatCount = triggerRepeatCount;
        triggerRepeatCount = newTriggerRepeatCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT, oldTriggerRepeatCount, triggerRepeatCount));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getTriggerRepeatInterval() {
        return triggerRepeatInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerRepeatInterval(Object newTriggerRepeatInterval) {
        Object oldTriggerRepeatInterval = triggerRepeatInterval;
        triggerRepeatInterval = newTriggerRepeatInterval;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL, oldTriggerRepeatInterval, triggerRepeatInterval));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStateful() {
        return stateful;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStateful(boolean newStateful) {
        boolean oldStateful = stateful;
        stateful = newStateful;
        boolean oldStatefulESet = statefulESet;
        statefulESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL, oldStateful, stateful, !oldStatefulESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStateful() {
        boolean oldStateful = stateful;
        boolean oldStatefulESet = statefulESet;
        stateful = STATEFUL_EDEFAULT;
        statefulESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL, oldStateful, STATEFUL_EDEFAULT, oldStatefulESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStateful() {
        return statefulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getTriggerStartTime() {
        return triggerStartTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerStartTime(XMLGregorianCalendar newTriggerStartTime) {
        XMLGregorianCalendar oldTriggerStartTime = triggerStartTime;
        triggerStartTime = newTriggerStartTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME, oldTriggerStartTime, triggerStartTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLGregorianCalendar getTriggerEndTime() {
        return triggerEndTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerEndTime(XMLGregorianCalendar newTriggerEndTime) {
        XMLGregorianCalendar oldTriggerEndTime = triggerEndTime;
        triggerEndTime = newTriggerEndTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME, oldTriggerEndTime, triggerEndTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTriggerTimeZone() {
        return triggerTimeZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerTimeZone(String newTriggerTimeZone) {
        String oldTriggerTimeZone = triggerTimeZone;
        triggerTimeZone = newTriggerTimeZone;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE, oldTriggerTimeZone, triggerTimeZone));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                return getCamelBindingName();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                return getCron();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT:
                return getTriggerRepeatCount();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL:
                return getTriggerRepeatInterval();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                return isStateful();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME:
                return getTriggerStartTime();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME:
                return getTriggerEndTime();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE:
                return getTriggerTimeZone();
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
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName((String)newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                setCron((String)newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT:
                setTriggerRepeatCount(newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL:
                setTriggerRepeatInterval(newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                setStateful((Boolean)newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME:
                setTriggerStartTime((XMLGregorianCalendar)newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME:
                setTriggerEndTime((XMLGregorianCalendar)newValue);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE:
                setTriggerTimeZone((String)newValue);
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
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                setCamelBindingName(CAMEL_BINDING_NAME_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                setCron(CRON_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT:
                setTriggerRepeatCount(TRIGGER_REPEAT_COUNT_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL:
                setTriggerRepeatInterval(TRIGGER_REPEAT_INTERVAL_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                unsetStateful();
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME:
                setTriggerStartTime(TRIGGER_START_TIME_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME:
                setTriggerEndTime(TRIGGER_END_TIME_EDEFAULT);
                return;
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE:
                setTriggerTimeZone(TRIGGER_TIME_ZONE_EDEFAULT);
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
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CAMEL_BINDING_NAME:
                return CAMEL_BINDING_NAME_EDEFAULT == null ? camelBindingName != null : !CAMEL_BINDING_NAME_EDEFAULT.equals(camelBindingName);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__CRON:
                return CRON_EDEFAULT == null ? cron != null : !CRON_EDEFAULT.equals(cron);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_COUNT:
                return TRIGGER_REPEAT_COUNT_EDEFAULT == null ? triggerRepeatCount != null : !TRIGGER_REPEAT_COUNT_EDEFAULT.equals(triggerRepeatCount);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_REPEAT_INTERVAL:
                return TRIGGER_REPEAT_INTERVAL_EDEFAULT == null ? triggerRepeatInterval != null : !TRIGGER_REPEAT_INTERVAL_EDEFAULT.equals(triggerRepeatInterval);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__STATEFUL:
                return isSetStateful();
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_START_TIME:
                return TRIGGER_START_TIME_EDEFAULT == null ? triggerStartTime != null : !TRIGGER_START_TIME_EDEFAULT.equals(triggerStartTime);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_END_TIME:
                return TRIGGER_END_TIME_EDEFAULT == null ? triggerEndTime != null : !TRIGGER_END_TIME_EDEFAULT.equals(triggerEndTime);
            case QuartzPackage.CAMEL_QUARTZ_BINDING_TYPE__TRIGGER_TIME_ZONE:
                return TRIGGER_TIME_ZONE_EDEFAULT == null ? triggerTimeZone != null : !TRIGGER_TIME_ZONE_EDEFAULT.equals(triggerTimeZone);
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
        result.append(" (camelBindingName: ");
        result.append(camelBindingName);
        result.append(", cron: ");
        result.append(cron);
        result.append(", triggerRepeatCount: ");
        result.append(triggerRepeatCount);
        result.append(", triggerRepeatInterval: ");
        result.append(triggerRepeatInterval);
        result.append(", stateful: ");
        if (statefulESet) result.append(stateful); else result.append("<unset>");
        result.append(", triggerStartTime: ");
        result.append(triggerStartTime);
        result.append(", triggerEndTime: ");
        result.append(triggerEndTime);
        result.append(", triggerTimeZone: ");
        result.append(triggerTimeZone);
        result.append(')');
        return result.toString();
    }

} //CamelQuartzBindingTypeImpl
