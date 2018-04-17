/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class MaximumArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 26;
		int h[] = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int maxHeight = Integer.MIN_VALUE;

		for (int i = 0; i < word.length(); i++) {
			int charHeight = h[word.charAt(i)-'a'];
			if (charHeight > maxHeight) {
				maxHeight = charHeight;
			}

		}
		int area = word.length() * maxHeight;
		System.out.println(area);

	}

}
