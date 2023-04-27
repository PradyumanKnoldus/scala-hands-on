package com.knoldus
package assignments
package patternMatching

object EmployeePayrollSystemDriver extends App {
  val employeePayrollSystem = new EmployeePayrollSystem

  val employeeOne = EmployeeDetails(1884, "Software Engineer", "Noida", 3, 0.5)
  val employeeTwo = EmployeeDetails(1890, "Manager", "New York", 3, 0.8)
  val employeeThree = EmployeeDetails(1750, "Sales Representative", "Chicago", 2, 0.5)

  employeePayrollSystem.calculatePaycheck(employeeOne)
  employeePayrollSystem.calculatePaycheck(employeeTwo)
  employeePayrollSystem.calculatePaycheck(employeeThree)

}
