import Dependencies._


name := "amanita"

version := "0.1"

scalaVersion := "2.12.7"



lazy val core = project.in(file("core"))
  .settings(
    libraryDependencies ++= Seq(
      "org.graalvm.truffle" % "truffle-api" % Versions.truffleVersion,
      "org.graalvm.truffle" % "truffle-dsl-processor" % Versions.truffleVersion % "provided",
    )
  )