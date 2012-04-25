/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.camel;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFilter <em>Filter</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getConsumerDelay <em>Consumer Delay</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getConsumerInitialDelay <em>Consumer Initial Delay</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isConsumerUserFixedDelay <em>Consumer User Fixed Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType()
 * @model extendedMetaData="name='CamelAtomBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelAtomBindingType extends SwitchYardBindingType {
	/**
	 * Returns the value of the '<em><b>Feed URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed URI</em>' attribute.
	 * @see #setFeedURI(String)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_FeedURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='feedURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeedURI();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getFeedURI <em>Feed URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed URI</em>' attribute.
	 * @see #getFeedURI()
	 * @generated
	 */
	void setFeedURI(String value);

	/**
	 * Returns the value of the '<em><b>Split Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Entries</em>' attribute.
	 * @see #isSetSplitEntries()
	 * @see #unsetSplitEntries()
	 * @see #setSplitEntries(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_SplitEntries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='splitEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSplitEntries();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Entries</em>' attribute.
	 * @see #isSetSplitEntries()
	 * @see #unsetSplitEntries()
	 * @see #isSplitEntries()
	 * @generated
	 */
	void setSplitEntries(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSplitEntries()
	 * @see #isSplitEntries()
	 * @see #setSplitEntries(boolean)
	 * @generated
	 */
	void unsetSplitEntries();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSplitEntries <em>Split Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Split Entries</em>' attribute is set.
	 * @see #unsetSplitEntries()
	 * @see #isSplitEntries()
	 * @see #setSplitEntries(boolean)
	 * @generated
	 */
	boolean isSetSplitEntries();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #setFilter(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_Filter()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFilter();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #isSetFilter()
	 * @see #unsetFilter()
	 * @see #isFilter()
	 * @generated
	 */
	void setFilter(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilter()
	 * @see #isFilter()
	 * @see #setFilter(boolean)
	 * @generated
	 */
	void unsetFilter();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFilter <em>Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Filter</em>' attribute is set.
	 * @see #unsetFilter()
	 * @see #isFilter()
	 * @see #setFilter(boolean)
	 * @generated
	 */
	boolean isSetFilter();

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(XMLGregorianCalendar)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_LastUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='lastUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastUpdate();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Throttle Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle Entries</em>' attribute.
	 * @see #isSetThrottleEntries()
	 * @see #unsetThrottleEntries()
	 * @see #setThrottleEntries(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_ThrottleEntries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='throttleEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isThrottleEntries();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttle Entries</em>' attribute.
	 * @see #isSetThrottleEntries()
	 * @see #unsetThrottleEntries()
	 * @see #isThrottleEntries()
	 * @generated
	 */
	void setThrottleEntries(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThrottleEntries()
	 * @see #isThrottleEntries()
	 * @see #setThrottleEntries(boolean)
	 * @generated
	 */
	void unsetThrottleEntries();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isThrottleEntries <em>Throttle Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Throttle Entries</em>' attribute is set.
	 * @see #unsetThrottleEntries()
	 * @see #isThrottleEntries()
	 * @see #setThrottleEntries(boolean)
	 * @generated
	 */
	boolean isSetThrottleEntries();

	/**
	 * Returns the value of the '<em><b>Feed Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Header</em>' attribute.
	 * @see #isSetFeedHeader()
	 * @see #unsetFeedHeader()
	 * @see #setFeedHeader(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_FeedHeader()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='feedHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFeedHeader();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Header</em>' attribute.
	 * @see #isSetFeedHeader()
	 * @see #unsetFeedHeader()
	 * @see #isFeedHeader()
	 * @generated
	 */
	void setFeedHeader(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeedHeader()
	 * @see #isFeedHeader()
	 * @see #setFeedHeader(boolean)
	 * @generated
	 */
	void unsetFeedHeader();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isFeedHeader <em>Feed Header</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feed Header</em>' attribute is set.
	 * @see #unsetFeedHeader()
	 * @see #isFeedHeader()
	 * @see #setFeedHeader(boolean)
	 * @generated
	 */
	boolean isSetFeedHeader();

	/**
	 * Returns the value of the '<em><b>Sort Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Entries</em>' attribute.
	 * @see #isSetSortEntries()
	 * @see #unsetSortEntries()
	 * @see #setSortEntries(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_SortEntries()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='sortEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSortEntries();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Entries</em>' attribute.
	 * @see #isSetSortEntries()
	 * @see #unsetSortEntries()
	 * @see #isSortEntries()
	 * @generated
	 */
	void setSortEntries(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortEntries()
	 * @see #isSortEntries()
	 * @see #setSortEntries(boolean)
	 * @generated
	 */
	void unsetSortEntries();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isSortEntries <em>Sort Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Entries</em>' attribute is set.
	 * @see #unsetSortEntries()
	 * @see #isSortEntries()
	 * @see #setSortEntries(boolean)
	 * @generated
	 */
	boolean isSetSortEntries();

	/**
	 * Returns the value of the '<em><b>Consumer Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Delay</em>' attribute.
	 * @see #setConsumerDelay(BigInteger)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_ConsumerDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='consumer.delay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getConsumerDelay();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getConsumerDelay <em>Consumer Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Delay</em>' attribute.
	 * @see #getConsumerDelay()
	 * @generated
	 */
	void setConsumerDelay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Consumer Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Initial Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer Initial Delay</em>' attribute.
	 * @see #setConsumerInitialDelay(BigInteger)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_ConsumerInitialDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='consumer.initialDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getConsumerInitialDelay();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#getConsumerInitialDelay <em>Consumer Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer Initial Delay</em>' attribute.
	 * @see #getConsumerInitialDelay()
	 * @generated
	 */
	void setConsumerInitialDelay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Consumer User Fixed Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer User Fixed Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer User Fixed Delay</em>' attribute.
	 * @see #isSetConsumerUserFixedDelay()
	 * @see #unsetConsumerUserFixedDelay()
	 * @see #setConsumerUserFixedDelay(boolean)
	 * @see org.jboss.tools.switchyard.model.camel.CamelPackage#getCamelAtomBindingType_ConsumerUserFixedDelay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='consumer.userFixedDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isConsumerUserFixedDelay();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isConsumerUserFixedDelay <em>Consumer User Fixed Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer User Fixed Delay</em>' attribute.
	 * @see #isSetConsumerUserFixedDelay()
	 * @see #unsetConsumerUserFixedDelay()
	 * @see #isConsumerUserFixedDelay()
	 * @generated
	 */
	void setConsumerUserFixedDelay(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isConsumerUserFixedDelay <em>Consumer User Fixed Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsumerUserFixedDelay()
	 * @see #isConsumerUserFixedDelay()
	 * @see #setConsumerUserFixedDelay(boolean)
	 * @generated
	 */
	void unsetConsumerUserFixedDelay();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.camel.CamelAtomBindingType#isConsumerUserFixedDelay <em>Consumer User Fixed Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consumer User Fixed Delay</em>' attribute is set.
	 * @see #unsetConsumerUserFixedDelay()
	 * @see #isConsumerUserFixedDelay()
	 * @see #setConsumerUserFixedDelay(boolean)
	 * @generated
	 */
	boolean isSetConsumerUserFixedDelay();

} // CamelAtomBindingType
