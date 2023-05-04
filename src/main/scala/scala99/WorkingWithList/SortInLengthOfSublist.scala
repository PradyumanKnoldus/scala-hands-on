package com.knoldus
package scala99

object SortInLengthOfSublist extends App {
  val inputList = List(List('a', 'h', 'l'), List('p'), List('i', 'j', 'k', 'l', 'f'), List('y', 'q'), List('a', 'f', 'r'))

  def sortInLengthOfSublist[T](inputList: List[List[T]]): List[List[T]] = {
    inputList match {
      case Nil => Nil
      case firstElement :: remainingList =>
        val (lengthLessThanFirstElement , lengthGreaterThanFirstElement) = remainingList.partition(_.length < firstElement.length)
        sortInLengthOfSublist(lengthLessThanFirstElement) ::: firstElement :: sortInLengthOfSublist(lengthGreaterThanFirstElement)
    }
  }

  println(sortInLengthOfSublist(inputList))
}
