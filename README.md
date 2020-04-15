# fpga-toolchain-experiment
An initial investigation into a viable FPGA development toolchain.

The scope of this investigation is:

* To determine whether Spinal-HDL can be used with Maven, not SBT (as Maven is the defacto standard, and I greatly prefer it); 
    * It requires a scalac compiler plugin. When attempting to run the CounterMain program after a 'straight' maven
    compilation, Spinal failed with 'dslScope stack is not empty'; Spinal-HDL 1.4.0 release notes and a search on Gitter
    suggested the sbt plugin is required. (At this point, I thought it MUST need sbt...) 
    * Instructions on how to use SpinalHDL only mention SBT.
    * Got it working fine with SBT, but want to use Maven.
    * Tried to use https://sbt-compiler-maven-plugin.github.io/sbt-compiler-maven-plugin/1.0.0/sbt-compiler-maven-plugin/compile-mojo.html
    to use the sbt compiler directly from maven, specifying the Spinal compiler plugin. This did not work - this maven
    plugin might only support very old versions of sbt. 0.13, 0.14 not the more recent 1.3.3 that SpinalHDL uses.
    * Noticed that the scala-maven-plugin supports the addition of a scalac plugin. Tried to use the 'SBT' plugin, and
    it generated code that ran successfully to produce VHDL. Yes! I no longer have to endure the 'blinding pain' of sbt!

* Develop maven plugins to make developing VHDL via Spinal HDL with Maven easier, as necessary?

* To see if Spinal-HDL can output VHDL suitable for use with Lattice Diamond for the Mach XO2 board.

* How to simulate designs built in Spinal-HDL.

* How to test designs built in Spinal-HDL, via Maven Surefire/JUnit 5, develop DSLs to assist as necessary.

Example counter code taken from SpinalHDL's workshop - https://github.com/SpinalHDL/SpinalWorkshop/tree/workshop/src/main/scala/workshop/counter
