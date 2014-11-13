/******************************************************************************* 
 * Copyright (c) 2014 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.debug.structure;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.internal.ui.views.variables.VariablesView;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.switchyard.tools.ui.debug.SwitchYardDebugUtil;

/**
 * SwitchYardContextView
 * <p/>
 * Provides details of the SwitchYard context (e.g. exchange, message, etc.) for
 * the current stack frame.
 */
@SuppressWarnings("restriction")
public class SwitchYardContextView extends VariablesView {

	@Override
	protected int getViewerStyle() {
		return SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.TITLE
				| SWT.VIRTUAL | SWT.FULL_SELECTION;
	}

//	@Override
//    protected String getPresentationContextSecondaryId() {
//        return SwitchYardDebugUtil.SWITCHYARD_CONTEXT_ID;
////		return SwitchYardDebugUtil.SWITCHYARD_CONTEXT_VIEW_ID;
//    }

    @Override
    protected String getPresentationContextId() {
        return SwitchYardDebugUtil.SWITCHYARD_CONTEXT_ID;
    }

    /*
     * Hackery to convert a java stack frame input to a SwitchYardContext, which
     * effectively converts the model id from java to switchyard.
     */
    @Override
    protected void contextActivated(ISelection selection) {
        if (selection != null && selection instanceof IStructuredSelection) {
            final Object source = ((IStructuredSelection) selection).getFirstElement();
            if (source instanceof IAdaptable) {
                final IJavaStackFrame javaFrame = (IJavaStackFrame) ((IAdaptable) source)
                        .getAdapter(IJavaStackFrame.class);
                if (javaFrame != null) {
                	final SwitchYardContext context = new SwitchYardContext((IJavaThread) javaFrame.getThread());
                    super.contextActivated(new StructuredSelection(context));
                    return;
                }
            }
        }
    	super.becomesHidden();
    }
}
