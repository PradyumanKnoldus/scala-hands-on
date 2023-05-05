package com.knoldus
package scala99.Arithmetic

import scala99.Arithmetic.IsPrime.isPrime

object GoldbachConjecture extends App {
  implicit class Goldbach(number: Int) {
    def goldbach: Option[(Int, Int)] = {
      val primeNumber = (2 to number).filter(isPrime).toList
      primeNumber.flatMap { firstNumber =>
        val secondNumber = number - firstNumber
        if (primeNumber.contains(secondNumber)) Some((firstNumber, secondNumber)) else None
      }
    }.headOption
  }

  println(28.goldbach)
}
