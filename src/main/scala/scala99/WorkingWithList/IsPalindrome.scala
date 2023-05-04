package com.knoldus
package scala99

object IsPalindrome extends App {

  val list = List(1, 2, 3, 2, 1)

  def isPalindrome[T](list: List[T]): Boolean = {
    if (list == list.reverse) true else false
  }

  if (isPalindrome(list)) println("YES") else println("NO")

}