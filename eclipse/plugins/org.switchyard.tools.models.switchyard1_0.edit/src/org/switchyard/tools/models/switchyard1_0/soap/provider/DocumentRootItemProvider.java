/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.soap.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.soap.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRootItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addMtomPropertyDescriptor(object);
            addEndpointConfigPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Mtom feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMtomPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_mtom_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_mtom_feature", "_UI_DocumentRoot_type"),
                 SOAPPackage.Literals.DOCUMENT_ROOT__MTOM,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Endpoint Config feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndpointConfigPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_endpointConfig_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_endpointConfig_feature", "_UI_DocumentRoot_type"),
                 SOAPPackage.Literals.DOCUMENT_ROOT__ENDPOINT_CONFIG,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(SOAPPackage.Literals.DOCUMENT_ROOT__BINDING_SOAP);
            childrenFeatures.add(SOAPPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP);
            childrenFeatures.add(SOAPPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP);
            childrenFeatures.add(SOAPPackage.Literals.DOCUMENT_ROOT__INTERCEPTOR);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_DocumentRoot_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case SOAPPackage.DOCUMENT_ROOT__BINDING_SOAP:
            case SOAPPackage.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP:
            case SOAPPackage.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP:
            case SOAPPackage.DOCUMENT_ROOT__INTERCEPTOR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (SOAPPackage.Literals.DOCUMENT_ROOT__BINDING_SOAP,
                 SOAPFactory.eINSTANCE.createSOAPBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (SOAPPackage.Literals.DOCUMENT_ROOT__CONTEXT_MAPPER_SOAP,
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (SOAPPackage.Literals.DOCUMENT_ROOT__MESSAGE_COMPOSER_SOAP,
                 SOAPFactory.eINSTANCE.createSOAPMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (SOAPPackage.Literals.DOCUMENT_ROOT__INTERCEPTOR,
                 SOAPFactory.eINSTANCE.createInterceptorType()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
