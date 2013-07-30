name         := "hello-opencv"

version      := "0.1"

scalaVersion :=  "2.10.2"

// TODO let's try to make opencv a managed dependency
//   automate the "localization" of the macports opencv jar and dylib from /opt/local/share/OpenCV/java/ into our local space in the future...
//   http://www.scala-sbt.org/release/docs/Getting-Started/Library-Dependencies.html
//     libraryDependencies += "org.opencv" % "opencv" % "2.4.6"
//     resolvers += Resolver.file("org.opencv", file("/opt/local/share/OpenCV/java")) transactional()
// IN THE MEANTIME, DO:
//   port -n install jpeg
//   port -n install opencv +java +static +eigen +opencl +tbb
//   mkdir ./lib
//   cp /opt/local/share/OpenCV/java/* ./lib/

fork := true

javaOptions in run += "-Djava.library.path=./lib"
