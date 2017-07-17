package edu.scala01

trait Queue {
  def enqueue(a: Int): List[Int]
  def dequeue: List[Int]
}