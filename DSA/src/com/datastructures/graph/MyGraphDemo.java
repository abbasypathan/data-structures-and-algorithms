package com.datastructures.graph;

public class MyGraphDemo {

	public static void main(String[] args) {
		MyGraph myGraph = new MyGraph();
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");

		myGraph.addEdge("A", "B");
		myGraph.addEdge("A", "C");
		myGraph.addEdge("B", "C");

		myGraph.removeEdge("A", "C");

		myGraph.printGraph();

		myGraph.addEdge("A", "C");
		myGraph.addVertex("D");
		myGraph.addEdge("A", "D");
		myGraph.addEdge("B", "D");

		myGraph.printGraph();

		myGraph.removeVertex("D");
		
		myGraph.printGraph();
	}
}
