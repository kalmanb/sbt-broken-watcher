name := "watcher"

scalaVersion := "2.11.2"

// If this line is uncommented watching does not
// work on the sub project. Comment this line 
// and is works
// eg. ~sub/compile
lazy val root = project in file(".")

lazy val sub = project in file("sub")








