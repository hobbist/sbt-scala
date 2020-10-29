name := "http"
version := "0.1"
scalaVersion := "2.12.4"
organization := "com.sbt.scala.lab"
val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.1"
val db = ProjectRef(base =file("/home/kapil/workspace/sbt-scala/db"),id = "db" )
lazy val http = (project in file(".")).dependsOn(db).aggregate(db)
libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-stream" % AkkaVersion, "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion, "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion)
