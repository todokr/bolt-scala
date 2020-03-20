import Dependencies._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.github.todokr"

lazy val root = (project in file("."))
  .settings(
    name := "bolt-scala",
    libraryDependencies ++= Seq(
      "com.slack.api" % "bolt-jetty" % "1.0.1",
      scalaTest % Test
    )
  )
  .enablePlugins(JavaServerAppPackaging)
