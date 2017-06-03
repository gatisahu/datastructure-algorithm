/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class MaximumSumIn2D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] inputArray = new int[6][6];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				inputArray[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 4; k++) {
				int sum = inputArray[i][k] + inputArray[i][k + 1] + inputArray[i][k + 2];
				int middleSum = inputArray[i + 1][k + 1];
				int lasrSum = inputArray[i + 2][k] + inputArray[i+2][k + 1] + inputArray[i+2][k + 2];
				int totalSum = sum + middleSum + lasrSum;
				if (totalSum > maxSum) {
					maxSum = totalSum;
				}
			}
		}
		System.out.println(maxSum);
	}

}
