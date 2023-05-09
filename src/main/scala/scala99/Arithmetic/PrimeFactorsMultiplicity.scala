package com.knoldus
package scala99.Arithmetic

import PrimeFactorization._

object PrimeFactorsMultiplicity extends App {

  implicit class PrimeFactorMultiplicity(numbers: Int){
    def primeFactorMultiplicity: List[(Int, Int)] = {
      val primeFactor = numbers.primeFactors
      val groupingSameElements = primeFactor.groupBy(identity)

      println(groupingSameElements)

       groupingSameElements.map(element => (element._1, element._2.length)).toList.reverse
    }
  }

  println(315.primeFactorMultiplicity)
}
