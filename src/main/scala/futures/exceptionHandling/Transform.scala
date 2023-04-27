package com.knoldus
package futures.exceptionHandling

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Transform extends App {
  def /(dividend: Int, divisor: Int): Future[Int] = Future {
    dividend / divisor
  }

  /(42,0).transform {
    case Failure(exception) => Failure(new RuntimeException("An error occurred while processing the future", exception))
    case Success(value) => Success(value * 2)
  }.foreach( result => println(result))

}
