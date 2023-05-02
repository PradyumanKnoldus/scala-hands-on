package com.knoldus
package scala99

object RemoveKthElement extends App {
  val inputList = List("a", "b", "c", "d", "e", "f", "g", "h")
  val position = 3

  val result = (inputList.filterNot(_ == inputList(position)), inputList(position))
  println(result)

  def removeKthElement[T](inputList: List[T], position: Int): (List[T], T) = {
    inputList match {
      case _ :: _ =>
        val (firstHalf, secondHalf) = inputList.splitAt(position)
        secondHalf match {
          case firstElement :: remainingList =>
            (firstHalf ::: remainingList, firstElement)
        }
    }
  }

  println(removeKthElement(inputList, position))
}
