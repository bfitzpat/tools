/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netty Tcp Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isTextline <em>Textline</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyTcpBindingType()
 * @model extendedMetaData="name='CamelNettyTcpBindingType' kind='elementOnly'"
 * @generated
 */
public interface CamelNettyTcpBindingType extends CamelNettyBindingType {
    /**
     * Returns the value of the '<em><b>Textline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Textline</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Textline</em>' attribute.
     * @see #setTextline(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyTcpBindingType_Textline()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='textline' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTextline();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isTextline <em>Textline</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Textline</em>' attribute.
     * @see #isTextline()
     * @generated
     */
    void setTextline(boolean value);

    /**
     * Returns the value of the '<em><b>Tcp No Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tcp No Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tcp No Delay</em>' attribute.
     * @see #setTcpNoDelay(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyTcpBindingType_TcpNoDelay()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='tcpNoDelay' namespace='##targetNamespace'"
     * @generated
     */
    boolean isTcpNoDelay();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isTcpNoDelay <em>Tcp No Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcp No Delay</em>' attribute.
     * @see #isTcpNoDelay()
     * @generated
     */
    void setTcpNoDelay(boolean value);

    /**
     * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Alive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Alive</em>' attribute.
     * @see #setKeepAlive(boolean)
     * @see org.switchyard.tools.models.switchyard1_0.camel.CamelPackage#getCamelNettyTcpBindingType_KeepAlive()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='element' name='keepAlive' namespace='##targetNamespace'"
     * @generated
     */
    boolean isKeepAlive();

    /**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.camel.CamelNettyTcpBindingType#isKeepAlive <em>Keep Alive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Alive</em>' attribute.
     * @see #isKeepAlive()
     * @generated
     */
    void setKeepAlive(boolean value);

} // CamelNettyTcpBindingType
