/*************************************************************************************
 * Copyright (c) 2012 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.maven.model.Dependency;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.M2EUtils;
import org.switchyard.tools.ui.common.ISwitchYardComponentExtension.Category;
import org.switchyard.tools.ui.i18n.Messages;

/**
 * SwitchYardComponentExtensionManager
 * 
 * <p/>
 * Manages the org.switchyard.tools.ui.switchYardComponent extension point.
 * 
 * @author Rob Cernich
 */
public final class SwitchYardComponentExtensionManager {

    /** The ID of the core SwitchYard runtime component. */
    public static final String RUNTIME_COMPONENT_EXTENSION_ID = "org.switchyard:switchyard-runtime"; //$NON-NLS-1$

    private static final SwitchYardComponentExtensionManager INSTANCE = new SwitchYardComponentExtensionManager();

    /**
     * @return the instance.
     */
    public static SwitchYardComponentExtensionManager instance() {
        return INSTANCE;
    }

    private Map<String, ISwitchYardComponentExtension> _extensions = new TreeMap<String, ISwitchYardComponentExtension>();
    private Map<Category, Collection<ISwitchYardComponentExtension>> _extensionsByCategory;

    private SwitchYardComponentExtensionManager() {
        _extensionsByCategory = new HashMap<ISwitchYardComponentExtension.Category, Collection<ISwitchYardComponentExtension>>();
        for (Category category : Category.values()) {
            _extensionsByCategory.put(category, new ArrayList<ISwitchYardComponentExtension>());
        }
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,
                "switchYardComponent"); //$NON-NLS-1$
        for (IExtension extension : extensionPoint.getExtensions()) {
            for (IConfigurationElement element : extension.getConfigurationElements()) {
                processComponent(element);
            }
        }
    }

    /**
     * @return the extension representing the core runtime.
     */
    public ISwitchYardComponentExtension getRuntimeComponentExtension() {
        if (_extensions.containsKey(RUNTIME_COMPONENT_EXTENSION_ID)) {
            return _extensions.get(RUNTIME_COMPONENT_EXTENSION_ID);
        }
        return null;
    }

    /**
     * @return the list of registered component extensions.
     */
    public Collection<ISwitchYardComponentExtension> getComponentExtensions() {
        return Collections.unmodifiableCollection(_extensions.values());
    }

    /**
     * @param category the component category.
     * @return the list of registered component extensions for the specified
     *         category.
     */
    public Collection<ISwitchYardComponentExtension> getComponentExtensions(Category category) {
        return Collections.unmodifiableCollection(_extensionsByCategory.get(category));
    }

    /**
     * @param id the id of the component extension.
     * @return the component extension; null if no extension is registered with
     *         the specified id.
     */
    public ISwitchYardComponentExtension getComponentExtension(String id) {
        if (_extensions.containsKey(id)) {
            return _extensions.get(id);
        }
        return null;
    }

    private void processComponent(IConfigurationElement element) {
        if (!"component".equals(element.getName())) { //$NON-NLS-1$
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_InvalidElementStatus + element.getName()
                                    + ", plugin=" + element.getContributor().getName())); //$NON-NLS-1$
            return;
        }
        String id = element.getAttribute("id"); //$NON-NLS-1$
        String name = element.getAttribute("name"); //$NON-NLS-1$
        Category category = parseCategory(element);
        String description = parseDescription(element);
        String bundleId = parseBundleId(element);
        List<Dependency> dependencies = parseDependencies(element);
        if (id == null) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_InvalidIDStatus
                                    + element.getContributor().getName()));
            return;
        } else if (_extensions.containsKey(id)) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_DuplicateIDStatus
                                    + element.getContributor().getName()));
            return;
        } else if (name == null || name.length() == 0) {
            name = id;
        }
        ISwitchYardComponentExtension extension = new SwitchYardComponentExtension(id, name, category,
                element.getAttribute("scannerClass"), description, bundleId, dependencies); //$NON-NLS-1$
        _extensions.put(id, extension);
        _extensionsByCategory.get(category).add(extension);
    }

    private Category parseCategory(IConfigurationElement element) {
        String categoryString = element.getAttribute("category"); //$NON-NLS-1$
        if (categoryString == null || categoryString.length() == 0) {
            return Category.UNKNOWN;
        }
        try {
            return Category.valueOf(categoryString.toUpperCase());
        } catch (Exception e) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_InvalidCategoryStatus
                                    + element.getContributor().getName() + ", id=" + element.getAttribute("id"))); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return Category.UNKNOWN;
    }

    private String parseDescription(IConfigurationElement element) {
        IConfigurationElement[] descriptions = element.getChildren("description"); //$NON-NLS-1$
        if (descriptions.length == 0) {
            return null;
        }
        return descriptions[0].getValue();
    }

    private List<Dependency> parseDependencies(IConfigurationElement element) {
        IConfigurationElement[] dependencyElements = element.getChildren("dependency"); //$NON-NLS-1$
        if (dependencyElements == null) {
            return Collections.emptyList();
        }
        List<Dependency> dependencies = new ArrayList<Dependency>(dependencyElements.length);
        for (IConfigurationElement dependencyElement : dependencyElements) {
            String artifactId = parseArtifactId(dependencyElement);
            String groupId = parseGroupId(dependencyElement);
            String scope = parseScope(dependencyElement);
            if (artifactId == null || artifactId.length() == 0 || groupId == null || groupId.length() == 0) {
                Activator
                        .getDefault()
                        .getLog()
                        .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                                Messages.SwitchYardComponentExtensionManager_InvalidDependencyStatus
                                        + element.getContributor().getName()));
                continue;
            }
            dependencies.add(M2EUtils.createSwitchYardDependency(groupId, artifactId, scope));
        }
        return dependencies;
    }

    private String parseGroupId(IConfigurationElement element) {
        IConfigurationElement[] groupIds = element.getChildren("groupId"); //$NON-NLS-1$
        if (groupIds.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_MultipleGroupIDsFoundStatus
                                    + element.getContributor().getName()));
            return null;
        }
        return groupIds[0].getValue().trim();
    }

    private String parseArtifactId(IConfigurationElement element) {
        IConfigurationElement[] artifactIds = element.getChildren("artifactId"); //$NON-NLS-1$
        if (artifactIds.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_MultipleArtifactIDsStatus
                                    + element.getContributor().getName()));
            return null;
        }
        return artifactIds[0].getValue().trim();
    }

    private String parseBundleId(IConfigurationElement element) {
        String bundleIdString = element.getAttribute("bundleId"); //$NON-NLS-1$
        if (bundleIdString != null && bundleIdString.length() > 0) {
            return bundleIdString;
        }
        return null;
    }

    private String parseScope(IConfigurationElement element) {
        IConfigurationElement[] scopes = element.getChildren("scope"); //$NON-NLS-1$
        if (scopes.length == 0) {
            return null;
        } else if (scopes.length != 1) {
            Activator
                    .getDefault()
                    .getLog()
                    .log(new Status(Status.ERROR, Activator.PLUGIN_ID,
                            Messages.SwitchYardComponentExtensionManager_MultipleScopesStatus
                                    + element.getContributor().getName()));
            // we'll fall through and return the first element's value
        }
        String scope = scopes[0].getValue().trim();
        return scope.length() == 0 ? null : scope;
    }

    private static final class SwitchYardComponentExtension implements ISwitchYardComponentExtension {

        private final String _id;
        private final String _name;
        private final Category _category;
        private final String _scannerClassName;
        private final String _description;
        private final String _bundleId;
        private final List<Dependency> _dependencies;

        private SwitchYardComponentExtension(String id, String name, Category category, String scannerClassName,
                String description, String bundleId, List<Dependency> dependencies) {
            super();
            _id = id;
            _name = name;
            _category = category;
            _scannerClassName = scannerClassName;
            _description = description;
            _dependencies = Collections.unmodifiableList(dependencies);
            _bundleId = bundleId;
        }

        @Override
        public String getId() {
            return _id;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public Category getCategory() {
            return _category;
        }

        @Override
        public String getScannerClassName() {
            return _scannerClassName;
        }

        @Override
        public String getDescription() {
            return _description;
        }

        @Override
        public List<Dependency> getDependencies() {
            return _dependencies;
        }

        @Override
        public String getBundleId() {
            return _bundleId;
        }
    }
}
