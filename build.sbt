import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "aws-luminary"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
)



jsDependencies += "org.webjars.npm" % "konva" % "0.11.1" / "konva.js"

bootSnippet := "example.d3.ScalaJSExample().main();"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

skip in packageJSDependencies := false

//persistLauncher in Compile := true
//
//persistLauncher in Test := false
//
//testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "org.singlespaced" %%% "scalajs-d3" % "0.3.1",
  "com.lihaoyi" %%% "upickle" % "0.3.8",
  "com.lihaoyi" %% "upickle" % "0.3.8",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test",
  "com.github.japgolly.scalajs-react" %%% "core" % "0.10.4",
  "com.lihaoyi" %%% "scalatags" % "0.5.4"

)

