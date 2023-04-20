package com.knoldus
package functions

object PartiallyAppliedFunction extends App {
  def multiplyNumbers(firstNumber: Int, secondNumber: Int): Int = {
    firstNumber * secondNumber
  }

  val partiallyApplied = multiplyNumbers(11, _) // Partially Applied Function
  val result = partiallyApplied(11)

  println(result)
}
