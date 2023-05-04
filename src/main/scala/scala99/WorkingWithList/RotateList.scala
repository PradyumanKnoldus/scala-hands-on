package com.knoldus
package scala99

object RotateList extends App {

  val inputList = List("a", "b", "c", "d", "e", "f", "g", "h")

  def rotateListAtAPoint[T](inputList: List[T], rotationIndex: Int): List[T] = {
    val splittingPoint = if (rotationIndex < 0) inputList.length + rotationIndex else rotationIndex

    val (firstPart , secondPart) = inputList.splitAt(splittingPoint)

    secondPart ::: firstPart
  }

  println(rotateListAtAPoint(inputList, 4))
}
