package com.knoldus
package futures

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

// Zip : Used to combine Two different futures
// We can use it to handle exceptions also
object CombiningTwoFutures extends App {
  val name: Future[String] = Future {
    "Pradyuman"
  }

  val age: Future[Int] = Future {
    23
  }

  val combinedResult: Future[(String, Int)] = name.zip(age)

  combinedResult.onComplete {
    case Success((name,age)) => println(s"Name: $name , Age: $age")
    case Failure(exception) => println(s"Exception: $exception")
  }
}
