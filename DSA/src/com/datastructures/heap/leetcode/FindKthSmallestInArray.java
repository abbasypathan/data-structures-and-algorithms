package com.datastructures.heap.leetcode;

public class FindKthSmallestInArray {

	public static int findKthSmallest(int[] nums, int k) {
		Heap heap = new Heap();
		for (int num : nums) {
			heap.insert(num);
			if (heap.getHeap().size() > k) {
				heap.remove();
			}
		}
		return heap.getHeap().get(0);
	}

	public static void main(String[] args) {
		// Test case 1
		int[] nums1 = { 7, 10, 4, 3, 20, 15 };
		int k1 = 3;
		System.out.println("Test case 1:");
		System.out.println("Expected output: 7");
		System.out.println("Actual output: " + findKthSmallest(nums1, k1));
		System.out.println();

		// Test case 2
		int[] nums2 = { 2, 1, 3, 5, 6, 4 };
		int k2 = 2;
		System.out.println("Test case 2:");
		System.out.println("Expected output: 2");
		System.out.println("Actual output: " + findKthSmallest(nums2, k2));
		System.out.println();

		// Test case 3
		int[] nums3 = { 9, 3, 2, 11, 7, 10, 4, 5 };
		int k3 = 5;
		System.out.println("Test case 3:");
		System.out.println("Expected output: 7");
		System.out.println("Actual output: " + findKthSmallest(nums3, k3));
		System.out.println();

	}
}
