package com.knoldus
package patternMatching

// Example of CONSTRUCTOR PATTERN
case class Person(name: String, age: Int)

object ConstructorPattern extends App {
  def personalInfoMatch(person: Person): String = {
    person match {
      case Person("Pradyuman", age) => s"This is Pradyuman, and his age is $age"
      case Person(name, 23) => s"This is $name, and their age is 23"
      case Person(name, age) => s"This is $name, and their age is $age"
      case _ => "This is not a person"
    }
  }

  private val person = Person("Pradyuman", 23)
  private val result = personalInfoMatch(person)

  println(result)
}
