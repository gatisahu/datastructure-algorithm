package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		// Let us construct the BST shown in the above figure
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		LowestCommonAncestor ancestor = new LowestCommonAncestor();
		int n1 = 14, n2 = 10;
		Node t = ancestor.lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

		n1 = 14;
		n2 = 8;
		t = ancestor.lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

		n1 = 10;
		n2 = 22;
		t = ancestor.lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	}

	private Node lca(Node root, int n1, int n2) {

		if (root == null)
			return null;

		if (root.data > n1 && root.data > n2) {
			return lca(root.left, n1, n2);
		}
		if (root.data < n1 && root.data < n2) {
			return lca(root.right, n1, n2);
		}
		return root;
	}

}
