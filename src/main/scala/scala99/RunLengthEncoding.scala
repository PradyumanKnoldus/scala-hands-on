package com.knoldus
package scala99

object RunLengthEncoding extends App {

  val inputList = List("a","a","a","a","b","c","c","a","a","d","e","e","e","e")

//  val packedConsecutiveDuplicates = PackConsecutiveDuplicates.packConsecutiveDuplicates(inputList)
//  def runLengthEncoding[T](inputList: List[List[T]]): List[(T, Int)] = {
//    inputList.flatMap(innerList => innerList.groupBy(identity).view.mapValues(_.size).toList)
//  }

  val packedConsecutiveDuplicates = PackConsecutiveDuplicates.packConsecutiveDuplicates(inputList)

  def runLengthEncoding[T](inputList: List[List[T]]): List[(T, Int)] = {
    inputList.map(innerList => (innerList.head, innerList.length))
  }

  println(runLengthEncoding(packedConsecutiveDuplicates))
}
