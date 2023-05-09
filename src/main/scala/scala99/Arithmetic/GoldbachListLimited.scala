package com.knoldus
package scala99.Arithmetic

import GoldbachConjecture.Goldbach

object GoldbachListLimited extends App {

  def printGoldbachListLimited(range: Range, limit: Int): List[String] = {
    val evenNumbers = range.filter(_ % 2 == 0).toList

    val goldbachOfEach = evenNumbers.flatMap(element => element.goldbach)
    val aboveLimit = goldbachOfEach.filter(element => (element._1 > limit) && (element._2 > limit))

    aboveLimit.map { element =>
      val firstNumber = element._1
      val secondNumber = element._2
      val sum = firstNumber + secondNumber

      s"\n$sum = $firstNumber + $secondNumber"
    }
  }

  println(printGoldbachListLimited(1 to 2000, 50))
}
