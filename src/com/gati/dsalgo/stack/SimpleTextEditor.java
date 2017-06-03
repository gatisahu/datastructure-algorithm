/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author sahug
 *
 */
public class SimpleTextEditor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		Stack<String> stack = new Stack<>();
		for (int a0 = 0; a0 < t; a0++) {
			int operationType = in.nextInt();
			String str = null;
			if (operationType != 4)
				str = in.next();
			switch (operationType) {
			case 1:
				if (stack.isEmpty()) {
					stack.push(str);
				} else {
					String tempStr = stack.peek();
					stack.push(tempStr + str);
				}
				break;
			case 2:
				String tempStr = stack.peek();
				int endIndex = tempStr.length() - Integer.parseInt(str);
				String newString = tempStr.substring(0, endIndex);
				stack.push(newString);

				break;
			case 3:
				System.out.println(stack.peek().charAt(Integer.parseInt(str) - 1));
				break;
			case 4:
				stack.pop();
				break;

			default:
				break;
			}

		}
	}

}
