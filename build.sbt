val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    // Fork the running process in its own JVM and give it some more memory:
    // https://www.scala-sbt.org/1.x/docs/Forking.html
    fork := true,
    run / javaOptions += "-Xmx8G",
    outputStrategy := Some(StdoutOutput),
    run / connectInput := true,
  )

// To build a runnable package with bundled Java 11, run Metals with Java 11 and enable the following:
// enablePlugins(JlinkPlugin)
// jlinkIgnoreMissingDependency := JlinkIgnore.everything
// jlinkModules += "jdk.unsupported"
