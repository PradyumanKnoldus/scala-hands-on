package com.knoldus
package scala99.Arithmetic

import IsPrime._

object PrimeNumbersInRange extends App {

  def listPrimesInRange(range: Range): List[Int] = {
    range.filter(isPrime).toList
  }

  println(listPrimesInRange(7 to 31))
}
