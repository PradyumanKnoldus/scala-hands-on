package com.knoldus
package functions

object PolymorphicFunction extends App {
  def add[T](firstElement: T, secondElement: T): String = {
    s"$firstElement" + s"$secondElement"
  }

  val myInt = add(10, 20)
  val myDouble = add(10.0, 40.0)
  val myString = add("Hello", "Scala")

  println(myInt)
  println(myDouble)
  println(myString)
}
