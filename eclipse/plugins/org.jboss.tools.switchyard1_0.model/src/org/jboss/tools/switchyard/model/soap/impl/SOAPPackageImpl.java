/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.soap.impl;

import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.core.model.instance.InstancePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

import org.jboss.tools.switchyard.model.bean.BeanPackage;

import org.jboss.tools.switchyard.model.bean.impl.BeanPackageImpl;

import org.jboss.tools.switchyard.model.bpm.BPMPackage;

import org.jboss.tools.switchyard.model.bpm.impl.BPMPackageImpl;

import org.jboss.tools.switchyard.model.clojure.ClojurePackage;

import org.jboss.tools.switchyard.model.clojure.impl.ClojurePackageImpl;

import org.jboss.tools.switchyard.model.commonrules.CommonRulesPackage;

import org.jboss.tools.switchyard.model.commonrules.impl.CommonRulesPackageImpl;

import org.jboss.tools.switchyard.model.hornetq.HornetQPackage;

import org.jboss.tools.switchyard.model.hornetq.impl.HornetQPackageImpl;

import org.jboss.tools.switchyard.model.rules.RulesPackage;

import org.jboss.tools.switchyard.model.rules.impl.RulesPackageImpl;

import org.jboss.tools.switchyard.model.soap.DocumentRoot;
import org.jboss.tools.switchyard.model.soap.SOAPBindingType;
import org.jboss.tools.switchyard.model.soap.SOAPFactory;
import org.jboss.tools.switchyard.model.soap.SOAPPackage;

import org.jboss.tools.switchyard.model.soap.util.SOAPValidator;

import org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage;

import org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl;

import org.jboss.tools.switchyard.model.transform.TransformPackage;

import org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl;

import org.jboss.tools.switchyard.model.validate.ValidatePackage;

import org.jboss.tools.switchyard.model.validate.impl.ValidatePackageImpl;

import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELPackage;

import org.open.oasis.docs.ns.opencsa.sca.bpel.impl.BPELPackageImpl;

import org.w3.ns.ws.policy.PolicyPackage;

import org.w3.ns.ws.policy.impl.PolicyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SOAPPackageImpl extends EPackageImpl implements SOAPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soapBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wsdlPortTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.jboss.tools.switchyard.model.soap.SOAPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SOAPPackageImpl() {
		super(eNS_URI, SOAPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SOAPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SOAPPackage init() {
		if (isInited) return (SOAPPackage)EPackage.Registry.INSTANCE.getEPackage(SOAPPackage.eNS_URI);

		// Obtain or create and register package
		SOAPPackageImpl theSOAPPackage = (SOAPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SOAPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SOAPPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ScaPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		AddressingPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI) : PolicyPackage.eINSTANCE);
		BeanPackageImpl theBeanPackage = (BeanPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) instanceof BeanPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BeanPackage.eNS_URI) : BeanPackage.eINSTANCE);
		BPELPackageImpl theBPELPackage = (BPELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) instanceof BPELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPELPackage.eNS_URI) : BPELPackage.eINSTANCE);
		BPMPackageImpl theBPMPackage = (BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) instanceof BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMPackage.eNS_URI) : BPMPackage.eINSTANCE);
		CommonRulesPackageImpl theCommonRulesPackage = (CommonRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) instanceof CommonRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonRulesPackage.eNS_URI) : CommonRulesPackage.eINSTANCE);
		SwitchyardPackageImpl theSwitchyardPackage = (SwitchyardPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) instanceof SwitchyardPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SwitchyardPackage.eNS_URI) : SwitchyardPackage.eINSTANCE);
		ClojurePackageImpl theClojurePackage = (ClojurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) instanceof ClojurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClojurePackage.eNS_URI) : ClojurePackage.eINSTANCE);
		HornetQPackageImpl theHornetQPackage = (HornetQPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) instanceof HornetQPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HornetQPackage.eNS_URI) : HornetQPackage.eINSTANCE);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);
		TransformPackageImpl theTransformPackage = (TransformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) instanceof TransformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformPackage.eNS_URI) : TransformPackage.eINSTANCE);
		ValidatePackageImpl theValidatePackage = (ValidatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) instanceof ValidatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidatePackage.eNS_URI) : ValidatePackage.eINSTANCE);

		// Create package meta-data objects
		theSOAPPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theBeanPackage.createPackageContents();
		theBPELPackage.createPackageContents();
		theBPMPackage.createPackageContents();
		theCommonRulesPackage.createPackageContents();
		theSwitchyardPackage.createPackageContents();
		theClojurePackage.createPackageContents();
		theHornetQPackage.createPackageContents();
		theRulesPackage.createPackageContents();
		theTransformPackage.createPackageContents();
		theValidatePackage.createPackageContents();

		// Initialize created meta-data
		theSOAPPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theBeanPackage.initializePackageContents();
		theBPELPackage.initializePackageContents();
		theBPMPackage.initializePackageContents();
		theCommonRulesPackage.initializePackageContents();
		theSwitchyardPackage.initializePackageContents();
		theClojurePackage.initializePackageContents();
		theHornetQPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();
		theTransformPackage.initializePackageContents();
		theValidatePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSOAPPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SOAPValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSOAPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SOAPPackage.eNS_URI, theSOAPPackage);
		return theSOAPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BindingSoap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOAPBindingType() {
		return soapBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOAPBindingType_Wsdl() {
		return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOAPBindingType_WsdlPort() {
		return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOAPBindingType_SocketAddr() {
		return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOAPBindingType_ContextPath() {
		return (EAttribute)soapBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWsdlPortType() {
		return wsdlPortTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOAPFactory getSOAPFactory() {
		return (SOAPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING_SOAP);

		soapBindingTypeEClass = createEClass(SOAP_BINDING_TYPE);
		createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__WSDL);
		createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__WSDL_PORT);
		createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__SOCKET_ADDR);
		createEAttribute(soapBindingTypeEClass, SOAP_BINDING_TYPE__CONTEXT_PATH);

		// Create data types
		wsdlPortTypeEDataType = createEDataType(WSDL_PORT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BindingSoap(), this.getSOAPBindingType(), null, "bindingSoap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(soapBindingTypeEClass, SOAPBindingType.class, "SOAPBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSOAPBindingType_Wsdl(), theXMLTypePackage.getAnyURI(), "wsdl", null, 1, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOAPBindingType_WsdlPort(), this.getWsdlPortType(), "wsdlPort", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOAPBindingType_SocketAddr(), theXMLTypePackage.getString(), "socketAddr", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOAPBindingType_ContextPath(), theXMLTypePackage.getString(), "contextPath", null, 0, 1, SOAPBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(wsdlPortTypeEDataType, String.class, "WsdlPortType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_BindingSoap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "binding.soap",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:switchyard-config:switchyard:1.0#binding.switchyard"
		   });		
		addAnnotation
		  (soapBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SOAPBindingType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSOAPBindingType_Wsdl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wsdl",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSOAPBindingType_WsdlPort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wsdlPort",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSOAPBindingType_SocketAddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "socketAddr",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSOAPBindingType_ContextPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contextPath",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (wsdlPortTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "wsdlPortType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "\\{.+\\}.+:[^:]+|.+:[^:]+|[^:]+"
		   });
	}

} //SOAPPackageImpl
