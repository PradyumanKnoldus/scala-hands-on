package com.knoldus
package assignments.liveCoding

//Add a given element in list at given index
object Exercise2 extends App {
  def addAtIndex[A](inputList: List[A], element: A, index: Int): Either[String, List[A]] = {
    if (index < 0 || index > inputList.length) {
      Left("Invalid Index!")
    } else {
      val (firstHalf, secondHalf) = inputList.splitAt(index)
      Right(firstHalf ::: element :: secondHalf)
    }
  }

  println(addAtIndex(List(1, 2, 3, 4, 5), 99, 2))
}
