/**
 * 
 */
package com.gati.dsalgo.graph;

import java.util.LinkedList;

/**
 * @author sahug
 *
 */
public class GraphDFS {

	private int V;
	private LinkedList<Integer> adj[];

	public static void main(String[] args) {
		GraphDFS g = new GraphDFS(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.DFS(2);
	}

	private void DFS(int i) {
		boolean[] visit = new boolean[4];

		DFSUtil(visit, i);
	}

	private void DFSUtil(boolean[] visit, int node) {
		visit[node] = true;
        System.out.println("node "+node);
		LinkedList<Integer> linkedList = adj[node];
		for (int index = 0; index < linkedList.size(); index++) {

			if (!visit[linkedList.get(index)]) {
				DFSUtil(visit, linkedList.get(index));
			}
		}
	}

	GraphDFS(int v) {
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
