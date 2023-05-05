package com.knoldus
package scala99.Arithmetic

import scala.annotation.tailrec

object PrimeFactors extends App {

  implicit class IntWithPrimeFactors(number: Int) {
    def primeFactors: List[Int] = {
      @tailrec
      def primeFactorsHelper(number: Int, factor: Int, factors: List[Int]): List[Int] = {
        if (number == 1) factors
        else if (number % factor == 0) primeFactorsHelper(number / factor, factor, factor :: factors)
        else primeFactorsHelper(number, factor + 1, factors)
      }

      primeFactorsHelper(number, 2, Nil).reverse
    }
  }

  println(315.primeFactors)
}
