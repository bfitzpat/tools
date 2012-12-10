/**
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jpa Consumer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeDelete <em>Consume Delete</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeLockEntity <em>Consume Lock Entity</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerTransacted <em>Consumer Transacted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType()
 * @model extendedMetaData="name='JpaConsumerType' kind='elementOnly'"
 * @generated
 */
public interface JpaConsumerType extends ScheduledBatchPollConsumerType {
	/**
     * Returns the value of the '<em><b>Consume Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consume Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consume Delete</em>' attribute.
     * @see #isSetConsumeDelete()
     * @see #unsetConsumeDelete()
     * @see #setConsumeDelete(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumeDelete()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='consumeDelete' namespace='##targetNamespace'"
     * @generated
     */
	Boolean getConsumeDelete();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeDelete <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume Delete</em>' attribute.
     * @see #isSetConsumeDelete()
     * @see #unsetConsumeDelete()
     * @see #getConsumeDelete()
     * @generated
     */
	void setConsumeDelete(Boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeDelete <em>Consume Delete</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetConsumeDelete()
     * @see #getConsumeDelete()
     * @see #setConsumeDelete(Boolean)
     * @generated
     */
	void unsetConsumeDelete();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeDelete <em>Consume Delete</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consume Delete</em>' attribute is set.
     * @see #unsetConsumeDelete()
     * @see #getConsumeDelete()
     * @see #setConsumeDelete(Boolean)
     * @generated
     */
	boolean isSetConsumeDelete();

	/**
     * Returns the value of the '<em><b>Consume Lock Entity</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consume Lock Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consume Lock Entity</em>' attribute.
     * @see #isSetConsumeLockEntity()
     * @see #unsetConsumeLockEntity()
     * @see #setConsumeLockEntity(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumeLockEntity()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='consumeLockEntity' namespace='##targetNamespace'"
     * @generated
     */
	Boolean getConsumeLockEntity();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeLockEntity <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consume Lock Entity</em>' attribute.
     * @see #isSetConsumeLockEntity()
     * @see #unsetConsumeLockEntity()
     * @see #getConsumeLockEntity()
     * @generated
     */
	void setConsumeLockEntity(Boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeLockEntity <em>Consume Lock Entity</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetConsumeLockEntity()
     * @see #getConsumeLockEntity()
     * @see #setConsumeLockEntity(Boolean)
     * @generated
     */
	void unsetConsumeLockEntity();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumeLockEntity <em>Consume Lock Entity</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consume Lock Entity</em>' attribute is set.
     * @see #unsetConsumeLockEntity()
     * @see #getConsumeLockEntity()
     * @see #setConsumeLockEntity(Boolean)
     * @generated
     */
	boolean isSetConsumeLockEntity();

	/**
     * Returns the value of the '<em><b>Maximum Results</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Results</em>' attribute.
     * @see #isSetMaximumResults()
     * @see #unsetMaximumResults()
     * @see #setMaximumResults(Integer)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_MaximumResults()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.IntObject"
     *        extendedMetaData="kind='element' name='maximumResults' namespace='##targetNamespace'"
     * @generated
     */
	Integer getMaximumResults();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Results</em>' attribute.
     * @see #isSetMaximumResults()
     * @see #unsetMaximumResults()
     * @see #getMaximumResults()
     * @generated
     */
	void setMaximumResults(Integer value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetMaximumResults()
     * @see #getMaximumResults()
     * @see #setMaximumResults(Integer)
     * @generated
     */
	void unsetMaximumResults();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getMaximumResults <em>Maximum Results</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Results</em>' attribute is set.
     * @see #unsetMaximumResults()
     * @see #getMaximumResults()
     * @see #setMaximumResults(Integer)
     * @generated
     */
	boolean isSetMaximumResults();

	/**
     * Returns the value of the '<em><b>Consumer Query</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Query</em>' attribute.
     * @see #setConsumerQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumerQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.query' namespace='##targetNamespace'"
     * @generated
     */
	String getConsumerQuery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerQuery <em>Consumer Query</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Query</em>' attribute.
     * @see #getConsumerQuery()
     * @generated
     */
	void setConsumerQuery(String value);

	/**
     * Returns the value of the '<em><b>Consumer Named Query</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Named Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Named Query</em>' attribute.
     * @see #setConsumerNamedQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumerNamedQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.namedQuery' namespace='##targetNamespace'"
     * @generated
     */
	String getConsumerNamedQuery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerNamedQuery <em>Consumer Named Query</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Named Query</em>' attribute.
     * @see #getConsumerNamedQuery()
     * @generated
     */
	void setConsumerNamedQuery(String value);

	/**
     * Returns the value of the '<em><b>Consumer Native Query</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Native Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Native Query</em>' attribute.
     * @see #setConsumerNativeQuery(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumerNativeQuery()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.nativeQuery' namespace='##targetNamespace'"
     * @generated
     */
	String getConsumerNativeQuery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerNativeQuery <em>Consumer Native Query</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Native Query</em>' attribute.
     * @see #getConsumerNativeQuery()
     * @generated
     */
	void setConsumerNativeQuery(String value);

	/**
     * Returns the value of the '<em><b>Consumer Result Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Result Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Result Class</em>' attribute.
     * @see #setConsumerResultClass(String)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumerResultClass()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='consumer.resultClass' namespace='##targetNamespace'"
     * @generated
     */
	String getConsumerResultClass();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerResultClass <em>Consumer Result Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Result Class</em>' attribute.
     * @see #getConsumerResultClass()
     * @generated
     */
	void setConsumerResultClass(String value);

	/**
     * Returns the value of the '<em><b>Consumer Transacted</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer Transacted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Consumer Transacted</em>' attribute.
     * @see #isSetConsumerTransacted()
     * @see #unsetConsumerTransacted()
     * @see #setConsumerTransacted(Boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getJpaConsumerType_ConsumerTransacted()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
     *        extendedMetaData="kind='element' name='consumer.transacted' namespace='##targetNamespace'"
     * @generated
     */
	Boolean getConsumerTransacted();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerTransacted <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Consumer Transacted</em>' attribute.
     * @see #isSetConsumerTransacted()
     * @see #unsetConsumerTransacted()
     * @see #getConsumerTransacted()
     * @generated
     */
	void setConsumerTransacted(Boolean value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerTransacted <em>Consumer Transacted</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetConsumerTransacted()
     * @see #getConsumerTransacted()
     * @see #setConsumerTransacted(Boolean)
     * @generated
     */
	void unsetConsumerTransacted();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.JpaConsumerType#getConsumerTransacted <em>Consumer Transacted</em>}' attribute is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumer Transacted</em>' attribute is set.
     * @see #unsetConsumerTransacted()
     * @see #getConsumerTransacted()
     * @see #setConsumerTransacted(Boolean)
     * @generated
     */
	boolean isSetConsumerTransacted();

} // JpaConsumerType
