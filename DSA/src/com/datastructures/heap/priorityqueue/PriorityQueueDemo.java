package com.datastructures.heap.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

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

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		maxHeap.add(10);
		maxHeap.add(5);
		maxHeap.add(20);

		System.out.println("Max Heap :");
		System.out.println(maxHeap);
		System.out.println(maxHeap.poll());
		System.out.println(maxHeap.peek());
	}
}
