/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.switchyard.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ArtifactsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ContextMapperType;
import org.switchyard.tools.models.switchyard1_0.switchyard.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.switchyard.DomainType;
import org.switchyard.tools.models.switchyard1_0.switchyard.EsbInterface;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.HandlersType;
import org.switchyard.tools.models.switchyard1_0.switchyard.JavaOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.MessageComposerType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.PropertyType;
import org.switchyard.tools.models.switchyard1_0.switchyard.RegexOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecuritiesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SecurityType;
import org.switchyard.tools.models.switchyard1_0.switchyard.StaticOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardBindingType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardOperationSelectorType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchYardType;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;
import org.switchyard.tools.models.switchyard1_0.switchyard.TransformsType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidateType;
import org.switchyard.tools.models.switchyard1_0.switchyard.ValidatesType;
import org.switchyard.tools.models.switchyard1_0.switchyard.XPathOperationSelectorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getBindingSwitchyard <em>Binding Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getInterfaceEsb <em>Interface Esb</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getSwitchyard <em>Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getValidates <em>Validates</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getOperationSelectorSwitchyard <em>Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getJavaOperationSelectorSwitchyard <em>Java Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getRegexOperationSelectorSwitchyard <em>Regex Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getXpathOperationSelectorSwitchyard <em>Xpath Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getStaticOperationSelectorSwitchyard <em>Static Operation Selector Switchyard</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getLoadBalance <em>Load Balance</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getSecurityAttr <em>Security Attr</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.switchyard.impl.DocumentRootImpl#getSecurities <em>Securities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
	protected FeatureMap mixed;

	/**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
	protected EMap<String, String> xSISchemaLocation;

	/**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected static final String TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected String target = TARGET_EDEFAULT;

    /**
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #isClustered() <em>Clustered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isClustered()
     * @generated
     * @ordered
     */
    protected static final boolean CLUSTERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isClustered() <em>Clustered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isClustered()
     * @generated
     * @ordered
     */
    protected boolean clustered = CLUSTERED_EDEFAULT;

    /**
     * The default value of the '{@link #getLoadBalance() <em>Load Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadBalance()
     * @generated
     * @ordered
     */
    protected static final String LOAD_BALANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoadBalance() <em>Load Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadBalance()
     * @generated
     * @ordered
     */
    protected String loadBalance = LOAD_BALANCE_EDEFAULT;

    /**
     * The default value of the '{@link #getSecurityAttr() <em>Security Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityAttr()
     * @generated
     * @ordered
     */
    protected static final String SECURITY_ATTR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityAttr() <em>Security Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityAttr()
     * @generated
     * @ordered
     */
    protected String securityAttr = SECURITY_ATTR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected DocumentRootImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SwitchyardPackage.Literals.DOCUMENT_ROOT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, SwitchyardPackage.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated NOT
     */
	@SuppressWarnings("serial")
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String, String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
                    EStringToStringMapEntryImpl.class, null) {
                {
                    initializeDelegateEList();
                }

                @Override
                protected void initializeDelegateEList() {
                    delegateEList = new DelegateEObjectContainmentEList<Entry<String, String>>(entryClass,
                            DocumentRootImpl.this, SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP) {
                        @Override
                        protected void dispatchNotification(Notification notification) {
                        }
                    };
                }
            };
        }
        return xMLNSPrefixMap;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArtifactType getArtifact() {
        return (ArtifactType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACT, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetArtifact(ArtifactType newArtifact, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACT, newArtifact, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setArtifact(ArtifactType newArtifact) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACT, newArtifact);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArtifactsType getArtifacts() {
        return (ArtifactsType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACTS, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetArtifacts(ArtifactsType newArtifacts, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACTS, newArtifacts, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setArtifacts(ArtifactsType newArtifacts) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__ARTIFACTS, newArtifacts);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchYardBindingType getBindingSwitchyard() {
        return (SwitchYardBindingType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__BINDING_SWITCHYARD, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBindingSwitchyard(SwitchYardBindingType newBindingSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__BINDING_SWITCHYARD, newBindingSwitchyard, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DomainType getDomain() {
        return (DomainType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__DOMAIN, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDomain(DomainType newDomain, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDomain(DomainType newDomain) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__DOMAIN, newDomain);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HandlerType getHandler() {
        return (HandlerType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLER, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHandler(HandlerType newHandler, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLER, newHandler, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHandler(HandlerType newHandler) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLER, newHandler);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HandlersType getHandlers() {
        return (HandlersType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLERS, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHandlers(HandlersType newHandlers, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLERS, newHandlers, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHandlers(HandlersType newHandlers) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__HANDLERS, newHandlers);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EsbInterface getInterfaceEsb() {
        return (EsbInterface)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__INTERFACE_ESB, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetInterfaceEsb(EsbInterface newInterfaceEsb, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__INTERFACE_ESB, newInterfaceEsb, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInterfaceEsb(EsbInterface newInterfaceEsb) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__INTERFACE_ESB, newInterfaceEsb);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertiesType getProperties() {
        return (PropertiesType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTIES, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProperties(PropertiesType newProperties) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTIES, newProperties);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PropertyType getProperty() {
        return (PropertyType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProperty(PropertyType newProperty) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResourceType getResource() {
        return (ResourceType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__RESOURCE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetResource(ResourceType newResource, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResource(ResourceType newResource) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__RESOURCE, newResource);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SwitchYardType getSwitchyard() {
        return (SwitchYardType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__SWITCHYARD, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSwitchyard(SwitchYardType newSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__SWITCHYARD, newSwitchyard, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSwitchyard(SwitchYardType newSwitchyard) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__SWITCHYARD, newSwitchyard);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformType getTransform() {
        return (TransformType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORM, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransform(TransformType newTransform, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransformsType getTransforms() {
        return (TransformsType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTransforms(TransformsType newTransforms, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, newTransforms, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransforms(TransformsType newTransforms) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, newTransforms);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidateType getValidate() {
        return (ValidateType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATE, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetValidate(ValidateType newValidate, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATE, newValidate, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ValidatesType getValidates() {
        return (ValidatesType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATES, true);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetValidates(ValidatesType newValidates, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATES, newValidates, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValidates(ValidatesType newValidates) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__VALIDATES, newValidates);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchYardOperationSelectorType getOperationSelectorSwitchyard() {
        return (SwitchYardOperationSelectorType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperationSelectorSwitchyard(SwitchYardOperationSelectorType newOperationSelectorSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD, newOperationSelectorSwitchyard, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextMapperType getContextMapper() {
        return (ContextMapperType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextMapper(ContextMapperType newContextMapper, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextMapper(ContextMapperType newContextMapper) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER, newContextMapper);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageComposerType getMessageComposer() {
        return (MessageComposerType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessageComposer(MessageComposerType newMessageComposer, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageComposer(MessageComposerType newMessageComposer) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER, newMessageComposer);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JavaOperationSelectorType getJavaOperationSelectorSwitchyard() {
        return (JavaOperationSelectorType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD, true);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetJavaOperationSelectorSwitchyard(JavaOperationSelectorType newJavaOperationSelectorSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD, newJavaOperationSelectorSwitchyard, msgs);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setJavaOperationSelectorSwitchyard(JavaOperationSelectorType newJavaOperationSelectorSwitchyard) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD, newJavaOperationSelectorSwitchyard);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RegexOperationSelectorType getRegexOperationSelectorSwitchyard() {
        return (RegexOperationSelectorType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD, true);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetRegexOperationSelectorSwitchyard(RegexOperationSelectorType newRegexOperationSelectorSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD, newRegexOperationSelectorSwitchyard, msgs);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRegexOperationSelectorSwitchyard(RegexOperationSelectorType newRegexOperationSelectorSwitchyard) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD, newRegexOperationSelectorSwitchyard);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public XPathOperationSelectorType getXpathOperationSelectorSwitchyard() {
        return (XPathOperationSelectorType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD, true);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetXpathOperationSelectorSwitchyard(XPathOperationSelectorType newXpathOperationSelectorSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD, newXpathOperationSelectorSwitchyard, msgs);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXpathOperationSelectorSwitchyard(XPathOperationSelectorType newXpathOperationSelectorSwitchyard) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD, newXpathOperationSelectorSwitchyard);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StaticOperationSelectorType getStaticOperationSelectorSwitchyard() {
        return (StaticOperationSelectorType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD, true);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetStaticOperationSelectorSwitchyard(StaticOperationSelectorType newStaticOperationSelectorSwitchyard, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD, newStaticOperationSelectorSwitchyard, msgs);
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStaticOperationSelectorSwitchyard(StaticOperationSelectorType newStaticOperationSelectorSwitchyard) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD, newStaticOperationSelectorSwitchyard);
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecurityType getSecurity() {
        return (SecurityType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY, true);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecurity(SecurityType newSecurity, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY, newSecurity, msgs);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurity(SecurityType newSecurity) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITY, newSecurity);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTarget() {
        return target;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(String newTarget) {
        String oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOCUMENT_ROOT__TARGET, oldTarget, target));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isClustered() {
        return clustered;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClustered(boolean newClustered) {
        boolean oldClustered = clustered;
        clustered = newClustered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED, oldClustered, clustered));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLoadBalance() {
        return loadBalance;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoadBalance(String newLoadBalance) {
        String oldLoadBalance = loadBalance;
        loadBalance = newLoadBalance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE, oldLoadBalance, loadBalance));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSecurityAttr() {
        return securityAttr;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityAttr(String newSecurityAttr) {
        String oldSecurityAttr = securityAttr;
        securityAttr = newSecurityAttr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR, oldSecurityAttr, securityAttr));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecuritiesType getSecurities() {
        return (SecuritiesType)getMixed().get(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITIES, true);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecurities(SecuritiesType newSecurities, NotificationChain msgs) {
        return ((FeatureMap.Internal)getMixed()).basicAdd(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITIES, newSecurities, msgs);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurities(SecuritiesType newSecurities) {
        ((FeatureMap.Internal)getMixed()).set(SwitchyardPackage.Literals.DOCUMENT_ROOT__SECURITIES, newSecurities);
    }

                /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SwitchyardPackage.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
                return basicSetArtifact(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
                return basicSetArtifacts(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__BINDING_SWITCHYARD:
                return basicSetBindingSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
                return basicSetDomain(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
                return basicSetHandler(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
                return basicSetHandlers(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
                return basicSetInterfaceEsb(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
                return basicSetProperties(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
                return basicSetProperty(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
                return basicSetResource(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
                return basicSetSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORM:
                return basicSetTransform(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
                return basicSetTransforms(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATE:
                return basicSetValidate(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
                return basicSetValidates(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD:
                return basicSetOperationSelectorSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return basicSetContextMapper(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return basicSetMessageComposer(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
                return basicSetJavaOperationSelectorSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
                return basicSetRegexOperationSelectorSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
                return basicSetXpathOperationSelectorSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
                return basicSetStaticOperationSelectorSwitchyard(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
                return basicSetSecurity(null, msgs);
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
                return basicSetSecurities(null, msgs);
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
            case SwitchyardPackage.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
                return getArtifact();
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
                return getArtifacts();
            case SwitchyardPackage.DOCUMENT_ROOT__BINDING_SWITCHYARD:
                return getBindingSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
                return getDomain();
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
                return getHandler();
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
                return getHandlers();
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
                return getInterfaceEsb();
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
                return getProperties();
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
                return getProperty();
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource();
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
                return getSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORM:
                return getTransform();
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
                return getTransforms();
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATE:
                return getValidate();
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
                return getValidates();
            case SwitchyardPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD:
                return getOperationSelectorSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper();
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer();
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
                return getJavaOperationSelectorSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
                return getRegexOperationSelectorSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
                return getXpathOperationSelectorSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
                return getStaticOperationSelectorSwitchyard();
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
                return getSecurity();
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET:
                return getTarget();
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE:
                return getTargetNamespace();
            case SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED:
                return isClustered();
            case SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE:
                return getLoadBalance();
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR:
                return getSecurityAttr();
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
                return getSecurities();
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
            case SwitchyardPackage.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
                setArtifact((ArtifactType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
                setArtifacts((ArtifactsType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
                setDomain((DomainType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
                setHandler((HandlerType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
                setHandlers((HandlersType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
                setInterfaceEsb((EsbInterface)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
                setProperty((PropertyType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
                setSwitchyard((SwitchYardType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
                setTransforms((TransformsType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
                setValidates((ValidatesType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
                setJavaOperationSelectorSwitchyard((JavaOperationSelectorType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
                setRegexOperationSelectorSwitchyard((RegexOperationSelectorType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
                setXpathOperationSelectorSwitchyard((XPathOperationSelectorType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
                setStaticOperationSelectorSwitchyard((StaticOperationSelectorType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
                setSecurity((SecurityType)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET:
                setTarget((String)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED:
                setClustered((Boolean)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE:
                setLoadBalance((String)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR:
                setSecurityAttr((String)newValue);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
                setSecurities((SecuritiesType)newValue);
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
            case SwitchyardPackage.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
                setArtifact((ArtifactType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
                setArtifacts((ArtifactsType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
                setDomain((DomainType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
                setHandler((HandlerType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
                setHandlers((HandlersType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
                setInterfaceEsb((EsbInterface)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
                setProperty((PropertyType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
                setResource((ResourceType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
                setSwitchyard((SwitchYardType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
                setTransforms((TransformsType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
                setValidates((ValidatesType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                setContextMapper((ContextMapperType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                setMessageComposer((MessageComposerType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
                setJavaOperationSelectorSwitchyard((JavaOperationSelectorType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
                setRegexOperationSelectorSwitchyard((RegexOperationSelectorType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
                setXpathOperationSelectorSwitchyard((XPathOperationSelectorType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
                setStaticOperationSelectorSwitchyard((StaticOperationSelectorType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
                setSecurity((SecurityType)null);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED:
                setClustered(CLUSTERED_EDEFAULT);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE:
                setLoadBalance(LOAD_BALANCE_EDEFAULT);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR:
                setSecurityAttr(SECURITY_ATTR_EDEFAULT);
                return;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
                setSecurities((SecuritiesType)null);
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
            case SwitchyardPackage.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case SwitchyardPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case SwitchyardPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACT:
                return getArtifact() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__ARTIFACTS:
                return getArtifacts() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__BINDING_SWITCHYARD:
                return getBindingSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__DOMAIN:
                return getDomain() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLER:
                return getHandler() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__HANDLERS:
                return getHandlers() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__INTERFACE_ESB:
                return getInterfaceEsb() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTIES:
                return getProperties() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__PROPERTY:
                return getProperty() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__RESOURCE:
                return getResource() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__SWITCHYARD:
                return getSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORM:
                return getTransform() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__TRANSFORMS:
                return getTransforms() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATE:
                return getValidate() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__VALIDATES:
                return getValidates() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_SWITCHYARD:
                return getOperationSelectorSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__CONTEXT_MAPPER:
                return getContextMapper() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER:
                return getMessageComposer() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__JAVA_OPERATION_SELECTOR_SWITCHYARD:
                return getJavaOperationSelectorSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__REGEX_OPERATION_SELECTOR_SWITCHYARD:
                return getRegexOperationSelectorSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__XPATH_OPERATION_SELECTOR_SWITCHYARD:
                return getXpathOperationSelectorSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__STATIC_OPERATION_SELECTOR_SWITCHYARD:
                return getStaticOperationSelectorSwitchyard() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY:
                return getSecurity() != null;
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case SwitchyardPackage.DOCUMENT_ROOT__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
            case SwitchyardPackage.DOCUMENT_ROOT__CLUSTERED:
                return clustered != CLUSTERED_EDEFAULT;
            case SwitchyardPackage.DOCUMENT_ROOT__LOAD_BALANCE:
                return LOAD_BALANCE_EDEFAULT == null ? loadBalance != null : !LOAD_BALANCE_EDEFAULT.equals(loadBalance);
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITY_ATTR:
                return SECURITY_ATTR_EDEFAULT == null ? securityAttr != null : !SECURITY_ATTR_EDEFAULT.equals(securityAttr);
            case SwitchyardPackage.DOCUMENT_ROOT__SECURITIES:
                return getSecurities() != null;
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
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(", target: ");
        result.append(target);
        result.append(", targetNamespace: ");
        result.append(targetNamespace);
        result.append(", clustered: ");
        result.append(clustered);
        result.append(", loadBalance: ");
        result.append(loadBalance);
        result.append(", securityAttr: ");
        result.append(securityAttr);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
