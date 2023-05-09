package com.knoldus
package scala99

import scala.annotation.tailrec
import scala.util.Random

object RandomDifferentNumbers extends App {

  def differentRandomNumbers(numberOfElements: Int, generateNumberUpto: Int): List[Int] = {
    @tailrec
    def numberGenerator(numberOfElements: Int, outputSet: List[Int]): Set[Int] = {
      if (numberOfElements <= 0) outputSet.toSet
      else numberGenerator(numberOfElements - 1, Random.nextInt(generateNumberUpto) :: outputSet)
    }
    numberGenerator(numberOfElements, Nil)
  }.toList

  println(differentRandomNumbers(6, 49))
}