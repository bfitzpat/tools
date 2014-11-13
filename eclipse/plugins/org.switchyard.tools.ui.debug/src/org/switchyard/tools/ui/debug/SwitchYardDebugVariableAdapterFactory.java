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
package org.switchyard.tools.ui.debug;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IColumnPresentation;
import org.eclipse.debug.internal.ui.viewers.model.provisional.IPresentationContext;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jdt.internal.debug.ui.variables.JavaVariableColumnPresentation;
import org.eclipse.jdt.internal.debug.ui.variables.JavaVariableColumnPresentationFactory;

/**
 * Copy of the JavaVariableColumnPresentationFactory to handle column setup in the
 * SwitchYard debug view.
 * 
 * @author bfitzpat
 *
 */
@SuppressWarnings("restriction")
public class SwitchYardDebugVariableAdapterFactory extends
		JavaVariableColumnPresentationFactory {
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.ui.viewers.provisional.IColumnPresentationFactoryAdapter#createColumnPresentation(org.eclipse.debug.internal.ui.viewers.provisional.IPresentationContext, java.lang.Object)
	 */
	public IColumnPresentation createColumnPresentation(IPresentationContext context, Object element) {
		if (isApplicable(context, element)) {
			return new JavaVariableColumnPresentation();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.ui.viewers.provisional.IColumnPresentationFactoryAdapter#getColumnPresentationId(org.eclipse.debug.internal.ui.viewers.provisional.IPresentationContext, java.lang.Object)
	 */
	public String getColumnPresentationId(IPresentationContext context, Object element) {
		if (isApplicable(context, element)) {
			return JavaVariableColumnPresentation.JAVA_VARIABLE_COLUMN_PRESENTATION;
		}
		return null;
	}
	
	private boolean isApplicable(IPresentationContext context, Object element) {
		IJavaStackFrame frame = null;
		if (SwitchYardDebugUtil.SWITCHYARD_CONTEXT_ID.equals(context.getId())) {
			if (element instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable)element;
				frame = (IJavaStackFrame) adaptable.getAdapter(IJavaStackFrame.class);
			}
		}
		return frame != null;		
	}

}
