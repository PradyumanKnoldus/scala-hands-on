package com.knoldus
package scala99

object PackConsecutiveDuplicates extends App {
  val inputList = List("a","a","a","a","b","c","c","a","a","d","e","e","e","e")

  def packConsecutiveDuplicates[T](inputList: List[T]): List[List[T]] = {
    inputList match {
      case Nil => Nil
      case firstElement :: remainingList =>
        val (consecutive , remaining) = remainingList.span(_ == firstElement)
        (firstElement :: consecutive ) :: packConsecutiveDuplicates(remaining)
    }
  }

  println(packConsecutiveDuplicates(inputList))
}
