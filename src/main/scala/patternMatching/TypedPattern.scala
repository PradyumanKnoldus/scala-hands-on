package com.knoldus
package patternMatching

// Example of TYPED PATTERN
object TypedPattern extends App {
  def matchType(userInput: Any): String = {
    userInput match {
      case number: Int => s"The value ($number) is an Int "
      case string: String => s"The value ($string) is a String "
      case boolean: Boolean => s"The value ($boolean) is a Boolean "
      case _ => "The value doesn't match any pattern"
    }
  }

  private val myInt = 42
  private val myString = "Hello"
  private val myBoolean = true

  private val result1 = matchType(myInt)
  private val result2 =  matchType(myString)
  private val result3 = matchType(myBoolean)

  println(result1)
  println(result2)
  println(result3)
}
