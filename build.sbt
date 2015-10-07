
organization := "com.ebook"

name := """library"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "net.codingwell" %% "scala-guice" % "4.0.0",
  "org.scalatestplus" %% "play" % "1.4.0-M2" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.12" % "test",
  ws,
  filters
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
