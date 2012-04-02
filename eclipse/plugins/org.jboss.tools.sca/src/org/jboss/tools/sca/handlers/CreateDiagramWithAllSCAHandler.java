package org.jboss.tools.sca.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Creates sample data
 */
public final class CreateDiagramWithAllSCAHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (!(selection instanceof IStructuredSelection)) {
			return null;
		}

		// Operation must be started on ECLasses node -> cancel if not
		Object first = ((IStructuredSelection) selection).getFirstElement();
		if (!(first instanceof IFile)) {
			return null;
		}

		// Retrieve the project from the selected node
		IFile node = (IFile) first;
		IProject project = node.getProject();
		if (project == null) {
			return null;
		}

		// Ask for the name of the new diagram
		CharSequence namePattern = '.' + node.getFileExtension();
		String initialName = node.getName().replace(namePattern, new String());
		InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), "Diagram Title", "Diagram Description",
				initialName, null);
		if (dialog.open() != Dialog.OK) {
			return null;
		}
		String diagramName = dialog.getValue();

		// Get the default resource set to hold the new resource
		ResourceSet resourceSet = new ResourceSetImpl();
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);
		if (editingDomain == null) {
			// Not yet existing, create one
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		}

		// Create the data within a command and save (must not happen inside
		// the command since finishing the command will trigger setting the 
		// modification flag on the resource which will be used by the save
		// operation to determine which resources need to be saved)
		AddAllSCACommand operation = new AddAllSCACommand(project, editingDomain, diagramName, node);
		editingDomain.getCommandStack().execute(operation);
		try {
			if (operation.getCreatedResource() !=  null) 
				operation.getCreatedResource().save(null);
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, "org.jboss.tools.sca.diagram", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Diagram Error", e.getMessage(), status);
			return null;
		}

		// Dispose the editing domain to eliminate memory leak
		editingDomain.dispose();

		// Open the editor
		if (operation.getCreatedResource() != null) {
			String platformString = operation.getCreatedResource().getURI().toPlatformString(true);
			IFile file = project.getParent().getFile(new Path(platformString));
			IFileEditorInput input = new FileEditorInput(file);
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, DiagramEditor.DIAGRAM_EDITOR_ID);
			} catch (PartInitException e) {
				IStatus status = new Status(IStatus.ERROR, "org.jboss.tools.sca.diagram", e.getMessage(), e); //$NON-NLS-1$
				ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Diagram Error", e.getMessage(), status);
				return null;
			}
		}

		return null;
	}
}