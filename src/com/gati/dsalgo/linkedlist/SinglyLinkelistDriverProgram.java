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
		//4 3 2 5 1
		/* Start with the empty list */
		SinglyLinkedList<Integer> llist = new SinglyLinkedList<Integer>();

		// Insert 6. So linked list becomes 6->NUllist
		llist.add(4);

		// Insert 7 at the beginning. So linked list becomes
		// 7->6->NUllist
		llist.add(3);

		// Insert 1 at the beginning. So linked list becomes
		// 1->7->6->NUllist
		llist.add(2);
		llist.add(5);
		llist.add(1);

		// Insert 4 at the end. So linked list becomes
		// 1->7->6->4->NUllist
		//llist.add(4);
		llist.printList();
		llist.deleteNode(3);
		llist.printList();
		//llist.reverse();;

		System.out.println("\nCreated Linked list is: ");
		//llist.printList();
	}

}
