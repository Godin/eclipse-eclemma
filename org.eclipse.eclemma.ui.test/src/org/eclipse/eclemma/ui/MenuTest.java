/*******************************************************************************
 * Copyright (c) 2006, 2020 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Evgeny Mandrikov - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.eclemma.ui;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.ui.PlatformUI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {

  private static final SWTWorkbenchBot bot = new SWTWorkbenchBot();

  @Before
  public void before() {
    UIThreadRunnable.syncExec(new VoidResult() {
      public void run() {
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
            .forceActive();
      }
    });
  }

  @After
  public void resetWorkbench() {
    bot.resetWorkbench();
  }

  /**
   * https://bugs.eclipse.org/bugs/show_bug.cgi?id=517712
   */
  @Test
  public void labels_should_be_consistent() {
    bot.perspectiveByLabel("Java").activate();
    final List<String> items = bot.menu("Run").menuItems();

    assertTrue(items.contains("Run"));
    assertTrue(items.contains("Coverage"));

    assertTrue(items.contains("Run History"));
    assertTrue(items.contains("Coverage History"));

    assertTrue(items.contains("Run Configurations..."));
    assertTrue(items.contains("Coverage Configurations..."));
  }

}
