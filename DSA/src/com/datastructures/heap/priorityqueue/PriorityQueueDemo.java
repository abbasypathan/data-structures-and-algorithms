package com.datastructures.heap.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// Not thread safe
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		minHeap.add(10);
		minHeap.add(5);
		minHeap.add(20);

		System.out.println("Min Heap :");
		System.out.println(minHeap);
		System.out.println(minHeap.poll());
		System.out.println(minHeap);
		System.out.println(minHeap.peek());
		System.out.println(minHeap);

		// Not thread safe
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		maxHeap.add(10);
		maxHeap.add(5);
		maxHeap.add(20);

		System.out.println("Max Heap :");
		System.out.println(maxHeap);
		System.out.println(maxHeap.poll());
		System.out.println(maxHeap.peek());

		// Thread safe & 11 is the initial capacity it can automatically increased
		PriorityBlockingQueue<Integer> blockingQueue = new PriorityBlockingQueue<>(11, Collections.reverseOrder());
		blockingQueue.add(45);
		blockingQueue.add(67);
		System.out.println("Priority Blocking Queue :");
		System.out.println(blockingQueue);
	}
}
