package com.datastructures.dynamicprograming;

public class FibonacciSequenceUsingMemoization {

	public static Integer[] memo = new Integer[100];
	public static int count = 0;

	public static int fib(int n) {
		count++;
		if (memo[n] != null) {
			return memo[n];
		}
		if (n == 0 || n == 1) {
			return n;
		}
		memo[n] = fib(n - 1) + fib(n - 2);
		return memo[n];
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci of : " + fib(6));
		System.out.println("Method call : " + count);
	}
}
