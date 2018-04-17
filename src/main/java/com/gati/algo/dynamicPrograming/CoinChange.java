/**
 * 
 */
package com.gati.algo.dynamicPrograming;

/**
 * @author sahug
 *
 */
public class CoinChange {
	
	int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int m = arr.length;
		int n = 4;
		CoinChange change = new CoinChange();
		System.out.println(change.countWays(arr, m, n));

	}

	private int countWays(int[] arr, int m, int n) {

		countWaysUtil(arr, m, n, 0);
		return count;
	}

	private void countWaysUtil(int[] arr, int m, int n, int result) {
		
		
		for (int i = 0; i < m; i++) {
			if (result+arr[i] == n) {
				count=count+1;
			}
			if (arr[i] < n-result) {
				 countWaysUtil(arr, m, n, result+arr[i]);
			}
		}
		
	}

}
