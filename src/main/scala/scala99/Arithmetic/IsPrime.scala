package com.knoldus
package scala99.Arithmetic

object IsPrime extends App {

  def isPrime(integer: Int): Boolean = {
    integer match {
      case number if number <= 1 => false
      case 2 => true
      case _ => val range = (2 until integer)
        !range.exists(number => integer % number == 0)
    }
  }

  println(isPrime(3))
}