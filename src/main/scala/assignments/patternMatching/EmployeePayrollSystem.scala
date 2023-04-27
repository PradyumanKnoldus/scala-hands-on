package com.knoldus
package assignments
package patternMatching

import org.slf4j.LoggerFactory

// Define a case class to hold the details of an employee.
case class EmployeeDetails(id: Int, jobTitle: String, workLocation: String, yearsOfExperience: Double, performance: Double)

class EmployeePayrollSystem {
  private val logger = LoggerFactory.getLogger(getClass)

  // This method calculates the monthly salary of an employee based on their job title, years of experience, and performance.
  def calculateMonthlySalary(employeeDetails: EmployeeDetails): Double = {
    val monthlySalary = employeeDetails match {
      case employee if employee.jobTitle == "Software Engineer" =>
        1000.0 + 50.0 * employee.yearsOfExperience
      case employee if employee.jobTitle == "Sales Representative" =>
        val baseSalary = 800.0
        val bonus = if (employee.performance >= 0.5) 40.0 else 20.0
        baseSalary + bonus * employee.yearsOfExperience
      case employee if employee.jobTitle == "Manager" =>
        val baseSalary = 1500.0
        val bonus = if (employee.performance >= 0.8) 75.0 else 50.0
        baseSalary + bonus * employee.yearsOfExperience
      case _ => 600.0
    }
    logger.info(s"\nCalculated monthly salary of $monthlySalary for employee with details $employeeDetails")
    monthlySalary
  }

  // This method calculates the benefits of an employee based on their work location.
  def calculateBenefits(employeeDetails: EmployeeDetails): (Double, Double) = {
    val (healthInsurance, retirementBenefits) = employeeDetails.workLocation match {
      case "Chicago" => (50, 100)
      case "Seattle" => (60, 90)
      case "New York" => (40, 80)
      case _ => (0, 0)
    }
    logger.info(s"\nCalculated benefits for employee ID ${employeeDetails.id}: Health Insurance: $healthInsurance , Retirement Benefits: $retirementBenefits ")
    (healthInsurance, retirementBenefits)
  }

  // This method calculates the tax deduction of an employee based on their monthly salary.
  def calculateTaxes(monthlySalary: Double): Double = {
    val taxDeduction = monthlySalary match {
      case salary if salary < 600 => 0
      case salary if salary >= 600 && salary <= 1000 => 0.10 * salary
      case salary => 0.15 * salary
    }
    logger.info(s"\nCalculated tax deduction of $taxDeduction for employee with monthly salary $monthlySalary")
    taxDeduction
  }

  // This method calculates the final paycheck of an employee based on their details.
  def calculatePaycheck(employeeDetails: EmployeeDetails): Double = {
    val monthlySalary = calculateMonthlySalary(employeeDetails)
    val (healthInsurance, retirementBenefits) = calculateBenefits(employeeDetails)
    val taxDeduction = calculateTaxes(monthlySalary)

    val finalPaycheck = (monthlySalary + healthInsurance + retirementBenefits) - taxDeduction
    logger.info(s"\nCalculated final paycheck of $finalPaycheck for employee ID ${employeeDetails.id}\n")
    finalPaycheck
  }
}
