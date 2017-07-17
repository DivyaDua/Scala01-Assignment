package edu.scala01

class DoubleQueue(l: List[Int]) extends Queue{

  override def enqueue(a: Int): List[Int] ={
    val list = l ::: List(2*a)
    list
  }

  override def dequeue() = l.tail

  //override def toString: String = s"$l"
}
