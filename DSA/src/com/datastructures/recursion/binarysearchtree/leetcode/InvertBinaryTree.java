package com.datastructures.recursion.binarysearchtree.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

	private BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	private BinaryNode insert(BinaryNode currentNode, int value) {
		if (currentNode == null)
			return new BinaryNode(value);

		if (value < currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = insert(currentNode.right, value);
		}
		return currentNode;
	}

	public void insert(int value) {
		if (root == null)
			root = new BinaryNode(value);
		insert(root, value);
	}

	public ArrayList<Integer> BFS() {
		BinaryNode currentNode = root;
		Queue<BinaryNode> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		if (currentNode != null) {
			queue.add(currentNode);
		}

		while (queue.size() > 0) {
			currentNode = queue.remove();
			if (currentNode != null) {
				results.add(currentNode.value);
				queue.add(currentNode.left);
				queue.add(currentNode.right);
			}
		}
		return results;
	}

	public void invert() {
		root = invertTree(root);
	}

	private BinaryNode invertTree(BinaryNode node) {
		if (node == null)
			return null;

		BinaryNode temp = node.left;
		node.left = invertTree(node.right);
		node.right = invertTree(temp);

		return node;
	}
}
