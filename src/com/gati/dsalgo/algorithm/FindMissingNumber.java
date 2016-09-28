/**
 * 
 */
package com.gati.dsalgo.algorithm;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author sahug
 * 
 *         You are given list of n-1 integers and these integers are in the
 *         range of 1to n There is no duplicate in list.One of the integers is
 *         missing in the list.Write an efficient code to find missing integer.
 *         input :[1,2,4,6,3,7,8] Output :5
 * 
 *
 */
public class FindMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMissingNumber missingNumber = new FindMissingNumber();
		int[] inputArray = { 1, 2, 4, 6, 3, 7, 8 };
		System.out.println("Missing number " + missingNumber.findMissingNumber(inputArray));
		System.out.println("Missing number " + missingNumber.findMissingNumberUsingFormulae(inputArray, 8));
		System.out.println("Missing number " + missingNumber.findMissingNumberUsingExtraSpace(inputArray, 8));

	}

	/**
	 * This method will find the missing number from a given input array .The
	 * time complexity is O(n ln n)
	 * 
	 * 
	 * @param inputAarray
	 * @return
	 */
	public int findMissingNumber(int[] inputAarray) {
		// 1.Sort the inputArray
		Arrays.sort(inputAarray);
		// Loop through the element and try to find the difference between two
		// consecutive number and
		// difference is greater than 1 then missing number present in between
		// two number
		for (int i = 0; i < inputAarray.length - 1; i++) {
			if (inputAarray[i + 1] - inputAarray[i] > 1) {
				return inputAarray[i] + 1;
			}
		}
		return 0;

	}

	/**
	 * This method will find missing number by using formulae .This will first
	 * calculate sum of number from 1 to n input integer by formulae n*(n+1)/2
	 * then subtract the number one by one from sum.The overflow issue will
	 * come.
	 * 
	 * @param inputAarray
	 * @param num
	 * @return
	 */
	public int findMissingNumberUsingFormulae(int[] inputAarray, int num) {
		int sum = num * (num + 1) / 2;
		for (int i = 0; i < inputAarray.length; i++) {
			sum = sum - inputAarray[i];
		}
		return sum;

	}

	/**
	 * This is a general implementation to find the missing number by using extra space .In this implementation 
	 * we are using bitSet to mark which number present and by calling next clear bit it will return the false mark index and 
	 * that will be the number missing.This will also handle if multiple number.
	 * 
	 * 
	 * @param numbers
	 * @param count
	 * @return
	 */
	public int findMissingNumberUsingExtraSpace(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			return ++lastMissingIndex;
		}
		return lastMissingIndex;
	}

}
