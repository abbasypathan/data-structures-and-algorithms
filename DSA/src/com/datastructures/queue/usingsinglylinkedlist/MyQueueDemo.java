package com.datastructures.queue.usingsinglylinkedlist;

public class MyQueueDemo {

	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue(12);

		myQueue.enqueue(13);

		myQueue.dequeue();

		myQueue.printQueue();
		myQueue.printFirst();
		myQueue.printLast();
		myQueue.printLength();
	}
}
