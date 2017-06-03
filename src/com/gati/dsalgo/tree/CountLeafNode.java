/**
 * 
 */
package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class CountLeafNode {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/* create a tree */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		CountLeafNode countLeafNode = new CountLeafNode();
		/* get leaf count of the abve tree */
		/* get leaf count of the abve tree */
		System.out.println("The leaf count of binary tree is : " + countLeafNode.getLeafCount(tree.root));
	}

	private int getLeafCount(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return getLeafCount(root.left) + getLeafCount(root.right);

	}

}
