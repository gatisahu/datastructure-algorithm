package com.gati.dsalgo.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * function to return maximum occurring character in the input string e.g., if
 * input string is “test” then function should return ‘t’.
 *
 */
public class MaxOccuringChar {

	public static void main(String[] args) {
		MaxOccuringChar maxOccuringChar = new MaxOccuringChar();
		System.out.println(maxOccuringChar.getMaxOccuringCharWithoutSpace("test"));
		System.out.println(maxOccuringChar.getMaxOccuringCharWithSpace("test"));

	}

	public char getMaxOccuringCharWithoutSpace(String inputString) {
		char[] charArray = inputString.toCharArray();
		java.util.Collection<String> resSet = new java.util.HashSet<>();
		Arrays.sort(charArray);
		char currentMaxChar = charArray[0];
		char maxChar = 0;
		int currentMaxCount = 0;
		int maxCount = 0;
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == currentMaxChar) {
				currentMaxCount++;
			} else {
				if (maxCount < currentMaxCount) {
					maxCount = currentMaxCount;
					maxChar = currentMaxChar;
				}
				currentMaxCount = 1;
				currentMaxChar = charArray[i];
			}
		}
		if (maxCount < currentMaxCount) {
			maxCount = currentMaxCount;
			maxChar = currentMaxChar;
		}
		return maxChar;

	}

	public char getMaxOccuringCharWithSpace(String inputString) {
		int count[] = new int[256];
		int max = -1;
		char result = 0;
		int len = inputString.length();
		for (int i = 0; i < len; i++)
			count[inputString.charAt(i)]++;

		for (int i = 0; i < len; i++) {
			if (max < count[inputString.charAt(i)]) {
				max = count[inputString.charAt(i)];
				result = inputString.charAt(i);
			}
		}

		return result;

	}

}
