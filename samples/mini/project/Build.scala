import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "mini"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "EPFL" % "play-js-validation_2.10.0-virtualized-SNAPSHOT" % "0.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
      resolvers += Resolver.url("ivy-local", url("file:///home/namin/.ivy2/local"))(Resolver.ivyStylePatterns),
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xexperimental", "-Yvirtualize")
    )

}