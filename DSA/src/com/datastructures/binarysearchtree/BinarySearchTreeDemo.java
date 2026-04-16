package com.datastructures.binarysearchtree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {

		BinarySearchTree myBinarySearchTree = new BinarySearchTree();

		myBinarySearchTree.insert(2);
		myBinarySearchTree.insert(1);
		myBinarySearchTree.insert(3);

		System.out.println("Root: " + myBinarySearchTree.root.value);
		System.out.println("\nRoot->Left: " + myBinarySearchTree.root.left.value);
		System.out.println("\nRoot->Right: " + myBinarySearchTree.root.right.value);
		
		System.out.println("Value COntains : "+myBinarySearchTree.contains(3));
		System.out.println("Value COntains : "+myBinarySearchTree.contains(9));
	}

}
