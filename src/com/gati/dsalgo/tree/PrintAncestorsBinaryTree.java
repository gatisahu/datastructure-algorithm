/**
 * 
 */
package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class PrintAncestorsBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		/*
		 * Construct the following binary tree 1 / \ 2 3 / \ 4 5 / 7
		 */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(7);
		PrintAncestorsBinaryTree binaryTree = new PrintAncestorsBinaryTree();
		binaryTree.printAncestors(tree.root, 7);

	}

	private boolean printAncestors(Node root, int i) {
		if(root==null){
			return false;
		}
		if(root.data ==i){
			return true;
		}
		if(printAncestors(root.left, i) ||printAncestors(root.left, i)){
			System.out.println(root.data);
			return true;
		}
		return false;
		

	}

}
