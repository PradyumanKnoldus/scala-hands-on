package com.knoldus
package functions

import scala.annotation.tailrec

object RecursiveFunction extends App {

  // ---------------------------------------------------------------------------------
  def factorial(number: Int): BigInt = {
    @tailrec
    def factorialHelper(number: Int, accumulator: BigInt = 1): BigInt = {
      if (number == 1) accumulator
      else factorialHelper(number - 1 , number * accumulator)
    }
    factorialHelper(number)
  }

  val factorialResult = factorial(5)

  println(factorialResult)

  // ---------------------------------------------------------------------------------

  def fibonacciNumber(position: Int): Int = {
    @tailrec
    def fibanacciHelper(position: Int, nextToLastElement: Int = 0, lastElement: Int = 1): Int = {
      if (position == 0) nextToLastElement
      else if (position == 1) lastElement
      else fibanacciHelper(position - 1, lastElement, lastElement + nextToLastElement)
    }

    fibanacciHelper(position)
  }

  val fibonacciResult = fibonacciNumber(8)

  println(fibonacciResult)

}
