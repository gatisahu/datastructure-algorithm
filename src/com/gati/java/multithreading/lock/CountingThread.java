/**
 * 
 */
package com.gati.java.multithreading.lock;

/**
 * @author sahug
 *
 */
public class CountingThread extends Thread {
	private Counter counter;

	public CountingThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int x = 0; x < 10000; ++x)
			counter.increment();
	}

}
