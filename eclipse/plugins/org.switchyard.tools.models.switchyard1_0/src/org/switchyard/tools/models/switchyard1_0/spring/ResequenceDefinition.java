/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resequence Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getBatchConfig <em>Batch Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getStreamConfig <em>Stream Config</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getExpressionDefinition <em>Expression Definition</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getEl <em>El</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getGroovy <em>Groovy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getHeader <em>Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getJxpath <em>Jxpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMvel <em>Mvel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getOgnl <em>Ognl</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPhp <em>Php</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPython <em>Python</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRef <em>Ref</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSpel <em>Spel</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSql <em>Sql</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getTokenize <em>Tokenize</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getXquery <em>Xquery</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition()
 * @model extendedMetaData="name='resequenceDefinition' kind='elementOnly'"
 * @generated
 */
public interface ResequenceDefinition extends ProcessorDefinition {
	/**
     * Returns the value of the '<em><b>Batch Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Batch Config</em>' containment reference.
     * @see #setBatchConfig(BatchResequencerConfig)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_BatchConfig()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='batch-config' namespace='##targetNamespace'"
     * @generated
     */
	BatchResequencerConfig getBatchConfig();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getBatchConfig <em>Batch Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Batch Config</em>' containment reference.
     * @see #getBatchConfig()
     * @generated
     */
	void setBatchConfig(BatchResequencerConfig value);

	/**
     * Returns the value of the '<em><b>Stream Config</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stream Config</em>' containment reference.
     * @see #setStreamConfig(StreamResequencerConfig)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_StreamConfig()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='stream-config' namespace='##targetNamespace'"
     * @generated
     */
	StreamResequencerConfig getStreamConfig();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getStreamConfig <em>Stream Config</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stream Config</em>' containment reference.
     * @see #getStreamConfig()
     * @generated
     */
	void setStreamConfig(StreamResequencerConfig value);

	/**
     * Returns the value of the '<em><b>Expression Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Definition</em>' containment reference.
     * @see #setExpressionDefinition(Expression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_ExpressionDefinition()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='expressionDefinition' namespace='##targetNamespace'"
     * @generated
     */
	Expression getExpressionDefinition();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getExpressionDefinition <em>Expression Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Definition</em>' containment reference.
     * @see #getExpressionDefinition()
     * @generated
     */
	void setExpressionDefinition(Expression value);

	/**
     * Returns the value of the '<em><b>Constant</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constant</em>' containment reference.
     * @see #setConstant(ConstantExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Constant()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='constant' namespace='##targetNamespace'"
     * @generated
     */
	ConstantExpression getConstant();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getConstant <em>Constant</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constant</em>' containment reference.
     * @see #getConstant()
     * @generated
     */
	void setConstant(ConstantExpression value);

	/**
     * Returns the value of the '<em><b>El</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>El</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>El</em>' containment reference.
     * @see #setEl(ElExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_El()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='el' namespace='##targetNamespace'"
     * @generated
     */
	ElExpression getEl();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getEl <em>El</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>El</em>' containment reference.
     * @see #getEl()
     * @generated
     */
	void setEl(ElExpression value);

	/**
     * Returns the value of the '<em><b>Groovy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groovy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Groovy</em>' containment reference.
     * @see #setGroovy(GroovyExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Groovy()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='groovy' namespace='##targetNamespace'"
     * @generated
     */
	GroovyExpression getGroovy();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getGroovy <em>Groovy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Groovy</em>' containment reference.
     * @see #getGroovy()
     * @generated
     */
	void setGroovy(GroovyExpression value);

	/**
     * Returns the value of the '<em><b>Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Header</em>' containment reference.
     * @see #setHeader(HeaderExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Header()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
     * @generated
     */
	HeaderExpression getHeader();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getHeader <em>Header</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header</em>' containment reference.
     * @see #getHeader()
     * @generated
     */
	void setHeader(HeaderExpression value);

	/**
     * Returns the value of the '<em><b>Jxpath</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jxpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Jxpath</em>' containment reference.
     * @see #setJxpath(JxPathExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Jxpath()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='jxpath' namespace='##targetNamespace'"
     * @generated
     */
	JxPathExpression getJxpath();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getJxpath <em>Jxpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Jxpath</em>' containment reference.
     * @see #getJxpath()
     * @generated
     */
	void setJxpath(JxPathExpression value);

	/**
     * Returns the value of the '<em><b>Java Script</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Java Script</em>' containment reference.
     * @see #setJavaScript(JavaScriptExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_JavaScript()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='javaScript' namespace='##targetNamespace'"
     * @generated
     */
	JavaScriptExpression getJavaScript();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getJavaScript <em>Java Script</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Java Script</em>' containment reference.
     * @see #getJavaScript()
     * @generated
     */
	void setJavaScript(JavaScriptExpression value);

	/**
     * Returns the value of the '<em><b>Language</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Language</em>' containment reference.
     * @see #setLanguage(LanguageExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Language()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
     * @generated
     */
	LanguageExpression getLanguage();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getLanguage <em>Language</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Language</em>' containment reference.
     * @see #getLanguage()
     * @generated
     */
	void setLanguage(LanguageExpression value);

	/**
     * Returns the value of the '<em><b>Method</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' containment reference.
     * @see #setMethod(MethodCallExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Method()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
     * @generated
     */
	MethodCallExpression getMethod();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMethod <em>Method</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' containment reference.
     * @see #getMethod()
     * @generated
     */
	void setMethod(MethodCallExpression value);

	/**
     * Returns the value of the '<em><b>Mvel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mvel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mvel</em>' containment reference.
     * @see #setMvel(MvelExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Mvel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='mvel' namespace='##targetNamespace'"
     * @generated
     */
	MvelExpression getMvel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getMvel <em>Mvel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mvel</em>' containment reference.
     * @see #getMvel()
     * @generated
     */
	void setMvel(MvelExpression value);

	/**
     * Returns the value of the '<em><b>Ognl</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ognl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ognl</em>' containment reference.
     * @see #setOgnl(OgnlExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Ognl()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ognl' namespace='##targetNamespace'"
     * @generated
     */
	OgnlExpression getOgnl();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getOgnl <em>Ognl</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ognl</em>' containment reference.
     * @see #getOgnl()
     * @generated
     */
	void setOgnl(OgnlExpression value);

	/**
     * Returns the value of the '<em><b>Php</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Php</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Php</em>' containment reference.
     * @see #setPhp(PhpExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Php()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='php' namespace='##targetNamespace'"
     * @generated
     */
	PhpExpression getPhp();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPhp <em>Php</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Php</em>' containment reference.
     * @see #getPhp()
     * @generated
     */
	void setPhp(PhpExpression value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #isSetProperty()
     * @see #unsetProperty()
     * @see #setProperty(EObject)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Property()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	EObject getProperty();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #isSetProperty()
     * @see #unsetProperty()
     * @see #getProperty()
     * @generated
     */
	void setProperty(EObject value);

	/**
     * Unsets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSetProperty()
     * @see #getProperty()
     * @see #setProperty(EObject)
     * @generated
     */
	void unsetProperty();

	/**
     * Returns whether the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getProperty <em>Property</em>}' containment reference is set.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return whether the value of the '<em>Property</em>' containment reference is set.
     * @see #unsetProperty()
     * @see #getProperty()
     * @see #setProperty(EObject)
     * @generated
     */
	boolean isSetProperty();

	/**
     * Returns the value of the '<em><b>Python</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Python</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Python</em>' containment reference.
     * @see #setPython(PythonExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Python()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='python' namespace='##targetNamespace'"
     * @generated
     */
	PythonExpression getPython();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getPython <em>Python</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Python</em>' containment reference.
     * @see #getPython()
     * @generated
     */
	void setPython(PythonExpression value);

	/**
     * Returns the value of the '<em><b>Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' containment reference.
     * @see #setRef(RefExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Ref()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ref' namespace='##targetNamespace'"
     * @generated
     */
	RefExpression getRef();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRef <em>Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' containment reference.
     * @see #getRef()
     * @generated
     */
	void setRef(RefExpression value);

	/**
     * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ruby</em>' containment reference.
     * @see #setRuby(RubyExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Ruby()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
     * @generated
     */
	RubyExpression getRuby();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getRuby <em>Ruby</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ruby</em>' containment reference.
     * @see #getRuby()
     * @generated
     */
	void setRuby(RubyExpression value);

	/**
     * Returns the value of the '<em><b>Simple</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Simple</em>' containment reference.
     * @see #setSimple(SimpleExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Simple()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='simple' namespace='##targetNamespace'"
     * @generated
     */
	SimpleExpression getSimple();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSimple <em>Simple</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple</em>' containment reference.
     * @see #getSimple()
     * @generated
     */
	void setSimple(SimpleExpression value);

	/**
     * Returns the value of the '<em><b>Spel</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spel</em>' containment reference.
     * @see #setSpel(SpELExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Spel()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='spel' namespace='##targetNamespace'"
     * @generated
     */
	SpELExpression getSpel();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSpel <em>Spel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spel</em>' containment reference.
     * @see #getSpel()
     * @generated
     */
	void setSpel(SpELExpression value);

	/**
     * Returns the value of the '<em><b>Sql</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sql</em>' containment reference.
     * @see #setSql(SqlExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Sql()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='sql' namespace='##targetNamespace'"
     * @generated
     */
	SqlExpression getSql();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getSql <em>Sql</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sql</em>' containment reference.
     * @see #getSql()
     * @generated
     */
	void setSql(SqlExpression value);

	/**
     * Returns the value of the '<em><b>Tokenize</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokenize</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tokenize</em>' containment reference.
     * @see #setTokenize(TokenizerExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Tokenize()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='tokenize' namespace='##targetNamespace'"
     * @generated
     */
	TokenizerExpression getTokenize();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getTokenize <em>Tokenize</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tokenize</em>' containment reference.
     * @see #getTokenize()
     * @generated
     */
	void setTokenize(TokenizerExpression value);

	/**
     * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xpath</em>' containment reference.
     * @see #setXpath(XPathExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Xpath()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
     * @generated
     */
	XPathExpression getXpath();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getXpath <em>Xpath</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath</em>' containment reference.
     * @see #getXpath()
     * @generated
     */
	void setXpath(XPathExpression value);

	/**
     * Returns the value of the '<em><b>Xquery</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xquery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Xquery</em>' containment reference.
     * @see #setXquery(XQueryExpression)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Xquery()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='xquery' namespace='##targetNamespace'"
     * @generated
     */
	XQueryExpression getXquery();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition#getXquery <em>Xquery</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xquery</em>' containment reference.
     * @see #getXquery()
     * @generated
     */
	void setXquery(XQueryExpression value);

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:28'"
     * @generated
     */
	FeatureMap getGroup();

	/**
     * Returns the value of the '<em><b>Aop</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.AopDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Aop</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Aop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aop' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<AopDefinition> getAop();

	/**
     * Returns the value of the '<em><b>Aggregate</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Aggregate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<AggregateDefinition> getAggregate();

	/**
     * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bean</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Bean()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='bean' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<BeanDefinition> getBean();

	/**
     * Returns the value of the '<em><b>Do Catch</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.CatchDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Catch</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_DoCatch()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doCatch' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<CatchDefinition> getDoCatch();

	/**
     * Returns the value of the '<em><b>When</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_When()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<WhenDefinition> getWhen();

	/**
     * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Choice</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Choice()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ChoiceDefinition> getChoice();

	/**
     * Returns the value of the '<em><b>Otherwise</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Otherwise</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Otherwise()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='otherwise' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<OtherwiseDefinition> getOtherwise();

	/**
     * Returns the value of the '<em><b>Convert Body To</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ConvertBodyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert Body To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Convert Body To</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_ConvertBodyTo()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='convertBodyTo' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ConvertBodyDefinition> getConvertBodyTo();

	/**
     * Returns the value of the '<em><b>Delay</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Delay()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='delay' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<DelayDefinition> getDelay();

	/**
     * Returns the value of the '<em><b>Dynamic Router</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dynamic Router</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_DynamicRouter()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='dynamicRouter' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<DynamicRouterDefinition> getDynamicRouter();

	/**
     * Returns the value of the '<em><b>Enrich</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enrich</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Enrich()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='enrich' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<EnrichDefinition> getEnrich();

	/**
     * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Filter</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Filter()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<FilterDefinition> getFilter();

	/**
     * Returns the value of the '<em><b>Do Finally</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Finally</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Finally</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_DoFinally()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doFinally' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<FinallyDefinition> getDoFinally();

	/**
     * Returns the value of the '<em><b>Idempotent Consumer</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Consumer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Idempotent Consumer</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_IdempotentConsumer()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='idempotentConsumer' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<IdempotentConsumerDefinition> getIdempotentConsumer();

	/**
     * Returns the value of the '<em><b>In Only</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InOnlyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Only</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>In Only</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_InOnly()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOnly' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<InOnlyDefinition> getInOnly();

	/**
     * Returns the value of the '<em><b>In Out</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InOutDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>In Out</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_InOut()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='inOut' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<InOutDefinition> getInOut();

	/**
     * Returns the value of the '<em><b>Intercept</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Intercept()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='intercept' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<InterceptDefinition> getIntercept();

	/**
     * Returns the value of the '<em><b>Intercept From</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept From</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_InterceptFrom()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptFrom' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<InterceptFromDefinition> getInterceptFrom();

	/**
     * Returns the value of the '<em><b>Intercept To Endpoint</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept To Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Intercept To Endpoint</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_InterceptToEndpoint()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interceptToEndpoint' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint();

	/**
     * Returns the value of the '<em><b>Load Balance</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Load Balance</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_LoadBalance()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loadBalance' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<LoadBalanceDefinition> getLoadBalance();

	/**
     * Returns the value of the '<em><b>Log</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LogDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Log</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Log()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<LogDefinition> getLog();

	/**
     * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Loop</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Loop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<LoopDefinition> getLoop();

	/**
     * Returns the value of the '<em><b>Marshal</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Marshal</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Marshal()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='marshal' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<MarshalDefinition> getMarshal();

	/**
     * Returns the value of the '<em><b>Multicast</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicast</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Multicast</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Multicast()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='multicast' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<MulticastDefinition> getMulticast();

	/**
     * Returns the value of the '<em><b>On Completion</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Completion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Completion</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_OnCompletion()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onCompletion' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<OnCompletionDefinition> getOnCompletion();

	/**
     * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>On Exception</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_OnException()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='onException' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<OnExceptionDefinition> getOnException();

	/**
     * Returns the value of the '<em><b>Pipeline</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PipelineDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Pipeline</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Pipeline()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pipeline' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<PipelineDefinition> getPipeline();

	/**
     * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PolicyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Policy</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Policy()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<PolicyDefinition> getPolicy();

	/**
     * Returns the value of the '<em><b>Poll Enrich</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Enrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Poll Enrich</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_PollEnrich()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='pollEnrich' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<PollEnrichDefinition> getPollEnrich();

	/**
     * Returns the value of the '<em><b>Process</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ProcessDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Process()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='process' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ProcessDefinition> getProcess();

	/**
     * Returns the value of the '<em><b>Recipient List</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Recipient List</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_RecipientList()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='recipientList' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RecipientListDefinition> getRecipientList();

	/**
     * Returns the value of the '<em><b>Remove Header</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Header</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_RemoveHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeader' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RemoveHeaderDefinition> getRemoveHeader();

	/**
     * Returns the value of the '<em><b>Remove Headers</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Headers</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_RemoveHeaders()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeHeaders' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RemoveHeadersDefinition> getRemoveHeaders();

	/**
     * Returns the value of the '<em><b>Remove Property</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Property</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_RemoveProperty()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='removeProperty' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RemovePropertyDefinition> getRemoveProperty();

	/**
     * Returns the value of the '<em><b>Resequence</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resequence</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Resequence()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resequence' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ResequenceDefinition> getResequence();

	/**
     * Returns the value of the '<em><b>Rollback</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rollback</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Rollback()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='rollback' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RollbackDefinition> getRollback();

	/**
     * Returns the value of the '<em><b>Route</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Route</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Route()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='route' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RouteDefinition> getRoute();

	/**
     * Returns the value of the '<em><b>Routing Slip</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.RoutingSlipDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Slip</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Routing Slip</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_RoutingSlip()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='routingSlip' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<RoutingSlipDefinition> getRoutingSlip();

	/**
     * Returns the value of the '<em><b>Sample</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sample</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Sample()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sample' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SamplingDefinition> getSample();

	/**
     * Returns the value of the '<em><b>Set Body</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetBodyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Body</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetBody()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setBody' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetBodyDefinition> getSetBody();

	/**
     * Returns the value of the '<em><b>Set Exchange Pattern</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Exchange Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Exchange Pattern</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetExchangePattern()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setExchangePattern' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetExchangePatternDefinition> getSetExchangePattern();

	/**
     * Returns the value of the '<em><b>Set Fault Body</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetFaultBodyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Fault Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Fault Body</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetFaultBody()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setFaultBody' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetFaultBodyDefinition> getSetFaultBody();

	/**
     * Returns the value of the '<em><b>Set Header</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Header</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setHeader' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetHeaderDefinition> getSetHeader();

	/**
     * Returns the value of the '<em><b>Set Out Header</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetOutHeaderDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Out Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Out Header</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetOutHeader()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setOutHeader' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetOutHeaderDefinition> getSetOutHeader();

	/**
     * Returns the value of the '<em><b>Set Property</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SetPropertyDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Set Property</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_SetProperty()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='setProperty' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SetPropertyDefinition> getSetProperty();

	/**
     * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SortDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Sort</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Sort()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sort' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SortDefinition> getSort();

	/**
     * Returns the value of the '<em><b>Split</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Split</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Split()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<SplitDefinition> getSplit();

	/**
     * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.StopDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stop</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Stop()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<StopDefinition> getStop();

	/**
     * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Threads</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Threads()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='threads' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ThreadsDefinition> getThreads();

	/**
     * Returns the value of the '<em><b>Throttle</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throttle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Throttle</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Throttle()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throttle' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ThrottleDefinition> getThrottle();

	/**
     * Returns the value of the '<em><b>Throw Exception</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Throw Exception</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_ThrowException()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='throwException' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ThrowExceptionDefinition> getThrowException();

	/**
     * Returns the value of the '<em><b>To</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ToDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_To()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='to' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ToDefinition> getTo();

	/**
     * Returns the value of the '<em><b>Transacted</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transacted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transacted</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Transacted()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transacted' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<TransactedDefinition> getTransacted();

	/**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Transform()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<TransformDefinition> getTransform();

	/**
     * Returns the value of the '<em><b>Do Try</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.TryDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Try</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Do Try</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_DoTry()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='doTry' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<TryDefinition> getDoTry();

	/**
     * Returns the value of the '<em><b>Unmarshal</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unmarshal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unmarshal</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Unmarshal()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='unmarshal' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<UnmarshalDefinition> getUnmarshal();

	/**
     * Returns the value of the '<em><b>Validate</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validate</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_Validate()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<ValidateDefinition> getValidate();

	/**
     * Returns the value of the '<em><b>Wire Tap</b></em>' containment reference list.
     * The list contents are of type {@link org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Tap</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Tap</em>' containment reference list.
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_WireTap()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='wireTap' namespace='##targetNamespace' group='#group:28'"
     * @generated
     */
	EList<WireTapDefinition> getWireTap();

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
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getResequenceDefinition_AnyAttribute1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':87' processing='skip'"
     * @generated
     */
	FeatureMap getAnyAttribute1();

} // ResequenceDefinition
