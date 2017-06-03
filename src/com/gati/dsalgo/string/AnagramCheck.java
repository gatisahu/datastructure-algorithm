package com.gati.dsalgo.string;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		AnagramCheck anagramCheck = new AnagramCheck();
		String input1 = "anagram";
		String input2 = "nagaram";
		boolean result = anagramCheck.isAnagram(input1, input2);
		System.out.println(result);
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] chArray1 = s.toCharArray();
		Arrays.sort(chArray1);
		char[] chArray2 = t.toCharArray();
		Arrays.sort(chArray2);
		if (String.valueOf(chArray1).equals(String.valueOf(chArray2))) {
			return true;
		}
		return false;

	}
}
