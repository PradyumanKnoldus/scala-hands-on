package com.knoldus
package patternMatching

// Example of PATTERN GUARD
object LeapYear extends App {
  def leapYear(year: Int): Boolean = {
    year match {
      case year if(year % 4 == 0) && (year % 100 != 0) => true
      case year if(year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) => true
      case _ => false
    }
  }

  private val inputYear = 2024
  private val result = leapYear(inputYear)

  println(result)
}

