/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.switchyard.tools.models.switchyard1_0.spring.AggregateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.AopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.BeanDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.CatchDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ChoiceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ConvertBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DelayDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.DynamicRouterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.EnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FilterDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.FinallyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.IdempotentConsumerDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOnlyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InOutDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptFromDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.InterceptSendToEndpointDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LoadBalanceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LogDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.LoopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.MulticastDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnCompletionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OnExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.OtherwiseDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.Output;
import org.switchyard.tools.models.switchyard1_0.spring.PipelineDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PolicyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.PollEnrichDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ProcessDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RecipientListDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemoveHeadersDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RemovePropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ResequenceDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RollbackDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RouteDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.RoutingSlipDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SamplingDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetExchangePatternDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetFaultBodyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetOutHeaderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SetPropertyDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SortDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SplitDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;
import org.switchyard.tools.models.switchyard1_0.spring.StopDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThreadsDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrottleDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ThrowExceptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ToDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransactedDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TransformDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.TryDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.UnmarshalDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.ValidateDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WhenDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.WireTapDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getDoCatch <em>Do Catch</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getConvertBodyTo <em>Convert Body To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getDynamicRouter <em>Dynamic Router</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getEnrich <em>Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getDoFinally <em>Do Finally</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getIdempotentConsumer <em>Idempotent Consumer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getInOnly <em>In Only</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getInOut <em>In Out</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getIntercept <em>Intercept</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getInterceptFrom <em>Intercept From</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getInterceptToEndpoint <em>Intercept To Endpoint</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getMarshal <em>Marshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getOnCompletion <em>On Completion</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getOnException <em>On Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getPollEnrich <em>Poll Enrich</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRecipientList <em>Recipient List</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRemoveHeader <em>Remove Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRemoveHeaders <em>Remove Headers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRemoveProperty <em>Remove Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getResequence <em>Resequence</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getRoutingSlip <em>Routing Slip</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSample <em>Sample</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetExchangePattern <em>Set Exchange Pattern</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetFaultBody <em>Set Fault Body</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetHeader <em>Set Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetOutHeader <em>Set Out Header</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSetProperty <em>Set Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getThrottle <em>Throttle</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getThrowException <em>Throw Exception</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getTransacted <em>Transacted</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getDoTry <em>Do Try</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getUnmarshal <em>Unmarshal</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getWireTap <em>Wire Tap</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.OutputImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends ProcessorDefinitionImpl implements Output {
	/**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
	protected FeatureMap group;

	/**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
	protected FeatureMap anyAttribute1;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected OutputImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getOutput();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, SpringPackage.OUTPUT__GROUP);
        }
        return group;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AopDefinition> getAop() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Aop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<AggregateDefinition> getAggregate() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Aggregate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BeanDefinition> getBean() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Bean());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<CatchDefinition> getDoCatch() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_DoCatch());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WhenDefinition> getWhen() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_When());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ChoiceDefinition> getChoice() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Choice());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OtherwiseDefinition> getOtherwise() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Otherwise());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ConvertBodyDefinition> getConvertBodyTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_ConvertBodyTo());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DelayDefinition> getDelay() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Delay());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<DynamicRouterDefinition> getDynamicRouter() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_DynamicRouter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<EnrichDefinition> getEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Enrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FilterDefinition> getFilter() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Filter());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<FinallyDefinition> getDoFinally() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_DoFinally());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<IdempotentConsumerDefinition> getIdempotentConsumer() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_IdempotentConsumer());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOnlyDefinition> getInOnly() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_InOnly());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InOutDefinition> getInOut() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_InOut());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptDefinition> getIntercept() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Intercept());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptFromDefinition> getInterceptFrom() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_InterceptFrom());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<InterceptSendToEndpointDefinition> getInterceptToEndpoint() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_InterceptToEndpoint());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoadBalanceDefinition> getLoadBalance() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_LoadBalance());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LogDefinition> getLog() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Log());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<LoopDefinition> getLoop() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Loop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MarshalDefinition> getMarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Marshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MulticastDefinition> getMulticast() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Multicast());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnCompletionDefinition> getOnCompletion() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_OnCompletion());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<OnExceptionDefinition> getOnException() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_OnException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PipelineDefinition> getPipeline() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Pipeline());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PolicyDefinition> getPolicy() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Policy());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PollEnrichDefinition> getPollEnrich() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_PollEnrich());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ProcessDefinition> getProcess() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Process());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RecipientListDefinition> getRecipientList() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_RecipientList());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeaderDefinition> getRemoveHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_RemoveHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemoveHeadersDefinition> getRemoveHeaders() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_RemoveHeaders());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RemovePropertyDefinition> getRemoveProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_RemoveProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ResequenceDefinition> getResequence() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Resequence());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RollbackDefinition> getRollback() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Rollback());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RouteDefinition> getRoute() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Route());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<RoutingSlipDefinition> getRoutingSlip() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_RoutingSlip());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SamplingDefinition> getSample() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Sample());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetBodyDefinition> getSetBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetExchangePatternDefinition> getSetExchangePattern() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetExchangePattern());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetFaultBodyDefinition> getSetFaultBody() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetFaultBody());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetHeaderDefinition> getSetHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetOutHeaderDefinition> getSetOutHeader() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetOutHeader());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SetPropertyDefinition> getSetProperty() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_SetProperty());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SortDefinition> getSort() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Sort());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SplitDefinition> getSplit() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Split());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<StopDefinition> getStop() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Stop());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThreadsDefinition> getThreads() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Threads());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrottleDefinition> getThrottle() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Throttle());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ThrowExceptionDefinition> getThrowException() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_ThrowException());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ToDefinition> getTo() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_To());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransactedDefinition> getTransacted() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Transacted());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TransformDefinition> getTransform() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Transform());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TryDefinition> getDoTry() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_DoTry());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<UnmarshalDefinition> getUnmarshal() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Unmarshal());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ValidateDefinition> getValidate() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_Validate());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WireTapDefinition> getWireTap() {
        return getGroup().list(SpringPackage.eINSTANCE.getOutput_WireTap());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getAnyAttribute1() {
        if (anyAttribute1 == null) {
            anyAttribute1 = new BasicFeatureMap(this, SpringPackage.OUTPUT__ANY_ATTRIBUTE1);
        }
        return anyAttribute1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SpringPackage.OUTPUT__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__AOP:
                return ((InternalEList<?>)getAop()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__AGGREGATE:
                return ((InternalEList<?>)getAggregate()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__BEAN:
                return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__DO_CATCH:
                return ((InternalEList<?>)getDoCatch()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__WHEN:
                return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__CHOICE:
                return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__OTHERWISE:
                return ((InternalEList<?>)getOtherwise()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__CONVERT_BODY_TO:
                return ((InternalEList<?>)getConvertBodyTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__DELAY:
                return ((InternalEList<?>)getDelay()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__DYNAMIC_ROUTER:
                return ((InternalEList<?>)getDynamicRouter()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ENRICH:
                return ((InternalEList<?>)getEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__FILTER:
                return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__DO_FINALLY:
                return ((InternalEList<?>)getDoFinally()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__IDEMPOTENT_CONSUMER:
                return ((InternalEList<?>)getIdempotentConsumer()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__IN_ONLY:
                return ((InternalEList<?>)getInOnly()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__IN_OUT:
                return ((InternalEList<?>)getInOut()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__INTERCEPT:
                return ((InternalEList<?>)getIntercept()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__INTERCEPT_FROM:
                return ((InternalEList<?>)getInterceptFrom()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__INTERCEPT_TO_ENDPOINT:
                return ((InternalEList<?>)getInterceptToEndpoint()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__LOAD_BALANCE:
                return ((InternalEList<?>)getLoadBalance()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__LOG:
                return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__LOOP:
                return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__MARSHAL:
                return ((InternalEList<?>)getMarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__MULTICAST:
                return ((InternalEList<?>)getMulticast()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ON_COMPLETION:
                return ((InternalEList<?>)getOnCompletion()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ON_EXCEPTION:
                return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__PIPELINE:
                return ((InternalEList<?>)getPipeline()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__POLICY:
                return ((InternalEList<?>)getPolicy()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__POLL_ENRICH:
                return ((InternalEList<?>)getPollEnrich()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__PROCESS:
                return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__RECIPIENT_LIST:
                return ((InternalEList<?>)getRecipientList()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__REMOVE_HEADER:
                return ((InternalEList<?>)getRemoveHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__REMOVE_HEADERS:
                return ((InternalEList<?>)getRemoveHeaders()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__REMOVE_PROPERTY:
                return ((InternalEList<?>)getRemoveProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__RESEQUENCE:
                return ((InternalEList<?>)getResequence()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ROLLBACK:
                return ((InternalEList<?>)getRollback()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ROUTE:
                return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ROUTING_SLIP:
                return ((InternalEList<?>)getRoutingSlip()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SAMPLE:
                return ((InternalEList<?>)getSample()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_BODY:
                return ((InternalEList<?>)getSetBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_EXCHANGE_PATTERN:
                return ((InternalEList<?>)getSetExchangePattern()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_FAULT_BODY:
                return ((InternalEList<?>)getSetFaultBody()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_HEADER:
                return ((InternalEList<?>)getSetHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_OUT_HEADER:
                return ((InternalEList<?>)getSetOutHeader()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SET_PROPERTY:
                return ((InternalEList<?>)getSetProperty()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SORT:
                return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__SPLIT:
                return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__STOP:
                return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__THREADS:
                return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__THROTTLE:
                return ((InternalEList<?>)getThrottle()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__THROW_EXCEPTION:
                return ((InternalEList<?>)getThrowException()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__TO:
                return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__TRANSACTED:
                return ((InternalEList<?>)getTransacted()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__TRANSFORM:
                return ((InternalEList<?>)getTransform()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__DO_TRY:
                return ((InternalEList<?>)getDoTry()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__UNMARSHAL:
                return ((InternalEList<?>)getUnmarshal()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__VALIDATE:
                return ((InternalEList<?>)getValidate()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__WIRE_TAP:
                return ((InternalEList<?>)getWireTap()).basicRemove(otherEnd, msgs);
            case SpringPackage.OUTPUT__ANY_ATTRIBUTE1:
                return ((InternalEList<?>)getAnyAttribute1()).basicRemove(otherEnd, msgs);
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
            case SpringPackage.OUTPUT__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case SpringPackage.OUTPUT__AOP:
                return getAop();
            case SpringPackage.OUTPUT__AGGREGATE:
                return getAggregate();
            case SpringPackage.OUTPUT__BEAN:
                return getBean();
            case SpringPackage.OUTPUT__DO_CATCH:
                return getDoCatch();
            case SpringPackage.OUTPUT__WHEN:
                return getWhen();
            case SpringPackage.OUTPUT__CHOICE:
                return getChoice();
            case SpringPackage.OUTPUT__OTHERWISE:
                return getOtherwise();
            case SpringPackage.OUTPUT__CONVERT_BODY_TO:
                return getConvertBodyTo();
            case SpringPackage.OUTPUT__DELAY:
                return getDelay();
            case SpringPackage.OUTPUT__DYNAMIC_ROUTER:
                return getDynamicRouter();
            case SpringPackage.OUTPUT__ENRICH:
                return getEnrich();
            case SpringPackage.OUTPUT__FILTER:
                return getFilter();
            case SpringPackage.OUTPUT__DO_FINALLY:
                return getDoFinally();
            case SpringPackage.OUTPUT__IDEMPOTENT_CONSUMER:
                return getIdempotentConsumer();
            case SpringPackage.OUTPUT__IN_ONLY:
                return getInOnly();
            case SpringPackage.OUTPUT__IN_OUT:
                return getInOut();
            case SpringPackage.OUTPUT__INTERCEPT:
                return getIntercept();
            case SpringPackage.OUTPUT__INTERCEPT_FROM:
                return getInterceptFrom();
            case SpringPackage.OUTPUT__INTERCEPT_TO_ENDPOINT:
                return getInterceptToEndpoint();
            case SpringPackage.OUTPUT__LOAD_BALANCE:
                return getLoadBalance();
            case SpringPackage.OUTPUT__LOG:
                return getLog();
            case SpringPackage.OUTPUT__LOOP:
                return getLoop();
            case SpringPackage.OUTPUT__MARSHAL:
                return getMarshal();
            case SpringPackage.OUTPUT__MULTICAST:
                return getMulticast();
            case SpringPackage.OUTPUT__ON_COMPLETION:
                return getOnCompletion();
            case SpringPackage.OUTPUT__ON_EXCEPTION:
                return getOnException();
            case SpringPackage.OUTPUT__PIPELINE:
                return getPipeline();
            case SpringPackage.OUTPUT__POLICY:
                return getPolicy();
            case SpringPackage.OUTPUT__POLL_ENRICH:
                return getPollEnrich();
            case SpringPackage.OUTPUT__PROCESS:
                return getProcess();
            case SpringPackage.OUTPUT__RECIPIENT_LIST:
                return getRecipientList();
            case SpringPackage.OUTPUT__REMOVE_HEADER:
                return getRemoveHeader();
            case SpringPackage.OUTPUT__REMOVE_HEADERS:
                return getRemoveHeaders();
            case SpringPackage.OUTPUT__REMOVE_PROPERTY:
                return getRemoveProperty();
            case SpringPackage.OUTPUT__RESEQUENCE:
                return getResequence();
            case SpringPackage.OUTPUT__ROLLBACK:
                return getRollback();
            case SpringPackage.OUTPUT__ROUTE:
                return getRoute();
            case SpringPackage.OUTPUT__ROUTING_SLIP:
                return getRoutingSlip();
            case SpringPackage.OUTPUT__SAMPLE:
                return getSample();
            case SpringPackage.OUTPUT__SET_BODY:
                return getSetBody();
            case SpringPackage.OUTPUT__SET_EXCHANGE_PATTERN:
                return getSetExchangePattern();
            case SpringPackage.OUTPUT__SET_FAULT_BODY:
                return getSetFaultBody();
            case SpringPackage.OUTPUT__SET_HEADER:
                return getSetHeader();
            case SpringPackage.OUTPUT__SET_OUT_HEADER:
                return getSetOutHeader();
            case SpringPackage.OUTPUT__SET_PROPERTY:
                return getSetProperty();
            case SpringPackage.OUTPUT__SORT:
                return getSort();
            case SpringPackage.OUTPUT__SPLIT:
                return getSplit();
            case SpringPackage.OUTPUT__STOP:
                return getStop();
            case SpringPackage.OUTPUT__THREADS:
                return getThreads();
            case SpringPackage.OUTPUT__THROTTLE:
                return getThrottle();
            case SpringPackage.OUTPUT__THROW_EXCEPTION:
                return getThrowException();
            case SpringPackage.OUTPUT__TO:
                return getTo();
            case SpringPackage.OUTPUT__TRANSACTED:
                return getTransacted();
            case SpringPackage.OUTPUT__TRANSFORM:
                return getTransform();
            case SpringPackage.OUTPUT__DO_TRY:
                return getDoTry();
            case SpringPackage.OUTPUT__UNMARSHAL:
                return getUnmarshal();
            case SpringPackage.OUTPUT__VALIDATE:
                return getValidate();
            case SpringPackage.OUTPUT__WIRE_TAP:
                return getWireTap();
            case SpringPackage.OUTPUT__ANY_ATTRIBUTE1:
                if (coreType) return getAnyAttribute1();
                return ((FeatureMap.Internal)getAnyAttribute1()).getWrapper();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.OUTPUT__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case SpringPackage.OUTPUT__AOP:
                getAop().clear();
                getAop().addAll((Collection<? extends AopDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__AGGREGATE:
                getAggregate().clear();
                getAggregate().addAll((Collection<? extends AggregateDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__BEAN:
                getBean().clear();
                getBean().addAll((Collection<? extends BeanDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__DO_CATCH:
                getDoCatch().clear();
                getDoCatch().addAll((Collection<? extends CatchDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__WHEN:
                getWhen().clear();
                getWhen().addAll((Collection<? extends WhenDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__CHOICE:
                getChoice().clear();
                getChoice().addAll((Collection<? extends ChoiceDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__OTHERWISE:
                getOtherwise().clear();
                getOtherwise().addAll((Collection<? extends OtherwiseDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                getConvertBodyTo().addAll((Collection<? extends ConvertBodyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__DELAY:
                getDelay().clear();
                getDelay().addAll((Collection<? extends DelayDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                getDynamicRouter().addAll((Collection<? extends DynamicRouterDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ENRICH:
                getEnrich().clear();
                getEnrich().addAll((Collection<? extends EnrichDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__FILTER:
                getFilter().clear();
                getFilter().addAll((Collection<? extends FilterDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__DO_FINALLY:
                getDoFinally().clear();
                getDoFinally().addAll((Collection<? extends FinallyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                getIdempotentConsumer().addAll((Collection<? extends IdempotentConsumerDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__IN_ONLY:
                getInOnly().clear();
                getInOnly().addAll((Collection<? extends InOnlyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__IN_OUT:
                getInOut().clear();
                getInOut().addAll((Collection<? extends InOutDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__INTERCEPT:
                getIntercept().clear();
                getIntercept().addAll((Collection<? extends InterceptDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__INTERCEPT_FROM:
                getInterceptFrom().clear();
                getInterceptFrom().addAll((Collection<? extends InterceptFromDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                getInterceptToEndpoint().addAll((Collection<? extends InterceptSendToEndpointDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__LOAD_BALANCE:
                getLoadBalance().clear();
                getLoadBalance().addAll((Collection<? extends LoadBalanceDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__LOG:
                getLog().clear();
                getLog().addAll((Collection<? extends LogDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__LOOP:
                getLoop().clear();
                getLoop().addAll((Collection<? extends LoopDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__MARSHAL:
                getMarshal().clear();
                getMarshal().addAll((Collection<? extends MarshalDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__MULTICAST:
                getMulticast().clear();
                getMulticast().addAll((Collection<? extends MulticastDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ON_COMPLETION:
                getOnCompletion().clear();
                getOnCompletion().addAll((Collection<? extends OnCompletionDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ON_EXCEPTION:
                getOnException().clear();
                getOnException().addAll((Collection<? extends OnExceptionDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__PIPELINE:
                getPipeline().clear();
                getPipeline().addAll((Collection<? extends PipelineDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__POLICY:
                getPolicy().clear();
                getPolicy().addAll((Collection<? extends PolicyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__POLL_ENRICH:
                getPollEnrich().clear();
                getPollEnrich().addAll((Collection<? extends PollEnrichDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__PROCESS:
                getProcess().clear();
                getProcess().addAll((Collection<? extends ProcessDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__RECIPIENT_LIST:
                getRecipientList().clear();
                getRecipientList().addAll((Collection<? extends RecipientListDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__REMOVE_HEADER:
                getRemoveHeader().clear();
                getRemoveHeader().addAll((Collection<? extends RemoveHeaderDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                getRemoveHeaders().addAll((Collection<? extends RemoveHeadersDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                getRemoveProperty().addAll((Collection<? extends RemovePropertyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__RESEQUENCE:
                getResequence().clear();
                getResequence().addAll((Collection<? extends ResequenceDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ROLLBACK:
                getRollback().clear();
                getRollback().addAll((Collection<? extends RollbackDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ROUTE:
                getRoute().clear();
                getRoute().addAll((Collection<? extends RouteDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ROUTING_SLIP:
                getRoutingSlip().clear();
                getRoutingSlip().addAll((Collection<? extends RoutingSlipDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SAMPLE:
                getSample().clear();
                getSample().addAll((Collection<? extends SamplingDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_BODY:
                getSetBody().clear();
                getSetBody().addAll((Collection<? extends SetBodyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                getSetExchangePattern().addAll((Collection<? extends SetExchangePatternDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_FAULT_BODY:
                getSetFaultBody().clear();
                getSetFaultBody().addAll((Collection<? extends SetFaultBodyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_HEADER:
                getSetHeader().clear();
                getSetHeader().addAll((Collection<? extends SetHeaderDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_OUT_HEADER:
                getSetOutHeader().clear();
                getSetOutHeader().addAll((Collection<? extends SetOutHeaderDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SET_PROPERTY:
                getSetProperty().clear();
                getSetProperty().addAll((Collection<? extends SetPropertyDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SORT:
                getSort().clear();
                getSort().addAll((Collection<? extends SortDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__SPLIT:
                getSplit().clear();
                getSplit().addAll((Collection<? extends SplitDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__STOP:
                getStop().clear();
                getStop().addAll((Collection<? extends StopDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__THREADS:
                getThreads().clear();
                getThreads().addAll((Collection<? extends ThreadsDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__THROTTLE:
                getThrottle().clear();
                getThrottle().addAll((Collection<? extends ThrottleDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__THROW_EXCEPTION:
                getThrowException().clear();
                getThrowException().addAll((Collection<? extends ThrowExceptionDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__TO:
                getTo().clear();
                getTo().addAll((Collection<? extends ToDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__TRANSACTED:
                getTransacted().clear();
                getTransacted().addAll((Collection<? extends TransactedDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__TRANSFORM:
                getTransform().clear();
                getTransform().addAll((Collection<? extends TransformDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__DO_TRY:
                getDoTry().clear();
                getDoTry().addAll((Collection<? extends TryDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__UNMARSHAL:
                getUnmarshal().clear();
                getUnmarshal().addAll((Collection<? extends UnmarshalDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__VALIDATE:
                getValidate().clear();
                getValidate().addAll((Collection<? extends ValidateDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__WIRE_TAP:
                getWireTap().clear();
                getWireTap().addAll((Collection<? extends WireTapDefinition>)newValue);
                return;
            case SpringPackage.OUTPUT__ANY_ATTRIBUTE1:
                ((FeatureMap.Internal)getAnyAttribute1()).set(newValue);
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
            case SpringPackage.OUTPUT__GROUP:
                getGroup().clear();
                return;
            case SpringPackage.OUTPUT__AOP:
                getAop().clear();
                return;
            case SpringPackage.OUTPUT__AGGREGATE:
                getAggregate().clear();
                return;
            case SpringPackage.OUTPUT__BEAN:
                getBean().clear();
                return;
            case SpringPackage.OUTPUT__DO_CATCH:
                getDoCatch().clear();
                return;
            case SpringPackage.OUTPUT__WHEN:
                getWhen().clear();
                return;
            case SpringPackage.OUTPUT__CHOICE:
                getChoice().clear();
                return;
            case SpringPackage.OUTPUT__OTHERWISE:
                getOtherwise().clear();
                return;
            case SpringPackage.OUTPUT__CONVERT_BODY_TO:
                getConvertBodyTo().clear();
                return;
            case SpringPackage.OUTPUT__DELAY:
                getDelay().clear();
                return;
            case SpringPackage.OUTPUT__DYNAMIC_ROUTER:
                getDynamicRouter().clear();
                return;
            case SpringPackage.OUTPUT__ENRICH:
                getEnrich().clear();
                return;
            case SpringPackage.OUTPUT__FILTER:
                getFilter().clear();
                return;
            case SpringPackage.OUTPUT__DO_FINALLY:
                getDoFinally().clear();
                return;
            case SpringPackage.OUTPUT__IDEMPOTENT_CONSUMER:
                getIdempotentConsumer().clear();
                return;
            case SpringPackage.OUTPUT__IN_ONLY:
                getInOnly().clear();
                return;
            case SpringPackage.OUTPUT__IN_OUT:
                getInOut().clear();
                return;
            case SpringPackage.OUTPUT__INTERCEPT:
                getIntercept().clear();
                return;
            case SpringPackage.OUTPUT__INTERCEPT_FROM:
                getInterceptFrom().clear();
                return;
            case SpringPackage.OUTPUT__INTERCEPT_TO_ENDPOINT:
                getInterceptToEndpoint().clear();
                return;
            case SpringPackage.OUTPUT__LOAD_BALANCE:
                getLoadBalance().clear();
                return;
            case SpringPackage.OUTPUT__LOG:
                getLog().clear();
                return;
            case SpringPackage.OUTPUT__LOOP:
                getLoop().clear();
                return;
            case SpringPackage.OUTPUT__MARSHAL:
                getMarshal().clear();
                return;
            case SpringPackage.OUTPUT__MULTICAST:
                getMulticast().clear();
                return;
            case SpringPackage.OUTPUT__ON_COMPLETION:
                getOnCompletion().clear();
                return;
            case SpringPackage.OUTPUT__ON_EXCEPTION:
                getOnException().clear();
                return;
            case SpringPackage.OUTPUT__PIPELINE:
                getPipeline().clear();
                return;
            case SpringPackage.OUTPUT__POLICY:
                getPolicy().clear();
                return;
            case SpringPackage.OUTPUT__POLL_ENRICH:
                getPollEnrich().clear();
                return;
            case SpringPackage.OUTPUT__PROCESS:
                getProcess().clear();
                return;
            case SpringPackage.OUTPUT__RECIPIENT_LIST:
                getRecipientList().clear();
                return;
            case SpringPackage.OUTPUT__REMOVE_HEADER:
                getRemoveHeader().clear();
                return;
            case SpringPackage.OUTPUT__REMOVE_HEADERS:
                getRemoveHeaders().clear();
                return;
            case SpringPackage.OUTPUT__REMOVE_PROPERTY:
                getRemoveProperty().clear();
                return;
            case SpringPackage.OUTPUT__RESEQUENCE:
                getResequence().clear();
                return;
            case SpringPackage.OUTPUT__ROLLBACK:
                getRollback().clear();
                return;
            case SpringPackage.OUTPUT__ROUTE:
                getRoute().clear();
                return;
            case SpringPackage.OUTPUT__ROUTING_SLIP:
                getRoutingSlip().clear();
                return;
            case SpringPackage.OUTPUT__SAMPLE:
                getSample().clear();
                return;
            case SpringPackage.OUTPUT__SET_BODY:
                getSetBody().clear();
                return;
            case SpringPackage.OUTPUT__SET_EXCHANGE_PATTERN:
                getSetExchangePattern().clear();
                return;
            case SpringPackage.OUTPUT__SET_FAULT_BODY:
                getSetFaultBody().clear();
                return;
            case SpringPackage.OUTPUT__SET_HEADER:
                getSetHeader().clear();
                return;
            case SpringPackage.OUTPUT__SET_OUT_HEADER:
                getSetOutHeader().clear();
                return;
            case SpringPackage.OUTPUT__SET_PROPERTY:
                getSetProperty().clear();
                return;
            case SpringPackage.OUTPUT__SORT:
                getSort().clear();
                return;
            case SpringPackage.OUTPUT__SPLIT:
                getSplit().clear();
                return;
            case SpringPackage.OUTPUT__STOP:
                getStop().clear();
                return;
            case SpringPackage.OUTPUT__THREADS:
                getThreads().clear();
                return;
            case SpringPackage.OUTPUT__THROTTLE:
                getThrottle().clear();
                return;
            case SpringPackage.OUTPUT__THROW_EXCEPTION:
                getThrowException().clear();
                return;
            case SpringPackage.OUTPUT__TO:
                getTo().clear();
                return;
            case SpringPackage.OUTPUT__TRANSACTED:
                getTransacted().clear();
                return;
            case SpringPackage.OUTPUT__TRANSFORM:
                getTransform().clear();
                return;
            case SpringPackage.OUTPUT__DO_TRY:
                getDoTry().clear();
                return;
            case SpringPackage.OUTPUT__UNMARSHAL:
                getUnmarshal().clear();
                return;
            case SpringPackage.OUTPUT__VALIDATE:
                getValidate().clear();
                return;
            case SpringPackage.OUTPUT__WIRE_TAP:
                getWireTap().clear();
                return;
            case SpringPackage.OUTPUT__ANY_ATTRIBUTE1:
                getAnyAttribute1().clear();
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
            case SpringPackage.OUTPUT__GROUP:
                return group != null && !group.isEmpty();
            case SpringPackage.OUTPUT__AOP:
                return !getAop().isEmpty();
            case SpringPackage.OUTPUT__AGGREGATE:
                return !getAggregate().isEmpty();
            case SpringPackage.OUTPUT__BEAN:
                return !getBean().isEmpty();
            case SpringPackage.OUTPUT__DO_CATCH:
                return !getDoCatch().isEmpty();
            case SpringPackage.OUTPUT__WHEN:
                return !getWhen().isEmpty();
            case SpringPackage.OUTPUT__CHOICE:
                return !getChoice().isEmpty();
            case SpringPackage.OUTPUT__OTHERWISE:
                return !getOtherwise().isEmpty();
            case SpringPackage.OUTPUT__CONVERT_BODY_TO:
                return !getConvertBodyTo().isEmpty();
            case SpringPackage.OUTPUT__DELAY:
                return !getDelay().isEmpty();
            case SpringPackage.OUTPUT__DYNAMIC_ROUTER:
                return !getDynamicRouter().isEmpty();
            case SpringPackage.OUTPUT__ENRICH:
                return !getEnrich().isEmpty();
            case SpringPackage.OUTPUT__FILTER:
                return !getFilter().isEmpty();
            case SpringPackage.OUTPUT__DO_FINALLY:
                return !getDoFinally().isEmpty();
            case SpringPackage.OUTPUT__IDEMPOTENT_CONSUMER:
                return !getIdempotentConsumer().isEmpty();
            case SpringPackage.OUTPUT__IN_ONLY:
                return !getInOnly().isEmpty();
            case SpringPackage.OUTPUT__IN_OUT:
                return !getInOut().isEmpty();
            case SpringPackage.OUTPUT__INTERCEPT:
                return !getIntercept().isEmpty();
            case SpringPackage.OUTPUT__INTERCEPT_FROM:
                return !getInterceptFrom().isEmpty();
            case SpringPackage.OUTPUT__INTERCEPT_TO_ENDPOINT:
                return !getInterceptToEndpoint().isEmpty();
            case SpringPackage.OUTPUT__LOAD_BALANCE:
                return !getLoadBalance().isEmpty();
            case SpringPackage.OUTPUT__LOG:
                return !getLog().isEmpty();
            case SpringPackage.OUTPUT__LOOP:
                return !getLoop().isEmpty();
            case SpringPackage.OUTPUT__MARSHAL:
                return !getMarshal().isEmpty();
            case SpringPackage.OUTPUT__MULTICAST:
                return !getMulticast().isEmpty();
            case SpringPackage.OUTPUT__ON_COMPLETION:
                return !getOnCompletion().isEmpty();
            case SpringPackage.OUTPUT__ON_EXCEPTION:
                return !getOnException().isEmpty();
            case SpringPackage.OUTPUT__PIPELINE:
                return !getPipeline().isEmpty();
            case SpringPackage.OUTPUT__POLICY:
                return !getPolicy().isEmpty();
            case SpringPackage.OUTPUT__POLL_ENRICH:
                return !getPollEnrich().isEmpty();
            case SpringPackage.OUTPUT__PROCESS:
                return !getProcess().isEmpty();
            case SpringPackage.OUTPUT__RECIPIENT_LIST:
                return !getRecipientList().isEmpty();
            case SpringPackage.OUTPUT__REMOVE_HEADER:
                return !getRemoveHeader().isEmpty();
            case SpringPackage.OUTPUT__REMOVE_HEADERS:
                return !getRemoveHeaders().isEmpty();
            case SpringPackage.OUTPUT__REMOVE_PROPERTY:
                return !getRemoveProperty().isEmpty();
            case SpringPackage.OUTPUT__RESEQUENCE:
                return !getResequence().isEmpty();
            case SpringPackage.OUTPUT__ROLLBACK:
                return !getRollback().isEmpty();
            case SpringPackage.OUTPUT__ROUTE:
                return !getRoute().isEmpty();
            case SpringPackage.OUTPUT__ROUTING_SLIP:
                return !getRoutingSlip().isEmpty();
            case SpringPackage.OUTPUT__SAMPLE:
                return !getSample().isEmpty();
            case SpringPackage.OUTPUT__SET_BODY:
                return !getSetBody().isEmpty();
            case SpringPackage.OUTPUT__SET_EXCHANGE_PATTERN:
                return !getSetExchangePattern().isEmpty();
            case SpringPackage.OUTPUT__SET_FAULT_BODY:
                return !getSetFaultBody().isEmpty();
            case SpringPackage.OUTPUT__SET_HEADER:
                return !getSetHeader().isEmpty();
            case SpringPackage.OUTPUT__SET_OUT_HEADER:
                return !getSetOutHeader().isEmpty();
            case SpringPackage.OUTPUT__SET_PROPERTY:
                return !getSetProperty().isEmpty();
            case SpringPackage.OUTPUT__SORT:
                return !getSort().isEmpty();
            case SpringPackage.OUTPUT__SPLIT:
                return !getSplit().isEmpty();
            case SpringPackage.OUTPUT__STOP:
                return !getStop().isEmpty();
            case SpringPackage.OUTPUT__THREADS:
                return !getThreads().isEmpty();
            case SpringPackage.OUTPUT__THROTTLE:
                return !getThrottle().isEmpty();
            case SpringPackage.OUTPUT__THROW_EXCEPTION:
                return !getThrowException().isEmpty();
            case SpringPackage.OUTPUT__TO:
                return !getTo().isEmpty();
            case SpringPackage.OUTPUT__TRANSACTED:
                return !getTransacted().isEmpty();
            case SpringPackage.OUTPUT__TRANSFORM:
                return !getTransform().isEmpty();
            case SpringPackage.OUTPUT__DO_TRY:
                return !getDoTry().isEmpty();
            case SpringPackage.OUTPUT__UNMARSHAL:
                return !getUnmarshal().isEmpty();
            case SpringPackage.OUTPUT__VALIDATE:
                return !getValidate().isEmpty();
            case SpringPackage.OUTPUT__WIRE_TAP:
                return !getWireTap().isEmpty();
            case SpringPackage.OUTPUT__ANY_ATTRIBUTE1:
                return anyAttribute1 != null && !anyAttribute1.isEmpty();
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
        result.append(" (group: ");
        result.append(group);
        result.append(", anyAttribute1: ");
        result.append(anyAttribute1);
        result.append(')');
        return result.toString();
    }

} //OutputImpl
