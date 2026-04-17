package com.datastructures.hashtable.leetcode;

import java.util.HashMap;

public class ItemInCommonTwoArray {

	public static boolean isItemCOmmon(int[] array1, int[] array2) {

		HashMap<Integer, Boolean> hashMap = new HashMap<>();
		for (int value : array1) {
			hashMap.put(value, true);
		}
		for (int value : array2) {
			if (hashMap.get(value) != null) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 5 };
		int[] array2 = { 6, 3, 5 };

		System.out.println(isItemCOmmon(array1, array2));
	}
}
