/**
 * 
 */
package com.gati.algo.dynamicPrograming;

/**
 * The Longest Increasing Subsequence (LIS) problem is to find the length of the
 * longest subsequence of a given sequence such that all elements of the
 * subsequence are sorted in increasing order. For example, the length of LIS
 * for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60,
 * 80}.
 * 
 * @author gati.sahu@gmail.com
 *
 */
public class LongestIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n) + "\n");
	}

	private static int lis(int[] arr, int n) {
		int res[] = new int[n];
		int maxCount = 1;
		/* Initialize LIS values for all indexes */
		for (int i = 0; i < n; i++)
			res[i] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && res[i] <= res[j] + 1) {
					res[i] = res[j] + 1;
				}
			}
			if (maxCount < res[i]) {
				maxCount = res[i];
			}
		}
		return maxCount;
	}

}
