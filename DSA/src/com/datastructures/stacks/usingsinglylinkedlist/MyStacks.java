package com.datastructures.stacks.usingsinglylinkedlist;

public class MyStacks {

	public SingleNode top;
	public int height;

	MyStacks(int value) {
		SingleNode newNode = new SingleNode(value);
		this.top = newNode;
		this.height = 1;
	}

	public void push(int value) {
		SingleNode newNode = new SingleNode(value);
		if (this.height == 0) {
			this.top = newNode;
		} else {
			newNode.next = this.top;
			this.top = newNode;
		}
		this.height++;
	}

	public SingleNode pop() {

		if (this.height == 0) {
			return null;
		}
		SingleNode temp = this.top;
		this.top = temp.next;
		temp.next = null;
		this.height--;
		return temp;
	}

	public void printStack() {
		SingleNode temp = this.top;
		System.out.println("Stack : ");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printTop() {
		System.out.println("Top : " + this.top.value);
	}

	public void printHeight() {
		System.out.println("Heightp : " + this.height);
	}
}
