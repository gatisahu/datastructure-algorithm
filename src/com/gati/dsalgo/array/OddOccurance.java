/**
 * Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times.
 *  Find the number in O(n) time & constant space.
 *  Example:
 *  I/P = [1, 2, 3, 2, 3, 1, 3]
 *  O/P = 3
 */
package com.gati.dsalgo.array;

/**
 * @author sahug
 *
 */
public class OddOccurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OddOccurance occur = new OddOccurance();
		int ar[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = ar.length;
		System.out.println(occur.getOddOccurrence(ar, n));

	}

	public int getOddOccurrence(int ar[], int ar_size) {
		int i;
		int res = 0;
		for (i = 0; i < ar_size; i++) {
			res = res ^ ar[i];
		}
		return res;
	}

}
