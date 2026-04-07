package com.datastructures.bigoofn;

public class BigOofnDemo {

	// O(n) - time complexity will increase exponentially with respective to n
	// In below execution 10 times same operation performed
	public static void printItems(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		BigOofnDemo.printItems(10);
	}
}
