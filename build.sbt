scalaVersion := "3.6.3"

name := "templates.g8"

// Libraries used in the template project. Copied here to allow
// Scala Steward updates.
addSbtPlugin("africa.shuwari.sbt" % "sbt-shuwari" % "0.13.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.0")
addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.1.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.12.2")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")

lazy val libraries = new {
  val munit = "org.scalameta" %% "munit" % "1.1.0"
}

libraryDependencies ++= Seq(
  libraries.munit % Test
)