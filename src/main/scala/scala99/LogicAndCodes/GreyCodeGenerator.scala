package com.knoldus
package scala99.LogicAndCodes

object GreyCodeGenerator extends App {

  def grey(number: Int): List[String] = {
    if (number == 0) List("")
    else {
      val previousList = grey(number - 1)
      val greyCode = for {
        previous <- previousList
        character <- List('0', '1')
      } yield previous + character
      greyCode
    }
  }

  println(grey(3))
}
