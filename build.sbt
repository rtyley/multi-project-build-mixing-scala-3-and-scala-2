lazy val root = (project in file("."))
  .aggregate(legacy, appServer)

lazy val legacy = (project in file("legacy"))
  .settings(
    scalaVersion := "2.13.10"
  )

lazy val appServer = (project in file("app-server"))
  .dependsOn(legacy) // https://docs.scala-lang.org/scala3/guides/migration/compatibility-classpath.html#the-scala-3-unpickler
  .settings(
    scalaVersion := "3.2.1"
  )
