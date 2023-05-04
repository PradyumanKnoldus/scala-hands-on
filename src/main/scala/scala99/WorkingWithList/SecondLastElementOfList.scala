package com.knoldus
package scala99

object SecondLastElementOfList extends App {

  val list = List(5,7,9,2,1)

  def secondLastElementOfList[T](list: List[T]): List[T] = {
    val secondLastElement = list match {
      case Nil => Nil
      case firstElement:: _ :: Nil => firstElement :: Nil
      case _ :: remainingList => secondLastElementOfList(remainingList)
    }
    secondLastElement
  }

  println(secondLastElementOfList(list))
}
