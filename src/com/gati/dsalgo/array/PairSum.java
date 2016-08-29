/**
 * Let Array be {1, 4, 45, 6, 10, -8} and sum to find be 16 
 * Find two element whose Sum is 16
 * Sort the array in non-decreasing order.
 * 2) Initialize two index variables to find the candidate 
 *   elements in the sorted array.
 *     (a) Initialize first to the leftmost index: l = 0
 *     (b) Initialize second  the rightmost index:  r = ar_size-1
 * 3) Loop while l < r.
 *     (a) If (A[l] + A[r] == sum)  then return 1
 *     (b) Else if( A[l] + A[r] <  sum )  then l++
 *     (c) Else r--    
 *   4) No candidates in whole array - return 0 
 */
package com.gati.dsalgo.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sahug
 *
 */
public class PairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputArray = { 1, 4, 45, 6, 10, -8, 12 };
		int sum = 16;
		PairSum pairSum = new PairSum();
		// pairSum.printPairs(inputArray, sum);
		//pairSum.printPairsWithExtraSpace(inputArray, sum);
		pairSum.printPairsWithExtraSpaceOptimize(inputArray, sum);
	}

	public void printPairs(int[] inputArray, int sum) {

		// Sort the input Array
		Arrays.sort(inputArray);
		int left = 0;
		int right = inputArray.length - 1;
		// Loop thorough the array if sum of array equal to given sum tehn
		// print.
		// if sum of array is less than given sum then increase left pointer
		while (left < right) {
			if (inputArray[left] + inputArray[right] == sum) {
				System.out.println("First Element  " + inputArray[left] + " Second  Element   " + inputArray[right]);
				left++;
				right--;
			} else if (inputArray[left] + inputArray[right] < sum) {
				left++;
			} else {
				right--;
			}
		}
	}

	public void printPairsWithExtraSpace(int[] inputArray, int sum) {

		Set<Integer> inputSet = new HashSet<Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			inputSet.add(inputArray[i]);
		}
		for (int i = 0; i < inputArray.length; i++) {
			int requiredNum = sum - inputArray[i];
			if (inputSet.contains(requiredNum)) {
				inputSet.remove(inputArray[i]);
				System.out.println("First Element  " + inputArray[i] + " Second  Element   " + requiredNum);
			}
		}
	}

	public void printPairsWithExtraSpaceOptimize(int[] inputArray, int sum) {

		Set<Integer> inputSet = new HashSet<Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			int requiredNum = sum - inputArray[i];
			if (inputSet.contains(requiredNum)) {
				inputSet.remove(inputArray[i]);
				System.out.println("First Element  " + inputArray[i] + " Second  Element   " + requiredNum);
			}
			inputSet.add(inputArray[i]);
		}

	}

}
