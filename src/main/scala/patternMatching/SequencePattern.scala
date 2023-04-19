package com.knoldus
package patternMatching

// Example of SEQUENCE PATTERN
object SequencePattern extends App {
  def listElementsMatch[T](myList: List[T]): String = {
    myList match {
      case List(1, 2, 3, _*) => "The list starts with 1, 2, 3"
      case List(_, 2, _*) => "The list contains 2 in the second position"
      case _ => "The list doesn't match any pattern"
    }
  }

  private val myList: List[Int] = List(1, 2, 3, 4, 5)
  private val result = listElementsMatch(myList)

  println(result)

}
