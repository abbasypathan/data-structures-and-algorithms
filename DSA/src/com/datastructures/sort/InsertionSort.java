package com.datastructures.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arrays) {

		for (int i = 1; i < arrays.length; i++) {
			int temp = arrays[i];
			int j = i - 1;
			while (j > -1 && temp < arrays[j]) {
				arrays[j + 1] = arrays[j];
				arrays[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int[] arrays = { 5, 2, 6, 8, 9, 1 };
		System.out.println(Arrays.toString(arrays));
		insertionSort(arrays);
		System.out.println(Arrays.toString(arrays));
	}
}
