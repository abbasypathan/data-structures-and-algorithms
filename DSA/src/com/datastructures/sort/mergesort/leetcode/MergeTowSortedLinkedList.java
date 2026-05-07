package com.datastructures.sort.mergesort.leetcode;

public class MergeTowSortedLinkedList {

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList(1);
		l1.append(3);
		l1.append(5);
		l1.append(7);

		MyLinkedList l2 = new MyLinkedList(2);
		l2.append(4);
		l2.append(6);
		l2.append(8);

		l1.merge(l2);

		l1.printAll();
	}
}
