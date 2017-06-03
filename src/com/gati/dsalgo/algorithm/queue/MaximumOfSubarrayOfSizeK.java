/**
 * 
 */
package com.gati.dsalgo.algorithm.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author sahug
 *
 */
public class MaximumOfSubarrayOfSizeK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		MaximumOfSubarrayOfSizeK msa = new MaximumOfSubarrayOfSizeK();
		int max[] = msa.maxSubArray(input, 4);
		for (int i : max) {
			System.out.print(i + " ");
		}
	}

	public int[] maxSubArray(int input[], int k) {
		Deque<Integer> queue = new LinkedList<Integer>();
		int max[] = new int[input.length - k + 1];
		int maxVal = Integer.MIN_VALUE;
		// first find max of first k values and make it 0th element of max array
		for (int i = 0; i < k; i++) {
			if (maxVal < input[i]) {
				maxVal = input[i];
			}
			if (queue.isEmpty()) {
				queue.offerLast(i);
			} else {
				while (!queue.isEmpty() && input[queue.peekLast()] <= input[i]) {
					queue.pollLast();
				}
				queue.offerLast(i);
			}

		}
		max[0] = maxVal;
		int index = 1;
		// continue from k till end of the input array
		for (int i = k; i < input.length; i++) {
			// if index of peek is k distance from i then its no value to us.
			// throw it away
			if (i - k + 1 > queue.peekFirst()) {
				queue.pollFirst();
			}
			while (!queue.isEmpty() && input[queue.peekLast()] <= input[i]) {
				queue.pollLast();
			}
			queue.offerLast(i);
			// Only reason first element survived was because it was biggest
			// element.
			// make it the max value for this k
			max[index] = input[queue.peekFirst()];
			index++;
		}
		return max;
	}
}
