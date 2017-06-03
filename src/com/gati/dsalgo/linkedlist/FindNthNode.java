/**
 * 
 */
package com.gati.dsalgo.linkedlist;

/**
 * @author sahug
 *
 */
public class FindNthNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Start with empty list */
		SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();

		/*
		 * Use add to construct below list 1->6->7->12->15
		 */
		llist.add(1);
		llist.add(6);
		llist.add(7);
		llist.add(12);
		llist.add(15);
		llist.printList();
		/* Check the count function */
		System.out.println("Element at index 3 is " + llist.getNthNode(1, llist));
	}

}
