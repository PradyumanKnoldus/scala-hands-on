package com.knoldus
package scala99.Arithmetic

import CoPrime._
object EulerTotient extends App {

  implicit class Totient(number: Int) {
    def totient: Int = {
      (1 to number).count(numbers => numbers.isCoprimeTo(number))
    }
  }

  println(10.totient)
}
