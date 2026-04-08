package com.datastructures.singlelinkedlist.practical;

public class FindMiddleNodeDemo {

	public static void main(String[] args) {
		MySingleLinkedList singleLinkedList = new MySingleLinkedList(23);
		singleLinkedList.append(34);
		singleLinkedList.append(76);
		singleLinkedList.append(87);

		System.out.println(singleLinkedList.findMiddleNode().value);
	}
}
