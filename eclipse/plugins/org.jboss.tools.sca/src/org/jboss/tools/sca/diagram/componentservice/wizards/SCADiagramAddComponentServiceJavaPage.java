package org.jboss.tools.sca.diagram.componentservice.wizards;

import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaUIMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.soa.sca.sca1_1.model.sca.JavaInterface;
import org.eclipse.soa.sca.sca1_1.model.sca.WSDLPortType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.jboss.tools.sca.diagram.internal.wizards.BaseWizardPage;
import org.jboss.tools.sca.diagram.internal.wizards.IRefreshablePage;

@SuppressWarnings("restriction")
public class SCADiagramAddComponentServiceJavaPage extends BaseWizardPage implements IRefreshablePage {

	private Text mJavaInterfaceName;
	private String sJavaInterface = null;
	private SCADiagramAddComponentServiceStartPage startPage = null;

	public SCADiagramAddComponentServiceJavaPage ( SCADiagramAddComponentServiceStartPage start, String pageName) {
		this(pageName);
		this.startPage = start;
	}
	
	protected SCADiagramAddComponentServiceJavaPage(String pageName) {
		super(pageName);
		setTitle("Specify Java Class");
		setDescription("Specify the fully qualified class name for the Java interface.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl = new GridLayout();
		gl.numColumns = 3;
		composite.setLayout(gl);
		// Component service name
		new Label(composite, SWT.NONE).setText("Name:");
		mJavaInterfaceName = new Text(composite, SWT.BORDER);
		if (startPage != null && startPage.getInterface() instanceof JavaInterface) {
			mJavaInterfaceName.setText(((JavaInterface)startPage.getInterface()).getInterface());
		}
		mJavaInterfaceName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				handleModify();
			}
		});
		mJavaInterfaceName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Button browseBtn = new Button(composite, SWT.PUSH);
		browseBtn.setText("...");
		browseBtn.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browseBtn.addSelectionListener(new SelectionListener(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				String out = browseForClass();
				mJavaInterfaceName.setText(out);
				if (startPage != null && startPage.getInterface() instanceof JavaInterface) {
					((JavaInterface)startPage.getInterface()).setInterface(out);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

        setControl(composite);

		validate();
		setErrorMessage(null);
	}

	public String getJavaInterfaceString() {
		return this.sJavaInterface;
	}
	
	private void handleModify() {
		sJavaInterface = mJavaInterfaceName.getText().trim();
		if (startPage != null && startPage.getInterface() instanceof WSDLPortType) {
			((JavaInterface)startPage.getInterface()).setInterface(sJavaInterface);
		}
		validate();
	}

	private void validate() {
		String errorMessage = null;
		String cpName = mJavaInterfaceName.getText();

		if (cpName == null || cpName.trim().length() == 0) {
			errorMessage = "No name specified";
		}
		else if (cpName.trim().length() < cpName.length() ) {
			errorMessage = "No spaces allowed in name";
		}
		setErrorMessage(errorMessage);
		setPageComplete(errorMessage == null);
	}
	
	private String browseForClass() {
		Shell parent= JavaPlugin.getActiveWorkbenchShell();
		SelectionDialog dialog= new OpenTypeSelectionDialog(parent, false,
			    PlatformUI.getWorkbench().getProgressService(), null, 
			    IJavaSearchConstants.INTERFACE);
		dialog.setTitle(JavaUIMessages.OpenTypeAction_dialogTitle);
		dialog.setMessage(JavaUIMessages.OpenTypeAction_dialogMessage);
		int rtn_code = dialog.open();
		if (rtn_code == Window.OK) {
			SourceType result = (SourceType) dialog.getResult()[0];
			return result.getFullyQualifiedName();
		}
		return null;
	}

	@Override
	public boolean getSkippable() {
		if (this.startPage != null && this.startPage.getInterface() != null) {
			if (startPage.getInterface() instanceof JavaInterface) {
				return false;
			} else {
				return true;
			}
		}
		return super.getSkippable();
	}

	@Override
	public void refresh() {
		if (startPage != null && startPage.getInterface() instanceof JavaInterface) {
			mJavaInterfaceName.setText(((JavaInterface)startPage.getInterface()).getInterface());
		}
	}
}
