package com.datastructures.singlelinkedlist.practical;

public class MySingleLinkedListDemo {

	public static void main(String[] args) {
		MySingleLinkedList myLinkedList = new MySingleLinkedList(4);

		myLinkedList.append(5);
		myLinkedList.append(9);

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		System.out.println();
		System.out.println("Removed :" + myLinkedList.removeLast().value);
		System.out.println();

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		myLinkedList.append(45);

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		myLinkedList.removeFirst();

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		System.out.println("Get Operation :");
		System.out.println("Get : " + myLinkedList.get(1).value);

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		System.out.println("Set Operation :");
		System.out.println("Is Set ? : " + myLinkedList.set(1, 66));

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		System.out.println("Insert Operation :");
		System.out.println("Is inserted ? : " + myLinkedList.insert(1, 68));

		System.out.println("Head :" + myLinkedList.getHead().value);
		System.out.println("Tail :" + myLinkedList.getTail().value);
		System.out.println("Length :" + myLinkedList.getLength());

		myLinkedList.prinList();

		myLinkedList.reverse();
		System.out.println("After Reverse:");
		myLinkedList.prinList();

	}
}
