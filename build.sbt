name := "fpga-toolchain-experiment"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.12.11"
val spinalVersion = "1.4.0"

libraryDependencies ++= Seq(
  "com.github.spinalhdl" % "spinalhdl-core_2.12" % spinalVersion,
  "com.github.spinalhdl" % "spinalhdl-lib_2.12" % spinalVersion,
  compilerPlugin("com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.12" % spinalVersion)
)

fork := true
