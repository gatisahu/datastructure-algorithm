/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author sahug
 *
 */
public class EvaluateExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] input1 = { "2", "2", "/" };
		EvaluateExpression expression = new EvaluateExpression();
		System.out.println(expression.evalRPN(populateList(input1)));
		String[] input2 = { "5", "1", "2", "+", "4", "*", "+", "3", "-"};
		System.out.println(expression.evalRPN(populateList(input2)));
		

	}

	public int evalRPN(ArrayList<String> a) {
		Stack<Integer> stack = new Stack<>();
		for (String str : a) {
			if (!stack.isEmpty() && isOperator(str)) {
				int op2 = stack.pop();
				int op1 = stack.pop();
				int res = performOperation(op1, op2, str);
				stack.push(res);
				continue;
			}
			stack.push(Integer.parseInt(str));
		}
		return stack.pop();
	}

	private int performOperation(int op1, int op2, String str) {
		int res = 0;
		switch (str) {
		case "+":
			res = op1 + op2;
			break;
		case "-":
			res = op1 - op2;
			break;
		case "*":
			res = op1 * op2;
			break;
		case "/":
			res = op1 / op2;
			break;
		}
		return res;
	}

	private boolean isOperator(String token) {
		if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
			return true;
		}
		return false;

	}

	private static ArrayList<String> populateList(String[] input) {
		ArrayList<String> resList = new ArrayList<>();
		for (String str : input) {
			resList.add(str);
		}
		return resList;
	}
}
