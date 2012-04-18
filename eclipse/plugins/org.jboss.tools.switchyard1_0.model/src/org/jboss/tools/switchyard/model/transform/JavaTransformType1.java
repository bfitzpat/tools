/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.jboss.tools.switchyard.model.transform;

import org.jboss.tools.switchyard.model.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Transform Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Generic/Custom Java Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jboss.tools.switchyard.model.transform.JavaTransformType1#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jboss.tools.switchyard.model.transform.TransformPackage#getJavaTransformType1()
 * @model extendedMetaData="name='JavaTransformType' kind='empty'"
 * @generated
 */
public interface JavaTransformType1 extends TransformType {

	/**
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see org.jboss.tools.switchyard.model.transform.TransformPackage#getJavaTransformType1_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     * @generated
     */
	String getClass_();

	/**
     * Sets the value of the '{@link org.jboss.tools.switchyard.model.transform.JavaTransformType1#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
	void setClass(String value);
} // JavaTransformType1
