package com.datastructures.bigoofn;

public class BigOofnDropConstantDemo {

	public static void printItems(int n) {
		
		// O(n) - time complexity
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}

		// O(n) - time complexity
		for (int j = 0; j < n; j++) {
			System.out.println(j);
		}
		
		// overall complexity is n + n = 2n
		// But to calculate complexity we don't consider constant value so final complexity will be O(n)
	}

	public static void main(String[] args) {
		printItems(10);
	}
}
