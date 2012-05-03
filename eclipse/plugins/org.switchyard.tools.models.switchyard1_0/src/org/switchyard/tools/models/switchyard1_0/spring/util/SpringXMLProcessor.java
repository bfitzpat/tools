/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpringXMLProcessor extends XMLProcessor {

	/**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpringXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        SpringPackage.eINSTANCE.eClass();
    }
	
	/**
     * Register for "*" and "xml" file extensions the SpringResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new SpringResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new SpringResourceFactoryImpl());
        }
        return registrations;
    }

} //SpringXMLProcessor
