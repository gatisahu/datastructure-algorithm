/**
 * 
 */
package com.gati.dsalgo.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sahug
 *
 */
public class GraphBFS {

	private int V;
	private LinkedList<Integer> adj[];

	public static void main(String[] args) {
		GraphBFS g = new GraphBFS(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(2);

	}

	private void BFS(int i) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(i);
		boolean[] visit = new boolean[4];
		while (!queue.isEmpty()) {
			int node = queue.poll();
			visit[node] = true;
			System.out.println(node);
			LinkedList<Integer> linkedList = adj[node];
			for (int index = 0; index < linkedList.size(); index++) {
				if (!visit[linkedList.get(index)]) {
					queue.add(linkedList.get(index));
				}
			}

		}
	}

	GraphBFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
	}
}
