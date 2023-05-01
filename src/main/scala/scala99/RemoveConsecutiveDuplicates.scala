package com.knoldus
package scala99

object RemoveConsecutiveDuplicates extends App {
  val list = List(1,1,1,2,2,2,3,5,7,11,13,3,3,3,14,15,14,15,15,16)

  def removeConsecutiveDuplicates[T](inputList: List[T]): List[T] = {
    inputList match {
      case Nil => Nil
      case firstElement :: Nil => List(firstElement)
      case firstElement :: remainingList => List(firstElement) :::
        removeConsecutiveDuplicates(remainingList.dropWhile(_ == firstElement))
    }
  }

  println(removeConsecutiveDuplicates(list))
}
