/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
package com.gati.dsalgo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sahug
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputArray = { 2, 7, 11, 15 };
		int sum = 9;
		TwoSum twoSum = new TwoSum();
		int[] result = twoSum.findTwoSum(inputArray, sum);
		System.out.println("first index" + result[0] + "End index" + result[1]);
		result = twoSum.findTwoSumWithoutOriginalIndex(inputArray, sum);
		System.out.println("first index" + result[0] + "End index" + result[1]);
		int[] inputArray1 = { 0, 4, 3, 0 };
		sum = 0;
		result = twoSum.twoSum(inputArray1, sum);
		System.out.println("first index" + result[0] + "End index" + result[1]);

	}

	// This will not keep the original index
	private int[] findTwoSumWithoutOriginalIndex(int[] nums, int target) {

		Arrays.sort(nums);
		int[] result = null;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int tempSum = nums[start] + nums[end];
			if (tempSum == target) {
				result = new int[2];
				result[0] = start;
				result[1] = end;
				return result;
			} else if (tempSum > target) {
				end--;
			} else {
				start++;
			}

		}
		return result;
	}

	// This method will not solve if input is { 0, 4, 3, 0 }
	private int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			indexMap.put(nums[i], i);
		}
		Arrays.sort(nums);
		int[] result = null;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int tempSum = nums[start] + nums[end];
			if (tempSum == target) {
				result = new int[2];
				result[0] = indexMap.get(nums[start]);
				result[1] = indexMap.get(nums[end]);
				;
				return result;
			} else if (tempSum > target) {
				end--;
			} else {
				start++;
			}

		}
		return result;
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
