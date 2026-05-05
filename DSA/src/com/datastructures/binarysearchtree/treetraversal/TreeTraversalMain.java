package com.datastructures.binarysearchtree.treetraversal;

public class TreeTraversalMain {

	public static void main(String[] args) {
		MyBinarySearchTree myBST = new MyBinarySearchTree();

		myBST.insert(50);
		myBST.insert(30);
		myBST.insert(70);
		myBST.insert(60);
		myBST.insert(40);
		myBST.insert(20);
		myBST.insert(80);

		System.out.println("Breadth First Search:");
		System.out.println(myBST.BFS());

		System.out.println("Depth First Search PreOrder:");
		System.out.println(myBST.DFSPreOrder());

		System.out.println("Depth First Search PostOrder:");
		System.out.println(myBST.DFSPostOrder());

		System.out.println("Depth First Search InOrder:");
		System.out.println(myBST.DFSInOrder());

		System.out.println("Is Valid BST:");
		System.out.println(myBST.isValidBST());

		System.out.println("Find Kth Smallest Node:");
		System.out.println(myBST.kthSmallest(3));
		System.out.println(myBST.kthSmallest(8));
	}
}
