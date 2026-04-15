package com.datastructures.stacks;

import java.util.Stack;

public class StacksWithBigOofDemo {

	public static void main(String[] args) {
		Stack<Integer> integers = new Stack<>();
		// Amortized O(1) : An operation may sometimes take O(n) time due to resizing in case of resizable array, but over many operations, the average time per operation is O(1).

		//Amortized O(1) - Adding one element top of array
		integers.add(12);
		integers.add(34);
		integers.add(56);
		
		//Amortized O(1) - Adding one element top of array
		integers.push(78);
		
		//O(1) - Remove one element top of array
		integers.pop();
		
		//O(n) - Need to add element at specific index and for other element need to change index as well
		integers.add(1, 67);
		
		//O(1) - This will return element at specific index
		integers.get(3);
		
		//O(n) - Need to remove particular index and readjustments for other element index
		integers.remove(4);
	}
}
