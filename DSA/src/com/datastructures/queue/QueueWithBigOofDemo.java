package com.datastructures.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueWithBigOofDemo {

	public static void main(String args[]) {
		// Big O of depends on internal data structure implementation
		// Internally Uses Circular Array
		Queue<Integer> queue = new ArrayDeque<>();

		// Amortized O(1) - Insert element into array
		queue.offer(12);

		// O(1)
		queue.poll();

		// O(1)
		queue.peek();

		// Internally Uses Doubly Linked list
		Queue<Integer> queue1 = new LinkedList<>();

		// O(1)
		queue1.offer(12);

		// O(1)
		queue1.poll();

		// O(1)
		queue1.peek();

		// Internally Uses Heap
		Queue<Integer> queue2 = new PriorityQueue<>();

		// O(log n)
		queue2.offer(12);

		// O(log n)
		queue2.poll();

		// O(1)
		queue2.peek();

		// Internally uses a lock-free singly linked list (CAS-based, thread-safe)
		Queue<Integer> queue3 = new ConcurrentLinkedQueue<>();

		// O(1)
		queue3.offer(12);

		// O(1)
		queue3.poll();

		// O(1)
		queue3.peek();
	}
}
