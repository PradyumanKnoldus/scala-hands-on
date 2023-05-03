package com.knoldus
package scala99

import scala.util.Random

object RandomSelectElement extends App {
  val inputList = List("a","b","c","d","e","f","g","h")

  def randomSelectElement[T](numberOfElements: Int, inputList: List[T]): List[T] = {
    Random.shuffle(inputList).take(numberOfElements)
  }

  println(randomSelectElement(3,inputList))

}
