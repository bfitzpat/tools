/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.editor.property;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.switchyard.tools.ui.editor.Activator;

/**
 * AbstractModelComposite
 * 
 * <p/>
 * Base composite for controls that provide property views for switchyard model
 * elments.
 * 
 * @param <T> Model type.
 */
public abstract class AbstractModelComposite<T extends EObject> extends Composite {

    private Class<T> _type;
    private ICompositeContainer _container;
    private String _description;

    /**
     * Create a new AbstractModelComposite.
     * 
     * @param type the model type
     * @param container the container
     * @param parent parent composite
     * @param style style
     */
    public AbstractModelComposite(Class<T> type, ICompositeContainer container, Composite parent, int style) {
        super(parent, style);
        _type = type;
        _container = container;
    }

    /**
     * @return the description to be used for this composite (e.g. property page
     *         description).
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @return the status after validating the control contents.
     */
    public IStatus validate() {
        return Status.OK_STATUS;
    }

    /**
     * Update controls.
     */
    public abstract void refresh();

    /**
     * @param description the description to be used for this composite.
     */
    protected void setDescription(String description) {
        _description = description;
    }

    /**
     * Shim to ease migration for existing tabbed property sections.
     * 
     * @return the widget factory.
     */
    protected FormToolkit getWidgetFactory() {
        return _container.getToolkit();
    }

    /**
     * @return the container.
     */
    public ICompositeContainer getContainer() {
        return _container;
    }

    /**
     * @return the current target object.
     */
    protected T getTargetObject() {
        if (_container == null) {
            return null;
        }
        EObject target = _container.getSelectedBusinessObject();
        return target == null ? null : _type.isInstance(target) ? _type.cast(target) : _type.cast(Platform
                .getAdapterManager().getAdapter(target, _type));
    }

    /**
     * Wraps a model update operation in a RecordingCommand, if required.
     * 
     * @param runner the model update operation.
     */
    protected void wrapOperation(final Runnable runner) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getTargetObject());
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }
    
    /**
     * Wraps a model update operation in a RecordingCommand, if required.
     * 
     * @param runner the model update operation.
     * @param target an EoOject to use for the domain processing
     */
    protected void wrapOperation(final Runnable runner, EObject target) {
        if (target == null) {
            wrapOperation(runner);
            return;
        }
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(target);
        if (domain != null) {
            domain.getCommandStack().execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    try {
                        runner.run();
                    } catch (Exception e) {
                        Activator.logError(e);
                    }
                }
            });
        } else {
            try {
                runner.run();
            } catch (Exception e) {
                Activator.logError(e);
            }
        }
    }
    

    protected void adaptChildren(Control control) {
        if (control != null) {
            if (control instanceof Composite) {
                Composite composite = (Composite) control;
                Control[] kids = composite.getChildren();
                for (Control kid : kids) {
                    adaptChildren(kid);
                }
                getWidgetFactory().adapt(composite);
            } else {
                getWidgetFactory().adapt(control, false, false);
            }
        }
    }

}
