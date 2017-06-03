/**
 * 
 */
package com.gati.dsalgo.tree;

import java.util.LinkedList;
import java.util.Stack;

import com.gati.dsalgo.tree.BinaryTree.Node;

/**
 * @author sahug
 *
 */
public class TreeTopView {

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
		tree.root.left.left.right =new Node(9);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.right.left=new Node(7);
		TreeTopView topView =new TreeTopView();
		topView.top_view(tree.root);
	}
	void top_view(Node root)
	{
	 Stack stack =new Stack<>();
	 Node node=root.left;
	  while(node!=null){
		  stack.push(node.data);
		  node= node.left;
	  }
	  while(!stack.isEmpty()){
		  System.out.print(stack.pop() +" ");
	  }
	  System.out.print(root.data+" ");
	   node=root.right;
	  while(node!=null){
		  System.out.print(node.data+" ");
		  node= node.right;
	  }
	}
}
