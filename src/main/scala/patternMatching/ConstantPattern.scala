package com.knoldus
package patternMatching

// Example of Constant Pattern
// Constant patterns are often used in conjunction with case classes to match specific values of those classes
object ConstantPattern extends App {
  def matchNumber(input: Int): String = {
    input match {
      case 0 => "This is zero"
      case 1 => "This is one"
      case 42 => "This is forty-two"
      case _ => "This is something else"
    }
  }

  private val userInput = 42
  private val result = matchNumber(userInput)

  println(result)
}
