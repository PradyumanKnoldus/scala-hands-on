package com.knoldus
package scala99

object CombinationOfKDistinctElements extends App {
  val inputList = List("a","b","c","d","e","f")

  def combinationOfKDistinctElements[T](inputList: List[T], numberOfElements: Int): List[List[T]] = {
    inputList.toSet.subsets(numberOfElements).map(_.toList).toList
  }

  println(combinationOfKDistinctElements(inputList, 3))
}
