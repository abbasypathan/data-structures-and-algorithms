package com.datastructures.recursion.binarysearchtree;

public class BinarySearchTreeUsingRecursionDemo {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.rInsert(2);
		binarySearchTree.rInsert(1);
		binarySearchTree.rInsert(3);
		
		System.out.println(binarySearchTree.rContains(3));
		System.out.println(binarySearchTree.rContains(4));
		
		binarySearchTree.deleteNode(2);

		System.out.println(binarySearchTree.root.value);
		System.out.println(binarySearchTree.root.left.value);
		System.out.println(binarySearchTree.root.right);
		
		
	}
}
