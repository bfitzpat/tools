/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.transform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.jboss.tools.switchyard.model.switchyard.SwitchyardPackage;

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
 * @see org.jboss.tools.switchyard.model.transform.TransformFactory
 * @model kind="package"
 * @generated
 */
public interface TransformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:switchyard-config:transform:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformPackage eINSTANCE = org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.DocumentRootImpl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Transform Java</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM_JAVA = 3;

	/**
	 * The feature id for the '<em><b>Transform Jaxb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM_JAXB = 4;

	/**
	 * The feature id for the '<em><b>Transform Json</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM_JSON = 5;

	/**
	 * The feature id for the '<em><b>Transform Smooks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM_SMOOKS = 6;

	/**
	 * The feature id for the '<em><b>Transform Xslt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSFORM_XSLT = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.JavaTransformType1Impl <em>Java Transform Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.JavaTransformType1Impl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformType1()
	 * @generated
	 */
	int JAVA_TRANSFORM_TYPE1 = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TRANSFORM_TYPE1__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TRANSFORM_TYPE1__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TRANSFORM_TYPE1__CLASS = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Transform Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TRANSFORM_TYPE1_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.JAXBTransformTypeImpl <em>JAXB Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.JAXBTransformTypeImpl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJAXBTransformType()
	 * @generated
	 */
	int JAXB_TRANSFORM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
	 * The number of structural features of the '<em>JAXB Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.JsonTransformTypeImpl <em>Json Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.JsonTransformTypeImpl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJsonTransformType()
	 * @generated
	 */
	int JSON_TRANSFORM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
	 * The number of structural features of the '<em>Json Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.SmooksTransformType1Impl <em>Smooks Transform Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.SmooksTransformType1Impl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformType1()
	 * @generated
	 */
	int SMOOKS_TRANSFORM_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_TRANSFORM_TYPE1__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_TRANSFORM_TYPE1__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
	 * The number of structural features of the '<em>Smooks Transform Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMOOKS_TRANSFORM_TYPE1_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.impl.XsltTransformTypeImpl <em>Xslt Transform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.impl.XsltTransformTypeImpl
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getXsltTransformType()
	 * @generated
	 */
	int XSLT_TRANSFORM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_TRANSFORM_TYPE__FROM = SwitchyardPackage.TRANSFORM_TYPE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_TRANSFORM_TYPE__TO = SwitchyardPackage.TRANSFORM_TYPE__TO;

	/**
	 * The number of structural features of the '<em>Xslt Transform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSLT_TRANSFORM_TYPE_FEATURE_COUNT = SwitchyardPackage.TRANSFORM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType <em>Java Transform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformType()
	 * @generated
	 */
	int JAVA_TRANSFORM_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.jboss.tools.switchyard.model.transform.SmooksTransformType <em>Smooks Transform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformType()
	 * @generated
	 */
	int SMOOKS_TRANSFORM_TYPE = 7;

	/**
	 * The meta object id for the '<em>Java Transform Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformTypeObject()
	 * @generated
	 */
	int JAVA_TRANSFORM_TYPE_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Smooks Transform Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
	 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformTypeObject()
	 * @generated
	 */
	int SMOOKS_TRANSFORM_TYPE_OBJECT = 9;


	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJava <em>Transform Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Java</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJava()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformJava();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJaxb <em>Transform Jaxb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Jaxb</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJaxb()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformJaxb();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJson <em>Transform Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Json</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformJson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformJson();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformSmooks <em>Transform Smooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Smooks</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformSmooks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformSmooks();

	/**
	 * Returns the meta object for the containment reference '{@link org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformXslt <em>Transform Xslt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Xslt</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.DocumentRoot#getTransformXslt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransformXslt();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType1 <em>Java Transform Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Transform Type1</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType1
	 * @generated
	 */
	EClass getJavaTransformType1();

	/**
	 * Returns the meta object for the attribute '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType1#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType1#getClass_()
	 * @see #getJavaTransformType1()
	 * @generated
	 */
	EAttribute getJavaTransformType1_Class();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.JAXBTransformType <em>JAXB Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAXB Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JAXBTransformType
	 * @generated
	 */
	EClass getJAXBTransformType();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.JsonTransformType <em>Json Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JsonTransformType
	 * @generated
	 */
	EClass getJsonTransformType();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.SmooksTransformType1 <em>Smooks Transform Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smooks Transform Type1</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType1
	 * @generated
	 */
	EClass getSmooksTransformType1();

	/**
	 * Returns the meta object for class '{@link org.jboss.tools.switchyard.model.transform.XsltTransformType <em>Xslt Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xslt Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.XsltTransformType
	 * @generated
	 */
	EClass getXsltTransformType();

	/**
	 * Returns the meta object for enum '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType <em>Java Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Java Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
	 * @generated
	 */
	EEnum getJavaTransformType();

	/**
	 * Returns the meta object for enum '{@link org.jboss.tools.switchyard.model.transform.SmooksTransformType <em>Smooks Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Smooks Transform Type</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
	 * @generated
	 */
	EEnum getSmooksTransformType();

	/**
	 * Returns the meta object for data type '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType <em>Java Transform Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Transform Type Object</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
	 * @model instanceClass="org.jboss.tools.switchyard.model.transform.JavaTransformType"
	 *        extendedMetaData="name='javaTransformType:Object' baseType='javaTransformType'"
	 * @generated
	 */
	EDataType getJavaTransformTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.jboss.tools.switchyard.model.transform.SmooksTransformType <em>Smooks Transform Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Smooks Transform Type Object</em>'.
	 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
	 * @model instanceClass="org.jboss.tools.switchyard.model.transform.SmooksTransformType"
	 *        extendedMetaData="name='smooksTransformType:Object' baseType='smooksTransformType'"
	 * @generated
	 */
	EDataType getSmooksTransformTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformFactory getTransformFactory();

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
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.DocumentRootImpl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Transform Java</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM_JAVA = eINSTANCE.getDocumentRoot_TransformJava();

		/**
		 * The meta object literal for the '<em><b>Transform Jaxb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM_JAXB = eINSTANCE.getDocumentRoot_TransformJaxb();

		/**
		 * The meta object literal for the '<em><b>Transform Json</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM_JSON = eINSTANCE.getDocumentRoot_TransformJson();

		/**
		 * The meta object literal for the '<em><b>Transform Smooks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM_SMOOKS = eINSTANCE.getDocumentRoot_TransformSmooks();

		/**
		 * The meta object literal for the '<em><b>Transform Xslt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSFORM_XSLT = eINSTANCE.getDocumentRoot_TransformXslt();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.JavaTransformType1Impl <em>Java Transform Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.JavaTransformType1Impl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformType1()
		 * @generated
		 */
		EClass JAVA_TRANSFORM_TYPE1 = eINSTANCE.getJavaTransformType1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TRANSFORM_TYPE1__CLASS = eINSTANCE.getJavaTransformType1_Class();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.JAXBTransformTypeImpl <em>JAXB Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.JAXBTransformTypeImpl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJAXBTransformType()
		 * @generated
		 */
		EClass JAXB_TRANSFORM_TYPE = eINSTANCE.getJAXBTransformType();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.JsonTransformTypeImpl <em>Json Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.JsonTransformTypeImpl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJsonTransformType()
		 * @generated
		 */
		EClass JSON_TRANSFORM_TYPE = eINSTANCE.getJsonTransformType();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.SmooksTransformType1Impl <em>Smooks Transform Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.SmooksTransformType1Impl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformType1()
		 * @generated
		 */
		EClass SMOOKS_TRANSFORM_TYPE1 = eINSTANCE.getSmooksTransformType1();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.impl.XsltTransformTypeImpl <em>Xslt Transform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.impl.XsltTransformTypeImpl
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getXsltTransformType()
		 * @generated
		 */
		EClass XSLT_TRANSFORM_TYPE = eINSTANCE.getXsltTransformType();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType <em>Java Transform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformType()
		 * @generated
		 */
		EEnum JAVA_TRANSFORM_TYPE = eINSTANCE.getJavaTransformType();

		/**
		 * The meta object literal for the '{@link org.jboss.tools.switchyard.model.transform.SmooksTransformType <em>Smooks Transform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformType()
		 * @generated
		 */
		EEnum SMOOKS_TRANSFORM_TYPE = eINSTANCE.getSmooksTransformType();

		/**
		 * The meta object literal for the '<em>Java Transform Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.JavaTransformType
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getJavaTransformTypeObject()
		 * @generated
		 */
		EDataType JAVA_TRANSFORM_TYPE_OBJECT = eINSTANCE.getJavaTransformTypeObject();

		/**
		 * The meta object literal for the '<em>Smooks Transform Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jboss.tools.switchyard.model.transform.SmooksTransformType
		 * @see org.jboss.tools.switchyard.model.transform.impl.TransformPackageImpl#getSmooksTransformTypeObject()
		 * @generated
		 */
		EDataType SMOOKS_TRANSFORM_TYPE_OBJECT = eINSTANCE.getSmooksTransformTypeObject();

	}

} //TransformPackage
