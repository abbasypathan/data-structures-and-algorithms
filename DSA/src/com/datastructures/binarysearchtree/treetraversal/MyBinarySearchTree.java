package com.datastructures.binarysearchtree.treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyBinarySearchTree {

	public BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	public boolean insert(int value) {
		BinaryNode newNode = new BinaryNode(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		BinaryNode temp = root;
		while (true) {
			if (newNode.value == temp.value)
				return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	public boolean contains(int value) {
		if (root == null)
			return false;
		BinaryNode temp = root;
		while (temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if (value > temp.value) {
				temp = temp.right;
			} else {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> BFS() {
		BinaryNode currentNode = this.root;
		Queue<BinaryNode> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		queue.add(currentNode);
		while (queue.size() > 0) {
			currentNode = queue.remove();
			results.add(currentNode.value);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return results;
	}

	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(BinaryNode currentNode) {
				results.add(currentNode.value);
				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		if (root != null) {
			new Traverse(root);
		}
		return results;
	}

	public ArrayList<Integer> DFSPostOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(BinaryNode currentNode) {

				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
				results.add(currentNode.value);
			}
		}

		if (root != null) {
			new Traverse(root);
		}
		return results;
	}

	public ArrayList<Integer> DFSInOrder() {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(BinaryNode currentNode) {

				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				results.add(currentNode.value);
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}

		if (root != null) {
			new Traverse(root);
		}
		return results;
	}

	public boolean isValidBST() {
		ArrayList<Integer> results = DFSInOrder();
		if (results == null || results.size() <= 1)
			return true;

		for (int i = 0; i < results.size() - 1; i++) {
			if (results.get(i) >= results.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public Integer kthSmallest(int k) {
		Stack<BinaryNode> stack = new Stack<>();
		BinaryNode node = this.root;

		while (!stack.isEmpty() || node != null) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			k -= 1;
			if (k == 0) {
				return node.value;
			}
			node = node.right;
		}
		return null;
	}
}
