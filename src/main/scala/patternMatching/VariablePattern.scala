package com.knoldus
package patternMatching

// Example of VARIABLE PATTERN
object VariablePattern extends App {
  def oddOrEven(userInput: Int): String = {
    userInput match {
      case i: Int if i % 2 == 0 => s"$i is an even number"
      case i: Int if i % 2 == 1 => s"$i is an odd number"
      case i: Int if i == 0 => s"It is $i"
      case _ => "This is not an integer"
    }
  }

  private val userInput = 24
  private val result = oddOrEven(userInput)

  println(result)
}
