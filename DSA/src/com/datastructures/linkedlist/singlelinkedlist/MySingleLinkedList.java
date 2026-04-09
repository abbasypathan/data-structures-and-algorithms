package com.datastructures.linkedlist.singlelinkedlist;

import java.util.HashSet;
import java.util.Set;

public class MySingleLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int length;

	public MySingleLinkedList(int value) {
		SingleNode myNewNode = new SingleNode(value);
		this.head = myNewNode;
		this.tail = myNewNode;
		this.length = 1;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void prinList() {
		SingleNode temp = this.head;

		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void append(int value) {
		SingleNode node = new SingleNode(value);

		if (this.tail == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
		this.tail = node;
		this.length++;
	}

	public SingleNode removeLast() {
		if (this.length == 0) {
			return null;
		}
		SingleNode temp = head;
		SingleNode pre = head;
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
		SingleNode node = new SingleNode(value);
		if (this.length == 0) {
			this.head = node;
			this.tail = node;
		} else {
			node.next = this.head;
			this.head = node;
		}
		this.length++;
	}

	public SingleNode removeFirst() {
		if (this.length == 0) {
			return null;
		}
		SingleNode temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.length--;
		// Edge case when their is only one node
		if (this.length == 0) {
			this.tail = null;
		}
		return temp;
	}

	public SingleNode get(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		SingleNode temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		SingleNode temp = get(index);
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
		SingleNode neNode = new SingleNode(value);
		SingleNode temp = get(index - 1);
		neNode.next = temp.next;
		temp.next = neNode;
		this.length++;
		return true;
	}

	public SingleNode remove(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == this.length - 1) {
			return removeLast();
		}
		SingleNode pre = get(index - 1);
		SingleNode temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		this.length--;
		return temp;
	}

	public void reverse() {
		SingleNode temp = head;
		head = tail;
		tail = temp;
		SingleNode after = temp.next;
		SingleNode before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}

	public SingleNode findMiddleNode() {
		SingleNode slow = this.head;
		SingleNode fast = this.head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public boolean hasLoop() {
		SingleNode slow = this.head;
		SingleNode fast = this.head;
		boolean hasLoop = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				hasLoop = true;
				break;
			}
		}
		return hasLoop;
	}

	public SingleNode findKthFromEnd(int k) {
		if (k <= 0) {
			return null;
		}
		SingleNode slow = this.head;
		SingleNode fast = this.head;

		for (int i = 0; i < k; i++) {
			if (fast == null) {
				return null;
			}
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public void removeDuplicates() {
		SingleNode current = this.head;

		while (current != null) {
			SingleNode runner = current;
			while (runner.next != null) {
				if (runner.next.value == current.value) {
					runner.next = runner.next.next;
					length--;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public void removeDuplicatesUsingHashSet() {
		// Step 1: Create a Set to store unique node values.
		// We initialize a HashSet, which allows for fast look-up
		// to check for duplicates later on.
		Set<Integer> values = new HashSet<>();

		// Step 2: Initialize a Node variable 'previous' to null.
		// 'previous' will help us unlink a node if it's a duplicate.
		SingleNode previous = null;

		// Step 3: Initialize 'current' to point to the head node.
		// 'current' will be used to iterate through the linked list.
		SingleNode current = head;

		// Step 4: Begin iteration through the linked list.
		// We will keep iterating until 'current' becomes null,
		// indicating we have reached the end of the list.
		while (current != null) {

			// Step 5: Check for duplicates.
			// We check if the current node's value is already in the set.
			if (values.contains(current.value)) {

				// Step 6: Remove the duplicate node.
				// By setting 'previous.next' to 'current.next',
				// we remove the link to 'current', effectively
				// deleting it from the list.
				previous.next = current.next;

				// Step 7: Update the length of the list.
				// Since we removed a node, we decrement the length by 1.
				length -= 1;

			} else {

				// Step 8: Add unique value to set.
				// If the current value is not a duplicate,
				// we add it to the set for future reference.
				values.add(current.value);

				// Step 9: Update 'previous' node.
				// We set 'previous' to the 'current' node, as we
				// move forward in the list.
				previous = current;
			}

			// Step 10: Move to the next node.
			// We update 'current' to point to the next node in the list,
			// continuing our iteration.
			current = current.next;
		}
	}

	public int binaryToDecimal() {
		int decimal = 0;
		SingleNode temp = this.head;
		while (temp != null) {
			decimal = decimal * 2 + temp.value;
			temp = temp.next;
		}
		return decimal;
	}

	public void partitionList(int x) {

		if (head == null) {
			return;
		}
		SingleNode dummy1 = new SingleNode(0);
		SingleNode dummy2 = new SingleNode(0);

		SingleNode lessThan = dummy1;
		SingleNode greaterThan = dummy2;

		SingleNode temp = this.head;

		while (temp != null) {
			if (temp.value < x) {
				lessThan.next = temp;
				lessThan = temp;
			} else {
				greaterThan.next = temp;
				greaterThan = temp;
			}
			temp = temp.next;
		}
		greaterThan.next = null;
		lessThan.next = dummy2.next;
		this.head = dummy1.next;
	}

	public void reverseBetween(int startIndex, int endIndex) {
		if (head == null)
			return;

		SingleNode dummyNode = new SingleNode(0);
		dummyNode.next = head;
		SingleNode previousNode = dummyNode;

		for (int i = 0; i < startIndex; i++) {
			previousNode = previousNode.next;
		}

		SingleNode currentNode = previousNode.next;

		for (int i = 0; i < endIndex - startIndex; i++) {
			SingleNode nodeToMove = currentNode.next;
			currentNode.next = nodeToMove.next;
			nodeToMove.next = previousNode.next;
			previousNode.next = nodeToMove;
		}

		head = dummyNode.next;
	}

	public void swapPairs() {
		SingleNode dummy = new SingleNode(0);
		dummy.next = head;
		SingleNode previous = dummy;
		SingleNode first = head;

		while (first != null && first.next != null) {
			SingleNode second = first.next;

			// Perform the swap
			previous.next = second;
			first.next = second.next;
			second.next = first;

			// Move pointers
			previous = first;
			first = first.next;
		}

		head = dummy.next;
	}
}