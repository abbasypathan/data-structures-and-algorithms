package com.datastructures.stacks.usingsinglylinkedlist;

public class MyStacksDemo {

	public static void main(String[] args) {
		MyStacks myStacks = new MyStacks(12);
		
		myStacks.push(13);
		
		myStacks.pop();
		
		myStacks.printStack();
		myStacks.printTop();
		myStacks.printHeight();
	}
}
