package com.knoldus
package scala99

import scala.util.Random

object RandomPermutation extends App {
  val inputList = List("a", "b", "c", "d", "e", "f", "g", "h")

  def randomPermutation[T](inputList: List[T]): List[T] = {
    Random.shuffle(inputList)
  }

  println(randomPermutation(inputList))

}
