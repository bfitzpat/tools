package org.jboss.tools.sca.util;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.PlatformUI;

public class CalculateUtil {
	private static class CalculateRunnable implements Runnable {
		private final String text;
		private final Font font;
		private IDimension dimension;

		public CalculateRunnable(String text, Font font) {
			this.text = text;
			this.font = font;
		}

		@Override
		public void run() {
			dimension = GraphitiUi.getUiLayoutService().calculateTextSize(text, font);
		}

		public IDimension getDimension() {
			return dimension;
		}
	}

	public static IDimension calculateTextSize(String text, Font font) {
		CalculateRunnable runnable = new CalculateRunnable(text, font);

		PlatformUI.getWorkbench().getDisplay().syncExec(runnable);

		return runnable.getDimension();
	}
}