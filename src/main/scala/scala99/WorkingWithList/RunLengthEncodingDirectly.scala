package com.knoldus
package scala99

import scala.annotation.tailrec

object RunLengthEncodingDirectly extends App {
  val inputList = List("a","a","a","a","b","c","c","a","a","d","e","e","e","e")


//  def runLengthEncodingDirectly[T](lst: List[T]): List[(Int, T)] = lst match {
//    case Nil => Nil
//    case firstElement :: _ =>
//      val (span, next) = lst.span(_ == firstElement)
//      (span.length, firstElement) :: runLengthEncodingDirectly(next)
//  }

  def runLengthEncodingDirectly[T](inputList: List[T]): List[(Int, T)] = {
    @tailrec
    def encodingHelper(list: List[T], count: (Int, T), outputList: List[(Int, T)] = List.empty): List[(Int, T)] = {
      list match {
        case Nil => count :: outputList
        case firstElement :: remainingList if firstElement == count._2 =>
          encodingHelper(remainingList, (count._1 + 1 , count._2), outputList)
        case firstElement :: remainingList =>
          encodingHelper(remainingList, (1, firstElement), count :: outputList)
      }
    }
    encodingHelper(inputList, (0, inputList.head)).reverse
  }

  println(runLengthEncodingDirectly(inputList))
}
