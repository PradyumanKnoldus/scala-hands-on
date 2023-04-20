package com.knoldus
package functions

import functions.AnonymousFunction.addNumbers

object HigherOrderFunction extends App {
  def adder(firstNumber: Int, secondNumber: Int, function: (Int, Int) => Int): Int = {
    function(firstNumber, secondNumber)
  }

  val result = adder(10,20, addNumbers)

  println(result)
}
