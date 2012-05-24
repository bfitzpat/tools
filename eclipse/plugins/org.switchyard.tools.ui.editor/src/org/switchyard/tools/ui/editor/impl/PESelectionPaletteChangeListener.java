/*****************************************************************************
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
package org.switchyard.tools.ui.editor.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.soa.sca.sca1_1.model.sca.Component;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentReference;
import org.eclipse.soa.sca.sca1_1.model.sca.ComponentService;
import org.eclipse.soa.sca.sca1_1.model.sca.Composite;
import org.eclipse.soa.sca.sca1_1.model.sca.Reference;
import org.eclipse.soa.sca.sca1_1.model.sca.Service;

/**
 * @author bfitzpat
 * 
 */
public class PESelectionPaletteChangeListener implements ISelectionChangedListener {

    private PaletteRoot _paletteRoot = null;
    private final String _connectionsContainer = "Connections";
    private final String _compositesContainer = "Composites";
    private final String _componentsContainer = "Components";
    private final String _bindingsContainer = "Bindings";
    private final String _implementationsContainer = "Implementations";
    private final String _standardToolsContainer = "Standard tools";

    /**
     * @param root Palette root from editor
     */
    public PESelectionPaletteChangeListener(PaletteRoot root) {
        this._paletteRoot = root;
    }

    @SuppressWarnings("restriction")
    @Override
    public void selectionChanged(SelectionChangedEvent event) {
        PictogramElement[] selectedPEs = SwitchyardSCAEditor.getActiveEditor().getSelectedPictogramElements();
        PictogramElement pe = null;
        if (selectedPEs != null && selectedPEs.length > 0) {
            pe = selectedPEs[0];
        }
        Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
        if (bo instanceof Component) {
            updatePalette(new String[] {_standardToolsContainer, _componentsContainer, _implementationsContainer });
        } else if (bo instanceof Composite) {
            updatePalette(new String[] {_standardToolsContainer, _compositesContainer, _connectionsContainer});
        } else if (bo instanceof Service || bo instanceof Reference) {
            updatePalette(new String[] {_standardToolsContainer, _bindingsContainer, _connectionsContainer });
        } else if (bo instanceof ComponentService || bo instanceof ComponentReference) {
            updatePalette(new String[] {_standardToolsContainer, _implementationsContainer, _connectionsContainer });
        } else {
            updatePalette(new String[0]);
        }
    }

    /**
     * @param flag turn on or off
     */
    private void updatePalette(String[] visibleContainers) {
        if (visibleContainers != null && visibleContainers.length > 0) {
            List<String> visible = (List<String>) Arrays.asList(visibleContainers);
            List<?> paletteKids = _paletteRoot.getChildren();
            for (Iterator<?> iterator = paletteKids.iterator(); iterator.hasNext();) {
                PaletteEntry object = (PaletteEntry) iterator.next();
                if (object instanceof PaletteContainer) {
                    PaletteContainer container = (PaletteContainer) object;
                    if (visible.contains(container.getLabel())) {
                        container.setVisible(true);
                    } else {
                        container.setVisible(false);
                    }
                }
            }
        } else {
            List<?> paletteKids = _paletteRoot.getChildren();
            for (Iterator<?> iterator = paletteKids.iterator(); iterator.hasNext();) {
                PaletteEntry object = (PaletteEntry) iterator.next();
                object.setVisible(true);
            }
        }
    }

}
