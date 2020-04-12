package org.devzendo.fpga.counter

// This code from https://github.com/SpinalHDL/SpinalWorkshop/blob/workshop/src/main/scala/workshop/counter/assets/Counter.solution

import spinal.core._

case class Counter(width: Int) extends Component {
  val io = new Bundle {
    val clear    = in  Bool
    val value    = out UInt(width bits)
    val full     = out Bool
  }

  val counter = Reg(UInt(width bits)) init(0)
  counter := counter + 1
  when(io.clear) {
    counter := 0
  }

  io.value := counter
  io.full  := counter === U(counter.range -> true)
}