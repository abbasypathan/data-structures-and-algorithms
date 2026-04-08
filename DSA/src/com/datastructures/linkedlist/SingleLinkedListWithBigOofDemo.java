package com.datastructures.linkedlist;

import com.datastructures.singlelinkedlist.practical.MySingleLinkedList;

public class SingleLinkedListWithBigOofDemo {

	public static void main(String[] args) {

		MySingleLinkedList myLinkedList = new MySingleLinkedList(23);

		// O(1) - This will append element at last considering we have tail reference and change tail to added node
		myLinkedList.append(34);

		// O(1) - This will add element first and just change the head
		myLinkedList.prepend(67);

		// O(n) - This will iterate over list and get the particular index node
		myLinkedList.get(1);

		// O(n) - This will iterate over list and set value to specified index
		myLinkedList.set(1, 56);

		// O(n) - This will iterate over list and add element to specified index
		myLinkedList.insert(1, 78);

		// O(n) - This will iterate over list and remove node at specified index
		myLinkedList.remove(1);

		// O(1) - This will change head to next and remove first
		myLinkedList.removeFirst();

		// O(n) - This will remove last element and set tail to previous but here need to iterate till last node
		myLinkedList.removeLast();

		// O(n) - This will iterate all node and print value
		myLinkedList.prinList();
	}
}
