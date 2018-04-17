/**
 * 
 */
package com.gati.dsalgo.tree;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class InsertIntoBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(3);
		tree.root.left = new Node(5);
		tree.root.right = new Node(2);

	}
 public Node insert(Node root,int value){
	 if(root ==null){
		 return new Node(value);
	 }
	 if(root.data >value){
		 root.left=insert(root.left,value) ;
	 }else{
		 root.right=insert(root.right,value) ;
	 }
	return root;
	 
 }
}
