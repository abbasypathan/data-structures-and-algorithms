package com.datastructures.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class DoubleLinkedListWithBigOofDemo {

	public static void operationOnLinkedList() {

		// O(n) - As it will add each element in list
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 4, 5, 7, 8, 9, 6));

		// O(1) - This will add element to first head as one more node
		linkedList.addFirst(45);

		// O(1) - This will add element to last tail as one more node, no need to iterate as it will have tail address
		linkedList.add(23);
		linkedList.addLast(22);

		// O(1) - This will remove first element and move head to next
		linkedList.remove();
		linkedList.removeFirst();

		// O(1) - This will remove last element and move tail to previous node
		linkedList.removeLast();
		
		// O(n) - need to iterate over list to remove
		linkedList.remove(2);
		
		// O(n) - need to iterate over list to add
		linkedList.add(4, 34);
		
		// O(1) - This will return first and last value no traversal needed
		linkedList.getFirst();
		linkedList.getLast();
		
		// O(n) - need to iterate over list to get value
		linkedList.get(5);
	}

	public static void main(String[] args) {
		operationOnLinkedList();
	}
}
