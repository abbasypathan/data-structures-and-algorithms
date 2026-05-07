package com.datastructures.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arrays) {
		for (int i = arrays.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arrays[j] > arrays[j + 1]) {
					int temp = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arrays = { 2, 5, 6, 8, 9, 1 };
		System.out.println(Arrays.toString(arrays));
		bubbleSort(arrays);
		System.out.println(Arrays.toString(arrays));
	}
}
