name := "ui"
version := "0.1"
scalaVersion := "2.12.4"
organization := "com.sbt.scala.lab"
lazy val ui = (project in file(".")).enablePlugins(PlayScala)
libraryDependencies ++= Seq("com.typesafe.play" %% "play" % "2.8.2",guice)
