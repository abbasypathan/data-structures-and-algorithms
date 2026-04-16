package com.datastructures.queue.leetcode;

public class ReverseStringUsingStack {

	public static String reverseString(String value) {

		Stack<Character> stack = new Stack<>();
		String reversedString = "";
		for (char c : value.toCharArray()) {
			stack.push(c);
		}
		while (!stack.isEmpty()) {
			reversedString += stack.pop();
		}
		return reversedString;
	}

	public static void main(String[] args) {
		// Explain purpose
		System.out.println("These tests confirm reverseString works");
		System.out.println("for normal words, empty strings,");
		System.out.println("single characters, palindromes, and");
		System.out.println("strings with spaces and symbols.");
		System.out.println();

		// Test 1: Normal word
		System.out.println("Test 1: Normal Word");
		System.out.println("Input: 'hello'");
		System.out.println("Expected: 'olleh'");
		System.out.println("Actual: '" + reverseString("hello") + "'");
		System.out.println();

		// Test 2: Empty string
		System.out.println("Test 2: Empty String");
		System.out.println("Input: ''");
		System.out.println("Expected: ''");
		System.out.println("Actual: '" + reverseString("") + "'");
		System.out.println();

		// Test 3: Single character
		System.out.println("Test 3: Single Character");
		System.out.println("Input: 'A'");
		System.out.println("Expected: 'A'");
		System.out.println("Actual: '" + reverseString("A") + "'");
		System.out.println();

		// Test 4: Palindrome
		System.out.println("Test 4: Palindrome");
		System.out.println("Input: 'madam'");
		System.out.println("Expected: 'madam'");
		System.out.println("Actual: '" + reverseString("madam") + "'");
		System.out.println();

		// Test 5: Spaces and symbols
		System.out.println("Test 5: Spaces and Symbols");
		System.out.println("Input: 'abc !'");
		System.out.println("Expected: '! cba'");
		System.out.println("Actual: '" + reverseString("abc !") + "'");
		System.out.println();

	}
}
