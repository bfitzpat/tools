/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Exception Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getException <em>Exception</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnWhen <em>On When</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRetryWhile <em>Retry While</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getHandled <em>Handled</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getContinued <em>Continued</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getAop <em>Aop</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getWhen <em>When</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#isUseOriginalMessage <em>Use Original Message</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition()
 * @model extendedMetaData="name='onExceptionDefinition' kind='elementOnly'"
 * @generated
 */
public interface OnExceptionDefinition extends ProcessorDefinition {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Exception()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='exception' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getException();

	/**
	 * Returns the value of the '<em><b>On When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On When</em>' containment reference.
	 * @see #setOnWhen(WhenDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_OnWhen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onWhen' namespace='##targetNamespace'"
	 * @generated
	 */
	WhenDefinition getOnWhen();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnWhen <em>On When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On When</em>' containment reference.
	 * @see #getOnWhen()
	 * @generated
	 */
	void setOnWhen(WhenDefinition value);

	/**
	 * Returns the value of the '<em><b>Retry While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry While</em>' containment reference.
	 * @see #setRetryWhile(ExpressionSubElementDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RetryWhile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retryWhile' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getRetryWhile();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRetryWhile <em>Retry While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry While</em>' containment reference.
	 * @see #getRetryWhile()
	 * @generated
	 */
	void setRetryWhile(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #setRedeliveryPolicy(RedeliveryPolicyDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RedeliveryPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='redeliveryPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	RedeliveryPolicyDefinition getRedeliveryPolicy();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRedeliveryPolicy <em>Redelivery Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy</em>' containment reference.
	 * @see #getRedeliveryPolicy()
	 * @generated
	 */
	void setRedeliveryPolicy(RedeliveryPolicyDefinition value);

	/**
	 * Returns the value of the '<em><b>Handled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handled</em>' containment reference.
	 * @see #setHandled(ExpressionSubElementDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Handled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handled' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getHandled();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getHandled <em>Handled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handled</em>' containment reference.
	 * @see #getHandled()
	 * @generated
	 */
	void setHandled(ExpressionSubElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Continued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continued</em>' containment reference.
	 * @see #setContinued(ExpressionSubElementDefinition)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Continued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continued' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionSubElementDefinition getContinued();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getContinued <em>Continued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continued</em>' containment reference.
	 * @see #getContinued()
	 * @generated
	 */
	void setContinued(ExpressionSubElementDefinition value);

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
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:10'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Aop</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.AopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aop</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Aop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aop' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<AopDefinition> getAop();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.AggregateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<AggregateDefinition> getAggregate();

	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.BeanDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Bean()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<BeanDefinition> getBean();

	/**
	 * Returns the value of the '<em><b>Do Catch</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.CatchDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Catch</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_DoCatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<CatchDefinition> getDoCatch();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.WhenDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_When()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<WhenDefinition> getWhen();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ChoiceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ChoiceDefinition> getChoice();

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.OtherwiseDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Otherwise()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<OtherwiseDefinition> getOtherwise();

	/**
	 * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ConvertBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Body To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert Body To</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_ConvertBodyTo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ConvertBodyDefinition> getConvertBodyTo();

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.DelayDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Delay()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<DelayDefinition> getDelay();

	/**
	 * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Router</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_DynamicRouter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<DynamicRouterDefinition> getDynamicRouter();

	/**
	 * Returns the value of the '<em><b>Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.EnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrich</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Enrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<EnrichDefinition> getEnrich();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FilterDefinition> getFilter();

	/**
	 * Returns the value of the '<em><b>Do Finally</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.FinallyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Finally</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Finally</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_DoFinally()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<FinallyDefinition> getDoFinally();

	/**
	 * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.IdempotentConsumerDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Consumer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent Consumer</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_IdempotentConsumer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<IdempotentConsumerDefinition> getIdempotentConsumer();

	/**
	 * Returns the value of the '<em><b>In Only</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.InOnlyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Only</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Only</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_InOnly()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOnly' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InOnlyDefinition> getInOnly();

	/**
	 * Returns the value of the '<em><b>In Out</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.InOutDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Out</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_InOut()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOut' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InOutDefinition> getInOut();

	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.InterceptDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Intercept()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InterceptDefinition> getIntercept();

	/**
	 * Returns the value of the '<em><b>Intercept From</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.InterceptFromDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept From</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_InterceptFrom()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
	 * Returns the value of the '<em><b>Intercept To Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.InterceptSendToEndpointDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept To Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept To Endpoint</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_InterceptToEndpoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interceptToEndpoint' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint();

	/**
	 * Returns the value of the '<em><b>Load Balance</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.LoadBalanceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balance</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_LoadBalance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<LoadBalanceDefinition> getLoadBalance();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.LogDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Log()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<LogDefinition> getLog();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.LoopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Loop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<LoopDefinition> getLoop();

	/**
	 * Returns the value of the '<em><b>Marshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.MarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marshal</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Marshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<MarshalDefinition> getMarshal();

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.MulticastDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Multicast()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<MulticastDefinition> getMulticast();

	/**
	 * Returns the value of the '<em><b>On Completion</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.OnCompletionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Completion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Completion</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_OnCompletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<OnCompletionDefinition> getOnCompletion();

	/**
	 * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Exception</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_OnException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<OnExceptionDefinition> getOnException();

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.PipelineDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Pipeline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<PipelineDefinition> getPipeline();

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.PolicyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Policy()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<PolicyDefinition> getPolicy();

	/**
	 * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.PollEnrichDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Enrich</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_PollEnrich()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<PollEnrichDefinition> getPollEnrich();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ProcessDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Process()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ProcessDefinition> getProcess();

	/**
	 * Returns the value of the '<em><b>Recipient List</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RecipientListDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient List</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RecipientList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RecipientListDefinition> getRecipientList();

	/**
	 * Returns the value of the '<em><b>Remove Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RemoveHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Header</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RemoveHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RemoveHeaderDefinition> getRemoveHeader();

	/**
	 * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RemoveHeadersDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Headers</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RemoveHeaders()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RemoveHeadersDefinition> getRemoveHeaders();

	/**
	 * Returns the value of the '<em><b>Remove Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RemovePropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Property</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RemoveProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RemovePropertyDefinition> getRemoveProperty();

	/**
	 * Returns the value of the '<em><b>Resequence</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ResequenceDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resequence</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Resequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ResequenceDefinition> getResequence();

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RollbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Rollback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RollbackDefinition> getRollback();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RouteDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Route()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RouteDefinition> getRoute();

	/**
	 * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.RoutingSlipDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Slip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Slip</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RoutingSlip()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<RoutingSlipDefinition> getRoutingSlip();

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SamplingDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Sample()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SamplingDefinition> getSample();

	/**
	 * Returns the value of the '<em><b>Set Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Body</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetBodyDefinition> getSetBody();

	/**
	 * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetExchangePatternDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Exchange Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Exchange Pattern</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetExchangePattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetExchangePatternDefinition> getSetExchangePattern();

	/**
	 * Returns the value of the '<em><b>Set Fault Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetFaultBodyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Fault Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Fault Body</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetFaultBody()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setFaultBody' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetFaultBodyDefinition> getSetFaultBody();

	/**
	 * Returns the value of the '<em><b>Set Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Header</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetHeaderDefinition> getSetHeader();

	/**
	 * Returns the value of the '<em><b>Set Out Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetOutHeaderDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Out Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Out Header</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetOutHeader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setOutHeader' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetOutHeaderDefinition> getSetOutHeader();

	/**
	 * Returns the value of the '<em><b>Set Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SetPropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Property</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_SetProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SetPropertyDefinition> getSetProperty();

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SortDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Sort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SortDefinition> getSort();

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.SplitDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<SplitDefinition> getSplit();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.StopDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<StopDefinition> getStop();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ThreadsDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Threads()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ThreadsDefinition> getThreads();

	/**
	 * Returns the value of the '<em><b>Throttle</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ThrottleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttle</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Throttle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ThrottleDefinition> getThrottle();

	/**
	 * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ThrowExceptionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Exception</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_ThrowException()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ThrowExceptionDefinition> getThrowException();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ToDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_To()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ToDefinition> getTo();

	/**
	 * Returns the value of the '<em><b>Transacted</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.TransactedDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transacted</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Transacted()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TransactedDefinition> getTransacted();

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.TransformDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Transform()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TransformDefinition> getTransform();

	/**
	 * Returns the value of the '<em><b>Do Try</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.TryDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Try</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Try</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_DoTry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<TryDefinition> getDoTry();

	/**
	 * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.UnmarshalDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmarshal</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Unmarshal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<UnmarshalDefinition> getUnmarshal();

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.ValidateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_Validate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<ValidateDefinition> getValidate();

	/**
	 * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference list.
	 * The list contents are of type {@link org.jboss.tools.switchyard.model.spring.WireTapDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Tap</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Tap</em>' containment reference list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_WireTap()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<WireTapDefinition> getWireTap();

	/**
	 * Returns the value of the '<em><b>On Redelivery Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Redelivery Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Redelivery Ref</em>' attribute.
	 * @see #setOnRedeliveryRef(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_OnRedeliveryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='onRedeliveryRef'"
	 * @generated
	 */
	String getOnRedeliveryRef();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getOnRedeliveryRef <em>On Redelivery Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Redelivery Ref</em>' attribute.
	 * @see #getOnRedeliveryRef()
	 * @generated
	 */
	void setOnRedeliveryRef(String value);

	/**
	 * Returns the value of the '<em><b>Redelivery Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redelivery Policy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redelivery Policy Ref</em>' attribute.
	 * @see #setRedeliveryPolicyRef(String)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_RedeliveryPolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='redeliveryPolicyRef'"
	 * @generated
	 */
	String getRedeliveryPolicyRef();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#getRedeliveryPolicyRef <em>Redelivery Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redelivery Policy Ref</em>' attribute.
	 * @see #getRedeliveryPolicyRef()
	 * @generated
	 */
	void setRedeliveryPolicyRef(String value);

	/**
	 * Returns the value of the '<em><b>Use Original Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Original Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Original Message</em>' attribute.
	 * @see #isSetUseOriginalMessage()
	 * @see #unsetUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_UseOriginalMessage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='useOriginalMessage'"
	 * @generated
	 */
	boolean isUseOriginalMessage();

	/**
	 * Sets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Original Message</em>' attribute.
	 * @see #isSetUseOriginalMessage()
	 * @see #unsetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @generated
	 */
	void setUseOriginalMessage(boolean value);

	/**
	 * Unsets the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @generated
	 */
	void unsetUseOriginalMessage();

	/**
	 * Returns whether the value of the '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition#isUseOriginalMessage <em>Use Original Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Original Message</em>' attribute is set.
	 * @see #unsetUseOriginalMessage()
	 * @see #isUseOriginalMessage()
	 * @see #setUseOriginalMessage(boolean)
	 * @generated
	 */
	boolean isSetUseOriginalMessage();

	/**
	 * Returns the value of the '<em><b>Any Attribute1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute1</em>' attribute list.
	 * @see org.jboss.tools.switchyard.model.spring.SpringPackage#getOnExceptionDefinition_AnyAttribute1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':72' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute1();

} // OnExceptionDefinition
