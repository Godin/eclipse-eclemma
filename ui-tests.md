TODO
* tests require fix for Eclipse 4.18 - 4.20
* capture screenshots

----

On Linux
for Eclipse 4.17 - 4.28

MenuTest fails with

```
org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException: The widget was null.
```

See
https://wiki.eclipse.org/SWTBot/Troubleshooting
https://www.eclipse.org/forums/index.php/t/153699/
https://github.com/eclipse/xtext/blob/346e1f7199b5a1f3a91a9bdfdbd32a46c99390ad/org.eclipse.xtend.ide.swtbot.tests/swtbot/src/org/eclipse/xtend/ide/tests/AbstractSwtBotTest.java#L34-L39
https://github.com/eclipse/buildship/blob/942a601b12e2da706ad3bbcbf3950cc29b5c86ab/org.eclipse.buildship.gradleprop.test/src/main/java/org/eclipse/buildship/gradleprop/test/SwtSpecification.java#L52-L59

and passes when CoverageViewTest disabled

----

On macOS
MenuTest fails every time CoverageViewTest fails

also

```
org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException: Could not find menu bar for shell: Shell with text {No Coverage Data}
	at org.eclipse.eclemma.ui.MenuTest.labels_should_be_consistent(MenuTest.java:40)
Caused by: org.eclipse.swtbot.swt.finder.widgets.TimeoutException: Timeout after: 10000 ms.: Could not find menu bar for shell: Shell with text {No Coverage Data}
	at org.eclipse.eclemma.ui.MenuTest.labels_should_be_consistent(MenuTest.java:40)
```

last one seems to be gone when DumpExecutionDataTest disabled
