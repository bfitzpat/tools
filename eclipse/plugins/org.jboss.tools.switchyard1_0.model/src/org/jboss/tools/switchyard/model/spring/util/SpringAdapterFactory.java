/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.spring.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.jboss.tools.switchyard.model.spring.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.jboss.tools.switchyard.model.spring.SpringPackage
 * @generated
 */
public class SpringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringSwitch<Adapter> modelSwitch =
		new SpringSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCamelConsumerTemplateFactoryBean(AbstractCamelConsumerTemplateFactoryBean object) {
				return createAbstractCamelConsumerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelContextFactoryBean(AbstractCamelContextFactoryBean object) {
				return createAbstractCamelContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelEndpointFactoryBean(AbstractCamelEndpointFactoryBean object) {
				return createAbstractCamelEndpointFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelFactoryBean(AbstractCamelFactoryBean object) {
				return createAbstractCamelFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelProducerTemplateFactoryBean(AbstractCamelProducerTemplateFactoryBean object) {
				return createAbstractCamelProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelRedeliveryPolicyFactoryBean(AbstractCamelRedeliveryPolicyFactoryBean object) {
				return createAbstractCamelRedeliveryPolicyFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractCamelThreadPoolFactoryBean(AbstractCamelThreadPoolFactoryBean object) {
				return createAbstractCamelThreadPoolFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractJsseUtilFactoryBean(AbstractJsseUtilFactoryBean object) {
				return createAbstractJsseUtilFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractKeyManagersParametersFactoryBean(AbstractKeyManagersParametersFactoryBean object) {
				return createAbstractKeyManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractKeyStoreParametersFactoryBean(AbstractKeyStoreParametersFactoryBean object) {
				return createAbstractKeyStoreParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractSecureRandomParametersFactoryBean(AbstractSecureRandomParametersFactoryBean object) {
				return createAbstractSecureRandomParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAbstractTrustManagersParametersFactoryBean(AbstractTrustManagersParametersFactoryBean object) {
				return createAbstractTrustManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseAggregateDefinition(AggregateDefinition object) {
				return createAggregateDefinitionAdapter();
			}
			@Override
			public Adapter caseAliasEntry(AliasEntry object) {
				return createAliasEntryAdapter();
			}
			@Override
			public Adapter caseAliasList(AliasList object) {
				return createAliasListAdapter();
			}
			@Override
			public Adapter caseAopDefinition(AopDefinition object) {
				return createAopDefinitionAdapter();
			}
			@Override
			public Adapter caseBatchResequencerConfig(BatchResequencerConfig object) {
				return createBatchResequencerConfigAdapter();
			}
			@Override
			public Adapter caseBeanDefinition(BeanDefinition object) {
				return createBeanDefinitionAdapter();
			}
			@Override
			public Adapter caseBindyDataFormat(BindyDataFormat object) {
				return createBindyDataFormatAdapter();
			}
			@Override
			public Adapter caseCamelBeanPostProcessor(CamelBeanPostProcessor object) {
				return createCamelBeanPostProcessorAdapter();
			}
			@Override
			public Adapter caseCamelConsumerTemplateFactoryBean(CamelConsumerTemplateFactoryBean object) {
				return createCamelConsumerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelContextFactoryBean(CamelContextFactoryBean object) {
				return createCamelContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelEndpointFactoryBean(CamelEndpointFactoryBean object) {
				return createCamelEndpointFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelJMXAgentDefinition(CamelJMXAgentDefinition object) {
				return createCamelJMXAgentDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelProducerTemplateFactoryBean(CamelProducerTemplateFactoryBean object) {
				return createCamelProducerTemplateFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelPropertyPlaceholderDefinition(CamelPropertyPlaceholderDefinition object) {
				return createCamelPropertyPlaceholderDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelProxyFactoryDefinition(CamelProxyFactoryDefinition object) {
				return createCamelProxyFactoryDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelRedeliveryPolicyFactoryBean(CamelRedeliveryPolicyFactoryBean object) {
				return createCamelRedeliveryPolicyFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelRouteContextFactoryBean(CamelRouteContextFactoryBean object) {
				return createCamelRouteContextFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCamelServiceExporterDefinition(CamelServiceExporterDefinition object) {
				return createCamelServiceExporterDefinitionAdapter();
			}
			@Override
			public Adapter caseCamelThreadPoolFactoryBean(CamelThreadPoolFactoryBean object) {
				return createCamelThreadPoolFactoryBeanAdapter();
			}
			@Override
			public Adapter caseCastorDataFormat(CastorDataFormat object) {
				return createCastorDataFormatAdapter();
			}
			@Override
			public Adapter caseCatchDefinition(CatchDefinition object) {
				return createCatchDefinitionAdapter();
			}
			@Override
			public Adapter caseChoiceDefinition(ChoiceDefinition object) {
				return createChoiceDefinitionAdapter();
			}
			@Override
			public Adapter caseCipherSuitesParameters(CipherSuitesParameters object) {
				return createCipherSuitesParametersAdapter();
			}
			@Override
			public Adapter caseConstantExpression(ConstantExpression object) {
				return createConstantExpressionAdapter();
			}
			@Override
			public Adapter caseConstants(Constants object) {
				return createConstantsAdapter();
			}
			@Override
			public Adapter caseContextScanDefinition(ContextScanDefinition object) {
				return createContextScanDefinitionAdapter();
			}
			@Override
			public Adapter caseConvertBodyDefinition(ConvertBodyDefinition object) {
				return createConvertBodyDefinitionAdapter();
			}
			@Override
			public Adapter caseConverterEntry(ConverterEntry object) {
				return createConverterEntryAdapter();
			}
			@Override
			public Adapter caseConverterList(ConverterList object) {
				return createConverterListAdapter();
			}
			@Override
			public Adapter caseCryptoDataFormat(CryptoDataFormat object) {
				return createCryptoDataFormatAdapter();
			}
			@Override
			public Adapter caseCsvDataFormat(CsvDataFormat object) {
				return createCsvDataFormatAdapter();
			}
			@Override
			public Adapter caseCustomDataFormat(CustomDataFormat object) {
				return createCustomDataFormatAdapter();
			}
			@Override
			public Adapter caseCustomLoadBalancerDefinition(CustomLoadBalancerDefinition object) {
				return createCustomLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseDataFormat(DataFormat object) {
				return createDataFormatAdapter();
			}
			@Override
			public Adapter caseDataFormatsDefinition(DataFormatsDefinition object) {
				return createDataFormatsDefinitionAdapter();
			}
			@Override
			public Adapter caseDelayDefinition(DelayDefinition object) {
				return createDelayDefinitionAdapter();
			}
			@Override
			public Adapter caseDescriptionDefinition(DescriptionDefinition object) {
				return createDescriptionDefinitionAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDynamicRouterDefinition(DynamicRouterDefinition object) {
				return createDynamicRouterDefinitionAdapter();
			}
			@Override
			public Adapter caseElExpression(ElExpression object) {
				return createElExpressionAdapter();
			}
			@Override
			public Adapter caseEnrichDefinition(EnrichDefinition object) {
				return createEnrichDefinitionAdapter();
			}
			@Override
			public Adapter caseErrorHandlerDefinition(ErrorHandlerDefinition object) {
				return createErrorHandlerDefinitionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionNode(ExpressionNode object) {
				return createExpressionNodeAdapter();
			}
			@Override
			public Adapter caseExpressionSubElementDefinition(ExpressionSubElementDefinition object) {
				return createExpressionSubElementDefinitionAdapter();
			}
			@Override
			public Adapter caseFailoverLoadBalancerDefinition(FailoverLoadBalancerDefinition object) {
				return createFailoverLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseFilterDefinition(FilterDefinition object) {
				return createFilterDefinitionAdapter();
			}
			@Override
			public Adapter caseFilterParameters(FilterParameters object) {
				return createFilterParametersAdapter();
			}
			@Override
			public Adapter caseFinallyDefinition(FinallyDefinition object) {
				return createFinallyDefinitionAdapter();
			}
			@Override
			public Adapter caseFlatpackDataFormat(FlatpackDataFormat object) {
				return createFlatpackDataFormatAdapter();
			}
			@Override
			public Adapter caseFromDefinition(FromDefinition object) {
				return createFromDefinitionAdapter();
			}
			@Override
			public Adapter caseGroovyExpression(GroovyExpression object) {
				return createGroovyExpressionAdapter();
			}
			@Override
			public Adapter caseGzipDataFormat(GzipDataFormat object) {
				return createGzipDataFormatAdapter();
			}
			@Override
			public Adapter caseHeaderExpression(HeaderExpression object) {
				return createHeaderExpressionAdapter();
			}
			@Override
			public Adapter caseHl7DataFormat(Hl7DataFormat object) {
				return createHl7DataFormatAdapter();
			}
			@Override
			public Adapter caseIdempotentConsumerDefinition(IdempotentConsumerDefinition object) {
				return createIdempotentConsumerDefinitionAdapter();
			}
			@Override
			public Adapter caseIdentifiedType(IdentifiedType object) {
				return createIdentifiedTypeAdapter();
			}
			@Override
			public Adapter caseImplicitCollectionEntry(ImplicitCollectionEntry object) {
				return createImplicitCollectionEntryAdapter();
			}
			@Override
			public Adapter caseImplicitCollectionList(ImplicitCollectionList object) {
				return createImplicitCollectionListAdapter();
			}
			@Override
			public Adapter caseInOnlyDefinition(InOnlyDefinition object) {
				return createInOnlyDefinitionAdapter();
			}
			@Override
			public Adapter caseInOutDefinition(InOutDefinition object) {
				return createInOutDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptDefinition(InterceptDefinition object) {
				return createInterceptDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptFromDefinition(InterceptFromDefinition object) {
				return createInterceptFromDefinitionAdapter();
			}
			@Override
			public Adapter caseInterceptSendToEndpointDefinition(InterceptSendToEndpointDefinition object) {
				return createInterceptSendToEndpointDefinitionAdapter();
			}
			@Override
			public Adapter caseJavaScriptExpression(JavaScriptExpression object) {
				return createJavaScriptExpressionAdapter();
			}
			@Override
			public Adapter caseJaxbDataFormat(JaxbDataFormat object) {
				return createJaxbDataFormatAdapter();
			}
			@Override
			public Adapter caseJibxDataFormat(JibxDataFormat object) {
				return createJibxDataFormatAdapter();
			}
			@Override
			public Adapter caseJsonDataFormat(JsonDataFormat object) {
				return createJsonDataFormatAdapter();
			}
			@Override
			public Adapter caseJxPathExpression(JxPathExpression object) {
				return createJxPathExpressionAdapter();
			}
			@Override
			public Adapter caseKeyManagersParametersFactoryBean(KeyManagersParametersFactoryBean object) {
				return createKeyManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseKeyStoreParametersFactoryBean(KeyStoreParametersFactoryBean object) {
				return createKeyStoreParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseLanguageExpression(LanguageExpression object) {
				return createLanguageExpressionAdapter();
			}
			@Override
			public Adapter caseLoadBalanceDefinition(LoadBalanceDefinition object) {
				return createLoadBalanceDefinitionAdapter();
			}
			@Override
			public Adapter caseLoadBalancer(LoadBalancer object) {
				return createLoadBalancerAdapter();
			}
			@Override
			public Adapter caseLogDefinition(LogDefinition object) {
				return createLogDefinitionAdapter();
			}
			@Override
			public Adapter caseLoopDefinition(LoopDefinition object) {
				return createLoopDefinitionAdapter();
			}
			@Override
			public Adapter caseMarshalDefinition(MarshalDefinition object) {
				return createMarshalDefinitionAdapter();
			}
			@Override
			public Adapter caseMethodCallExpression(MethodCallExpression object) {
				return createMethodCallExpressionAdapter();
			}
			@Override
			public Adapter caseMulticastDefinition(MulticastDefinition object) {
				return createMulticastDefinitionAdapter();
			}
			@Override
			public Adapter caseMvelExpression(MvelExpression object) {
				return createMvelExpressionAdapter();
			}
			@Override
			public Adapter caseNamespaceAwareExpression(NamespaceAwareExpression object) {
				return createNamespaceAwareExpressionAdapter();
			}
			@Override
			public Adapter caseNodeFactory(NodeFactory object) {
				return createNodeFactoryAdapter();
			}
			@Override
			public Adapter caseNoOutputDefinition(NoOutputDefinition object) {
				return createNoOutputDefinitionAdapter();
			}
			@Override
			public Adapter caseNoOutputExpressionNode(NoOutputExpressionNode object) {
				return createNoOutputExpressionNodeAdapter();
			}
			@Override
			public Adapter caseOgnlExpression(OgnlExpression object) {
				return createOgnlExpressionAdapter();
			}
			@Override
			public Adapter caseOmitFieldEntry(OmitFieldEntry object) {
				return createOmitFieldEntryAdapter();
			}
			@Override
			public Adapter caseOmitFieldList(OmitFieldList object) {
				return createOmitFieldListAdapter();
			}
			@Override
			public Adapter caseOnCompletionDefinition(OnCompletionDefinition object) {
				return createOnCompletionDefinitionAdapter();
			}
			@Override
			public Adapter caseOnExceptionDefinition(OnExceptionDefinition object) {
				return createOnExceptionDefinitionAdapter();
			}
			@Override
			public Adapter caseOptionalIdentifiedDefinition(OptionalIdentifiedDefinition object) {
				return createOptionalIdentifiedDefinitionAdapter();
			}
			@Override
			public Adapter caseOtherwiseDefinition(OtherwiseDefinition object) {
				return createOtherwiseDefinitionAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter casePackageScanDefinition(PackageScanDefinition object) {
				return createPackageScanDefinitionAdapter();
			}
			@Override
			public Adapter casePhpExpression(PhpExpression object) {
				return createPhpExpressionAdapter();
			}
			@Override
			public Adapter casePipelineDefinition(PipelineDefinition object) {
				return createPipelineDefinitionAdapter();
			}
			@Override
			public Adapter casePolicyDefinition(PolicyDefinition object) {
				return createPolicyDefinitionAdapter();
			}
			@Override
			public Adapter casePollEnrichDefinition(PollEnrichDefinition object) {
				return createPollEnrichDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessDefinition(ProcessDefinition object) {
				return createProcessDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessorDefinition(ProcessorDefinition object) {
				return createProcessorDefinitionAdapter();
			}
			@Override
			public Adapter caseProcessorDefinitionHelper(ProcessorDefinitionHelper object) {
				return createProcessorDefinitionHelperAdapter();
			}
			@Override
			public Adapter casePropertiesDefinition(PropertiesDefinition object) {
				return createPropertiesDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyExpression(PropertyExpression object) {
				return createPropertyExpressionAdapter();
			}
			@Override
			public Adapter caseProtobufDataFormat(ProtobufDataFormat object) {
				return createProtobufDataFormatAdapter();
			}
			@Override
			public Adapter casePythonExpression(PythonExpression object) {
				return createPythonExpressionAdapter();
			}
			@Override
			public Adapter caseRandomLoadBalancerDefinition(RandomLoadBalancerDefinition object) {
				return createRandomLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseRecipientListDefinition(RecipientListDefinition object) {
				return createRecipientListDefinitionAdapter();
			}
			@Override
			public Adapter caseRedeliveryPolicyDefinition(RedeliveryPolicyDefinition object) {
				return createRedeliveryPolicyDefinitionAdapter();
			}
			@Override
			public Adapter caseRefExpression(RefExpression object) {
				return createRefExpressionAdapter();
			}
			@Override
			public Adapter caseRemoveHeaderDefinition(RemoveHeaderDefinition object) {
				return createRemoveHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseRemoveHeadersDefinition(RemoveHeadersDefinition object) {
				return createRemoveHeadersDefinitionAdapter();
			}
			@Override
			public Adapter caseRemovePropertyDefinition(RemovePropertyDefinition object) {
				return createRemovePropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseResequenceDefinition(ResequenceDefinition object) {
				return createResequenceDefinitionAdapter();
			}
			@Override
			public Adapter caseResequencerConfig(ResequencerConfig object) {
				return createResequencerConfigAdapter();
			}
			@Override
			public Adapter caseRollbackDefinition(RollbackDefinition object) {
				return createRollbackDefinitionAdapter();
			}
			@Override
			public Adapter caseRoundRobinLoadBalancerDefinition(RoundRobinLoadBalancerDefinition object) {
				return createRoundRobinLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteBuilderDefinition(RouteBuilderDefinition object) {
				return createRouteBuilderDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteContextRefDefinition(RouteContextRefDefinition object) {
				return createRouteContextRefDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteDefinition(RouteDefinition object) {
				return createRouteDefinitionAdapter();
			}
			@Override
			public Adapter caseRouteDefinitionHelper(RouteDefinitionHelper object) {
				return createRouteDefinitionHelperAdapter();
			}
			@Override
			public Adapter caseRoutesDefinition(RoutesDefinition object) {
				return createRoutesDefinitionAdapter();
			}
			@Override
			public Adapter caseRoutingSlipDefinition(RoutingSlipDefinition object) {
				return createRoutingSlipDefinitionAdapter();
			}
			@Override
			public Adapter caseRssDataFormat(RssDataFormat object) {
				return createRssDataFormatAdapter();
			}
			@Override
			public Adapter caseRubyExpression(RubyExpression object) {
				return createRubyExpressionAdapter();
			}
			@Override
			public Adapter caseSamplingDefinition(SamplingDefinition object) {
				return createSamplingDefinitionAdapter();
			}
			@Override
			public Adapter caseSecureRandomParametersFactoryBean(SecureRandomParametersFactoryBean object) {
				return createSecureRandomParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSecureSocketProtocolsParameters(SecureSocketProtocolsParameters object) {
				return createSecureSocketProtocolsParametersAdapter();
			}
			@Override
			public Adapter caseSendDefinition(SendDefinition object) {
				return createSendDefinitionAdapter();
			}
			@Override
			public Adapter caseSerializationDataFormat(SerializationDataFormat object) {
				return createSerializationDataFormatAdapter();
			}
			@Override
			public Adapter caseSetBodyDefinition(SetBodyDefinition object) {
				return createSetBodyDefinitionAdapter();
			}
			@Override
			public Adapter caseSetExchangePatternDefinition(SetExchangePatternDefinition object) {
				return createSetExchangePatternDefinitionAdapter();
			}
			@Override
			public Adapter caseSetFaultBodyDefinition(SetFaultBodyDefinition object) {
				return createSetFaultBodyDefinitionAdapter();
			}
			@Override
			public Adapter caseSetHeaderDefinition(SetHeaderDefinition object) {
				return createSetHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseSetOutHeaderDefinition(SetOutHeaderDefinition object) {
				return createSetOutHeaderDefinitionAdapter();
			}
			@Override
			public Adapter caseSetPropertyDefinition(SetPropertyDefinition object) {
				return createSetPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseSimpleExpression(SimpleExpression object) {
				return createSimpleExpressionAdapter();
			}
			@Override
			public Adapter caseSoapJaxbDataFormat(SoapJaxbDataFormat object) {
				return createSoapJaxbDataFormatAdapter();
			}
			@Override
			public Adapter caseSortDefinition(SortDefinition object) {
				return createSortDefinitionAdapter();
			}
			@Override
			public Adapter caseSpELExpression(SpELExpression object) {
				return createSpELExpressionAdapter();
			}
			@Override
			public Adapter caseSplitDefinition(SplitDefinition object) {
				return createSplitDefinitionAdapter();
			}
			@Override
			public Adapter caseSqlExpression(SqlExpression object) {
				return createSqlExpressionAdapter();
			}
			@Override
			public Adapter caseSslContextClientParametersFactoryBean(SslContextClientParametersFactoryBean object) {
				return createSslContextClientParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSslContextParametersFactoryBean(SslContextParametersFactoryBean object) {
				return createSslContextParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseSslContextServerParametersFactoryBean(SslContextServerParametersFactoryBean object) {
				return createSslContextServerParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseStickyLoadBalancerDefinition(StickyLoadBalancerDefinition object) {
				return createStickyLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseStopDefinition(StopDefinition object) {
				return createStopDefinitionAdapter();
			}
			@Override
			public Adapter caseStreamResequencerConfig(StreamResequencerConfig object) {
				return createStreamResequencerConfigAdapter();
			}
			@Override
			public Adapter caseStringDataFormat(StringDataFormat object) {
				return createStringDataFormatAdapter();
			}
			@Override
			public Adapter caseSyslogDataFormat(SyslogDataFormat object) {
				return createSyslogDataFormatAdapter();
			}
			@Override
			public Adapter caseThreadPoolProfileDefinition(ThreadPoolProfileDefinition object) {
				return createThreadPoolProfileDefinitionAdapter();
			}
			@Override
			public Adapter caseThreadsDefinition(ThreadsDefinition object) {
				return createThreadsDefinitionAdapter();
			}
			@Override
			public Adapter caseThrottleDefinition(ThrottleDefinition object) {
				return createThrottleDefinitionAdapter();
			}
			@Override
			public Adapter caseThrowExceptionDefinition(ThrowExceptionDefinition object) {
				return createThrowExceptionDefinitionAdapter();
			}
			@Override
			public Adapter caseTidyMarkupDataFormat(TidyMarkupDataFormat object) {
				return createTidyMarkupDataFormatAdapter();
			}
			@Override
			public Adapter caseToDefinition(ToDefinition object) {
				return createToDefinitionAdapter();
			}
			@Override
			public Adapter caseTokenizerExpression(TokenizerExpression object) {
				return createTokenizerExpressionAdapter();
			}
			@Override
			public Adapter caseTopicLoadBalancerDefinition(TopicLoadBalancerDefinition object) {
				return createTopicLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseTransactedDefinition(TransactedDefinition object) {
				return createTransactedDefinitionAdapter();
			}
			@Override
			public Adapter caseTransformDefinition(TransformDefinition object) {
				return createTransformDefinitionAdapter();
			}
			@Override
			public Adapter caseTrustManagersParametersFactoryBean(TrustManagersParametersFactoryBean object) {
				return createTrustManagersParametersFactoryBeanAdapter();
			}
			@Override
			public Adapter caseTryDefinition(TryDefinition object) {
				return createTryDefinitionAdapter();
			}
			@Override
			public Adapter caseUnmarshalDefinition(UnmarshalDefinition object) {
				return createUnmarshalDefinitionAdapter();
			}
			@Override
			public Adapter caseValidateDefinition(ValidateDefinition object) {
				return createValidateDefinitionAdapter();
			}
			@Override
			public Adapter caseWeightedLoadBalancerDefinition(WeightedLoadBalancerDefinition object) {
				return createWeightedLoadBalancerDefinitionAdapter();
			}
			@Override
			public Adapter caseWhenDefinition(WhenDefinition object) {
				return createWhenDefinitionAdapter();
			}
			@Override
			public Adapter caseWireTapDefinition(WireTapDefinition object) {
				return createWireTapDefinitionAdapter();
			}
			@Override
			public Adapter caseXmlBeansDataFormat(XmlBeansDataFormat object) {
				return createXmlBeansDataFormatAdapter();
			}
			@Override
			public Adapter caseXmlSecurityDataFormat(XmlSecurityDataFormat object) {
				return createXmlSecurityDataFormatAdapter();
			}
			@Override
			public Adapter caseXPathExpression(XPathExpression object) {
				return createXPathExpressionAdapter();
			}
			@Override
			public Adapter caseXQueryExpression(XQueryExpression object) {
				return createXQueryExpressionAdapter();
			}
			@Override
			public Adapter caseXStreamDataFormat(XStreamDataFormat object) {
				return createXStreamDataFormatAdapter();
			}
			@Override
			public Adapter caseZipDataFormat(ZipDataFormat object) {
				return createZipDataFormatAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelConsumerTemplateFactoryBean <em>Abstract Camel Consumer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelConsumerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelConsumerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelContextFactoryBean <em>Abstract Camel Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelContextFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelEndpointFactoryBean <em>Abstract Camel Endpoint Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelEndpointFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelEndpointFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelFactoryBean <em>Abstract Camel Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelProducerTemplateFactoryBean <em>Abstract Camel Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelRedeliveryPolicyFactoryBean <em>Abstract Camel Redelivery Policy Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelRedeliveryPolicyFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelRedeliveryPolicyFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractCamelThreadPoolFactoryBean <em>Abstract Camel Thread Pool Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractCamelThreadPoolFactoryBean
	 * @generated
	 */
	public Adapter createAbstractCamelThreadPoolFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractJsseUtilFactoryBean <em>Abstract Jsse Util Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractJsseUtilFactoryBean
	 * @generated
	 */
	public Adapter createAbstractJsseUtilFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractKeyManagersParametersFactoryBean <em>Abstract Key Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractKeyManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractKeyManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractKeyStoreParametersFactoryBean <em>Abstract Key Store Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractKeyStoreParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractKeyStoreParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractSecureRandomParametersFactoryBean <em>Abstract Secure Random Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractSecureRandomParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractSecureRandomParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AbstractTrustManagersParametersFactoryBean <em>Abstract Trust Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AbstractTrustManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createAbstractTrustManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AggregateDefinition <em>Aggregate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AggregateDefinition
	 * @generated
	 */
	public Adapter createAggregateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AliasEntry <em>Alias Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AliasEntry
	 * @generated
	 */
	public Adapter createAliasEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AliasList
	 * @generated
	 */
	public Adapter createAliasListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.AopDefinition <em>Aop Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.AopDefinition
	 * @generated
	 */
	public Adapter createAopDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.BatchResequencerConfig <em>Batch Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.BatchResequencerConfig
	 * @generated
	 */
	public Adapter createBatchResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.BeanDefinition <em>Bean Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.BeanDefinition
	 * @generated
	 */
	public Adapter createBeanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.BindyDataFormat <em>Bindy Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.BindyDataFormat
	 * @generated
	 */
	public Adapter createBindyDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelBeanPostProcessor <em>Camel Bean Post Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelBeanPostProcessor
	 * @generated
	 */
	public Adapter createCamelBeanPostProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelConsumerTemplateFactoryBean <em>Camel Consumer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelConsumerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createCamelConsumerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelContextFactoryBean <em>Camel Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelEndpointFactoryBean <em>Camel Endpoint Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelEndpointFactoryBean
	 * @generated
	 */
	public Adapter createCamelEndpointFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelJMXAgentDefinition <em>Camel JMX Agent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelJMXAgentDefinition
	 * @generated
	 */
	public Adapter createCamelJMXAgentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelProducerTemplateFactoryBean <em>Camel Producer Template Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelProducerTemplateFactoryBean
	 * @generated
	 */
	public Adapter createCamelProducerTemplateFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelPropertyPlaceholderDefinition <em>Camel Property Placeholder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelPropertyPlaceholderDefinition
	 * @generated
	 */
	public Adapter createCamelPropertyPlaceholderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelProxyFactoryDefinition <em>Camel Proxy Factory Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelProxyFactoryDefinition
	 * @generated
	 */
	public Adapter createCamelProxyFactoryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelRedeliveryPolicyFactoryBean <em>Camel Redelivery Policy Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelRedeliveryPolicyFactoryBean
	 * @generated
	 */
	public Adapter createCamelRedeliveryPolicyFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelRouteContextFactoryBean <em>Camel Route Context Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelRouteContextFactoryBean
	 * @generated
	 */
	public Adapter createCamelRouteContextFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelServiceExporterDefinition <em>Camel Service Exporter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelServiceExporterDefinition
	 * @generated
	 */
	public Adapter createCamelServiceExporterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CamelThreadPoolFactoryBean <em>Camel Thread Pool Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CamelThreadPoolFactoryBean
	 * @generated
	 */
	public Adapter createCamelThreadPoolFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CastorDataFormat <em>Castor Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CastorDataFormat
	 * @generated
	 */
	public Adapter createCastorDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CatchDefinition <em>Catch Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CatchDefinition
	 * @generated
	 */
	public Adapter createCatchDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ChoiceDefinition <em>Choice Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ChoiceDefinition
	 * @generated
	 */
	public Adapter createChoiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CipherSuitesParameters <em>Cipher Suites Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CipherSuitesParameters
	 * @generated
	 */
	public Adapter createCipherSuitesParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ConstantExpression
	 * @generated
	 */
	public Adapter createConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.Constants
	 * @generated
	 */
	public Adapter createConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ContextScanDefinition <em>Context Scan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ContextScanDefinition
	 * @generated
	 */
	public Adapter createContextScanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ConvertBodyDefinition <em>Convert Body Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ConvertBodyDefinition
	 * @generated
	 */
	public Adapter createConvertBodyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ConverterEntry <em>Converter Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ConverterEntry
	 * @generated
	 */
	public Adapter createConverterEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ConverterList <em>Converter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ConverterList
	 * @generated
	 */
	public Adapter createConverterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CryptoDataFormat <em>Crypto Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CryptoDataFormat
	 * @generated
	 */
	public Adapter createCryptoDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CsvDataFormat <em>Csv Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CsvDataFormat
	 * @generated
	 */
	public Adapter createCsvDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CustomDataFormat <em>Custom Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CustomDataFormat
	 * @generated
	 */
	public Adapter createCustomDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.CustomLoadBalancerDefinition <em>Custom Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.CustomLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createCustomLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DataFormat
	 * @generated
	 */
	public Adapter createDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DataFormatsDefinition <em>Data Formats Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DataFormatsDefinition
	 * @generated
	 */
	public Adapter createDataFormatsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DelayDefinition <em>Delay Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DelayDefinition
	 * @generated
	 */
	public Adapter createDelayDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DescriptionDefinition <em>Description Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DescriptionDefinition
	 * @generated
	 */
	public Adapter createDescriptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition <em>Dynamic Router Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.DynamicRouterDefinition
	 * @generated
	 */
	public Adapter createDynamicRouterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ElExpression <em>El Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ElExpression
	 * @generated
	 */
	public Adapter createElExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.EnrichDefinition <em>Enrich Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.EnrichDefinition
	 * @generated
	 */
	public Adapter createEnrichDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ErrorHandlerDefinition <em>Error Handler Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ErrorHandlerDefinition
	 * @generated
	 */
	public Adapter createErrorHandlerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ExpressionNode
	 * @generated
	 */
	public Adapter createExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ExpressionSubElementDefinition <em>Expression Sub Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ExpressionSubElementDefinition
	 * @generated
	 */
	public Adapter createExpressionSubElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FailoverLoadBalancerDefinition <em>Failover Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FailoverLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createFailoverLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FilterDefinition <em>Filter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FilterDefinition
	 * @generated
	 */
	public Adapter createFilterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FilterParameters <em>Filter Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FilterParameters
	 * @generated
	 */
	public Adapter createFilterParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FinallyDefinition <em>Finally Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FinallyDefinition
	 * @generated
	 */
	public Adapter createFinallyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FlatpackDataFormat <em>Flatpack Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FlatpackDataFormat
	 * @generated
	 */
	public Adapter createFlatpackDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.FromDefinition <em>From Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.FromDefinition
	 * @generated
	 */
	public Adapter createFromDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.GroovyExpression <em>Groovy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.GroovyExpression
	 * @generated
	 */
	public Adapter createGroovyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.GzipDataFormat <em>Gzip Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.GzipDataFormat
	 * @generated
	 */
	public Adapter createGzipDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.HeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.HeaderExpression
	 * @generated
	 */
	public Adapter createHeaderExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.Hl7DataFormat <em>Hl7 Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.Hl7DataFormat
	 * @generated
	 */
	public Adapter createHl7DataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.IdempotentConsumerDefinition <em>Idempotent Consumer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.IdempotentConsumerDefinition
	 * @generated
	 */
	public Adapter createIdempotentConsumerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.IdentifiedType <em>Identified Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.IdentifiedType
	 * @generated
	 */
	public Adapter createIdentifiedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ImplicitCollectionEntry <em>Implicit Collection Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ImplicitCollectionEntry
	 * @generated
	 */
	public Adapter createImplicitCollectionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ImplicitCollectionList <em>Implicit Collection List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ImplicitCollectionList
	 * @generated
	 */
	public Adapter createImplicitCollectionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.InOnlyDefinition <em>In Only Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.InOnlyDefinition
	 * @generated
	 */
	public Adapter createInOnlyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.InOutDefinition <em>In Out Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.InOutDefinition
	 * @generated
	 */
	public Adapter createInOutDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.InterceptDefinition <em>Intercept Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.InterceptDefinition
	 * @generated
	 */
	public Adapter createInterceptDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.InterceptFromDefinition <em>Intercept From Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.InterceptFromDefinition
	 * @generated
	 */
	public Adapter createInterceptFromDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.InterceptSendToEndpointDefinition <em>Intercept Send To Endpoint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.InterceptSendToEndpointDefinition
	 * @generated
	 */
	public Adapter createInterceptSendToEndpointDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.JavaScriptExpression <em>Java Script Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.JavaScriptExpression
	 * @generated
	 */
	public Adapter createJavaScriptExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.JaxbDataFormat <em>Jaxb Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.JaxbDataFormat
	 * @generated
	 */
	public Adapter createJaxbDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.JibxDataFormat <em>Jibx Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.JibxDataFormat
	 * @generated
	 */
	public Adapter createJibxDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.JsonDataFormat <em>Json Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.JsonDataFormat
	 * @generated
	 */
	public Adapter createJsonDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.JxPathExpression <em>Jx Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.JxPathExpression
	 * @generated
	 */
	public Adapter createJxPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.KeyManagersParametersFactoryBean <em>Key Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.KeyManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createKeyManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.KeyStoreParametersFactoryBean <em>Key Store Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.KeyStoreParametersFactoryBean
	 * @generated
	 */
	public Adapter createKeyStoreParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.LanguageExpression <em>Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.LanguageExpression
	 * @generated
	 */
	public Adapter createLanguageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.LoadBalanceDefinition <em>Load Balance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.LoadBalanceDefinition
	 * @generated
	 */
	public Adapter createLoadBalanceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.LoadBalancer
	 * @generated
	 */
	public Adapter createLoadBalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.LogDefinition <em>Log Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.LogDefinition
	 * @generated
	 */
	public Adapter createLogDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.LoopDefinition <em>Loop Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.LoopDefinition
	 * @generated
	 */
	public Adapter createLoopDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.MarshalDefinition <em>Marshal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.MarshalDefinition
	 * @generated
	 */
	public Adapter createMarshalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.MethodCallExpression <em>Method Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.MethodCallExpression
	 * @generated
	 */
	public Adapter createMethodCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.MulticastDefinition <em>Multicast Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.MulticastDefinition
	 * @generated
	 */
	public Adapter createMulticastDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.MvelExpression <em>Mvel Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.MvelExpression
	 * @generated
	 */
	public Adapter createMvelExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.NamespaceAwareExpression <em>Namespace Aware Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.NamespaceAwareExpression
	 * @generated
	 */
	public Adapter createNamespaceAwareExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.NodeFactory <em>Node Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.NodeFactory
	 * @generated
	 */
	public Adapter createNodeFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.NoOutputDefinition <em>No Output Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.NoOutputDefinition
	 * @generated
	 */
	public Adapter createNoOutputDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.NoOutputExpressionNode <em>No Output Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.NoOutputExpressionNode
	 * @generated
	 */
	public Adapter createNoOutputExpressionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OgnlExpression <em>Ognl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OgnlExpression
	 * @generated
	 */
	public Adapter createOgnlExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OmitFieldEntry <em>Omit Field Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OmitFieldEntry
	 * @generated
	 */
	public Adapter createOmitFieldEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OmitFieldList <em>Omit Field List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OmitFieldList
	 * @generated
	 */
	public Adapter createOmitFieldListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OnCompletionDefinition <em>On Completion Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OnCompletionDefinition
	 * @generated
	 */
	public Adapter createOnCompletionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OnExceptionDefinition <em>On Exception Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OnExceptionDefinition
	 * @generated
	 */
	public Adapter createOnExceptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition <em>Optional Identified Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OptionalIdentifiedDefinition
	 * @generated
	 */
	public Adapter createOptionalIdentifiedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.OtherwiseDefinition <em>Otherwise Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.OtherwiseDefinition
	 * @generated
	 */
	public Adapter createOtherwiseDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PackageScanDefinition <em>Package Scan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PackageScanDefinition
	 * @generated
	 */
	public Adapter createPackageScanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PhpExpression <em>Php Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PhpExpression
	 * @generated
	 */
	public Adapter createPhpExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PipelineDefinition <em>Pipeline Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PipelineDefinition
	 * @generated
	 */
	public Adapter createPipelineDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PolicyDefinition <em>Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PolicyDefinition
	 * @generated
	 */
	public Adapter createPolicyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PollEnrichDefinition <em>Poll Enrich Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PollEnrichDefinition
	 * @generated
	 */
	public Adapter createPollEnrichDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ProcessDefinition
	 * @generated
	 */
	public Adapter createProcessDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ProcessorDefinition <em>Processor Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ProcessorDefinition
	 * @generated
	 */
	public Adapter createProcessorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ProcessorDefinitionHelper <em>Processor Definition Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ProcessorDefinitionHelper
	 * @generated
	 */
	public Adapter createProcessorDefinitionHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PropertiesDefinition
	 * @generated
	 */
	public Adapter createPropertiesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PropertyExpression
	 * @generated
	 */
	public Adapter createPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ProtobufDataFormat <em>Protobuf Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ProtobufDataFormat
	 * @generated
	 */
	public Adapter createProtobufDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.PythonExpression <em>Python Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.PythonExpression
	 * @generated
	 */
	public Adapter createPythonExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RandomLoadBalancerDefinition <em>Random Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RandomLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createRandomLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RecipientListDefinition <em>Recipient List Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RecipientListDefinition
	 * @generated
	 */
	public Adapter createRecipientListDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RedeliveryPolicyDefinition <em>Redelivery Policy Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RedeliveryPolicyDefinition
	 * @generated
	 */
	public Adapter createRedeliveryPolicyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RefExpression <em>Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RefExpression
	 * @generated
	 */
	public Adapter createRefExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RemoveHeaderDefinition <em>Remove Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RemoveHeaderDefinition
	 * @generated
	 */
	public Adapter createRemoveHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RemoveHeadersDefinition <em>Remove Headers Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RemoveHeadersDefinition
	 * @generated
	 */
	public Adapter createRemoveHeadersDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RemovePropertyDefinition <em>Remove Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RemovePropertyDefinition
	 * @generated
	 */
	public Adapter createRemovePropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ResequenceDefinition <em>Resequence Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ResequenceDefinition
	 * @generated
	 */
	public Adapter createResequenceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ResequencerConfig <em>Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ResequencerConfig
	 * @generated
	 */
	public Adapter createResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RollbackDefinition <em>Rollback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RollbackDefinition
	 * @generated
	 */
	public Adapter createRollbackDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RoundRobinLoadBalancerDefinition <em>Round Robin Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RoundRobinLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createRoundRobinLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RouteBuilderDefinition <em>Route Builder Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RouteBuilderDefinition
	 * @generated
	 */
	public Adapter createRouteBuilderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RouteContextRefDefinition <em>Route Context Ref Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RouteContextRefDefinition
	 * @generated
	 */
	public Adapter createRouteContextRefDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RouteDefinition <em>Route Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RouteDefinition
	 * @generated
	 */
	public Adapter createRouteDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RouteDefinitionHelper <em>Route Definition Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RouteDefinitionHelper
	 * @generated
	 */
	public Adapter createRouteDefinitionHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RoutesDefinition <em>Routes Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RoutesDefinition
	 * @generated
	 */
	public Adapter createRoutesDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RoutingSlipDefinition <em>Routing Slip Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RoutingSlipDefinition
	 * @generated
	 */
	public Adapter createRoutingSlipDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RssDataFormat <em>Rss Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RssDataFormat
	 * @generated
	 */
	public Adapter createRssDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.RubyExpression <em>Ruby Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.RubyExpression
	 * @generated
	 */
	public Adapter createRubyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SamplingDefinition <em>Sampling Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SamplingDefinition
	 * @generated
	 */
	public Adapter createSamplingDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SecureRandomParametersFactoryBean <em>Secure Random Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SecureRandomParametersFactoryBean
	 * @generated
	 */
	public Adapter createSecureRandomParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SecureSocketProtocolsParameters <em>Secure Socket Protocols Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SecureSocketProtocolsParameters
	 * @generated
	 */
	public Adapter createSecureSocketProtocolsParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SendDefinition <em>Send Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SendDefinition
	 * @generated
	 */
	public Adapter createSendDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SerializationDataFormat <em>Serialization Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SerializationDataFormat
	 * @generated
	 */
	public Adapter createSerializationDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetBodyDefinition <em>Set Body Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetBodyDefinition
	 * @generated
	 */
	public Adapter createSetBodyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetExchangePatternDefinition <em>Set Exchange Pattern Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetExchangePatternDefinition
	 * @generated
	 */
	public Adapter createSetExchangePatternDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetFaultBodyDefinition <em>Set Fault Body Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetFaultBodyDefinition
	 * @generated
	 */
	public Adapter createSetFaultBodyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetHeaderDefinition <em>Set Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetHeaderDefinition
	 * @generated
	 */
	public Adapter createSetHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetOutHeaderDefinition <em>Set Out Header Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetOutHeaderDefinition
	 * @generated
	 */
	public Adapter createSetOutHeaderDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SetPropertyDefinition <em>Set Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SetPropertyDefinition
	 * @generated
	 */
	public Adapter createSetPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SimpleExpression <em>Simple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SimpleExpression
	 * @generated
	 */
	public Adapter createSimpleExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SoapJaxbDataFormat <em>Soap Jaxb Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SoapJaxbDataFormat
	 * @generated
	 */
	public Adapter createSoapJaxbDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SortDefinition <em>Sort Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SortDefinition
	 * @generated
	 */
	public Adapter createSortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SpELExpression <em>Sp EL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SpELExpression
	 * @generated
	 */
	public Adapter createSpELExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SplitDefinition <em>Split Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SplitDefinition
	 * @generated
	 */
	public Adapter createSplitDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SqlExpression <em>Sql Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SqlExpression
	 * @generated
	 */
	public Adapter createSqlExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SslContextClientParametersFactoryBean <em>Ssl Context Client Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SslContextClientParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextClientParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SslContextParametersFactoryBean <em>Ssl Context Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SslContextParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SslContextServerParametersFactoryBean <em>Ssl Context Server Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SslContextServerParametersFactoryBean
	 * @generated
	 */
	public Adapter createSslContextServerParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.StickyLoadBalancerDefinition <em>Sticky Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.StickyLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createStickyLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.StopDefinition <em>Stop Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.StopDefinition
	 * @generated
	 */
	public Adapter createStopDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.StreamResequencerConfig <em>Stream Resequencer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.StreamResequencerConfig
	 * @generated
	 */
	public Adapter createStreamResequencerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.StringDataFormat <em>String Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.StringDataFormat
	 * @generated
	 */
	public Adapter createStringDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.SyslogDataFormat <em>Syslog Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.SyslogDataFormat
	 * @generated
	 */
	public Adapter createSyslogDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ThreadPoolProfileDefinition <em>Thread Pool Profile Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ThreadPoolProfileDefinition
	 * @generated
	 */
	public Adapter createThreadPoolProfileDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ThreadsDefinition <em>Threads Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ThreadsDefinition
	 * @generated
	 */
	public Adapter createThreadsDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ThrottleDefinition <em>Throttle Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ThrottleDefinition
	 * @generated
	 */
	public Adapter createThrottleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ThrowExceptionDefinition <em>Throw Exception Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ThrowExceptionDefinition
	 * @generated
	 */
	public Adapter createThrowExceptionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TidyMarkupDataFormat <em>Tidy Markup Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TidyMarkupDataFormat
	 * @generated
	 */
	public Adapter createTidyMarkupDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ToDefinition <em>To Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ToDefinition
	 * @generated
	 */
	public Adapter createToDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TokenizerExpression <em>Tokenizer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TokenizerExpression
	 * @generated
	 */
	public Adapter createTokenizerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TopicLoadBalancerDefinition <em>Topic Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TopicLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createTopicLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TransactedDefinition <em>Transacted Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TransactedDefinition
	 * @generated
	 */
	public Adapter createTransactedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TransformDefinition <em>Transform Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TransformDefinition
	 * @generated
	 */
	public Adapter createTransformDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TrustManagersParametersFactoryBean <em>Trust Managers Parameters Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TrustManagersParametersFactoryBean
	 * @generated
	 */
	public Adapter createTrustManagersParametersFactoryBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.TryDefinition <em>Try Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.TryDefinition
	 * @generated
	 */
	public Adapter createTryDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.UnmarshalDefinition <em>Unmarshal Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.UnmarshalDefinition
	 * @generated
	 */
	public Adapter createUnmarshalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ValidateDefinition <em>Validate Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ValidateDefinition
	 * @generated
	 */
	public Adapter createValidateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.WeightedLoadBalancerDefinition <em>Weighted Load Balancer Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.WeightedLoadBalancerDefinition
	 * @generated
	 */
	public Adapter createWeightedLoadBalancerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.WhenDefinition <em>When Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.WhenDefinition
	 * @generated
	 */
	public Adapter createWhenDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.WireTapDefinition <em>Wire Tap Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.WireTapDefinition
	 * @generated
	 */
	public Adapter createWireTapDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.XmlBeansDataFormat <em>Xml Beans Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.XmlBeansDataFormat
	 * @generated
	 */
	public Adapter createXmlBeansDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.XmlSecurityDataFormat <em>Xml Security Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.XmlSecurityDataFormat
	 * @generated
	 */
	public Adapter createXmlSecurityDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.XPathExpression <em>XPath Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.XPathExpression
	 * @generated
	 */
	public Adapter createXPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.XQueryExpression <em>XQuery Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.XQueryExpression
	 * @generated
	 */
	public Adapter createXQueryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.XStreamDataFormat <em>XStream Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.XStreamDataFormat
	 * @generated
	 */
	public Adapter createXStreamDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jboss.tools.switchyard.model.spring.ZipDataFormat <em>Zip Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jboss.tools.switchyard.model.spring.ZipDataFormat
	 * @generated
	 */
	public Adapter createZipDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpringAdapterFactory
