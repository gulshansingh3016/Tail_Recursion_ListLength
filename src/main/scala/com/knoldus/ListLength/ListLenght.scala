package com.knoldus.ListLength

class ListLenght {

  def tailRecursiveLength(list: List[Int], accumulator: Long): Long ={
    if(list == List()) accumulator
    else tailRecursiveLength(list.tail , accumulator + 1)
  }
}

object lenghtTest extends App{
  val a = new ListLenght
  println(a.tailRecursiveLength(List(1,5,9,6), 0))
}