/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.Stack;

/**
 * @author sahug
 *
 */
public class RedundantStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String input="((a + b))";
		RedundantStack redundantStack =new RedundantStack();
		//System.out.println(redundantStack.countRedundantBrace(input));
		String input1="(a+((b*c)+c))";  //"(a + (a + b))";
		System.out.println(redundantStack.countRedundantBrace(input1));
		//input="(a)";
		//System.out.println(redundantStack.countRedundantBrace(input));
		
	}

	private int countRedundantBrace(String a) {
		Stack<Character> stack=new Stack<>();
		int count=0;
		boolean flag=true;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) ==')'){
				char ch=stack.peek();
					while(!stack.isEmpty() &&ch !='('){
						ch=stack.pop();
						if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
							flag=false;
						}
					}
					if(flag){
						count++;
					}
					flag=true;
				
			}else{
				stack.push(a.charAt(i));
			}
		}
		return count;
	}

}
