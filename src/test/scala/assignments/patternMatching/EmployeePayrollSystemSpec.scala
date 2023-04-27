package com.knoldus
package assignments.patternMatching

import org.scalatest.flatspec.AnyFlatSpec


class EmployeePayrollSystemSpec extends AnyFlatSpec {
  val employeePayrollSystem = new EmployeePayrollSystem

  "calculateMonthlySalary" should "return the correct monthly salary for a Software Engineer" in {
    val employeeDetails = EmployeeDetails(1, "Software Engineer", "Chicago", 2.5, 0.9)
    assert(employeePayrollSystem.calculateMonthlySalary(employeeDetails) == 1125.0)
  }

  it should "return the correct monthly salary for a Sales Representative" in {
    val employeeDetails = EmployeeDetails(2, "Sales Representative", "New York", 3.2, 0.6)
    assert(employeePayrollSystem.calculateMonthlySalary(employeeDetails) == 928.0)
  }

  it should "return the correct monthly salary for a Manager" in {
    val employeeDetails = EmployeeDetails(3, "Manager", "Seattle", 4.8, 0.7)
    assert(employeePayrollSystem.calculateMonthlySalary(employeeDetails) == 1740.0)
  }

  it should "return the default monthly salary for other job titles" in {
    val employeeDetails = EmployeeDetails(4, "Tester", "Seattle", 1.5, 0.8)
    assert(employeePayrollSystem.calculateMonthlySalary(employeeDetails) == 600.0)
  }

  "calculateBenefits" should "return the correct health insurance and retirement benefits for a given work location" in {
    val employeeDetails = EmployeeDetails(5, "Software Engineer", "Chicago", 2.5, 0.9)
    assert(employeePayrollSystem.calculateBenefits(employeeDetails) == (50.0, 100.0))
  }

  it should "return (0, 0) for an unknown work location" in {
    val employeeDetails = EmployeeDetails(6, "Software Engineer", "Mumbai", 1.5, 0.6)
    assert(employeePayrollSystem.calculateBenefits(employeeDetails) == (0.0, 0.0))
  }

  "calculateTaxes" should "return the correct tax deduction for a given monthly salary" in {
    assert(employeePayrollSystem.calculateTaxes(800.0) == 80.0)
    assert(employeePayrollSystem.calculateTaxes(1200.0) == 180.0)
    assert(employeePayrollSystem.calculateTaxes(500.0) == 0.0)
  }

  "calculatePaycheck" should "return the correct final paycheck for an employee" in {
    val employeeDetails = EmployeeDetails(7, "Manager", "Seattle", 4.8, 0.7)
    assert(employeePayrollSystem.calculatePaycheck(employeeDetails) == 1629.0)
  }
}
