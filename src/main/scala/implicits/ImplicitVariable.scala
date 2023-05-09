package com.knoldus
package implicits

object ImplicitVariable extends App {
  implicit val number: Int = 2

  def add(number: Int)(implicit num: Int): Int = {
    num + number
  }

  println(add(2))
}
