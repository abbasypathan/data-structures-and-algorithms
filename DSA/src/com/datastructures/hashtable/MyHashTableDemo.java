package com.datastructures.hashtable;

public class MyHashTableDemo {

	public static void main(String[] args) {

		MyHashTable myHashTable = new MyHashTable();
		myHashTable.set("paints", 100);
		myHashTable.set("nails", 98);
		myHashTable.set("tile", 50);
		myHashTable.set("lumber", 80);
		myHashTable.set("bolts", 66);

		myHashTable.printTable();

		System.out.println("Get tile : " + myHashTable.get("tile"));

		System.out.println("Keys :" + myHashTable.keys());
	}
}
