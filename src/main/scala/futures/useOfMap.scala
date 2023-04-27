package com.knoldus
package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object useOfMap extends App {

  val list = List(2,3,4,5,6)

  def doubler(list: List[Int]): Future[List[Int]] = Future {
    list.map(_ * 2)
  }

  doubler(list).onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(s"${exception.getMessage}")
  }

  //-----------------------------------------------------------------------------

  // .map , .flatMap , .filter -- Future will enter in these functions only if it gets success
  val divisor = 1
  val divident = 2

  def divide(divident: Int, divisor: Int): Future[Int] = Future {
    divident / divisor
  }.map(_ * 2).recoverWith{
    case _: Exception => Future.failed(new Exception("Error"))
  }

  divide(divident, divisor).onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(s"${exception.getMessage}")
  }
}
