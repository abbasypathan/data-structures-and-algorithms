package com.datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyGraph {

	private HashMap<String, List<String>> adjList = new HashMap<>();

	public boolean addVertex(String vertex) {
		if (this.adjList.get(vertex) == null) {
			this.adjList.put(vertex, new ArrayList<>());
		}
		return false;
	}

	public boolean addEdge(String vertex1, String vertex2) {
		if (this.adjList.get(vertex1) != null && this.adjList.get(vertex2) != null) {
			this.adjList.get(vertex1).add(vertex2);
			this.adjList.get(vertex2).add(vertex1);
			return true;
		}
		return false;
	}

	public boolean removeEdge(String vertex1, String vertex2) {
		if (this.adjList.get(vertex1) != null && this.adjList.get(vertex2) != null) {
			this.adjList.get(vertex1).remove(vertex2);
			this.adjList.get(vertex2).remove(vertex1);
			return true;
		}
		return false;
	}

	public boolean removeVertex(String vertex) {
		if (this.adjList.get(vertex) != null) {
			for (String str : this.adjList.get(vertex)) {
				this.adjList.get(str).remove(vertex);
			}
			this.adjList.remove(vertex);
		}
		return false;
	}

	public void printGraph() {
		System.out.println(adjList);
	}
}
