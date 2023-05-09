package com.knoldus
package built_in_methods

object BuiltInMethods extends App {

  val inputList = List(1, 2, 3, 4, 5)

  //-------------------------------------------------------------------------------

  // .map
  val doubleElements = inputList.map(element => element * 2)
  println(doubleElements)

  // .filter
  val filteredEven = inputList.filter(element => element % 2  == 0)
  println(filteredEven)

  // .notFilter
  val notFilteringEven = inputList.filterNot(element => element % 2 == 0)
  println(notFilteringEven)

  // .fold
  val addingFiveToSumOfList = inputList.fold(5)(_ + _)
  println(addingFiveToSumOfList)

  // .foldLeft
  val addingTwoToSumOfList = inputList.foldLeft(2)(_ + _)
  println(addingTwoToSumOfList)

  // .foldRight
  val addingTenToSumOfList = inputList.foldRight(10)(_ + _)
  println(addingTenToSumOfList)

  // .forEach
  inputList.foreach(println)

  // flatMap
  val list = List(List(1,2), List(3,4), List(5))
  val fiveTimes = list.flatMap(innerList =>
    innerList.map(
      element => element * 5
    )
  )
  println(fiveTimes)

  // .flatten
  val listString = List("MY", "NAME", "IS", "PRADYUMAN")
  val flattenList = listString.flatten
  println(flattenList)

  // .reduce
  val reduceList = inputList.reduce(_ * _)
  println(reduceList)

  // .zip
  val zipLists = inputList.zip(fiveTimes)
  println(zipLists)

  // .groupBy
  val groupElements = inputList.groupBy(_ % 2 == 0).values.toList
  println(groupElements)

  // .exists
  val checkExistence = inputList.exists(_ % 2 != 0)
  println(checkExistence)

  // .sortBy
  val sort = listString.sortBy(_.length)
  println(sort)

  // .head
  println(inputList.head)
  println(inputList.headOption)

  // .tail
  println(inputList.tail)

  // .last
  println(inputList.last)
  println(inputList.lastOption)

  // .init
  println(inputList.init)

  // .reverse
  println(inputList.reverse)

  // .distinct
  println(flattenList.distinct)

  // .take
  println(inputList.take(2))

  // .drop
  println(inputList.drop(2))

  // .takeWhile
  println(inputList.takeWhile(_ <= 3))

  // .dropWhile
  println(inputList.dropWhile(_ <= 3))

  // .SplitAt
  println(inputList.splitAt(3))

  // .span
  println(inputList.span(_ <= 4))

  // .zipWithIndex
  println(inputList.zipWithIndex)

  // .find
  println(inputList.find(_ % 2 == 0))

  // .forAll
  println(inputList.forall(_ > 0))

  // .partition
  println(inputList.partition(_ % 2 == 0))

  // .sliding
  val slidingIterator = inputList.sliding(3).next           // Not Clear
  println(slidingIterator)

  // .sortWith
  println(flattenList.sortWith(_ < _))

  // .mkString
  println(inputList.mkString)

  // .collect
  println(inputList.collect { case x if x % 2 == 0 => x * 2 })

  // .zipAll
  val inputList1 = List(1, 2, 3, 8, 9, 10, 11, 12)
  val inputList2 = List(4, 5, 6, 7)
  println(inputList1.zipAll(inputList2, 0, 2))

}
