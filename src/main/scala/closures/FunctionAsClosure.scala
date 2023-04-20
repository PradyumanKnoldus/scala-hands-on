package com.knoldus
package closures

// Passing function as CLOSURE
object FunctionAsClosure extends App {
  val number = 5

  private val incrementByFive = (userInput: Int) => userInput + number

  val result = numberAdder(number, incrementByFive)

  def numberAdder(value: Int, function: Int => Int): Int = {
    function(value)
  }

  println(result)
}
