name := "Caronas_Inteligentes"

version := "1.0-SNAPSHOT"

libraryDependencies += javaEbean



libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.18"
)     

ebeanEnabled := true

play.Project.playJavaSettings
