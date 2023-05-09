package com.knoldus
package scala99.LogicAndCodes

object LogicalExpressions {

  def and(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    (conditionOne, conditionTwo) match {
      case (true, true) => true
      case _ => false
    }
  }

  def or(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    (conditionOne, conditionTwo) match {
      case (true, _) => true
      case (_, true) => true
      case _ => false
    }
  }

  def nand(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    !and(conditionOne, conditionTwo)
  }

  def nor(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    !or(conditionOne, conditionTwo)
  }

  def xor(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    and(or(conditionOne, conditionTwo), nand(conditionOne, conditionTwo))
  }

  def equ(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    or(and(conditionOne, conditionTwo), and(!conditionOne, !conditionTwo))
  }

  def impl(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
    or(!conditionOne, conditionTwo)
  }

  def table2(function: (Boolean, Boolean) => Boolean): Unit = {
    println("A     B     result")
    for {conditionOne <- List(true, false)
         conditionTwo <- List(true, false)
         }
      printf("%-5s %-5s %-5s\n", conditionOne, conditionTwo, function(conditionOne, conditionTwo))
  }

  //----------------------------------------------------------------------------

  def main(args: Array[String]): Unit = {
    println(and(true, true))
    println(xor(true, true))
    println(table2(and))
  }
}


