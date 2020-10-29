/*
import sbt._
import Keys._
import play.core.Build
import play.sbt._
object ProjectDependencies {
  val db = RootProject(file("/home/kapil/workspace/sbt-scala/db"))
}

object ProjectBuild extends Build {
  import ProjectDependencies._
  libraryDependencies ++= Seq("com.typesafe.play" %% "play" % "2.8.2",PlayImport.guice)
  name := "ui"
  version := "0.1"
  scalaVersion := "2.12.4"
  organization := "com.sbt.scala.lab"
  lazy val root = Project(id = "ui", base = file(".")).dependsOn(db)
}*/
