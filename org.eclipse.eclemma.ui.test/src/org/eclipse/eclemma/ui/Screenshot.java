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

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Screenshot implements TestRule {

  public Statement apply(final Statement base, final Description description) {
    return new Statement() {
      public void evaluate() throws Throwable {
        try {
          new SWTWorkbenchBot().captureScreenshot(
              "./target/screenshots/" + description.getClassName() + "."
                  + description.getMethodName() + "-before" + ".png");
          base.evaluate();
        } finally {
          new SWTWorkbenchBot().captureScreenshot(
              "./target/screenshots/" + description.getClassName() + "."
                  + description.getMethodName() + "-after" + ".png");
        }
      }
    };
  }

}
