package com.datastructures.linkedlist.practical;

public class MyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public MyLinkedList(int value) {
		Node myNewNode = new Node(value);
		this.head = myNewNode;
		this.tail = myNewNode;
		this.length = 1;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void prinList() {
		Node temp = this.head;

		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void append(int value) {
		Node node = new Node(value);

		if (this.tail == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
		this.tail = node;
		this.length++;
	}

	public Node removeLast() {
		if (this.length == 0) {
			return null;
		}
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		this.tail = pre;
		tail.next = null;
		this.length--;
		// This is edge condition when their is only one node
		if (length == 0) {
			this.head = null;
			this.tail = null;
		}
		return temp;
	}

	public void prepend(int value) {
		Node node = new Node(value);
		if (this.length == 0) {
			this.head = node;
			this.tail = node;
		} else {
			node.next = this.head;
			this.head = node;
		}
		this.length++;
	}

	public Node removeFirst() {
		if (this.length == 0) {
			return null;
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.length--;
		// Edge case when their is only one node
		if (this.length == 0) {
			this.tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
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
		Node neNode = new Node(value);
		Node temp = get(index - 1);
		neNode.next = temp.next;
		temp.next = neNode;
		this.length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == this.length - 1) {
			return removeLast();
		}
		Node pre = get(index - 1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		this.length--;
		return temp;
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
}