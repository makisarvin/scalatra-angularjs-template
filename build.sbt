name := "scalatra-angular-template"

version := "1.0"

scalaVersion := "2.10.0"

val scalatraVersion = "2.2.1"

val scalatraAuth = "org.scalatra" %% "scalatra-auth" % scalatraVersion
val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion
val scalatraScalate = "org.scalatra" %% "scalatra-scalate" % scalatraVersion
val scalatraSpecs2 = "org.scalatra" %% "scalatra-specs2" % scalatraVersion % "test"
val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime"
val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "container"
val jettyOrbit = "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))


lazy val root =
        project.in( file(".") )
   .aggregate(common, domain, webapp)

lazy val common = (
	Project("common", file("common"))
)

lazy val domain = (
	Project("domain", file("domain"))
	dependsOn(common)
)

lazy val webapp = (
	Project("website", file("website"))
	dependsOn(domain)
	settings(
		libraryDependencies ++= Seq(
			scalatraAuth,
			scalatra,
			scalatraScalate,
			scalatraSpecs2,
			logbackClassic,
			jettyWebapp,
			jettyOrbit
		)
	)
	settings(webSettings : _*)
	settings(scalateSettings : _*)
)

