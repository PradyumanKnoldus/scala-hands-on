package com.knoldus
package scala99

import scala.annotation.tailrec

object NoOfElements extends App {

  val list = List(1,2,3,4,5)

//  val lengthOfList = list.length
//  println(lengthOfList)

  @tailrec
  def listLength[T](list: List[T], count: Int = 0): Int = {
    if (count == list.length) count
    else listLength(list , count + 1)
  }

  println(listLength(list))

}
