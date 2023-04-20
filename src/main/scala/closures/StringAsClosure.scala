package com.knoldus
package closures

// Passing String as CLOSURE
object StringAsClosure extends App {
  private val company = "Knoldus" // Free Variable (Pure)

  def employeeDescription(name: String): String = {
    s"My name is $name, working at $company"
  }

  println(employeeDescription("Pradyuman"))
}
