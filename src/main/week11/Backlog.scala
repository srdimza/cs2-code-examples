package week11

import week11.linkedlist.LinkedListNode

class Backlog[A](f: A=> Unit) {
  var front: LinkedListNode[A] = null
  var back: LinkedListNode[A] = null
  def enqueue(a: A): Unit = {
    if (back == null) {
      this.back = new LinkedListNode[A](a, null)
      this.front = this.back
    } else {
      this.back.next = new LinkedListNode[A](a, null)
      this.back = this.back.next
    }
  }
  def dequeue(): A = {
    val toReturn = this.front.value
    this.front = this.front.next
    if(this.front == null){
      this.back = null
    }
    toReturn
  }
  def addTask(task: A): Unit ={
    this.enqueue(task)
  }
  def completeTask(): Unit = {
    f(this.front.value)
    this.dequeue()
  }
}