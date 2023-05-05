package com.knoldus
package implicits

object ImplicitClass extends App {
  implicit class StringOps(str: String) {
    def reverseString: String = str.reverse
  }

  val str = "Hello World"

  println(str.reverseString)
}
