/**
 * 
 */
package com.gati.dsalgo.linkedlist;

/**
 * @author sahug
 *
 */
public class SinglyLinkelistDriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Driver program to test above functions. Ideally this function should
		 * be in a separate user class. It is kept here to keep code compact
		 */

		/* Start with the empty list */
		SinglyLinkedList llist = new SinglyLinkedList();

		// Insert 6. So linked list becomes 6->NUllist
		llist.add(6);

		// Insert 7 at the beginning. So linked list becomes
		// 7->6->NUllist
		llist.addFirst(7);

		// Insert 1 at the beginning. So linked list becomes
		// 1->7->6->NUllist
		llist.addFirst(1);

		// Insert 4 at the end. So linked list becomes
		// 1->7->6->4->NUllist
		llist.add(4);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();
	}

}
