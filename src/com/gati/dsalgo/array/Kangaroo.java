/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class Kangaroo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if ((x2 - x1) % (v1 - v2) != 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}
