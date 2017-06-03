/**
 * 
 */
package com.gati.dsalgo.tree;

import java.util.ArrayList;
import java.util.List;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class BinaryTree {

	public Node root;

	public static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

}
