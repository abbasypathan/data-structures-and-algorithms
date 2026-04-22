package com.datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class MyHeap {

	private List<Integer> myHeap;

	public MyHeap() {
		this.myHeap = new ArrayList<>();
	}

	public void insert(int value) {
		this.myHeap.add(value);
		int currentIndex = this.myHeap.size() - 1;

		while (currentIndex > 0 && this.myHeap.get(currentIndex) > this.myHeap.get(parent(currentIndex))) {
			swap(currentIndex, parent(currentIndex));
			currentIndex = parent(currentIndex);
		}
	}

	// Remove top node & rearrange heap to make complete tree
	public Integer remove() {
		if (this.myHeap.size() == 0) {
			return null;
		}

		if (this.myHeap.size() == 1) {
			// remove of array list will delete node/vertex and return the value
			return this.myHeap.remove(0);
		}
		int maxValue = this.myHeap.get(0);
		this.myHeap.set(0, this.myHeap.remove(this.myHeap.size() - 1));
		sinkDown(0);
		return maxValue;
	}

	private void sinkDown(int index) {
		int maxIndex = index;
		while (true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);

			if (leftIndex < this.myHeap.size() && this.myHeap.get(leftIndex) > this.myHeap.get(maxIndex)) {
				maxIndex = leftIndex;
			}

			if (rightIndex < this.myHeap.size() && this.myHeap.get(rightIndex) > this.myHeap.get(maxIndex)) {
				maxIndex = rightIndex;
			}

			if (maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
	}

	public List<Integer> getMyHeap() {
		return new ArrayList<>(this.myHeap);
	}

	private int leftChild(int index) {
		return 2 * index + 1;
	}

	private int rightChild(int index) {
		return 2 * index + 2;
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	private void swap(int index1, int index2) {
		int temp = this.myHeap.get(index1);
		this.myHeap.set(index1, this.myHeap.get(index2));
		this.myHeap.set(index2, temp);
	}
}
