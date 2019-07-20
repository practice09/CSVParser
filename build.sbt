name := "CSVParser"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies += ("org.scalactic" %% "scalactic" % "3.0.8")
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies++=Seq(
  "org.apache.spark"%"spark-core_2.10"%"1.6.0",
  "org.apache.spark"%"spark-sql_2.10"%"1.6.0"
)

libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.0"


