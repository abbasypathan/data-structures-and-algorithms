package com.datastructures.queue.usingsinglylinkedlist;

public class MyQueue {

	public SinglyNode first;
	public SinglyNode last;
	public int length;

	MyQueue(int value) {
		SinglyNode newNode = new SinglyNode(value);
		this.first = newNode;
		this.last = newNode;
		this.length++;
	}

	public void enqueue(int value) {
		SinglyNode newNode = new SinglyNode(value);
		if (this.length == 0) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.next = newNode;
			this.last = newNode;
		}
		this.length++;
	}

	public SinglyNode dequeue() {
		if (this.length == 0) {
			return null;
		}
		SinglyNode temp = this.first;
		if (this.length == 1) {
			this.first = null;
			this.last = null;
		} else {
			this.first = this.first.next;
			temp.next = null;
		}
		this.length--;
		return temp;
	}

	public void printQueue() {
		SinglyNode temp = this.first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printFirst() {
		System.out.println("First : " + this.first.value);
	}

	public void printLast() {
		System.out.println("Last : " + this.last.value);
	}

	public void printLength() {
		System.out.println("Length : " + this.length);
	}
}
