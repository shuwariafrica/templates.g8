inThisBuild(
  List(
    scalaVersion := "3.6.3",
    organization := "$organisation$",
    description := "$description$",
    homepage := Some(url("https://github.com/shuwarifrica/$name$")),
    scmInfo := ScmInfo(
      url("https://github.com/shuwariafrica/$name$"),
      "scm:git:https://github.com/shuwariafrica/$name$.git",
      Some("scm:git:git@github.com:shuwariafrica/$name$.git")
    ).some,
    startYear := Some(2025),
    semanticdbEnabled := true
  )
)

lazy val $name;format="snake"$ =
  project
    .in(file("modules/$name;format="snake"$"))
    .settings(Publishing.project)
    .dependsOn(libraries.munit % Test)
    .settings(
      ScalaCompiler.basePackages ++= List("$package$")
    )

lazy val `$name;format="snake"$-root` =
  project
    .in(file("."))
    .shuwariProject
    .internalSoftware
    .notPublished
    .settings(Publishing.aggregate)
    .aggregate($name;format="snake"$)


lazy val libraries = new {
  val munit = "org.scalameta" %% "munit" % "1.1.0"
}
