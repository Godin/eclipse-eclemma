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

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.After;
import org.junit.Test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class MenuTest {

  private static final SWTWorkbenchBot bot = new SWTWorkbenchBot();

  @After
  public void resetWorkbench() {
      // TODO seems that this doesn't work for Retina
      new SWTWorkbenchBot().captureScreenshot("/tmp/screen.png");

      // TODO seems that this works for single monitor
      final Display display = Display.getDefault();
      display.syncExec(new Runnable() {
			public void run() {
				GC gc = new GC(display);
				Image image = null;

				try {
					image = new Image(display, display.getBounds().width, display.getBounds().height);
					gc.copyArea(image, display.getBounds().x, display.getBounds().y);

					ImageLoader imageLoader = new ImageLoader();
					imageLoader.data = new ImageData[] { image.getImageData(200) };
					imageLoader.save("/tmp/screen2.png", SWT.IMAGE_PNG);
				} catch (Exception ex) {
				} finally {
					gc.dispose();
					if (image != null) {
						image.dispose();
					}
				}
			}
		});

    bot.resetWorkbench();
  }

  /**
   * https://bugs.eclipse.org/bugs/show_bug.cgi?id=517712
   */
  @Test
  public void labels_should_be_consistent() {
    // org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences.TIMEOUT = 10000;

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
