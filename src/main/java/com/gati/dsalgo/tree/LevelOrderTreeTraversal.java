/**
 * 
 */
package com.gati.dsalgo.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class LevelOrderTreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		/*
		 * creating a binary tree and entering the nodes
		 */
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		LevelOrderTreeTraversal levelOrderTreeTraversal = new LevelOrderTreeTraversal();
		levelOrderTreeTraversal.printLevelOrder(tree_level.root);
	}

	private void printLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> treeQueue = new LinkedList<Node>();
		treeQueue.offer(root);
		while (!treeQueue.isEmpty()) {
			Node node = treeQueue.poll();
			System.out.print(node.data +" ");
			if (node.left != null) {
				treeQueue.offer(node.left);
			}
			if (node.right != null) {
				treeQueue.offer(node.right);
			}
		}

	}

}
