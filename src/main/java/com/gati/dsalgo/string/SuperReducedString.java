/**
 * 
 */
package com.gati.dsalgo.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author sahug
 *
 */
public class SuperReducedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String output = getReduceStringWithStack(input);
		if (output.isEmpty()) {
			System.out.println("Empty String");
		} else {
			System.out.println(output);
		}

	}

	public static String getReduceStringWithStack(String input) {
		Stack<Character> stack = new Stack<>();
		stack.push(input.charAt(0));
		for (int i = 1; i < input.length(); i++) {
			if (!stack.isEmpty() && input.charAt(i) == stack.peek()) {
				stack.pop();
			}else{
				stack.push(input.charAt(i));
			}
		}
		String output = "";
		for (int i = 0; i < stack.size(); i++) {
			output = output + stack.elementAt(i);
		}
		return output;

	}

	public static String getReduceString(String input) {
		int count = 0;
		String output = "";
		boolean flag = false;
		while (true) {
			while (count < input.length()) {
				if (count + 1 < input.length() && input.charAt(count) == input.charAt(count + 1)) {
					count = count + 2;
					flag = true;
				} else {
					output = output + input.charAt(count);
					count++;
				}
			}
			if (!flag) {
				break;
			}
			count = 0;
			input = output;
			flag = false;
			output = "";
		}
		return output;
	}

}
