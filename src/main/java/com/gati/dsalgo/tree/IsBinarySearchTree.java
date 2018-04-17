/**
 * 
 */
package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class IsBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(6);
		// tree.root.right.right = new Node(7);
		IsBinarySearchTree binarySearchTree = new IsBinarySearchTree();
		if (binarySearchTree.checkBST(tree.root)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	boolean checkBST(Node root) {
		if (root == null) {
			return true;
		}

		if (root.left != null && root.data < getMaxValue(root.left)) {
			return false;
		}
		if (root.right != null && root.data > getMinValue(root.right)) {
			return false;
		}
		if (!checkBST(root.left) || !checkBST(root.right)) {
			return false;
		}

		return true;

	}

	private int getMaxValue(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int res = root.data;
		int lres = getMaxValue(root.left);
		int rres = getMaxValue(root.right);
		if (lres > res)
			res = lres;
		if (rres > res)
			res = rres;
		return res;

	}

	private int getMinValue(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int res = root.data;
		int lres = getMinValue(root.left);
		int rres = getMinValue(root.right);
		if (lres < res)
			res = lres;
		if (rres < res)
			res = rres;
		return res;

	}

	private boolean checkBSTUtil(Node root, int maxValue, int minValue) {
		if (root == null) {
			return true;
		}
		if (root.left != null && root.data < root.left.data || (root.data < minValue)) {
			return false;
		}
		if (root.right != null && root.data > root.left.data || (root.data > maxValue)) {
			return false;
		}
		if (!checkBSTUtil(root.left,root.data,minValue) || !checkBSTUtil(root.right,maxValue,root.data)) {
			return false;
		}
		return true;

	}

}
