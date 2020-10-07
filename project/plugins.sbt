resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe repository mvn" at "https://repo.typesafe.com/typesafe/maven-releases/"

resolvers += "Sbt plugin repor" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.2") // where version is the current Play version, i.e. "2.8.x"