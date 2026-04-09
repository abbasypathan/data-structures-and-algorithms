package com.datastructures.linkedlist.doublylinkedlist;

public class MyDoublyLinkedList {

	private DoublyNode head;
	private DoublyNode tail;
	private int length;

	MyDoublyLinkedList(int value) {
		DoublyNode newNode = new DoublyNode(value);
		this.head = newNode;
		this.tail = newNode;
		this.length = 1;
	}

	public void append(int value) {
		DoublyNode newNode = new DoublyNode(value);
		if (this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
		}
		this.length++;
	}

	public DoublyNode removeLast() {
		if (this.length == 0) {
			return null;
		}
		DoublyNode temp = this.tail;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.tail = tail.prev;
			this.tail.next = null;
			temp.prev = null;
		}
		this.length--;
		return temp;
	}

	public void prepend(int value) {
		DoublyNode newNode = new DoublyNode(value);
		if (this.length == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
		this.length++;
	}

	public DoublyNode removeFirst() {
		if (this.length == 0) {
			return null;
		}
		DoublyNode temp = this.head;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
			this.head.prev = null;
			temp.next = null;
		}
		this.length--;
		return temp;
	}

	public DoublyNode get(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		DoublyNode temp = this.head;
		if (index < this.length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = this.tail;
			for (int j = this.length - 1; j > index; j--) {
				temp = temp.prev;
			}
		}
		return temp;
	}

	public boolean set(int index, int value) {
		DoublyNode temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > this.length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == this.length) {
			append(value);
			return true;
		}

		DoublyNode newNode = new DoublyNode(value);
		DoublyNode previous = get(index - 1);
		DoublyNode after = previous.next;

		previous.next = newNode;
		newNode.prev = previous;
		newNode.next = after;
		after.prev = newNode;
		this.length++;
		return true;
	}

	public DoublyNode remove(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		DoublyNode temp = get(index);
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		this.length--;
		return temp;
	}

	public boolean isPalindrome() {
		if (length <= 1)
			return true;

		DoublyNode forwardNode = head;
		DoublyNode backwardNode = tail;
		for (int i = 0; i < length / 2; i++) {
			if (forwardNode.value != backwardNode.value)
				return false;
			forwardNode = forwardNode.next;
			backwardNode = backwardNode.prev;
		}
		return true;
	}

	public void reverse() {
		DoublyNode current = head;
		DoublyNode temp = null;

		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		temp = head;
		head = tail;
		tail = temp;
	}

	public void printList() {
		DoublyNode temp = this.head;

		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}
