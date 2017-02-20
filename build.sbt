name := "GRID-Reactive"

version := "1.0"

scalaVersion := "2.11.8"

val playVersion = "2.5.12"

libraryDependencies += "com.typesafe.play" %% "play-json" % playVersion

libraryDependencies += "ai.x" %% "play-json-extensions" % "0.8.0"

libraryDependencies += "org.skinny-framework" %% "skinny-http-client" % "2.3.5"

libraryDependencies += "com.typesafe" % "config" % "1.3.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"