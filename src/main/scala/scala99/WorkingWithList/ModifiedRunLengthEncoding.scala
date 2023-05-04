package com.knoldus
package scala99

object ModifiedRunLengthEncoding extends App {
  val inputList = List("a","a","a","a","b","c","c","a","a","d","e","e","e","e")

  val packedConsecutiveDuplicates = PackConsecutiveDuplicates.packConsecutiveDuplicates(inputList)

  def modifiedRunLengthEncoding[T](inputList: List[List[T]]): List[Any] = {
    RunLengthEncoding.runLengthEncoding(inputList) map(element => if (element._2 == 1) element._1 else element)
  }

  println(modifiedRunLengthEncoding(packedConsecutiveDuplicates))
}
