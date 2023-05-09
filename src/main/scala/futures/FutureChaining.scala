package com.knoldus
package futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureChaining extends App {

  val future1 = Future(1)
  val future2 = Future(2)
  val future3 = Future(3)
  val future4 = Future(4)

  val addition = for {
    value1 <- future1
    value2 <- future2
    value3 <- future3
    value4 <- future4
  } yield value1 + value2 + value3 + value4

  addition.andThen {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

  //------------------------------------------------------------------------

  val futureList = List(Future(1), Future(2), Future(3), Future(4))

  val addValues = for {
    result <- Future.sequence(futureList)
  } yield result.sum

  addValues.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

  //------------------------------------------------------------------------

  val sum = future1.flatMap{
    value1 => future2.flatMap(
      value2 => future3.flatMap(
        value3 => future4.map(
          value4 => value1 + value2 + value3 + value4
        )
      )
    )
  }

  sum.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }

  //------------------------------------------------------------------------

  val addElements = Future.sequence(futureList).flatMap(
    list => Future(list.sum)
  )

  addElements.onComplete {
    case Success(value) => println(value)
    case Failure(exception) => println(exception.getMessage)
  }}
