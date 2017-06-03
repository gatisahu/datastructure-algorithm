/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author sahug
 *
 */
public class QueueUsingStck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for (int a0 = 0; a0 < t; a0++) {
			int operationType = in.nextInt();
			int data = 0;
			if (operationType == 1)
				data = in.nextInt();
			switch (operationType) {
			case 1:
				stack1.push(data);
				break;
			case 2:
				if (stack2.isEmpty()) {
					Iterator<Integer> it = stack1.iterator();
					while (it.hasNext()) {
						stack2.push(stack1.pop());
					}
				}

				stack2.pop();
				break;
			case 3:
				if (stack2.isEmpty()) {
					Iterator<Integer> it = stack1.iterator();
					while (it.hasNext()) {
						stack2.push(stack1.pop());
					}
				}
				System.out.println(stack2.peek());
				break;
			}

		}
	}

}
