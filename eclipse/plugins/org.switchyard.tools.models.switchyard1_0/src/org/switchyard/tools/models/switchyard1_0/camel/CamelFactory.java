/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage
 * @generated
 */
public interface CamelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CamelFactory eINSTANCE = org.switchyard.tools.models.switchyard1_0.camel.impl.CamelFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Atom Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Atom Binding Type</em>'.
     * @generated
     */
	CamelAtomBindingType createCamelAtomBindingType();

	/**
     * Returns a new object of class '<em>Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Binding Type</em>'.
     * @generated
     */
	CamelBindingType createCamelBindingType();

	/**
     * Returns a new object of class '<em>Direct Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Direct Binding Type</em>'.
     * @generated
     */
	CamelDirectBindingType createCamelDirectBindingType();

	/**
     * Returns a new object of class '<em>File Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>File Binding Type</em>'.
     * @generated
     */
	CamelFileBindingType createCamelFileBindingType();

	/**
     * Returns a new object of class '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Implementation Type</em>'.
     * @generated
     */
	CamelImplementationType createCamelImplementationType();

	/**
     * Returns a new object of class '<em>Mock Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Mock Binding Type</em>'.
     * @generated
     */
	CamelMockBindingType createCamelMockBindingType();

	/**
     * Returns a new object of class '<em>Operation Selector Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation Selector Type</em>'.
     * @generated
     */
	CamelOperationSelectorType createCamelOperationSelectorType();

	/**
     * Returns a new object of class '<em>Seda Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Seda Binding Type</em>'.
     * @generated
     */
	CamelSedaBindingType createCamelSedaBindingType();

	/**
     * Returns a new object of class '<em>Timer Binding Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Timer Binding Type</em>'.
     * @generated
     */
	CamelTimerBindingType createCamelTimerBindingType();

	/**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
	DocumentRoot createDocumentRoot();

	/**
     * Returns a new object of class '<em>File Consumer Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>File Consumer Type</em>'.
     * @generated
     */
	FileConsumerType createFileConsumerType();

	/**
     * Returns a new object of class '<em>File Producer Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>File Producer Type</em>'.
     * @generated
     */
	FileProducerType createFileProducerType();

	/**
     * Returns a new object of class '<em>Java DSL Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Java DSL Type</em>'.
     * @generated
     */
	JavaDSLType createJavaDSLType();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	CamelPackage getCamelPackage();

} //CamelFactory
