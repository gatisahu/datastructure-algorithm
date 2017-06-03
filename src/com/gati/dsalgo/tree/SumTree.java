/**
 * 
 */
package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class SumTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);
		SumTree sumTree = new SumTree();
		if (sumTree.isSumTree(tree.root) != 0)
			System.out.println("The given tree is a sum tree");
		else
			System.out.println("The given tree is not a sum tree");

	}

	private int isSumTree(Node root) {
		if ((root == null) || (root.left == null && root.right == null))
			return 1;
		int leftSum = sumTree(root.left);
		int rightSum = sumTree(root.right);
		if (root.data == leftSum + rightSum && isSumTree(root.left) == 1 && isSumTree(root.left) == 1) {
			return 1;
		}
		return 0;
	}

	int sumTree(Node node) {
		if (node == null)
			return 0;
		return sumTree(node.left) + node.data + sumTree(node.right);
	}
}
