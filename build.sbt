ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "scala-temp-lesson"
  )

lazy val akkaVersion = "2.7.0"
lazy val leveldbVersion = "0.7"
lazy val leveldbjniVersion = "1.8"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "dev.zio" %% "zio-kafka"         % "2.3.1"
libraryDependencies += "dev.zio" %% "zio-kafka-testkit" % "2.3.1" % Test