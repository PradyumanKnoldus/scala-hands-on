package com.knoldus
package futures.exceptionHandling

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FallBackTo extends App {
  val futureOne = Future(22/0)
  val futureTwo = Future(11)

  val recovered = futureOne.fallbackTo(futureTwo)

  recovered.onComplete {
    case Failure(exception) => println(exception.getMessage)
    case Success(value) => println(value)
  }
}
