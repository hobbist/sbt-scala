name := "sbt-scala"

version := "0.1"

scalaVersion := "2.12.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
libraryDependencies ++= Seq("com.typesafe.play" %% "play" % "2.8.2")
libraryDependencies += guice