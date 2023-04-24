package com.knoldus
package caseClasses

class Employee(val id : Int,val name: String)

  // Companion Object in which we have to define apply , unapply , toString , equals methods to make it acts like a case class
object Employee {
    def apply(id: Int, name: String): Employee = new Employee(id, name)

    def unapply(employee: Employee): Option[(Int, String)] = Some((employee.id, employee.name))

    def equals(employee: Employee): Boolean = employee match {
      case anotherEmployee: Employee
        if employee.id == anotherEmployee.id && employee.name == anotherEmployee.name => true
      case _ => false
    }
     def toString(employee: Employee): String = s"Employee(${employee.id}, ${employee.name})"
  }


object ClassAsCaseClass extends App {

  val employeeOne = Employee(1884, "Pradyuman")
  val employeeTwo = Employee(1872, "Satvik")

  def extractor(employee: Employee): String = {
    employee match {
      case Employee(id, name) => s"Employee ID is $id , and Name is $name"
      case _ => "Not an Employee"
    }
  }

  val useOfEquals = employeeTwo.equals(employeeOne)

  val useOfToString = Employee.toString(employeeOne)

  //---------------------------------------------------------------------------------------------------------------------------

  println(extractor(employeeOne))
  println(extractor(employeeTwo))

  println(useOfEquals)

  println(useOfToString)

}
