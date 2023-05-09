package com.knoldus
package scala99.Arithmetic

object CoPrime extends App {

implicit class Coprime(firstNumber: Int){
  def isCoprimeTo(secondNumber: Int): Boolean = {
    GreatestCommonDivisor.greatestCommonDivisor(firstNumber, secondNumber) == 1
  }
}

  println(135.isCoprimeTo(64))
}
