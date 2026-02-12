ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "scala-temp-lesson"
  )

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

libraryDependencies += "dev.zio" %% "zio-kafka"         % "2.3.1"
libraryDependencies += "dev.zio" %% "zio-kafka-testkit" % "2.3.1" % Test