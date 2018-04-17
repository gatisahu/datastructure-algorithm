/**
 * 
 */
package com.gati.java.multithreading.lock;

/**
 * @author sahug
 *
 */
public class ThreadSafeCounter {

	private int count = 0;

	public synchronized void increment() {
		++count;
	}

	public synchronized int getCount() {
		return count;
	}

}
