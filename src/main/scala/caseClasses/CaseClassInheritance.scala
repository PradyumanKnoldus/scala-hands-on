package com.knoldus
package caseClasses


// Inheritance in Case Classes is Prohibited
// NOTE : Case Classes can't be inherited to another Case Class
// Even though Syntactically compiler will not throw error but it will show error while compilation
case class EmployeeInfo(id: Int , name: String)

case class EmployeeSalary(override val id: Int, override val name: String, salary: Double) extends EmployeeInfo(id, name)

object Main extends App {
  val pradyuman = EmployeeSalary(1884 , "Pradyuman" , 18000)

  println(pradyuman)
}