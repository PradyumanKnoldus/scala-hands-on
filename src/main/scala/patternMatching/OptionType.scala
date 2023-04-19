package com.knoldus
package patternMatching

// Example of OPTION TYPE
object OptionType extends App {
  def divide(dividend: Double, divisor: Double): Option[Double] = {
    if (divisor == 0) None
    else Some(dividend / divisor)
  }

  private val result1 = divide(10, 2)
  private val result2 = divide(10, 0)

  result1 match {
    case Some(value) => println(s"The result is $value")
    case None => println("Division by zero")
  }

  result2 match {
    case Some(value) => println(s"The result is $value")
    case None => println("Division by zero")
  }
}
