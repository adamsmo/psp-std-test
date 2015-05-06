name := "untitled2"

version := "1.0"

resolvers +=  "bintray/paulp" at "https://dl.bintray.com/paulp/maven"

libraryDependencies +=  "org.improving" %% "psp-std" % "0.5.5"

scalacOptions ++=  Seq("-Yno-imports")

scalaVersion := "2.11.6"

initialCommands in console :=  "import psp._, std._, api._, StdEq._, StdShow._"