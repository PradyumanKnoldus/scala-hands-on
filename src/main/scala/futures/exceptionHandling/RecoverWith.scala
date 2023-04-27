package com.knoldus
package futures.exceptionHandling

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object RecoverWith extends App {
  def divider(dividend: Int, divisor: Int): Future[Int] = Future {
    dividend / divisor
  }.recoverWith {
    case _: ArithmeticException => Future.successful(-1)
  }

  divider(22, 0).onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }
}
