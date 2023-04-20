package com.knoldus
package patternMatching

// Example of Pattern Matching in Class
class Employee(val name: String, val age: Int, val salary: Double){

  object Employee {
    def unapply (employee: Employee): Option[(String, Int, Double)] = {
      Some(employee.name, employee.age, employee.salary)
    }
  }

  def employeeDetails(employee: Employee): String = employee match {
    case Employee("Pradyuman", 23 , _) => s"Employee name is Pradyuman and his age is 23 and his salary is $salary"
    case Employee(_, _, 20000) => s"Employee name is $name and his age is $age and his salary is 20000"
    case Employee(_, 25 , _) => s"Employee name is $name and his age is 25 and his salary is $salary"
    case Employee(_, _ , _) => s"Employee name is $name and his age is $age and his salary is $salary"
    case _ => "Employee not found!!"
  }
}

object Main extends App {


  val pradyuman = new Employee("Pradyuman", 23, 18000)
  val krishna = new Employee("Krishna", 23, 20000)
  val jitendra = new Employee("Jitendra", 23, 22000)
  val satvik = new Employee("satvik", 25, 24000)

  println(pradyuman.employeeDetails(pradyuman))
  println(krishna.employeeDetails(krishna))
  println(jitendra.employeeDetails(jitendra))
  println(satvik.employeeDetails(satvik))
}
