## TODOs

----

https://www.eclipse.org/projects/tools/future-releases.php

----

Close

https://bugs.eclipse.org/bugs/show_bug.cgi?id=565292
https://bugs.eclipse.org/bugs/show_bug.cgi?id=581276

----

Missing README, etc

----

`LICENSE` file is not recognized as EPLv2

----

```
The project org.eclipse.eclemma:org.eclipse.eclemma.build:pom:3.1.9-SNAPSHOT uses prerequisites which is only intended for maven-plugin projects but not for non maven-plugin projects.
```

----

```
Parameter 'qualifier' (user property 'buildQualifier') is read-only, must not be used in configuration
```

https://github.com/eclipse-tycho/tycho/issues/2644

----

```
[dcf1fcbb-b12f-440a-ae42-2bb78315ed5d][extension>org.eclipse.tycho:tycho-maven-plugin:3.0.5] No digest algorithm is available to verify download of osgi.bundle,org.eclipse.eclemma.core,3.1.9.202402010846.
```

https://github.com/eclipse-tycho/tycho/issues/2710

----

for Apple M1 need target 2021-12 ?

from IDE seems to work starting from target platform 2021-06

----

Error in console when running UI tests for target platform 2021-09

```
!ENTRY org.eclipse.pde.junit.runtime 4 0 2023-10-26 09:45:39.486
!MESSAGE FrameworkEvent ERROR
!STACK 0
org.osgi.framework.BundleException: Could not resolve module: org.eclipse.pde.junit.runtime [256]
  Unresolved requirement: Require-Bundle: org.eclipse.core.runtime; bundle-version="[3.29.0,4.0.0)"

	at org.eclipse.osgi.container.Module.start(Module.java:463)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.lambda$1(ModuleContainer.java:1834)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.incStartLevel(ModuleContainer.java:1829)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.incStartLevel(ModuleContainer.java:1775)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.doContainerStartLevel(ModuleContainer.java:1739)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.dispatchEvent(ModuleContainer.java:1661)
	at org.eclipse.osgi.container.ModuleContainer$ContainerStartLevel.dispatchEvent(ModuleContainer.java:1)
	at org.eclipse.osgi.framework.eventmgr.EventManager.dispatchEvent(EventManager.java:228)
	at org.eclipse.osgi.framework.eventmgr.EventManager$EventThread.run(EventManager.java:339)
```

and unable to run Plug-in Tests

See https://github.com/openhab/openhab-distro/issues/230#issuecomment-318110364

----

seems that Modular Target created by `EclEmma.setup` doesn't work

```
java.lang.LinkageError: loader constraint violation: loader org.eclipse.osgi.internal.loader.EquinoxClassLoader @336034ed wants to load interface org.hamcrest.Matcher. A different interface with the same name was previously loaded by org.eclipse.osgi.internal.loader.EquinoxClassLoader @d55c4c5. (org.hamcrest.Matcher is in unnamed module of loader org.eclipse.osgi.internal.loader.EquinoxClassLoader @d55c4c5, parent loader 'platform')
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at org.hamcrest.Matchers.equalTo(Matchers.java:326)
	at org.eclipse.swtbot.eclipse.finder.matchers.WithPerspectiveLabel.withPerspectiveLabel(WithPerspectiveLabel.java:62)
	at org.eclipse.swtbot.eclipse.finder.matchers.WidgetMatcherFactory.withPerspectiveLabel(WidgetMatcherFactory.java:115)
	at org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot.perspectiveByLabel(SWTWorkbenchBot.java:111)
	at org.eclipse.eclemma.ui.MenuTest.labels_should_be_consistent(MenuTest.java:68)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)
	at org.eclipse.pde.internal.junit.runtime.RemotePluginTestRunner.main(RemotePluginTestRunner.java:74)
	at org.eclipse.pde.internal.junit.runtime.PlatformUITestHarness.lambda$0(PlatformUITestHarness.java:45)
	at java.base/java.lang.Thread.run(Thread.java:829)

java.lang.LinkageError: loader constraint violation: loader org.eclipse.osgi.internal.loader.EquinoxClassLoader @336034ed wants to load interface org.hamcrest.Matcher. A different interface with the same name was previously loaded by org.eclipse.osgi.internal.loader.EquinoxClassLoader @d55c4c5. (org.hamcrest.Matcher is in unnamed module of loader org.eclipse.osgi.internal.loader.EquinoxClassLoader @d55c4c5, parent loader 'platform')
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1017)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.defineClass(ModuleClassLoader.java:283)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.defineClass(ClasspathManager.java:716)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findClassImpl(ClasspathManager.java:639)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:607)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClassImpl(ClasspathManager.java:587)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:566)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:475)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at org.hamcrest.Matchers.anything(Matchers.java:228)
	at org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot.editors(SWTWorkbenchBot.java:280)
	at org.eclipse.swtbot.eclipse.finder.DefaultWorkbench.saveAllEditors(DefaultWorkbench.java:79)
	at org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot.saveAllEditors(SWTWorkbenchBot.java:428)
	at org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot.resetWorkbench(SWTWorkbenchBot.java:401)
	at org.eclipse.eclemma.ui.MenuTest.resetWorkbench(MenuTest.java:39)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.RunAfters.invokeMethod(RunAfters.java:46)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:33)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)
	at org.eclipse.pde.internal.junit.runtime.RemotePluginTestRunner.main(RemotePluginTestRunner.java:74)
	at org.eclipse.pde.internal.junit.runtime.PlatformUITestHarness.lambda$0(PlatformUITestHarness.java:45)
	at java.base/java.lang.Thread.run(Thread.java:829)
```

----

After Oomph setup can't immediately edit `EclEmma.setup`.

----

When Taglet fails on first setup can't correct problem directly from IDEA because project isn't imported.
