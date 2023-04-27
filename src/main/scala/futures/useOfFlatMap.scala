package com.knoldus
package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object useOfFlatMap extends App {
  val list = List(2, 3, 4, 5, 6, 7, 8, 9, 1)

  def doubler(list: List[Int]): Future[List[Int]] = Future {
    list.map(_ * 2)
  }

  def findEven(list: Future[List[Int]]): Future[List[Int]] = list.flatMap { evenList =>
    Future {
      evenList.filter(_ % 2 == 0)
    }
  }

  val doubledElements = doubler(list)
  val evenDoubledElements = findEven(doubledElements)

  evenDoubledElements.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }
}
