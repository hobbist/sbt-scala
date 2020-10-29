organization := "com.sbt.scala.lab"
lazy val settings = Seq(name := "sbt-scala" , version := "0.1" , scalaVersion := "2.12.4" )
lazy val root = (project in file(".")).aggregate(ui, http,techgig)
lazy val ui = (project in file("ui"))
lazy val http = (project in file("http"))
lazy val techgig = (project in file("techgig"))