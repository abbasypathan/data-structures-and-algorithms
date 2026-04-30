package com.datastructures.recursion.binarysearchtree.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayToBalancedBST {

	private BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	public List<Integer> inorderTraversal() {
		List<Integer> result = new ArrayList<>();
		inorderHelper(this.root, result);
		return result;
	}

	private void inorderHelper(BinaryNode node, List<Integer> result) {
		if (node == null)
			return;
		inorderHelper(node.left, result);
		result.add(node.value);
		inorderHelper(node.right, result);
	}

	public boolean isBalanced() {
		return height(this.root) != -1;
	}

	private int height(BinaryNode node) {
		if (node == null)
			return 0;
		int leftHeight = height(node.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = height(node.right);
		if (rightHeight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public void sortedArrayToBST(int[] nums) {
		this.root = sortedArrayToBST(nums, 0, nums.length - 1);
	}

	private BinaryNode sortedArrayToBST(int[] nums, int left, int right) {

		if (left > right) {
			return null;
		}
		int midIndex = (left + right) / 2;
		BinaryNode binaryNode = new BinaryNode(nums[midIndex]);
		binaryNode.left = sortedArrayToBST(nums, left, midIndex - 1);
		binaryNode.right = sortedArrayToBST(nums, midIndex + 1, right);
		return binaryNode;

	}
}
