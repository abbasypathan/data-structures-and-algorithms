package com.datastructures.dynamicprograming;

public class FibonacciSequence {
	static int count = 0;

	public static int fib(int n) {
		count++;
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci of : " + fib(6));
		System.out.println("Method call : " + count);
	}
}
