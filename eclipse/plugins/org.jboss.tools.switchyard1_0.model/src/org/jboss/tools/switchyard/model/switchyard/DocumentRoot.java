/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.switchyard;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getBindingSwitchyard <em>Binding Switchyard</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getContextMapper <em>Context Mapper</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMessageComposer <em>Message Composer</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource <em>Resource</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidates <em>Validates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
	FeatureMap getMixed();

	/**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
	EMap<String, String> getXMLNSPrefixMap();

	/**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
	EMap<String, String> getXSISchemaLocation();

	/**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource</em>' containment reference.
     * @see #setResource(ResourceType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Resource()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
     * @generated
     */
	ResourceType getResource();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getResource <em>Resource</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource</em>' containment reference.
     * @see #getResource()
     * @generated
     */
    void setResource(ResourceType value);

    /**
     * Returns the value of the '<em><b>Binding Switchyard</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Switchyard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Binding Switchyard</em>' containment reference.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_BindingSwitchyard()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='binding.switchyard' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#binding'"
     * @generated
     */
	SwitchYardBindingType getBindingSwitchyard();

	/**
     * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact</em>' containment reference.
     * @see #setArtifact(ArtifactType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Artifact()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace'"
     * @generated
     */
	ArtifactType getArtifact();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifact <em>Artifact</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifact</em>' containment reference.
     * @see #getArtifact()
     * @generated
     */
	void setArtifact(ArtifactType value);

	/**
     * Returns the value of the '<em><b>Artifacts</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Artifacts</em>' containment reference.
     * @see #setArtifacts(ArtifactsType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Artifacts()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='artifacts' namespace='##targetNamespace'"
     * @generated
     */
	ArtifactsType getArtifacts();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getArtifacts <em>Artifacts</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifacts</em>' containment reference.
     * @see #getArtifacts()
     * @generated
     */
	void setArtifacts(ArtifactsType value);

	/**
     * Returns the value of the '<em><b>Context Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Mapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Context Mapper</em>' containment reference.
     * @see #setContextMapper(ContextMapperType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_ContextMapper()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='contextMapper' namespace='##targetNamespace'"
     * @generated
     */
	ContextMapperType getContextMapper();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getContextMapper <em>Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context Mapper</em>' containment reference.
     * @see #getContextMapper()
     * @generated
     */
	void setContextMapper(ContextMapperType value);

	/**
     * Returns the value of the '<em><b>Domain</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Domain</em>' containment reference.
     * @see #setDomain(DomainType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Domain()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
     * @generated
     */
	DomainType getDomain();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getDomain <em>Domain</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Domain</em>' containment reference.
     * @see #getDomain()
     * @generated
     */
	void setDomain(DomainType value);

	/**
     * Returns the value of the '<em><b>Handler</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Handler</em>' containment reference.
     * @see #setHandler(HandlerType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Handler()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='handler' namespace='##targetNamespace'"
     * @generated
     */
	HandlerType getHandler();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandler <em>Handler</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handler</em>' containment reference.
     * @see #getHandler()
     * @generated
     */
	void setHandler(HandlerType value);

	/**
     * Returns the value of the '<em><b>Handlers</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Handlers</em>' containment reference.
     * @see #setHandlers(HandlersType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Handlers()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='handlers' namespace='##targetNamespace'"
     * @generated
     */
	HandlersType getHandlers();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getHandlers <em>Handlers</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handlers</em>' containment reference.
     * @see #getHandlers()
     * @generated
     */
	void setHandlers(HandlersType value);

	/**
     * Returns the value of the '<em><b>Interface Esb</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Esb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Interface Esb</em>' containment reference.
     * @see #setInterfaceEsb(EsbInterface)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_InterfaceEsb()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='interface.esb' namespace='##targetNamespace' affiliation='http://docs.oasis-open.org/ns/opencsa/sca/200912#interface'"
     * @generated
     */
	EsbInterface getInterfaceEsb();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getInterfaceEsb <em>Interface Esb</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface Esb</em>' containment reference.
     * @see #getInterfaceEsb()
     * @generated
     */
	void setInterfaceEsb(EsbInterface value);

	/**
     * Returns the value of the '<em><b>Message Composer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Composer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Message Composer</em>' containment reference.
     * @see #setMessageComposer(MessageComposerType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_MessageComposer()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='messageComposer' namespace='##targetNamespace'"
     * @generated
     */
	MessageComposerType getMessageComposer();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getMessageComposer <em>Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message Composer</em>' containment reference.
     * @see #getMessageComposer()
     * @generated
     */
	void setMessageComposer(MessageComposerType value);

	/**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Properties()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
     * @generated
     */
	PropertiesType getProperties();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
	void setProperties(PropertiesType value);

	/**
     * Returns the value of the '<em><b>Property</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' containment reference.
     * @see #setProperty(PropertyType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Property()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
     * @generated
     */
	PropertyType getProperty();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getProperty <em>Property</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' containment reference.
     * @see #getProperty()
     * @generated
     */
	void setProperty(PropertyType value);

	/**
     * Returns the value of the '<em><b>Switchyard</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switchyard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Switchyard</em>' containment reference.
     * @see #setSwitchyard(SwitchYardType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Switchyard()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='switchyard' namespace='##targetNamespace'"
     * @generated
     */
	SwitchYardType getSwitchyard();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getSwitchyard <em>Switchyard</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switchyard</em>' containment reference.
     * @see #getSwitchyard()
     * @generated
     */
	void setSwitchyard(SwitchYardType value);

	/**
     * Returns the value of the '<em><b>Transform</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transform</em>' containment reference.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Transform()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transform' namespace='##targetNamespace'"
     * @generated
     */
	TransformType getTransform();

	/**
     * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transforms</em>' containment reference.
     * @see #setTransforms(TransformsType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Transforms()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='transforms' namespace='##targetNamespace'"
     * @generated
     */
	TransformsType getTransforms();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getTransforms <em>Transforms</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transforms</em>' containment reference.
     * @see #getTransforms()
     * @generated
     */
	void setTransforms(TransformsType value);

	/**
     * Returns the value of the '<em><b>Validate</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validate</em>' containment reference.
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Validate()
     * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='validate' namespace='##targetNamespace'"
     * @generated
     */
	ValidateType getValidate();

	/**
     * Returns the value of the '<em><b>Validates</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Validates</em>' containment reference.
     * @see #setValidates(ValidatesType)
     * @see org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage#getDocumentRoot_Validates()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='validates' namespace='##targetNamespace'"
     * @generated
     */
	ValidatesType getValidates();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.switchyard.DocumentRoot#getValidates <em>Validates</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Validates</em>' containment reference.
     * @see #getValidates()
     * @generated
     */
	void setValidates(ValidatesType value);

} // DocumentRoot
