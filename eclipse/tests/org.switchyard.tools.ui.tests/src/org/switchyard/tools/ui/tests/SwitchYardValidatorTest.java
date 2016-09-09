/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;
import org.eclipse.m2e.tests.common.WorkspaceHelpers;
import org.switchyard.tools.ui.validation.SwitchYardProjectValidator;

/**
 * SwitchYardValidatorTest
 * 
 * Tests the validator logic.
 * 
 * @author Rob Cernich, Brian Fitzpatrick
 */
@SuppressWarnings("restriction")
public class SwitchYardValidatorTest extends AbstractMavenProjectTestCase {

    /**
     * Tests wiring validation.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testWiringValidation() throws Exception {
        IProject project = importProject("test-data/validator-tests/wiring-validation-tests/pom.xml");
        waitForJobsToComplete();

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
        waitForJobsToComplete();

        IFile switchYardFile = project.getFile("src/main/resources/META-INF/switchyard.xml");
        assertTrue("switchyard.xml does not exist.", switchYardFile != null && switchYardFile.exists());

        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        int unknownCount = 0;
        for (IMarker marker : markers) {
            switch (marker.getAttribute(IMarker.SEVERITY, -1)) {
            case IMarker.SEVERITY_ERROR:
                ++errorCount;
                break;
            case IMarker.SEVERITY_INFO:
                ++infoCount;
                break;
            case IMarker.SEVERITY_WARNING:
                ++warningCount;
                break;
            default:
                ++unknownCount;
                break;
            }
        }
       
        checkContainsMarkerWithMessage(markers, "Required Capability Missing: The \"File Transfer (FTP/FTPS/SFTP)\" capability should be configured on the project when using this type of binding.");
        checkContainsMarkerWithMessage(markers, "Unused Capability: The \"File\" capability is configured on the project, but is not required by any SwitchYard binding or implementation types used in the project.");
        checkContainsMarkerWithMessage(markers, "Error loading service interface meta-data.  Interface compatibility cannot be verified.");
        checkContainsMarkerWithMessage(markers, "Required transformation missing: from=\"java:int\" to=\"{urn:org.switchyard.tools.tests:wiring-validation-tests:0.0.1-SNAPSHOT}testInOutMethodResponse\".");
        checkContainsMarkerWithMessage(markers, "Unbound Operation: Cannot resolve operation \"testMissingOperation\" on target.");
        checkContainsMarkerWithMessage(markers, "Required transformation missing: from=\"{urn:org.switchyard.tools.tests:wiring-validation-tests:0.0.1-SNAPSHOT}testInOnlyMethod\" to=\"java:java.lang.String\".");
        checkContainsMarkerWithMessage(markers, "Unbound Service: The service \"UnboundService\" is not bound to any component service (i.e. it promotes no component service).");
        checkContainsMarkerWithMessage(markers, "The referenced Java interface for service \"UnboundService\" specifies more than one operation and the binding \"null\" does not specify which to use in the operation selector.");
        checkContainsMarkerWithMessage(markers, "No interface is defined for the service/reference.");
        checkContainsMarkerWithMessage(markers, "Unused Reference: The reference \"UnusedReference\" is unused (i.e. it promotes no component references).");
        checkContainsSeveralMarkersWithMessage(markers, "Duplicate Name: The name \"ExtendedService\" must be unique among services, references and component services.", 3);
        checkContainsMarkerWithMessage(markers, "Ambiguous Reference: Cannot resolve a service for component reference \"ExtendedService\" (i.e. resolves to multiple services).");
        checkContainsMarkerWithMessage(markers, "No interface is defined for the service/reference.");
        checkContainsMarkerWithMessage(markers, "Unresolved Reference: The component reference \"UnresolvedReference\" cannot be resolved to a service.");
        checkContainsMarkerWithMessage(markers, "Service Interface Mismatch: Interface for service \"WSDLService\" in component \"InvalidInterfaceComponent\" does not match the interface provided by the implementation.");
        checkContainsMarkerWithMessage(markers, "Unused Component Reference: Reference \"WSDLReference\" defined by component \"InvalidInterfaceComponent\" is not used by the component's implementation.");
        checkContainsMarkerWithMessage(markers, "Incompatible Interface Type: \"WSDL\" interfaces cannot be used with \"Bean\" components (InvalidInterfaceComponent/WSDLService).");
        checkContainsMarkerWithMessage(markers, "Incompatible Interface Type: \"WSDL\" interfaces cannot be used with \"Bean\" components (InvalidInterfaceComponent/WSDLReference).");
        checkContainsMarkerWithMessage(markers, "Unresolved Reference: The component reference \"WSDLReference\" cannot be resolved to a service.");
        
        
        assertEquals("Expecting 16 errors: " + WorkspaceHelpers.toString(markers), 16, errorCount);
        assertEquals("Expecting 5 warnings: " + WorkspaceHelpers.toString(markers), 5, warningCount);
        assertEquals("Expecting 0 infos: " + WorkspaceHelpers.toString(markers), 0, infoCount);
        assertEquals("Unexpected marker severity (not info, warning, error): " + WorkspaceHelpers.toString(markers), 0, unknownCount);

        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), 21, markers.length);
        
        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), 21, markers.length);
    }

    private void checkContainsSeveralMarkersWithMessage(IMarker[] markers, String message, int occurence) {
    	assertThat(Arrays.stream(markers)
		        .filter(marker -> message.equals(marker.getAttribute(IMarker.MESSAGE, "")))
		        .count())
		.as("The validation marker has not been found the right number of times("+occurence+") for message: "+message + " in:\n"+ WorkspaceHelpers.toString(markers)).isEqualTo(occurence);
	}

	private void checkContainsMarkerWithMessage(IMarker[] markers, String message) {
		assertThat(Arrays.stream(markers)
		        .filter(marker -> message.equals(marker.getAttribute(IMarker.MESSAGE, "")))
		        .findFirst()
		        .isPresent())
		.as("The validation marker has not been found for message: "+message+ " in:\n"+ WorkspaceHelpers.toString(markers)).isTrue();
	}

	/**
     * Tests Camel route validation.
     * 
     * @throws Exception if a failure occurs.
     */
    public void testCamelRouteValidation() throws Exception {
        IProject project = importProject("test-data/validator-tests/camel-route-tests/pom.xml");
        waitForJobsToComplete();

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);
        waitForJobsToComplete();

        IFile switchYardFile = project.getFile("src/main/resources/META-INF/switchyard.xml");
        assertTrue("switchyard.xml does not exist.", switchYardFile != null && switchYardFile.exists());

        IMarker[] markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        int errorCount = 0;
        int warningCount = 0;
        int infoCount = 0;
        int unknownCount = 0;
        for (IMarker marker : markers) {
            switch (marker.getAttribute(IMarker.SEVERITY, -1)) {
            case IMarker.SEVERITY_ERROR:
                ++errorCount;
                break;
            case IMarker.SEVERITY_INFO:
                ++infoCount;
                break;
            case IMarker.SEVERITY_WARNING:
                ++warningCount;
                break;
            default:
                ++unknownCount;
                break;
            }
        }

        int expectedErrorCount = 12;
        assertEquals("Expecting " + expectedErrorCount + " errors: " + WorkspaceHelpers.toString(markers), expectedErrorCount, errorCount);
        assertEquals("Expecting 0 warnings: " + WorkspaceHelpers.toString(markers), 0, warningCount);
        assertEquals("Expecting 0 infos: " + WorkspaceHelpers.toString(markers), 0, infoCount);
        assertEquals("Unexpected marker severity (not info, warning, error): " + WorkspaceHelpers.toString(markers), 0,
                unknownCount);

        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), expectedErrorCount, markers.length);

        MavenPlugin.getProjectConfigurationManager().updateProjectConfiguration(project, monitor);
        project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
        waitForJobsToComplete();
        markers = project.findMarkers(null, true, IFile.DEPTH_INFINITE);
        assertEquals(WorkspaceHelpers.toString(markers), 0, markers.length);

        project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
        waitForJobsToComplete();
        markers = switchYardFile.findMarkers(SwitchYardProjectValidator.SWITCHYARD_MARKER_ID, true,
                IFile.DEPTH_ZERO);
        assertEquals(WorkspaceHelpers.toString(markers), expectedErrorCount, markers.length);
    }
}
