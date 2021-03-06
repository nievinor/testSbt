name := "testSbt"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13"

libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.12.1"

//retrieveManaged := true

mainClass in assembly := Some("Main")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}