package com.datastructures.recursion;

public class FactorialUsingRecursion {

	public static int factorial(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(31));
	}
}
