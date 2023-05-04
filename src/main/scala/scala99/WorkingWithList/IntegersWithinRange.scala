package com.knoldus
package scala99

import scala.annotation.tailrec

object IntegersWithinRange extends App {

  def integersWithinRange(range: (Int, Int)): List[Int] = {
    (range._1 to range._2).toList
  }

  println(integersWithinRange(1,10))

  //-----------------------------------------------------------------------------

  def integerWithinRange(range: (Int, Int)): List[Int] = {
    @tailrec
    def helper(from: Int, to: Int, outputList: List[Int]): List[Int] = {
      if (to <= from) {
        outputList
      } else {
        helper(from + 1, to, from :: outputList)
      }
    }
    helper(range._1, range._2 + 1, Nil).reverse
  }

  println(integerWithinRange((2,9)))
}
