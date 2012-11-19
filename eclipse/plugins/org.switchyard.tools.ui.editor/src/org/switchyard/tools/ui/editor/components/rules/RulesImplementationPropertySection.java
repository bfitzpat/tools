/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.tools.ui.editor.components.rules;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.switchyard.tools.models.switchyard1_0.rules.ActionType1;
import org.switchyard.tools.models.switchyard1_0.rules.RulesImplementationType;
import org.switchyard.tools.models.switchyard1_0.rules.RulesPackage;

/**
 * RulesImplementationPropertySection
 * 
 * Property sheet composite for BPM component implementations.
 */
public class RulesImplementationPropertySection extends GFPropertySection implements ITabbedPropertyConstants {

    private Composite _panel;
    private RulesActionTable _actionsTable;
    private RulesMappingsTable _inputsTable;
    private RulesMappingsTable _outputsTable;
    private RulesMappingsTable _globalsTable;
    private RulesEventListenerTable _listenersTable;
    private RulesImplementationType _implementation;

    /**
     * Create a new RulesImplementationPropertySection.
     */
    public RulesImplementationPropertySection() {
    }

    @Override
    public void refresh() {
        _implementation = null;
        final PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            final Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            _implementation = (RulesImplementationType) ((Component) bo).getImplementation();
        }
        _actionsTable.setTargetObject(_implementation);
        _listenersTable.setTargetObject(_implementation);
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        _panel = factory.createComposite(parent);
        _panel.setLayout(new GridLayout());

        CTabFolder folder = factory.createTabFolder(_panel, SWT.TOP);
        folder.setLayout(new GridLayout());
        folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        CTabItem resources = factory.createTabItem(folder, SWT.NONE);
        CTabItem actions = factory.createTabItem(folder, SWT.NONE);
        CTabItem advanced = factory.createTabItem(folder, SWT.NONE);

        resources.setText("Resources");
        actions.setText("Actions");
        advanced.setText("Advanced");

        createResourcesControls(folder, resources);
        createActionsControls(folder, actions);
        createAdvancedControls(folder, advanced);

        folder.setSelection(0);
    }

    private void createResourcesControls(CTabFolder folder, CTabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout());
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        ExpandableComposite resourcesSection = factory.createExpandableComposite(control, ExpandableComposite.TITLE_BAR
                | ExpandableComposite.EXPANDED);
        resourcesSection.setText("Resources");
        resourcesSection.setLayout(new GridLayout(2, false));
        resourcesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite resourcesComposite = factory.createComposite(resourcesSection);
        resourcesComposite.setLayout(new GridLayout(2, false));
        resourcesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        resourcesSection.setClient(resourcesComposite);

        TableViewer _resourcesTable = new TableViewer(resourcesComposite, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
        factory.adapt(_resourcesTable.getTable(), true, true);
        _resourcesTable.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

        Button _addResourceButton = factory.createButton(resourcesComposite, "Add...", SWT.PUSH);
        _addResourceButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        Button _removeResourceButton = factory.createButton(resourcesComposite, "Remove...", SWT.PUSH);
        _removeResourceButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

        item.setControl(control);
    }

    private void createActionsControls(CTabFolder folder, CTabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout(2, false));
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Composite actionsComposite = factory.createComposite(control);
        actionsComposite.setLayout(new GridLayout());
        actionsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        ExpandableComposite actionsSection = factory.createExpandableComposite(actionsComposite,
                ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
        actionsSection.setText("Actions");
        actionsSection.setLayout(new GridLayout());
        actionsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

        _actionsTable = new RulesActionTable(actionsSection, SWT.NONE);
        actionsSection.setClient(_actionsTable);
        _actionsTable.getTableViewer().addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final Object selected;
                if (event.getSelection().isEmpty()) {
                    selected = null;
                } else {
                    selected = ((IStructuredSelection) event.getSelection()).getFirstElement();
                }
                _inputsTable.setTargetObject((ActionType1) selected);
                _outputsTable.setTargetObject((ActionType1) selected);
                _globalsTable.setTargetObject((ActionType1) selected);
            }
        });

        Composite mappingsComposite = factory.createComposite(control);
        mappingsComposite.setLayout(new GridLayout());
        mappingsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        ExpandableComposite inputsSection = factory.createExpandableComposite(mappingsComposite,
                ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
        inputsSection.setText("Inputs");
        inputsSection.setLayout(new GridLayout());
        inputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        inputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                control.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        _inputsTable = new RulesMappingsTable(inputsSection, SWT.NONE, RulesPackage.eINSTANCE.getActionType1_Inputs(),
                RulesPackage.eINSTANCE.getMappingsType_Mapping());
        inputsSection.setClient(_inputsTable);

        ExpandableComposite outputsSection = factory.createExpandableComposite(mappingsComposite,
                ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
        outputsSection.setText("Outputs");
        outputsSection.setLayout(new GridLayout());
        outputsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        outputsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                control.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        _outputsTable = new RulesMappingsTable(outputsSection, SWT.NONE, RulesPackage.eINSTANCE.getActionType1_Outputs(),
                RulesPackage.eINSTANCE.getMappingsType_Mapping());
        outputsSection.setClient(_outputsTable);

        ExpandableComposite globalsSection = factory.createExpandableComposite(mappingsComposite,
                ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
        globalsSection.setText("Globals");
        globalsSection.setLayout(new GridLayout());
        globalsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        globalsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                control.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        _globalsTable = new RulesMappingsTable(globalsSection, SWT.NONE, RulesPackage.eINSTANCE.getActionType1_Globals(),
                RulesPackage.eINSTANCE.getMappingsType_Mapping());
        globalsSection.setClient(_globalsTable);

        item.setControl(control);
    }

    private void createAdvancedControls(CTabFolder folder, CTabItem item) {
        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        final Composite control = factory.createComposite(folder);
        control.setLayout(new GridLayout());
        control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        ExpandableComposite propertiesSection = factory.createExpandableComposite(control, ExpandableComposite.TWISTIE
                | ExpandableComposite.TITLE_BAR | ExpandableComposite.EXPANDED);
        propertiesSection.setText("Properties");
        propertiesSection.setLayout(new GridLayout());
        propertiesSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        propertiesSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _panel.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        Composite propertiesComposite = factory.createComposite(propertiesSection);
        propertiesComposite.setLayout(new GridLayout(2, false));
        propertiesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        propertiesSection.setClient(propertiesComposite);

        TableViewer _propertiesTable = new TableViewer(propertiesComposite, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
        factory.adapt(_propertiesTable.getTable(), true, true);
        _propertiesTable.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

        Button _addPropertyButton = factory.createButton(propertiesComposite, "Add...", SWT.PUSH);
        _addPropertyButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        Button _removePropertyButton = factory.createButton(propertiesComposite, "Remove...", SWT.PUSH);
        _removePropertyButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

        ExpandableComposite loggersSection = factory.createExpandableComposite(control, ExpandableComposite.TWISTIE
                | ExpandableComposite.TITLE_BAR);
        loggersSection.setText("Audit Loggers");
        loggersSection.setLayout(new GridLayout());
        loggersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        loggersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _panel.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        Composite loggersComposite = factory.createComposite(loggersSection);
        loggersComposite.setLayout(new GridLayout(2, false));
        loggersComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        loggersSection.setClient(loggersComposite);

        TableViewer _loggersTable = new TableViewer(loggersComposite, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
        factory.adapt(_loggersTable.getTable(), true, true);
        _loggersTable.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

        Button _addLoggerButton = factory.createButton(loggersComposite, "Add...", SWT.PUSH);
        _addLoggerButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        Button _removeLoggerButton = factory.createButton(loggersComposite, "Remove...", SWT.PUSH);
        _removeLoggerButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

        ExpandableComposite listenersSection = factory.createExpandableComposite(control, ExpandableComposite.TWISTIE
                | ExpandableComposite.TITLE_BAR);
        listenersSection.setText("Event Listeners");
        listenersSection.setLayout(new GridLayout());
        listenersSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        listenersSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _panel.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        _listenersTable = new RulesEventListenerTable(listenersSection, SWT.NONE);
        listenersSection.setClient(_listenersTable);

        ExpandableComposite channelsSection = factory.createExpandableComposite(control, ExpandableComposite.TWISTIE
                | ExpandableComposite.TITLE_BAR);
        channelsSection.setText("Channels");
        channelsSection.setLayout(new GridLayout());
        channelsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.addExpansionListener(new ExpansionAdapter() {
            @Override
            public void expansionStateChanged(ExpansionEvent e) {
                _panel.layout(new Control[] {(ExpandableComposite) e.getSource() });
            }
        });

        Composite channelsComposite = factory.createComposite(channelsSection);
        channelsComposite.setLayout(new GridLayout(2, false));
        channelsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        channelsSection.setClient(channelsComposite);

        TableViewer _channelsTable = new TableViewer(channelsComposite, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
        factory.adapt(_channelsTable.getTable(), true, true);
        _channelsTable.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

        Button _addChannelButton = factory.createButton(channelsComposite, "Add...", SWT.PUSH);
        _addChannelButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
        Button _removeChannelButton = factory.createButton(channelsComposite, "Remove...", SWT.PUSH);
        _removeChannelButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));

        item.setControl(control);
    }

}