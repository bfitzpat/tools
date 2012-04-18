/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.jboss.tools.sca.editor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public final class SwitchyardSCADiagramEditorInput extends DiagramEditorInput {

	private final TransactionalEditingDomain domain;

	SwitchyardSCADiagramEditorInput(URI diagramUri, TransactionalEditingDomain domain, String providerId) {
		super(diagramUri, domain, providerId);
		this.domain = domain;
	}

	@Override
	public boolean equals(Object obj) {
		boolean superEquals = super.equals(obj);
		if (superEquals) {
			return true;
		}

		// Eclipse makes FileEditorInputs for files to be opened. Here we check if the file is actually the same
		// as the DiagramEditorInput uses. This is for preventing opening new editors for the same file.
		if (obj instanceof FileEditorInput) {

			String path = ((FileEditorInput) obj).getFile().getFullPath().toString();
			URI platformUri = URI.createPlatformResourceURI(path, true);

			for (Resource resource : domain.getResourceSet().getResources()) {
				if (resource.getURI().equals(platformUri)) {
					return true;
				}
			}

		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return super.getAdapter(adapter);
	}
}