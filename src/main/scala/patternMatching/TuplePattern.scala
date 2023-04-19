package com.knoldus
package patternMatching

// Example of TUPLE PATTERN
object TuplePattern extends App {
  def tupleElementMatch[T, A, B](nyTuple: (T, A, B)): String = {
    myTuple match {
      case (number: Int, string: String, flag: Boolean) => s"The tuple contains an Int ($number), a String ($string), and a Boolean ($flag)"
      case _ => "The tuple doesn't match any pattern"
    }
  }

  private val myTuple = (42, "Hello", true)
  private val result = tupleElementMatch(myTuple)

  println(result)
}
