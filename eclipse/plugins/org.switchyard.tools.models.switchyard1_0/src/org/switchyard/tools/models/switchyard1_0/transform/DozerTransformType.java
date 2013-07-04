/**
 */
package org.switchyard.tools.models.switchyard1_0.transform;

import org.switchyard.tools.models.switchyard1_0.switchyard.TransformType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozer Transform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Dozer Transformer Configuration.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerTransformType()
 * @model extendedMetaData="name='DozerTransformType' kind='empty'"
 * @generated
 */
public interface DozerTransformType extends TransformType {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.switchyard.tools.models.switchyard1_0.transform.TransformPackage#getDozerTransformType_Config()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="name='config' kind='attribute'"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.transform.DozerTransformType#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

} // DozerTransformType
