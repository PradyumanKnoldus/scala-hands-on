package com.knoldus
package scala99

object LastElementOfList extends App {

  val list = List(4,2,6,2,8)

  //val lastElement = list.reverse.head
  //println(lastElement

  def lastElementOfList[T](list: List[T]): List[T] = {
    val lastElement = list match {
      case Nil => Nil
      case firstElement :: Nil => firstElement :: Nil
      case _ :: remainingList => lastElementOfList(remainingList)
    }
    lastElement
  }
  println(lastElementOfList(list))

}
