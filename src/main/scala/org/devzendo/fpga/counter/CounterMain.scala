package org.devzendo.fpga.counter


import spinal.core._

//Run this main to generate the RTL
object CounterMain{
  def main(args: Array[String]) {
    SpinalConfig(targetDirectory = "target").generateVhdl(Counter(width = 4))
  }
}
