package com.knoldus
package scala99

import scala.annotation.tailrec

object DecodeRunLengthEncodingList extends App {
  val inputList = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))

  //  def decodeRunLengthEncodingList[T](inputList: List[(Int, T)]): List[T] = {
  //    inputList.flatMap{
  //      case (times, character) =>
  //        List.fill(times)(character)
  //    }
  //  }

  def decodeRunLengthEncodingList[T](inputList: List[(Int, T)]): List[T] = {
    @tailrec
    def decodeHelper(inputList: List[(Int, T)], outputList: List[T]): List[T] = {
      inputList match {
        case Nil => outputList
        case (times, character) :: tail =>
          if (times <= 0) {
            decodeHelper(tail, outputList)
          } else {
            decodeHelper((times - 1, character) :: tail, character :: outputList)
          }
      }
    }

    decodeHelper(inputList, List()).reverse
  }

  println(decodeRunLengthEncodingList(inputList))
}
