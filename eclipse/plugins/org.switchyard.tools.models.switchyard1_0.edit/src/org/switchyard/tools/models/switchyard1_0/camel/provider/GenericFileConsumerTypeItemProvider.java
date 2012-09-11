/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.camel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.camel.CamelPackage;
import org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.GenericFileConsumerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericFileConsumerTypeItemProvider
    extends ScheduledBatchPollConsumerTypeItemProvider
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
    public GenericFileConsumerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addDeletePropertyDescriptor(object);
            addRecursivePropertyDescriptor(object);
            addNoopPropertyDescriptor(object);
            addPreMovePropertyDescriptor(object);
            addMovePropertyDescriptor(object);
            addMoveFailedPropertyDescriptor(object);
            addIncludePropertyDescriptor(object);
            addExcludePropertyDescriptor(object);
            addIdempotentPropertyDescriptor(object);
            addIdempotentRepositoryPropertyDescriptor(object);
            addInProgressRepositoryPropertyDescriptor(object);
            addFilterPropertyDescriptor(object);
            addSorterPropertyDescriptor(object);
            addSortByPropertyDescriptor(object);
            addReadLockPropertyDescriptor(object);
            addReadLockTimeoutPropertyDescriptor(object);
            addReadLockCheckIntervalPropertyDescriptor(object);
            addExclusiveReadLockStrategyPropertyDescriptor(object);
            addProcessStrategyPropertyDescriptor(object);
            addStartingDirectoryMustExistPropertyDescriptor(object);
            addDirectoryMustExistPropertyDescriptor(object);
            addDoneFileNamePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Delete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_delete_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_delete_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__DELETE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Recursive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecursivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_recursive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_recursive_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__RECURSIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Noop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoopPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_noop_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_noop_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__NOOP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pre Move feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreMovePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_preMove_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_preMove_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Move feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMovePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_move_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_move_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__MOVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Move Failed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMoveFailedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_moveFailed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_moveFailed_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Include feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncludePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_include_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_include_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__INCLUDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exclude feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExcludePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_exclude_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_exclude_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__EXCLUDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idempotent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdempotentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_idempotent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_idempotent_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idempotent Repository feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdempotentRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_idempotentRepository_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_idempotentRepository_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the In Progress Repository feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInProgressRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_inProgressRepository_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_inProgressRepository_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Filter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_filter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_filter_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__FILTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sorter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSorterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_sorter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_sorter_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__SORTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sort By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSortByPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_sortBy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_sortBy_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__SORT_BY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_readLock_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_readLock_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_readLockTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_readLockTimeout_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock Check Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockCheckIntervalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_readLockCheckInterval_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_readLockCheckInterval_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exclusive Read Lock Strategy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExclusiveReadLockStrategyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_exclusiveReadLockStrategy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_exclusiveReadLockStrategy_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Process Strategy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessStrategyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_processStrategy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_processStrategy_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Starting Directory Must Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartingDirectoryMustExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_startingDirectoryMustExist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_startingDirectoryMustExist_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Directory Must Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectoryMustExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_directoryMustExist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_directoryMustExist_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Done File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDoneFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_GenericFileConsumerType_doneFileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_GenericFileConsumerType_doneFileName_feature", "_UI_GenericFileConsumerType_type"),
                 CamelPackage.Literals.GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns GenericFileConsumerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/GenericFileConsumerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((GenericFileConsumerType)object).getDoneFileName();
        return label == null || label.length() == 0 ?
            getString("_UI_GenericFileConsumerType_type") :
            getString("_UI_GenericFileConsumerType_type") + " " + label;
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

        switch (notification.getFeatureID(GenericFileConsumerType.class)) {
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DELETE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__RECURSIVE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__NOOP:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PRE_MOVE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__MOVE_FAILED:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__INCLUDE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUDE:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__FILTER:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORTER:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__SORT_BY:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
            case CamelPackage.GENERIC_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

}
