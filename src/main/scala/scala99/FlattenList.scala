package com.knoldus
package scala99

object FlattenList extends App {

  val nestedList = List(List(5,6), List(8,3), List(9,1), List(2,7))

  def flattenList[T](list: List[List[T]]): List[T] = {
    list.flatten
  }

  println(flattenList(nestedList))
}
