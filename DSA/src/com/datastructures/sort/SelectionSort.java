package com.datastructures.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arrays) {

		for (int i = 0; i < arrays.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[j] < arrays[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = arrays[i];
				arrays[i] = arrays[minIndex];
				arrays[minIndex] = temp;
			}
		}
	}
	
	public static void selectionSortDESC(int[] arrays) {

		for (int i = 0; i < arrays.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[j] > arrays[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = arrays[i];
				arrays[i] = arrays[minIndex];
				arrays[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int[] arrays = { 5, 2, 6, 8, 9, 1 };
		System.out.println(Arrays.toString(arrays));
		selectionSort(arrays);
		System.out.println(Arrays.toString(arrays));
		
		selectionSortDESC(arrays);
		System.out.println(Arrays.toString(arrays));
	}
}
