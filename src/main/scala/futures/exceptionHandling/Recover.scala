package com.knoldus
package futures.exceptionHandling

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Recover extends App {
  def divide(dividend: Int, divisor: Int): Future[Int] = Future {
    dividend / divisor
  }.recover {
    case _: ArithmeticException => -1
  }

  divide(22, 0).onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }
}
