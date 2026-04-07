package com.datastructures.bigoofarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigOofArrayListDemo {

	public static void oprationOnArray() {

		// O(n) - Arrays.asList(1, 2, 4, 6, 7) add elements one by one
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7));
		
		// O(1) - It will directly fetch data at particular index
		integers.get(3);
		
		// O(1) - It will directly add 9 at last index
		integers.add(9);
		
		// O(n) - It will add element at 3rd index and shift other elements
		integers.add(3,7);
		
		// O(n) - It will remove element at 4th index and shift other elements
		integers.remove(4);
	}

	public static void main(String args[]) {
		oprationOnArray();
	}
}
