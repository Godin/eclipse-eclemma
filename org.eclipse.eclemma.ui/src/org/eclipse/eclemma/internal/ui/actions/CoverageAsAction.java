/*******************************************************************************
 * Copyright (c) 2006, 2020 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.eclemma.internal.ui.actions;

import org.eclipse.debug.ui.actions.LaunchShortcutsAction;

import org.eclipse.eclemma.internal.ui.EclEmmaUIPlugin;

/**
 * Action implementation for "Coverage as" menu.
 */
public class CoverageAsAction extends LaunchShortcutsAction {

  public CoverageAsAction() {
    super(EclEmmaUIPlugin.ID_COVERAGE_LAUNCH_GROUP);
  }

}
