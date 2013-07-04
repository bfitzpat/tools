/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.JMSBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JMSBindingItemProvider
	extends BindingItemProvider
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
	public JMSBindingItemProvider(AdapterFactory adapterFactory) {
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

			addCorrelationSchemePropertyDescriptor(object);
			addInitialContextFactoryPropertyDescriptor(object);
			addJndiURLPropertyDescriptor(object);
			addOperationProperties1PropertyDescriptor(object);
			addRequestConnectionPropertyDescriptor(object);
			addResponseConnectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Correlation Scheme feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrelationSchemePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_correlationScheme_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_correlationScheme_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_CorrelationScheme(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Context Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialContextFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_initialContextFactory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_initialContextFactory_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_InitialContextFactory(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jndi URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJndiURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_jndiURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_jndiURL_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_JndiURL(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Properties1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationProperties1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_operationProperties1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_operationProperties1_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_OperationProperties1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Request Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_requestConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_requestConnection_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_RequestConnection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JMSBinding_responseConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JMSBinding_responseConnection_feature", "_UI_JMSBinding_type"),
				 ScaPackage.eINSTANCE.getJMSBinding_ResponseConnection(),
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
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_Destination());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_ConnectionFactory());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_ActivationSpec());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_Response());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_Headers());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_MessageSelection());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_ResourceAdapter());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_OperationProperties());
			childrenFeatures.add(ScaPackage.eINSTANCE.getJMSBinding_Any());
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
	 * This returns JMSBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JMSBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JMSBinding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JMSBinding_type") :
			getString("_UI_JMSBinding_type") + " " + label;
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

		switch (notification.getFeatureID(JMSBinding.class)) {
			case ScaPackage.JMS_BINDING__CORRELATION_SCHEME:
			case ScaPackage.JMS_BINDING__INITIAL_CONTEXT_FACTORY:
			case ScaPackage.JMS_BINDING__JNDI_URL:
			case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES1:
			case ScaPackage.JMS_BINDING__REQUEST_CONNECTION:
			case ScaPackage.JMS_BINDING__RESPONSE_CONNECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScaPackage.JMS_BINDING__DESTINATION:
			case ScaPackage.JMS_BINDING__CONNECTION_FACTORY:
			case ScaPackage.JMS_BINDING__ACTIVATION_SPEC:
			case ScaPackage.JMS_BINDING__RESPONSE:
			case ScaPackage.JMS_BINDING__HEADERS:
			case ScaPackage.JMS_BINDING__MESSAGE_SELECTION:
			case ScaPackage.JMS_BINDING__RESOURCE_ADAPTER:
			case ScaPackage.JMS_BINDING__OPERATION_PROPERTIES:
			case ScaPackage.JMS_BINDING__ANY:
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
				(ScaPackage.eINSTANCE.getJMSBinding_Destination(),
				 ScaFactory.eINSTANCE.createJMSDestination()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_ConnectionFactory(),
				 ScaFactory.eINSTANCE.createJMSConnectionFactory()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_ActivationSpec(),
				 ScaFactory.eINSTANCE.createJMSActivationSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_Response(),
				 ScaFactory.eINSTANCE.createJMSResponse()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_Headers(),
				 ScaFactory.eINSTANCE.createJMSHeaders()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_MessageSelection(),
				 ScaFactory.eINSTANCE.createJMSMessageSelection()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_ResourceAdapter(),
				 ScaFactory.eINSTANCE.createJMSResourceAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getJMSBinding_OperationProperties(),
				 ScaFactory.eINSTANCE.createJMSOperationProperties()));
	}

}
