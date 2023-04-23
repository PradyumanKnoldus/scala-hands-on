package com.knoldus
package caseClasses

case class Employees(id: Int, name: String)

object CaseClassMethodRepresentation extends App {

  // We can Create its instance without new keyword because of apply method
  val employeeOne = Employees(1884, "Pradyuman")
  val employeeTwo = Employees(1872, "Satvik")
  val employeeThree = Employees(1870, "Krishna")

  // We can do pattern matching in case classes because of unapply method
  def extractor(employee: Employees): String = {
    employee match {
      case Employees(id, name) => s"Employee ID is $id , and Name is $name"
      case _ => "Not an Employee"
    }
  }

  val useOfToString = employeeOne.toString                  // Return String Representation

  val useOfEquals = employeeTwo.equals(employeeThree)       // Check if the "values" are equal or not

  val useOfHashcode = employeeOne.name.hashCode             // Return hashcode of particular Field

  val useOfProductArity = employeeOne.productArity          // Return Number of elements

  val useOfProductElement = employeeOne.productElement(1)   // Returns the value of a specific field in the case class instance

  val useOfProductIterator = employeeOne.productIterator // Returns the iterator over the Values

  val useOfCopy = employeeThree.copy(id = 1868).toString    // Return a new instance with updated values

  //---------------------------------------------------------------------------------------------------------------------------

  println(extractor(employeeOne))
  println(useOfToString)
  println(useOfEquals)
  println(useOfHashcode)
  println(useOfProductArity)
  println(useOfProductElement)
  println(useOfCopy)
  println(useOfProductIterator.next())

}
