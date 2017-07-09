package org.eclipse.eclemma.ui;

import static org.junit.Assert.assertEquals;

import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.swt.finder.results.Result;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.utils.SWTUtils;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.themes.ITheme;
import org.eclipse.ui.themes.IThemeManager;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class FontTest {

	private static final SWTWorkbenchBot bot = new SWTWorkbenchBot();

	private static FontData expected;

	@Test
	public void test() {
		increaseFontSize();
		t();
		increaseFontSize();
		t();
	}

	private void t() {
		UIThreadRunnable.asyncExec(new VoidResult() {
			public void run() {
				ActionFactory.PREFERENCES.create(PlatformUI.getWorkbench().getActiveWorkbenchWindow()).run();
			}
		});
		bot.shell("Preferences").activate();
		bot.tree().getTreeItem("Java").expand().getNode("Code Coverage").select();
		assertFont(expected, bot.widget(WidgetMatcherFactory.withId("org.eclipse.ui.help",
				"org.eclipse.eclemma.ui.coverage_preferences_context")));
		bot.button("Cancel").click();

		bot.menu("File").menu("Import...").click();
		bot.shell("Import").activate();
		SWTBotTreeItem treeItem = bot.tree().getTreeItem("Run/Debug").expand();
		treeItem.getNode("Coverage Session").select();
		bot.button("Next >").click();

		assertFont(expected, bot.widget(
				WidgetMatcherFactory.withId("org.eclipse.ui.help", "org.eclipse.eclemma.ui.session_import_context")));

		bot.radio("Agent address:").click();
		bot.button("Next >").click();

		assertFont(expected, bot.widget(
				WidgetMatcherFactory.withId("org.eclipse.ui.help", "org.eclipse.eclemma.ui.session_import_context")));

		bot.button("Cancel").click();
	}

	private static void increaseFontSize() {
		expected = UIThreadRunnable.syncExec(new Result<FontData>() {
			public FontData run() {
				IThemeManager themeManager = PlatformUI.getWorkbench().getThemeManager();
				ITheme currentTheme = themeManager.getCurrentTheme();
				FontRegistry fontRegistry = currentTheme.getFontRegistry();
				Font font = fontRegistry.get(JFaceResources.DIALOG_FONT);
				FontData current = font.getFontData()[0];
				FontData expected = new FontData(current.getName(), current.getHeight() + 2, current.getStyle());
				fontRegistry.put(JFaceResources.DIALOG_FONT, new FontData[] { expected });
				return expected;
			}
		});
	}

	private static void assertFont(final FontData expected, final Widget parentWidget) {
		for (Control widget : bot.widgets(CoreMatchers.any(Control.class), parentWidget)) {
			FontData actual = getFontData(widget);
			assertEquals(SWTUtils.toString(widget) + " font", expected, actual);
		}
	}

	private static FontData getFontData(final Control widget) {
		return UIThreadRunnable.syncExec(new Result<FontData>() {
			public FontData run() {
				return widget.getFont().getFontData()[0];
			}
		});
	}

}
