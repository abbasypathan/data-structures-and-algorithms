package com.datastructures.queue.leetcode;

public class QueueUsingArrayList {

	public static void main(String[] args) {
		Stack<Integer> stack;

		// Test 1: Pop single element
		System.out.println("Test 1: Pop Single Element");
		stack = new Stack<>();
		stack.push(10);
		System.out.println("Popped: " + stack.pop());
		System.out.println("Expected Stack: empty");
		System.out.println("Actual Stack:");
		stack.printStack();
		System.out.println("Peek: " + stack.peek());
		System.out.println("Size: " + stack.size());
		System.out.println();

		// Test 2: Pop multiple elements (LIFO order)
		System.out.println("Test 2: Pop Multiple Elements (LIFO)");
		stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Popped: " + stack.pop()); // Expect 3
		System.out.println("Popped: " + stack.pop()); // Expect 2
		System.out.println("Popped: " + stack.pop()); // Expect 1
		System.out.println("Expected Stack: empty");
		System.out.println("Actual Stack:");
		stack.printStack();
		System.out.println();

		// Test 3: Pop leaves correct remainder
		System.out.println("Test 3: Pop Leaves Correct Remainder");
		stack = new Stack<>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println("Popped: " + stack.pop()); // Expect 7
		System.out.println("Expected Stack (top to bottom): 6, 5");
		System.out.println("Actual Stack:");
		stack.printStack();
		System.out.println("Peek: " + stack.peek());
		System.out.println("Size: " + stack.size());
		System.out.println();

		// Test 4: Pop from empty stack
		System.out.println("Test 4: Pop from Empty Stack");
		stack = new Stack<>();
		System.out.println("Popped: " + stack.pop()); // Expect null
		System.out.println("Expected Stack: empty");
		System.out.println("Actual Stack:");
		stack.printStack();
		System.out.println("Peek: " + stack.peek());
		System.out.println("Size: " + stack.size());
		System.out.println();
	}
}
