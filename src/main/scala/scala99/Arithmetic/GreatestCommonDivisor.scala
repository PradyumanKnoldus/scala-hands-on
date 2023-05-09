package com.knoldus
package scala99.Arithmetic

import scala.annotation.tailrec

object GreatestCommonDivisor extends App {

  @tailrec
  def greatestCommonDivisor(firstElement: Int, secondElement: Int): Int = {
    if (secondElement == 0) firstElement
    else greatestCommonDivisor(secondElement, firstElement % secondElement)
  }

  println(greatestCommonDivisor(36, 63))
}
