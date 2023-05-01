package com.knoldus
package Collections.List

object ListOperations extends App {

  val list = List(1,2,3,5,7,11,13,14,15,16)
  def reverseList[T](inputList: List[T]): List[T] = {
    inputList match {
      case Nil => Nil
      case head :: tail => reverseList(tail) ::: List(head)
    }
  }
  println(reverseList(list))

  //-----------------------------------------------------------

  def removeConsecutiveDuplicates[T](inputList: List[T]): List[T] = {
    inputList match {
      case Nil => Nil
      case head :: Nil => List(head)
      case head :: tail => head :: removeConsecutiveDuplicates(tail.dropWhile(_ == head))
    }
  }
  println(removeConsecutiveDuplicates(list))

  //-----------------------------------------------------------

  def isPrime(number: Int): Boolean = number match {
    case num if num <= 1 => false
    case 2 => true
    case _ => !(2 until number).exists(num => number % num == 0)
  }

  println(isPrime(7))

  println(list.filter(isPrime))

  //----------------------------------------------------------

  def sort(list: List[List[Char]]): List[List[Char]] = {
    list match {
      case Nil => Nil
      case head :: tail =>
        val (less,high) = tail.partition(_.length < head.length)
        sort(less) ::: head :: sort(high)
    }
  }

  val listt = List(List('a', 'h', 'l'), List('p'), List('i', 'j', 'k', 'l', 'f'), List('y', 'q'), List('a', 'f', 'r'))

  println(sort(listt))
}
