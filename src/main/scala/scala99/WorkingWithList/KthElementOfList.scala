package com.knoldus
package scala99

import scala.annotation.tailrec

object KthElementOfList extends App {

 val list = List(8,3,4,1,2)

// val position = 2
// val kthElement = list(position)
// println(kthElement)
@tailrec
def kthElementOfList[T](list: List[T], position: Int, count: Int = 0): T = {
 if (count == position - 1) list(count)
 else kthElementOfList(list , position , count + 1)
  }

 println(kthElementOfList(list , 2 ))
}
