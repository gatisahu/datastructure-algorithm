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
public class SinglyLinkedList<E> {

	private Node<E> head;

	private int size = 0;

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

}
