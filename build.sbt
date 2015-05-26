name := """minimal-scala"""

version := "1.0"

scalaVersion := "2.11.6"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

lazy val root = (project in file("."))
  .dependsOn(someGitRepo2)

val someGitHash = "4fb84452a88a49fe0c31db118f0114cefbf2cc2e"

lazy val someGitRepo2 = RootProject(uri(s"ssh://git@github.com/mavilein/minimal-scala-2.git#$someGitHash"))