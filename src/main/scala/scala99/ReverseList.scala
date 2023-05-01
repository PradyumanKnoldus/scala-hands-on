package com.knoldus
package scala99

object ReverseList extends App {

  val list = List(1,2,3,4,5)

//  val reverseList = list.reverse
//  println(reverseList)

  def reverseList[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case firstElement :: remainingList => reverseList(remainingList) ::: List(firstElement)
  }

  println(reverseList(list))
}
