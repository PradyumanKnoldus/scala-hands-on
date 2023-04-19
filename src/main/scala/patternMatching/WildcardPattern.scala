package com.knoldus
package patternMatching

// Example of WILDCARD PATTERN
// It is used to make pattern matching exhaustive i.e if no case matched then it will act as a default case
object WildcardPattern extends App {
  def matchType[T](input: T): String = {
    input match {
      case _: Int => "This is an Int"
      case _: String => "This is a String"
      case _ => "This is something else"      // This is Wildcard
    }
  }

  private val userInput = "Hello"
  val result = matchType(userInput)

  println(result)
}
