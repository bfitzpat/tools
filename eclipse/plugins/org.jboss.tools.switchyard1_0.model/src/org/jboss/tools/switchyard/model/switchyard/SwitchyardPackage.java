/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.switchyard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardFactory
 * @model kind="package"
 * @generated
 */
public interface SwitchyardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "switchyard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:switchyard-config:switchyard:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwitchyardPackage eINSTANCE = org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ArtifactsTypeImpl <em>Artifacts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ArtifactsTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getArtifactsType()
	 * @generated
	 */
	int ARTIFACTS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_TYPE__ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>Artifacts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ArtifactTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__URL = 1;

	/**
	 * The number of structural features of the '<em>Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ContextMapperTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getContextMapperType()
	 * @generated
	 */
	int CONTEXT_MAPPER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Exclude Namespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = 1;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE__EXCLUDES = 2;

	/**
	 * The feature id for the '<em><b>Include Namespaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = 3;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE__INCLUDES = 4;

	/**
	 * The number of structural features of the '<em>Context Mapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MAPPER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.DocumentRootImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Binding Switchyard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_SWITCHYARD = 4;

	/**
	 * The feature id for the '<em><b>Resource1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE1 = 5;

	/**
	 * The feature id for the '<em><b>Binding Switchyard1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_SWITCHYARD1 = 6;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARTIFACT = 7;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARTIFACTS = 8;

	/**
	 * The feature id for the '<em><b>Binding Switchyard2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINDING_SWITCHYARD2 = 9;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTEXT_MAPPER = 10;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOMAIN = 11;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLER = 12;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HANDLERS = 13;

	/**
	 * The feature id for the '<em><b>Interface Esb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE_ESB = 14;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE_COMPOSER = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTIES = 16;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Resource2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE2 = 18;

	/**
	 * The feature id for the '<em><b>Switchyard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SWITCHYARD = 19;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM = 20;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORMS = 21;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE = 22;

	/**
	 * The feature id for the '<em><b>Validates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATES = 23;

	/**
	 * The feature id for the '<em><b>Transform1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM1 = 24;

	/**
	 * The feature id for the '<em><b>Transform2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM2 = 25;

	/**
	 * The feature id for the '<em><b>Transform3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM3 = 26;

	/**
	 * The feature id for the '<em><b>Transform4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM4 = 27;

	/**
	 * The feature id for the '<em><b>Transform5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM5 = 28;

	/**
	 * The feature id for the '<em><b>Validate1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE1 = 29;

	/**
	 * The feature id for the '<em><b>Validate2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALIDATE2 = 30;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 31;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.DomainTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Validates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__VALIDATES = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__HANDLERS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.EsbInterfaceImpl <em>Esb Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.EsbInterfaceImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getEsbInterface()
	 * @generated
	 */
	int ESB_INTERFACE = 5;

	/**
	 * The number of structural features of the '<em>Esb Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESB_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.HandlersTypeImpl <em>Handlers Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.HandlersTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getHandlersType()
	 * @generated
	 */
	int HANDLERS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLERS_TYPE__HANDLER = 0;

	/**
	 * The number of structural features of the '<em>Handlers Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.HandlerTypeImpl <em>Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.HandlerTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getHandlerType()
	 * @generated
	 */
	int HANDLER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Handler Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.MessageComposerTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getMessageComposerType()
	 * @generated
	 */
	int MESSAGE_COMPOSER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPOSER_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Message Composer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPOSER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.PropertiesTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.PropertyTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ResourceTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardBindingTypeImpl <em>Switch Yard Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardBindingTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getSwitchYardBindingType()
	 * @generated
	 */
	int SWITCH_YARD_BINDING_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Context Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER = 0;

	/**
	 * The feature id for the '<em><b>Message Composer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER = 1;

	/**
	 * The number of structural features of the '<em>Switch Yard Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardTypeImpl <em>Switch Yard Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getSwitchYardType()
	 * @generated
	 */
	int SWITCH_YARD_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Validates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__VALIDATES = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__ARTIFACTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__TARGET_NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE__COMPOSITE = 6;

	/**
	 * The number of structural features of the '<em>Switch Yard Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_YARD_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.TransformsTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getTransformsType()
	 * @generated
	 */
	int TRANSFORMS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Transform Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE__TRANSFORM_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE__TRANSFORM = 1;

	/**
	 * The number of structural features of the '<em>Transforms Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.TransformTypeImpl <em>Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.TransformTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getTransformType()
	 * @generated
	 */
	int TRANSFORM_TYPE = 15;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE__TO = 1;

	/**
	 * The number of structural features of the '<em>Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ValidatesTypeImpl <em>Validates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ValidatesTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getValidatesType()
	 * @generated
	 */
	int VALIDATES_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Validate Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATES_TYPE__VALIDATE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATES_TYPE__VALIDATE = 1;

	/**
	 * The number of structural features of the '<em>Validates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ValidateTypeImpl <em>Validate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.ValidateTypeImpl
	 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getValidateType()
	 * @generated
	 */
	int VALIDATE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Validate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_TYPE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ArtifactsType <em>Artifacts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifacts Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ArtifactsType
	 * @generated
	 */
	EClass getArtifactsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jboss.tools.switchyard.model.switchyard.ArtifactsType#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ArtifactsType#getArtifact()
	 * @see #getArtifactsType()
	 * @generated
	 */
	EReference getArtifactsType_Artifact();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ArtifactType
	 * @generated
	 */
	EClass getArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ArtifactType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ArtifactType#getName()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ArtifactType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ArtifactType#getUrl()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Url();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType <em>Context Mapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Mapper Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType
	 * @generated
	 */
	EClass getContextMapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getClass_()
	 * @see #getContextMapperType()
	 * @generated
	 */
	EAttribute getContextMapperType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getExcludeNamespaces <em>Exclude Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Namespaces</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getExcludeNamespaces()
	 * @see #getContextMapperType()
	 * @generated
	 */
	EAttribute getContextMapperType_ExcludeNamespaces();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excludes</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getExcludes()
	 * @see #getContextMapperType()
	 * @generated
	 */
	EAttribute getContextMapperType_Excludes();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getIncludeNamespaces <em>Include Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Namespaces</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getIncludeNamespaces()
	 * @see #getContextMapperType()
	 * @generated
	 */
	EAttribute getContextMapperType_IncludeNamespaces();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ContextMapperType#getIncludes()
	 * @see #getContextMapperType()
	 * @generated
	 */
	EAttribute getContextMapperType_Includes();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Resource();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard <em>Binding Switchyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Switchyard</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BindingSwitchyard();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource1 <em>Resource1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource1</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Resource1();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard1 <em>Binding Switchyard1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Switchyard1</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BindingSwitchyard1();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifacts</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifacts()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Artifacts();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard2 <em>Binding Switchyard2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Switchyard2</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BindingSwitchyard2();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getContextMapper <em>Context Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Mapper</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getContextMapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ContextMapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandler()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Handler();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handlers</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandlers()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Esb</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getInterfaceEsb()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterfaceEsb();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMessageComposer <em>Message Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Composer</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMessageComposer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MessageComposer();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource2 <em>Resource2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource2</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Resource2();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switchyard</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getSwitchyard()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Switchyard();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transform();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransforms()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validate</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Validate();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidates <em>Validates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validates</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Validates();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform1 <em>Transform1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform1</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform1();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform2 <em>Transform2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform2</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform2();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform3 <em>Transform3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform3</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform3()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform3();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform4 <em>Transform4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform4</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform4();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform5 <em>Transform5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform5</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform5()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Transform5();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate1 <em>Validate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate1</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Validate1();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate2 <em>Validate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate2</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Validate2();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DomainType#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType#getTransforms()
	 * @see #getDomainType()
	 * @generated
	 */
	EReference getDomainType_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DomainType#getValidates <em>Validates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validates</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType#getValidates()
	 * @see #getDomainType()
	 * @generated
	 */
	EReference getDomainType_Validates();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DomainType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType#getProperties()
	 * @see #getDomainType()
	 * @generated
	 */
	EReference getDomainType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.DomainType#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handlers</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType#getHandlers()
	 * @see #getDomainType()
	 * @generated
	 */
	EReference getDomainType_Handlers();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.DomainType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.DomainType#getName()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Name();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.EsbInterface <em>Esb Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esb Interface</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.EsbInterface
	 * @generated
	 */
	EClass getEsbInterface();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.HandlersType <em>Handlers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handlers Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.HandlersType
	 * @generated
	 */
	EClass getHandlersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jboss.tools.switchyard.model.switchyard.HandlersType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.HandlersType#getHandler()
	 * @see #getHandlersType()
	 * @generated
	 */
	EReference getHandlersType_Handler();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.HandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.HandlerType
	 * @generated
	 */
	EClass getHandlerType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.HandlerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.HandlerType#getClass_()
	 * @see #getHandlerType()
	 * @generated
	 */
	EAttribute getHandlerType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.HandlerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.HandlerType#getName()
	 * @see #getHandlerType()
	 * @generated
	 */
	EAttribute getHandlerType_Name();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.MessageComposerType <em>Message Composer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Composer Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.MessageComposerType
	 * @generated
	 */
	EClass getMessageComposerType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.MessageComposerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.MessageComposerType#getClass_()
	 * @see #getMessageComposerType()
	 * @generated
	 */
	EAttribute getMessageComposerType_Class();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jboss.tools.switchyard.model.switchyard.PropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.PropertiesType#getProperty()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ResourceType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ResourceType#getLocation()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ResourceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ResourceType#getType()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Type();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType <em>Switch Yard Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Yard Binding Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType
	 * @generated
	 */
	EClass getSwitchYardBindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getContextMapper <em>Context Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Mapper</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getContextMapper()
	 * @see #getSwitchYardBindingType()
	 * @generated
	 */
	EReference getSwitchYardBindingType_ContextMapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getMessageComposer <em>Message Composer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Composer</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardBindingType#getMessageComposer()
	 * @see #getSwitchYardBindingType()
	 * @generated
	 */
	EReference getSwitchYardBindingType_MessageComposer();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType <em>Switch Yard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Yard Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType
	 * @generated
	 */
	EClass getSwitchYardType();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getComposite()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EReference getSwitchYardType_Composite();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transforms</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getTransforms()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EReference getSwitchYardType_Transforms();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getValidates <em>Validates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validates</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getValidates()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EReference getSwitchYardType_Validates();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getDomain()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EReference getSwitchYardType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifacts</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getArtifacts()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EReference getSwitchYardType_Artifacts();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getName()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EAttribute getSwitchYardType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.SwitchYardType#getTargetNamespace()
	 * @see #getSwitchYardType()
	 * @generated
	 */
	EAttribute getSwitchYardType_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.TransformsType <em>Transforms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transforms Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformsType
	 * @generated
	 */
	EClass getTransformsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.jboss.tools.switchyard.model.switchyard.TransformsType#getTransformGroup <em>Transform Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transform Group</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformsType#getTransformGroup()
	 * @see #getTransformsType()
	 * @generated
	 */
	EAttribute getTransformsType_TransformGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jboss.tools.switchyard.model.switchyard.TransformsType#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transform</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformsType#getTransform()
	 * @see #getTransformsType()
	 * @generated
	 */
	EReference getTransformsType_Transform();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.TransformType <em>Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformType
	 * @generated
	 */
	EClass getTransformType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.TransformType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformType#getFrom()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_From();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.TransformType#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.TransformType#getTo()
	 * @see #getTransformType()
	 * @generated
	 */
	EAttribute getTransformType_To();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ValidatesType <em>Validates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validates Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ValidatesType
	 * @generated
	 */
	EClass getValidatesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.jboss.tools.switchyard.model.switchyard.ValidatesType#getValidateGroup <em>Validate Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Validate Group</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ValidatesType#getValidateGroup()
	 * @see #getValidatesType()
	 * @generated
	 */
	EAttribute getValidatesType_ValidateGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.jboss.tools.switchyard.model.switchyard.ValidatesType#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validate</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ValidatesType#getValidate()
	 * @see #getValidatesType()
	 * @generated
	 */
	EReference getValidatesType_Validate();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.switchyard.ValidateType <em>Validate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate Type</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ValidateType
	 * @generated
	 */
	EClass getValidateType();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.switchyard.ValidateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.jboss.tools.switchyard.model.switchyard.ValidateType#getName()
	 * @see #getValidateType()
	 * @generated
	 */
	EAttribute getValidateType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwitchyardFactory getSwitchyardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ArtifactsTypeImpl <em>Artifacts Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ArtifactsTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getArtifactsType()
		 * @generated
		 */
		EClass ARTIFACTS_TYPE = eINSTANCE.getArtifactsType();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACTS_TYPE__ARTIFACT = eINSTANCE.getArtifactsType_Artifact();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ArtifactTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getArtifactType()
		 * @generated
		 */
		EClass ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__NAME = eINSTANCE.getArtifactType_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__URL = eINSTANCE.getArtifactType_Url();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ContextMapperTypeImpl <em>Context Mapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ContextMapperTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getContextMapperType()
		 * @generated
		 */
		EClass CONTEXT_MAPPER_TYPE = eINSTANCE.getContextMapperType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MAPPER_TYPE__CLASS = eINSTANCE.getContextMapperType_Class();

		/**
		 * The meta object literal for the '<em><b>Exclude Namespaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MAPPER_TYPE__EXCLUDE_NAMESPACES = eINSTANCE.getContextMapperType_ExcludeNamespaces();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MAPPER_TYPE__EXCLUDES = eINSTANCE.getContextMapperType_Excludes();

		/**
		 * The meta object literal for the '<em><b>Include Namespaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MAPPER_TYPE__INCLUDE_NAMESPACES = eINSTANCE.getContextMapperType_IncludeNamespaces();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MAPPER_TYPE__INCLUDES = eINSTANCE.getContextMapperType_Includes();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.DocumentRootImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESOURCE = eINSTANCE.getDocumentRoot_Resource();

		/**
		 * The meta object literal for the '<em><b>Binding Switchyard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BINDING_SWITCHYARD = eINSTANCE.getDocumentRoot_BindingSwitchyard();

		/**
		 * The meta object literal for the '<em><b>Resource1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RESOURCE1 = eINSTANCE.getDocumentRoot_Resource1();

		/**
		 * The meta object literal for the '<em><b>Binding Switchyard1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BINDING_SWITCHYARD1 = eINSTANCE.getDocumentRoot_BindingSwitchyard1();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARTIFACT = eINSTANCE.getDocumentRoot_Artifact();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARTIFACTS = eINSTANCE.getDocumentRoot_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Binding Switchyard2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINDING_SWITCHYARD2 = eINSTANCE.getDocumentRoot_BindingSwitchyard2();

		/**
		 * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTEXT_MAPPER = eINSTANCE.getDocumentRoot_ContextMapper();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOMAIN = eINSTANCE.getDocumentRoot_Domain();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HANDLER = eINSTANCE.getDocumentRoot_Handler();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HANDLERS = eINSTANCE.getDocumentRoot_Handlers();

		/**
		 * The meta object literal for the '<em><b>Interface Esb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERFACE_ESB = eINSTANCE.getDocumentRoot_InterfaceEsb();

		/**
		 * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MESSAGE_COMPOSER = eINSTANCE.getDocumentRoot_MessageComposer();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTIES = eINSTANCE.getDocumentRoot_Properties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Resource2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESOURCE2 = eINSTANCE.getDocumentRoot_Resource2();

		/**
		 * The meta object literal for the '<em><b>Switchyard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SWITCHYARD = eINSTANCE.getDocumentRoot_Switchyard();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM = eINSTANCE.getDocumentRoot_Transform();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORMS = eINSTANCE.getDocumentRoot_Transforms();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATE = eINSTANCE.getDocumentRoot_Validate();

		/**
		 * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALIDATES = eINSTANCE.getDocumentRoot_Validates();

		/**
		 * The meta object literal for the '<em><b>Transform1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM1 = eINSTANCE.getDocumentRoot_Transform1();

		/**
		 * The meta object literal for the '<em><b>Transform2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM2 = eINSTANCE.getDocumentRoot_Transform2();

		/**
		 * The meta object literal for the '<em><b>Transform3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM3 = eINSTANCE.getDocumentRoot_Transform3();

		/**
		 * The meta object literal for the '<em><b>Transform4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM4 = eINSTANCE.getDocumentRoot_Transform4();

		/**
		 * The meta object literal for the '<em><b>Transform5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSFORM5 = eINSTANCE.getDocumentRoot_Transform5();

		/**
		 * The meta object literal for the '<em><b>Validate1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALIDATE1 = eINSTANCE.getDocumentRoot_Validate1();

		/**
		 * The meta object literal for the '<em><b>Validate2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALIDATE2 = eINSTANCE.getDocumentRoot_Validate2();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.DomainTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPE__TRANSFORMS = eINSTANCE.getDomainType_Transforms();

		/**
		 * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPE__VALIDATES = eINSTANCE.getDomainType_Validates();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPE__PROPERTIES = eINSTANCE.getDomainType_Properties();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPE__HANDLERS = eINSTANCE.getDomainType_Handlers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__NAME = eINSTANCE.getDomainType_Name();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.EsbInterfaceImpl <em>Esb Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.EsbInterfaceImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getEsbInterface()
		 * @generated
		 */
		EClass ESB_INTERFACE = eINSTANCE.getEsbInterface();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.HandlersTypeImpl <em>Handlers Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.HandlersTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getHandlersType()
		 * @generated
		 */
		EClass HANDLERS_TYPE = eINSTANCE.getHandlersType();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLERS_TYPE__HANDLER = eINSTANCE.getHandlersType_Handler();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.HandlerTypeImpl <em>Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.HandlerTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getHandlerType()
		 * @generated
		 */
		EClass HANDLER_TYPE = eINSTANCE.getHandlerType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_TYPE__CLASS = eINSTANCE.getHandlerType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_TYPE__NAME = eINSTANCE.getHandlerType_Name();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.MessageComposerTypeImpl <em>Message Composer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.MessageComposerTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getMessageComposerType()
		 * @generated
		 */
		EClass MESSAGE_COMPOSER_TYPE = eINSTANCE.getMessageComposerType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COMPOSER_TYPE__CLASS = eINSTANCE.getMessageComposerType_Class();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.PropertiesTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTY = eINSTANCE.getPropertiesType_Property();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.PropertyTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ResourceTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getResourceType()
		 * @generated
		 */
		EClass RESOURCE_TYPE = eINSTANCE.getResourceType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__LOCATION = eINSTANCE.getResourceType_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_TYPE__TYPE = eINSTANCE.getResourceType_Type();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardBindingTypeImpl <em>Switch Yard Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardBindingTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getSwitchYardBindingType()
		 * @generated
		 */
		EClass SWITCH_YARD_BINDING_TYPE = eINSTANCE.getSwitchYardBindingType();

		/**
		 * The meta object literal for the '<em><b>Context Mapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER = eINSTANCE.getSwitchYardBindingType_ContextMapper();

		/**
		 * The meta object literal for the '<em><b>Message Composer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER = eINSTANCE.getSwitchYardBindingType_MessageComposer();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardTypeImpl <em>Switch Yard Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchYardTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getSwitchYardType()
		 * @generated
		 */
		EClass SWITCH_YARD_TYPE = eINSTANCE.getSwitchYardType();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_TYPE__COMPOSITE = eINSTANCE.getSwitchYardType_Composite();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_TYPE__TRANSFORMS = eINSTANCE.getSwitchYardType_Transforms();

		/**
		 * The meta object literal for the '<em><b>Validates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_TYPE__VALIDATES = eINSTANCE.getSwitchYardType_Validates();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_TYPE__DOMAIN = eINSTANCE.getSwitchYardType_Domain();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_YARD_TYPE__ARTIFACTS = eINSTANCE.getSwitchYardType_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_YARD_TYPE__NAME = eINSTANCE.getSwitchYardType_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_YARD_TYPE__TARGET_NAMESPACE = eINSTANCE.getSwitchYardType_TargetNamespace();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.TransformsTypeImpl <em>Transforms Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.TransformsTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getTransformsType()
		 * @generated
		 */
		EClass TRANSFORMS_TYPE = eINSTANCE.getTransformsType();

		/**
		 * The meta object literal for the '<em><b>Transform Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMS_TYPE__TRANSFORM_GROUP = eINSTANCE.getTransformsType_TransformGroup();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMS_TYPE__TRANSFORM = eINSTANCE.getTransformsType_Transform();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.TransformTypeImpl <em>Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.TransformTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getTransformType()
		 * @generated
		 */
		EClass TRANSFORM_TYPE = eINSTANCE.getTransformType();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__FROM = eINSTANCE.getTransformType_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_TYPE__TO = eINSTANCE.getTransformType_To();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ValidatesTypeImpl <em>Validates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ValidatesTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getValidatesType()
		 * @generated
		 */
		EClass VALIDATES_TYPE = eINSTANCE.getValidatesType();

		/**
		 * The meta object literal for the '<em><b>Validate Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATES_TYPE__VALIDATE_GROUP = eINSTANCE.getValidatesType_ValidateGroup();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATES_TYPE__VALIDATE = eINSTANCE.getValidatesType_Validate();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.switchyard.impl.ValidateTypeImpl <em>Validate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.ValidateTypeImpl
		 * @see org.jboss.tools.switchyard.model.switchyard.impl.SwitchyardPackageImpl#getValidateType()
		 * @generated
		 */
		EClass VALIDATE_TYPE = eINSTANCE.getValidateType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATE_TYPE__NAME = eINSTANCE.getValidateType_Name();

	}

} //SwitchyardPackage
