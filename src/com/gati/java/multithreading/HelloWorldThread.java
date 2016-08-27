package com.gati.java.multithreading;

public class HelloWorldThread {

	public static void main(String[] args) throws InterruptedException {

		// This code creates an instance of Thread

		Thread newThread = new Thread() {
			public void run() {
				System.out.println("Hello from new thread");
			}
		};
		// Thread starts . From this point on,the thread’s run() method executes
		// concurrently.
		
		newThread.start();
		Thread.yield();
		System.out.println("Hello from main thread");
		newThread.join();
	}

}
