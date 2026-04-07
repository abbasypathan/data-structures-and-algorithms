package com.datastructures.bigoofn;

public class BigOofnSquareDemo {

	public static void printItems(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// O(n2) - n * n - it will execute, here time complexity will rapidly increase
				System.out.println(i + " " + j);
			}
		}
	}

	public static void main(String[] args) {
		printItems(10);
	}
}
