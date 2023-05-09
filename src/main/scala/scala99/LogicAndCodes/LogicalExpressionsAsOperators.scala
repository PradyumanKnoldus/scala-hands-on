package com.knoldus
package scala99.LogicAndCodes

object LogicalExpressionsAsOperators {
  implicit class AND(conditionOne: Boolean) {
    def and(conditionTwo: Boolean): Boolean = {
      (conditionOne, conditionTwo) match {
        case (true, true) => true
        case _ => false
      }
    }
  }

  implicit class OR(conditionOne: Boolean) {
    def or(conditionTwo: Boolean): Boolean = {
      (conditionOne, conditionTwo) match {
        case (true, _) => true
        case (_, true) => true
        case _ => false
      }
    }
  }

  implicit class NAND(conditionOne: Boolean) {
    def nand(conditionTwo: Boolean): Boolean = {
      !(conditionOne and (conditionTwo))
    }
  }

  implicit class NOR(conditionOne: Boolean) {
    def nor(conditionTwo: Boolean): Boolean = {
      !(conditionOne or (conditionTwo))
    }
  }

  implicit class XOR(conditionOne: Boolean) {
    def xor(conditionTwo: Boolean): Boolean = {
      (conditionOne or conditionTwo) and (conditionOne nand conditionTwo)
    }
  }

  implicit class EQU(conditionOne: Boolean) {
    def equ(conditionTwo: Boolean): Boolean = {
      (conditionOne and conditionTwo) or (!conditionOne and !conditionTwo)
    }
  }

  implicit class IMPL(conditionOne: Boolean) {
    def impl(conditionOne: Boolean, conditionTwo: Boolean): Boolean = {
      !conditionOne or (conditionTwo)
    }
  }

  // ---------------------------------------------------------------------------------------------------

  def main(args: Array[String]): Unit = {
    println(true and true)
    println(true xor true)
  }
}
