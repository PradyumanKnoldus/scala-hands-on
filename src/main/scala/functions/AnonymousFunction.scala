package com.knoldus
package functions

object  AnonymousFunction {
  // Function with No name
  val addNumbers: (Int, Int) => Int = (firstNumber: Int, secondNumber: Int) => {
    firstNumber + secondNumber
  }

//  val result = addNumbers(5, 10)

//  println(result)
}
