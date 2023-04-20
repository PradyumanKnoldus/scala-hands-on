package com.knoldus
package functions

object CurriedFunction extends App {
  def addTwoNumbers(firstNumber: Int)(secondNumber: Int): Int = {
    firstNumber + secondNumber
  }

  val firstStep = addTwoNumbers(10)(_)
  val result = firstStep(20)

  println(result)

}
