package com.datastructures.hashtable;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {

	private int size = 7;
	private HashNode[] dataMap;

	MyHashTable() {
		this.dataMap = new HashNode[this.size];
	}

	public void set(String key, int value) {
		int index = hash(key);
		HashNode newNode = new HashNode(key, value);
		if (this.dataMap[index] == null) {
			this.dataMap[index] = newNode;
		} else {
			HashNode temp = this.dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		HashNode temp = this.dataMap[index];
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return 0;
	}

	public List<String> keys() {
		List<String> keys = new ArrayList<>();
		for (int i = 0; i < dataMap.length; i++) {
			HashNode temp = dataMap[i];
			while (temp != null) {
				keys.add(temp.key);
				temp = temp.next;
			}
		}
		return keys;
	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + " :");
			HashNode temp = dataMap[i];
			while (temp != null) {
				System.out.println("	{" + temp.key + "= " + temp.value + "}");
				temp = temp.next;
			}
		}
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++) {
			// This will return digit number of char
			int asciiValue = keyChars[i];
			// We will multiply asciiValue with prime number to get unique number & then
			// will do module with size of set so we can get min & max hash value
			// Here size is 7 so min is 0 & max is 6
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}
}
