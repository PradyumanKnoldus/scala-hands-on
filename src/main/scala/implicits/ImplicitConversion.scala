package com.knoldus
package implicits

import scala.language.implicitConversions

object ImplicitConversion extends App {
  implicit def intToString(input: Int): String = input.toString

  def printer(input: String): String = {
    s"$input"
  }

  println(printer(22))
}
