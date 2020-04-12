# fpga-toolchain-experiment
An initial investigation into a viable FPGA development toolchain.

To investigate whether:
* Spinal-HDL can be used with Maven, not SBT (as Maven is the defacto standard, and I greatly prefer it); develop plugins to enable this as necessary.
* No, it cannot, since it requires a compiler plugin that's only for use with SBT. Changed project from Maven to sbt
1.3.3 as that's the version Spinal-HDL uses. When attempting to run the CounterMain program, Spinal failed with
'dslScope stack is not empty'; Spinal-HDL 1.4.0 release notes and a search on Gitter suggested the sbt plugin is
required. 
* Spinal-HDL can output VHDL suitable for use with Lattice Diamond for the Mach XO2 board.
* How to simulate designs built in Spinal-HDL.
* How to test designs built in Spinal-HDL, via Maven Surefire/JUnit 5, develop DSLs to assist as necessary.

Example counter code taken from SpinalHDL's workshop - https://github.com/SpinalHDL/SpinalWorkshop/tree/workshop/src/main/scala/workshop/counter
