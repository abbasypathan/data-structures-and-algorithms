package com.datastructures.heap;

public class MyHeapDemo {

	public static void main(String[] args) {
		MyHeap myHeap = new MyHeap();
		myHeap.insert(99);
		myHeap.insert(72);
		myHeap.insert(61);
		myHeap.insert(58);

		System.out.println(myHeap.getMyHeap());

		myHeap.insert(73);
		System.out.println(myHeap.getMyHeap());

		myHeap.insert(100);
		System.out.println(myHeap.getMyHeap());

		System.out.println("Removed Integer : " + myHeap.remove());

		System.out.println(myHeap.getMyHeap());

	}
}
