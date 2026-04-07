package com.datastructures.bigoof1;

public class BigOofOneDemo {

	// O(1) - one operation no matter how big is n
	public static void addItem(int n) {
		System.out.println(n + n);
		// here 2 operation with O(1+1) which will be O(2)
		// again drop constant and final will be O(1)
		System.out.println(n + n + n);
	}

	public static void main(String[] args) {
		addItem(10);
	}
}
