package com.datastructures.recursion.binarysearchtree;

public class BinarySearchTree {

	public BinaryNode root;

	public void rInsert(int value) {
		if (this.root == null) {
			this.root = new BinaryNode(value);
		}
		rInsert(this.root, value);
	}

	public boolean rContains(int value) {
		return rContains(this.root, value);
	}

	public void deleteNode(int value) {
		deleteNode(this.root, value);
	}

	private BinaryNode deleteNode(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			return null;
		}
		if (value < currentNode.value) {
			currentNode.left = deleteNode(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = deleteNode(currentNode.right, value);
		} else {
			if (currentNode.left == null && currentNode.right == null) {
				return null;
			} else if (currentNode.left == null) {
				currentNode = currentNode.right;
			} else if (currentNode.right == null) {
				currentNode = currentNode.left;
			} else {
				int subTreeMinValue = minValue(currentNode.right);
				currentNode.value = subTreeMinValue;
				currentNode.right = deleteNode(currentNode.right, subTreeMinValue);
			}
		}
		return currentNode;
	}

	public int minValue(BinaryNode binaryNode) {
		while (binaryNode.left != null) {
			binaryNode = binaryNode.left;
		}
		return binaryNode.value;
	}

	private BinaryNode rInsert(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			return new BinaryNode(value);
		}
		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = rInsert(currentNode.right, value);
		}

		return currentNode;
	}

	private boolean rContains(BinaryNode currentNode, int value) {
		if (currentNode == null) {
			return false;
		}
		if (currentNode.value == value) {
			return true;
		}
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}
}
