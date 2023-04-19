package com.knoldus
package patternMatching

// Example of VARIABLE BINDING
object FindInString extends App {
  def findInString(inputString: String): Boolean = {
    inputString match {
      case _@"Hello World" => true
      case _@"Goodbye, cruel world!" => false
      case _ => false
    }
  }

  private val inputString = "Hello World"
  private val result = findInString(inputString)

  println(result)
}
