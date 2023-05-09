package com.knoldus
package scala99.Arithmetic

import GoldbachConjecture.Goldbach

object GoldbachList extends App {

  def printGoldbachList(range: Range): List[String] = {
    val evenNumbers = range.filter( _ % 2 == 0).toList

    val goldbachOfEach = evenNumbers.flatMap( element => element.goldbach)

    goldbachOfEach.map{element =>
      val firstNumber = element._1
      val secondNumber = element._2
      val sum = firstNumber + secondNumber

      s"\n$sum = $firstNumber + $secondNumber"
    }
  }

  println(printGoldbachList(9 to 20))
}
