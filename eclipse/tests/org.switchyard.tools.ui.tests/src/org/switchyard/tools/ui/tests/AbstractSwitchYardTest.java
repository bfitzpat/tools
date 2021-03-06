/*************************************************************************************
 * Copyright (c) 2016 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.tests;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;
import org.eclipse.m2e.tests.common.JobHelpers;
import org.eclipse.m2e.tests.common.JobHelpers.IJobMatcher;

/**
 * Abstract test extending AbstractMavenProjectTestCase to handle timeout
 * better.
 * 
 * @author brianf
 */
@SuppressWarnings("restriction")
public abstract class AbstractSwitchYardTest extends AbstractMavenProjectTestCase {

    private static final int DEFAULT_TIMEOUT_MS = 300 * 1000; // 5 minute max

    /**
     * Wait for all build jobs with a parameterized timeout.
     * 
     * @throws Exception
     */
    protected void waitForJobs(int timeout) throws Exception {
        JobHelpers.waitForJobs(BuildJobMatcher.INSTANCE, timeout);
    }

    /**
     * Wait for all build jobs with a default timeout.
     */
    protected void waitForJobsNoThrow() {
        try {
            waitForJobsNoThrow(DEFAULT_TIMEOUT_MS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Wait for all build jobs with a parameterized timeout.
     * 
     * @throws Exception
     */
    protected void waitForJobsNoThrow(int timeout) {
        try {
            JobHelpers.waitForJobs(BuildJobMatcher.INSTANCE, timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class BuildJobMatcher implements IJobMatcher {

        public static final IJobMatcher INSTANCE = new BuildJobMatcher();

        public boolean matches(Job job) {
            return (job instanceof WorkspaceJob) || job.getClass().getName().matches("(.*\\.AutoBuild.*)") //$NON-NLS-1$
                    || job.getClass().getName().endsWith("JREUpdateJob"); //$NON-NLS-1$
        }
    }

    protected void waitForJobs() throws OperationCanceledException, InterruptedException {
        try {
            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, new NullProgressMonitor());
            Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, new NullProgressMonitor());
            Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_REFRESH, new NullProgressMonitor());
            Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, new NullProgressMonitor());
        } catch (InterruptedException ex) {
            // Workaround to bug
            // https://bugs.eclipse.org/bugs/show_bug.cgi?id=335251
            System.out.println("Have a trace in case of infinite loop in AbstractSwitchYardTest.waitJob()");
            waitForJobs();
        }
    }
}
