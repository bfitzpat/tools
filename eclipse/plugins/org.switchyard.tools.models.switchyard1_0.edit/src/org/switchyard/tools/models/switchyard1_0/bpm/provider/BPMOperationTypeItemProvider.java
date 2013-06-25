/**
 */
package org.switchyard.tools.models.switchyard1_0.bpm.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.soa.sca.sca1_1.model.sca.provider.CommonExtensionBaseItemProvider;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.bpm.BPMFactory;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType;
import org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.bpm.BPMOperationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMOperationTypeItemProvider
    extends CommonExtensionBaseItemProvider
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
    public BPMOperationTypeItemProvider(AdapterFactory adapterFactory) {
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

            addEventIdPropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Event Id feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventIdPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMOperationType_eventId_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMOperationType_eventId_feature", "_UI_BPMOperationType_type"),
                 BPMPackage.Literals.BPM_OPERATION_TYPE__EVENT_ID,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMOperationType_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMOperationType_name_feature", "_UI_BPMOperationType_type"),
                 BPMPackage.Literals.BPM_OPERATION_TYPE__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BPMOperationType_type_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BPMOperationType_type_feature", "_UI_BPMOperationType_type"),
                 BPMPackage.Literals.BPM_OPERATION_TYPE__TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(BPMPackage.Literals.BPM_OPERATION_TYPE__GLOBALS);
            childrenFeatures.add(BPMPackage.Literals.BPM_OPERATION_TYPE__INPUTS);
            childrenFeatures.add(BPMPackage.Literals.BPM_OPERATION_TYPE__OUTPUTS);
            childrenFeatures.add(BPMPackage.Literals.BPM_OPERATION_TYPE__FAULTS);
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
     * This returns BPMOperationType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/BPMOperationType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((BPMOperationType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_BPMOperationType_type") :
            getString("_UI_BPMOperationType_type") + " " + label;
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

        switch (notification.getFeatureID(BPMOperationType.class)) {
            case BPMPackage.BPM_OPERATION_TYPE__EVENT_ID:
            case BPMPackage.BPM_OPERATION_TYPE__NAME:
            case BPMPackage.BPM_OPERATION_TYPE__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BPMPackage.BPM_OPERATION_TYPE__GLOBALS:
            case BPMPackage.BPM_OPERATION_TYPE__INPUTS:
            case BPMPackage.BPM_OPERATION_TYPE__OUTPUTS:
            case BPMPackage.BPM_OPERATION_TYPE__FAULTS:
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
                (BPMPackage.Literals.BPM_OPERATION_TYPE__GLOBALS,
                 BPMFactory.eINSTANCE.createGlobalsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_OPERATION_TYPE__INPUTS,
                 BPMFactory.eINSTANCE.createInputsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_OPERATION_TYPE__OUTPUTS,
                 BPMFactory.eINSTANCE.createOutputsType()));

        newChildDescriptors.add
            (createChildParameter
                (BPMPackage.Literals.BPM_OPERATION_TYPE__FAULTS,
                 BPMFactory.eINSTANCE.createFaultsType()));
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
