package com.gati.dsalgo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
		// int[] nums = { -4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0
		// };
		int[] nums = { 0, 0, 0 };
		List<List<Integer>> result = threeSum.threeSum(nums);
		System.out.println(result.toArray());

	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {

			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				boolean flag = true;
				while (start + 1 < nums.length && start < end && (nums[start] == nums[start + 1])) {
					if (flag && nums[i] + nums[start + 1] + nums[start] == 0) {
						addToResultList(i, start + 1, end, nums, result);
						flag = false;

					}
					start++;
				}
				flag = true;
				while (flag && end > 0 && start < end && nums[end] == nums[end - 1]) {
					if (nums[i] + nums[end - 1] + nums[end] == 0) {
						addToResultList(i, end - 1, end, nums, result);
						flag = false;
					}
					end--;
				}
				if (start < end && nums[i] + nums[start] + nums[end] == 0) {
					addToResultList(i, start, end, nums, result);
					start++;
					end--;
				} else if (start < end && nums[i] + nums[start] + nums[end] < 0) {
					start++;
				} else if (start < end) {
					end--;
				}

			}
			while (i + 1 < nums.length && (nums[i] == nums[i + 1])) {
				i++;
			}
		}
		return result;

	}

	private void addToResultList(int index1, int index2, int index3, int[] nums, List<List<Integer>> result) {
		List<Integer> triplet = new ArrayList<>();
		triplet.add(nums[index1]);
		triplet.add(nums[index2]);
		triplet.add(nums[index3]);
		result.add(triplet);
	}
}
