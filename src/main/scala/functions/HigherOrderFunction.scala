package com.knoldus
package functions

import functions.AnonymousFunction.addNumbers

object HigherOrderFunction extends App {

  // HOF that takes a function as an argument
  def adder(firstNumber: Int, secondNumber: Int, function: (Int, Int) => Int): Int = {
    function(firstNumber, secondNumber)
  }

  val result = adder(10,20, addNumbers)

  println(result)

  // HOF that returns a function
  def add(firstNumber: Int): Int => Int = {
    (secondNumber: Int) => firstNumber + secondNumber
  }

  val addFive = add(5)
  val addedNumber = addFive(5)

  println(addedNumber)


}
