/**
 * 
 */
package com.gati.dsalgo.linkedlist;

/**
 * @author sahug
 * @param <E>
 * 
 *
 */
/**
 * @author sahug
 *
 * @param <E>
 */
/**
 * @author sahug
 *
 * @param <E>
 */
public class SinglyLinkedList<E> {

	private Node<E> head;

	private int size = 0;

	public int getSize() {
		return size;
	}

	/**
	 * Inserts the specified element at the beginning of this list.
	 *
	 * @param e
	 *            the element to add
	 */
	public void addFirst(E e) {
		linkFirst(e);
	}

	/**
	 * Appends the specified element to the end of this list.
	 *
	 * @param e
	 *            element to be appended to this list
	 * @return {@code true}
	 */
	public boolean add(E e) {
		linkLast(e);
		return true;
	}

	private void linkFirst(E e) {
		final Node<E> f = head;
		Node<E> newNode = new Node<E>(e, null);
		head = newNode;
		if (f != null) {
			newNode.next = f;
		}

		size++;

	}

	private void linkLast(E e) {
		Node<E> newNode = new Node<E>(e, null);
		if (head == null) {
			head = newNode;
		} else {
			Node<E> head = this.head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = newNode;
		}
		size++;
	}

	/**
	 * Given a key, deletes the first occurrence of key in linked list.
	 * 
	 * @param key
	 */
	public void deleteNode(E key) {
		Node<E> tempNode = head;
		Node<E> previousNode = null;
		if (head == null) {
			return;
		}
		if (tempNode != null && tempNode.data == key) {
			head = tempNode.next;
			return;
		}
		while (tempNode != null && tempNode.data != key) {
			previousNode = tempNode;
			tempNode = tempNode.next;
		}
		// If key was not present in linked list
		if (tempNode == null)
			return;

		// Unlink the node from linked list
		previousNode.next = tempNode.next;
		size--;
	}

	public void deleteNodeFrom(int position) {
		if (position == 0) {
			head.next = head;
		}
		Node tnode = head;
		Node prevNode = null;
		int count = 0;
		while (tnode != null && tnode.next != null) {
			count++;
			if (position == count) {
				prevNode.next = tnode.next;
			}
			prevNode = tnode;
			tnode = tnode.next;
		}
	}
	
	public void reverse(){
		Node prevNode=null;
		Node current=head;
		while(current !=null){
			Node tempNode=current.next;
			current.next=prevNode;
			prevNode=current;
			current=tempNode;
		}
		head=prevNode;
	}

	/**
	 * Constructs an empty list.
	 */
	public SinglyLinkedList() {
	}

	private static class Node<E> {
		E data;
		Node<E> next;

		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	/**
	 * 1. Initialize count = 0 2. Loop through the link list a. if count is
	 * equal to the passed index then return current node. b. Increment count
	 * c.change current to point to next of the current.
	 * 
	 * @param index
	 * @param llist
	 * @return
	 */
	public E getNthNode(int index, SinglyLinkedList<Integer> llist) {
		int size = llist.getSize();
		Node<E> tempNode = head;
		if (index > size) {
			return null;
		}
		int count = 1;
		while (tempNode != null) {
			if (count == index) {
				return tempNode.data;
			}
			tempNode = tempNode.next;
			count++;
		}
		return null;

	}

}
