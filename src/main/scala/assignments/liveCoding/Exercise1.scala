package com.knoldus
package assignments.liveCoding

// List(1,2,3,4,5)
// input: list, 2
// output : (List(1,2,4,5),3)
object Exercise1 extends App {
  def removeElement[T](inputList: List[T], index: Int): Either[String, (List[T], T)] = {

    if (index < 0 || index >= inputList.length)
      Left("Invalid Index")
    else {
      val removedElement = inputList(index)
      val newList = inputList.filterNot(_ == inputList(index))
      Right((newList, removedElement))
    }
  }

  println(removeElement(List(1, 2, 3, 4, 5), 3))

  //-------------------------------------------------------------------------------------

  def removeFromIndex[A](inputList: List[A], index: Int): Either[String, (List[A], A)] = {
    if (index < 0 || index >= inputList.length) {
      Left("Invalid Index !")
    } else {
      val (firstHalf, secondHalf) = inputList.splitAt(index)
      secondHalf match {
        case Nil => Left("List is Empty!")
        case head :: tail => Right((firstHalf ::: tail, head))
      }
    }
  }

  println(removeFromIndex(List("A", "B", "C", "D", "E"), 3))
}
