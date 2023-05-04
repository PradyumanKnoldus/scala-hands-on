package com.knoldus
package scala99

object InsertElement extends App {
  val inputList = List("a", "b", "c", "d", "e", "f", "g", "h")
  val position = 3

  def insertElementAtAPosition[T](inputList: List[T], position: Int, element: T): List[T] = {
    inputList match {
      case Nil => Nil
      case _ :: _  =>
        val (firstHalf, secondHalf) = inputList.splitAt(position -1)
        firstHalf ::: List(element) ::: secondHalf
    }
  }

  println(insertElementAtAPosition(inputList, position, "z"))
}
