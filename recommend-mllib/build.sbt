
name := """recommend-mllib"""

version := "1.0-SNAPSHOT"

scalaHome := Some(file("/opt/scala"))
scalaVersion := "2.11.8"

resolvers += "Red Hat Tech Preview" at "http://maven.repository.redhat.com/techpreview/all/"


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.0" % "provided",
  "org.apache.spark" % "spark-mllib_2.11" % "2.1.0" % "provided",
  "org.infinispan" % "infinispan-spark_2.11" % "0.4",
  "com.github.scopt" % "scopt_2.11" % "3.5.0",
  "org.specs2" % "specs2-core_2.11" % "3.8.6"  % "test",
  "org.scalatest" % "scalatest_2.11" % "3.0.0"  % "test",
  "org.specs2" % "specs2-junit_2.11" % "3.8.6"  % "test"
)
