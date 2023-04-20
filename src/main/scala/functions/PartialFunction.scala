package com.knoldus
package functions

object PartialFunction extends App {
  val divide: PartialFunction[(Int, Int), Int] = {
    case (x, y) if y != 0 => x / y
  }

  println(divide(10, 5))
//  println(divide(10, 0))

}
