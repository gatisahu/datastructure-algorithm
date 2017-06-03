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
public class PrintRootToLeafPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		PrintRootToLeafPath leafPath = new PrintRootToLeafPath();
		/* Print all root-to-leaf paths of the input tree */
		leafPath.printPaths(tree.root);
	}

	public void printPaths(Node root) {
		int path[] = new int[1000];
		printPaths(root, path, 0);

	}

	private void printPaths(Node root, int path[], int length) {
		if (root == null) {
			return;
		}
		path[length++] = root.data;
		if (root.left == null && root.right == null) {
			print(path, length);
		}
		printPaths(root.left, path, length);
		printPaths(root.right, path, length);
	}

	private void print(int path[], int length) {
		int i;
		for (i = 0; i < length; i++)
			System.out.print(path[i] + " ");
		System.out.println("");

	}
}
