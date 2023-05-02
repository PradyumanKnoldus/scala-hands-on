package com.knoldus
package scala99

object DuplicateElements extends App {
  val inputList = List("a", "b", "c", "d", "e")

  def duplicateElements[T](inputList: List[T]): List[T] = {
    inputList match {
      case Nil => Nil
      case firstElement :: remainingList => firstElement :: firstElement :: duplicateElements(remainingList)
    }
  }

  def duplicateElementsNTimes[T](inputList: List[T], times: Int): List[T] = {
    def duplicateHelper(element: T, times: Int): List[T] = {
      if (times == 0) {
        Nil
      } else {
        element :: duplicateHelper(element, times - 1)
      }
    }

    inputList match {
      case Nil => Nil
      case firstElement :: remainingList =>
        duplicateHelper(firstElement, times) ::: duplicateElementsNTimes(remainingList, times)
    }
  }

  println(duplicateElements(inputList))

  println(duplicateElementsNTimes(inputList, 5))
}
