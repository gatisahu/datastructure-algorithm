/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author sahug
 *
 */
public class MaximumElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack<>();

		int length = scan.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			int operation = scan.nextInt();
			if (operation == 1) {
				int item = scan.nextInt();
				stack.push(item);
			} else if (operation == 2) {
				int number = (int) stack.pop();
				if (number == max) {
					Iterator<Integer> it = stack.iterator();
					while (it.hasNext()) {
						int temp = it.next();
						if (temp > max) {
							max = temp;
						}
					}
				}
			} else {
				System.out.println(max);
			}
		}

	}

}
