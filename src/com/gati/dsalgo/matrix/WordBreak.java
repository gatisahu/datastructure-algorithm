/**
 * 
 */
package com.gati.dsalgo.matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sahug
 *
 */
public class WordBreak {
	private static final Set dictionary = new HashSet<>();
	static {
		String[] arr = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i", "love",
				"ice", "cream" };
		for (String word : arr) {
			dictionary.add(word);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordBreak wordBreak = new WordBreak();
		System.out.println("First Test:\n");
		wordBreak.wordBreak("iloveicecreamandmango");
		System.out.println("\nSecond Test:\n");
		wordBreak.wordBreak("ilovesamsungmobile");
	}

	private void wordBreak(String string) {
		wordBreakUtil(string, string.length(), "");
	}

	private void wordBreakUtil(String string, int length, String result) {

		for (int index = 1; index <= length; index++) {
			String prefix = string.substring(0, index);
			if (isValidWord(prefix)) {
				if (index == length) {
					System.out.println(result + prefix);
					
				}
				//System.out.println(result + prefix);
				wordBreakUtil(string.substring(index), length - index, result + prefix + " ");
			}
		}
	}

	private boolean isValidWord(String word) {
		return dictionary.contains(word);
	}
}
