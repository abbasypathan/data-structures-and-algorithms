package com.datastructures.linkedlist.doublylinkedlist;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		MyDoublyLinkedList myLinkedList = new MyDoublyLinkedList(11);

		myLinkedList.append(12);
		myLinkedList.append(13);

		myLinkedList.removeLast();

		myLinkedList.prepend(10);

		myLinkedList.removeFirst();

		System.out.println("Get at index : " + myLinkedList.get(0).value);

		myLinkedList.set(1, 13);

		myLinkedList.insert(1, 14);
		myLinkedList.insert(3, 15);

		System.out.println("Remove at index :" + myLinkedList.remove(2).value);

		myLinkedList.printList();

	}
}
