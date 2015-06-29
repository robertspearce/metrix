enablePlugins(ScalaJSPlugin)

name := "metrix"

scalaVersion := "2.11.6"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true
persistLauncher in Test := false