package edu.scala01

class SquareQueue(l: List[Int]) extends Queue{
  override def enqueue(a: Int): List[Int] ={
    val list = l ::: List(a*a)
    list
  }

  override def dequeue() = l.tail

}