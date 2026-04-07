package com.datastructures.bigoofn;

public class BigOofnSquareDropNonDominantDemo {

	public static void printItems(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// O(n2) - n * n - it will execute, here time complexity will rapidly increase
				System.out.println(i + " " + j);
			}
		}
		
		// O(n) - time complexity for this operation
		for (int k = 0; k < n; k++) {
			System.out.println(k);
		}
		
		// Overall if we calculate O(n2 + n) where as compared to n2 (Square) n is very less
		// So n can be drop as it's non-dominant
		//Final time complexity O(n2)
	}

	public static void main(String[] args) {
		printItems(10);
	}
}
