ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-hands-on",
    idePackagePrefix := Some("com.knoldus")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "2.0.5",
  "ch.qos.logback" % "logback-classic" % "1.4.6"
)
