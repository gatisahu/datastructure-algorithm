package com.gati.dsalgo.algorithm;

/**
 * @author sahug Write an JAVA program to find the sum of contiguous sub-array
 *         within a one-dimensional array of nummber which has largest sum.
 *         Input :[-2,-3,4,-1,-2,1,5,-3] 
 *         
 *         Output :7
 */
public class LargestSumContiguosSubArray {

	public static void main(String[] args) {
		int[] inputArray = { -2, -3, 4, -1, -2, 1, 5, -3 };
		LargestSumContiguosSubArray largestSum = new LargestSumContiguosSubArray();
		System.out.println("Largest Sum" + largestSum.findLargestSumContiguosSubArray(inputArray));
		System.out.println("Largest Sum" + largestSum.findLargestSumContiguosSubArrayWithDP(inputArray));
		// For negative input
		int[] inputArray1 = { -2, -3, -4, -1, -2, -1, -5, -3 };
		System.out.println("Largest Sum" + largestSum.findLargestSumContiguosSubArray(inputArray1));
		System.out.println("Largest Sum" + largestSum.findLargestSumContiguosSubArrayWithDP(inputArray1));
	}

	/**
	 * This is a Java Program to Implement Kadane Algorithm. Kadane algorithm is to used to obtain 
	 * the maximum subarray sum from an array of integers.Algorithm does not work for all negative numbers
	 * It simply return 0,if all numbers are negative.
	 * 
	 * @param inputArray
	 * @return
	 */
	public int findLargestSumContiguosSubArray(int[] inputArray) {
		int max_so_far = 0;
		int current_max = 0;
		for (int i = 0; i < inputArray.length; i++) {
			current_max = current_max + inputArray[i];
			if (current_max < 0) {
				current_max = 0;
			} else {
				if (current_max > max_so_far) {
					max_so_far = current_max;
				}
			}
		}
		return max_so_far;
	}

	/**
	 * This method use dynamic programming to calculate maximum sub-array sum from an array of integers.This method implementation
	 * also handle input array having all negative values.
	 * 
	 * @param inputArray
	 * @return
	 */
	public int findLargestSumContiguosSubArrayWithDP(int[] inputArray) {

		int max_so_far = inputArray[0];
		int current_max = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			current_max = Math.max(current_max + inputArray[i], inputArray[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}
		return max_so_far;
	}
}
