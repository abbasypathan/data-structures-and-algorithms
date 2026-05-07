package com.datastructures.sort.leetcode;

public class SelectionSortUsingLinkedList {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList(4);
		myLinkedList.append(2);
		myLinkedList.append(6);
		myLinkedList.append(5);
		myLinkedList.append(1);
		myLinkedList.append(3);

		System.out.println("Unsorted Linked List:");
		myLinkedList.printList();

		myLinkedList.selectionSort();

		System.out.println("\nSorted Linked List:");
		myLinkedList.printList();
	}
}
