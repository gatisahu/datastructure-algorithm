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
public class BalancedBrackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();

			if (balancedBrackets(s))
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	public static boolean balancedBrackets(String inputStr) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < inputStr.length(); i++) {

			char ch = inputStr.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else {

				if (!stack.isEmpty() && ((stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')
						|| (stack.peek() == '(' && ch == ')'))) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		return false;

	}
}
