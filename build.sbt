name := """hailApi"""
organization := "com.hail"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "org.hibernate" % "hibernate-core" % "5.2.5.Final",
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  "mysql" % "mysql-connector-java" % "5.1.12"
)

PlayKeys.externalizeResources := false