package com.gati.dsalgo.array;

import java.util.Arrays;

public class CloseSum {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2 };// { -1, 2, 1, -4 };
		int target = 3;
		CloseSum closeSum = new CloseSum();
		System.out.println(closeSum.threeSumClosest(nums, target));
	}

	public int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);
		int minDiff = Integer.MAX_VALUE;
		int diff = 0;
		int sum = 0;
		for (int index = 0; index < nums.length - 2; index++) {
			int firstElement = nums[index];
			int start = index + 1;
			int end = nums.length - 1;

			while (start < end) {
				int result = firstElement + nums[start] + nums[end];
				if (result == target) {
					return result;
				}
				diff = Math.abs(result - target);
				if (minDiff > diff) {
					minDiff = diff;
					sum = result;
				}
				if (result < target) {
					start++;
				} else {
					end--;
				}
			}
		}
		return sum;

	}
}
