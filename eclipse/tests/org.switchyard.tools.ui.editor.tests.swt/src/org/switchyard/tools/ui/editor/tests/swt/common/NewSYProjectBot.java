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
package org.switchyard.tools.ui.editor.tests.swt.common;

import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

/**
 *  Fire up the SwitchYard Project editor and update settings.
 */
public class NewSYProjectBot {
    
    private static SWTWorkbenchBot bot = new SWTWorkbenchBot();
    private SWTBotShell shell;
    
    public NewSYProjectBot() {
        bot.menu("File").menu("New").menu("Project...").click();
        bot.sleep(1000);
        shell = bot.shell("New Project");
        bot.sleep(1000);
        shell.activate();
        bot.sleep(1000);
        SWTBotTree tree = bot.tree();
        tree.expandNode("SwitchYard");
        bot.sleep(1000);
        SWTBotTreeItem item = tree.getTreeItem("SwitchYard");
        bot.sleep(1000);
        SWTBotTreeItem wizard = item.getNode("SwitchYard Project");
        bot.sleep(1000);
        wizard.select();
        bot.sleep(1000);
        bot.button("Next >").click();
        bot.sleep(1000);
    }
    
    public void setProjectName(String projectName) {
        bot.textWithLabel("Project name:").setText(projectName);
        bot.button("Next >").click();
    }
    
    public void setComponentChecked(String componentName) {
        SWTBotTable table = bot.tableWithLabel("Components:");
        table.getTableItem(componentName).check();
    }

    public void finish() {
        bot.button("Finish").click();
        bot.waitUntil(shellCloses(shell));
    }
}
