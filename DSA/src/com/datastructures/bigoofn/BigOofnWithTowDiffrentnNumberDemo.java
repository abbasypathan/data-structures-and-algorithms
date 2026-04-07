package com.datastructures.bigoofn;

public class BigOofnWithTowDiffrentnNumberDemo {

	public static void printItems(int a, int b) {

		// O(a * b) - As both are different numbers we need to keep both
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println(i + " " + j);
			}
		}

		// O(a)
		for (int k = 0; k < a; k++) {
			System.out.println(k);
		}
		
		// O(b)
		for (int l = 0; l < b; l++) {
			System.out.println(l);
		}
		
		// Final time complexity O((a * b) + (a + b)) = O(a * b) non dominant eliminated

	}

	public static void main(String[] args) {
		printItems(1,100);
	}
}
