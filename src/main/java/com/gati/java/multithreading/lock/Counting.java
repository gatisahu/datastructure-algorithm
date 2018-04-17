/**
 * 
 */
package com.gati.java.multithreading.lock;

/**
 * @author sahug
 *
 */
public class Counting {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		final Counter counter = new Counter();
		CountingThread t1 = new CountingThread(counter);
		CountingThread t2 = new CountingThread(counter);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter.getCount());

	}

}
