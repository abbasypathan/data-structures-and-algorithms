package com.datastructures.queue.leetcode;

public class QueueUsingStackDemo {

	public static void main(String[] args) {
		QueueUsingStack queue;

		System.out.println("These tests confirm enqueue and dequeue work");
		System.out.println("with proper FIFO behavior.");
		System.out.println("peek() shows the front (first) element.");
		System.out.println();

		// Test 1: Dequeue single element
		System.out.println("Test 1: Dequeue Single Element");
		queue = new QueueUsingStack();
		queue.enqueue(10);
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue is empty? " + queue.isEmpty());
		System.out.println();

		// Test 2: Dequeue multiple elements in FIFO order
		System.out.println("Test 2: Dequeue Multiple Elements (FIFO)");
		queue = new QueueUsingStack();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Queue is empty? " + queue.isEmpty());
		System.out.println();

		// Test 3: Peek after dequeue
		System.out.println("Test 3: Peek After Dequeue");
		queue = new QueueUsingStack();
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Peek after dequeue: " + queue.peek());
		System.out.println("Queue is empty? " + queue.isEmpty());
		System.out.println();

		// Test 4: Dequeue from empty queue
		System.out.println("Test 4: Dequeue from Empty Queue");
		queue = new QueueUsingStack();
		System.out.println("Dequeued from empty: " + queue.dequeue());
		queue.enqueue(42);
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued again (empty): " + queue.dequeue());
		System.out.println();

	}
}
