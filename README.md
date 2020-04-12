# fpga-toolchain-experiment
An initial investigation into a viable FPGA development toolchain.

To investigate whether:
* Spinal-HDL can be used with Maven, not SBT (as Maven is the defacto standard, and I greatly prefer it); develop plugins to enable this as necessary.
* Spinal-HDL can output VHDL suitable for use with Lattice Diamond for the Mach XO2 board.
* How to simulate designs built in Spinal-HDL.
* How to test designs built in Spinal-HDL, via Maven Surefire/JUnit 5, develop DSLs to assist as necessary.
