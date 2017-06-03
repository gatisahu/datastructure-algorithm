/**
 * 
 */
package com.gati.dsalgo.string;

/**
 * @author sahug
 *
 */
public class PermutationsWithRepetition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "ABC";
		System.out.println("All permutations with repetition of %s are: \n" + input);
		PermutationsWithRepetition permutationsWithRepetition = new PermutationsWithRepetition();
		permutationsWithRepetition.allLexicographic(input);

	}

	private void allLexicographic(String input) {
		char[] output = new char[input.length()];
		allLexicographicRec(input, 0, output);
	}

	private void allLexicographicRec(String input, int index, char[] output) {

		for (int j = 0; j < input.length(); j++) {
			// Fix the ith character at index and if this is not the last
			// index then recursively call for higher indexes
			output[index] = input.charAt(j);

			// If this is the last index then print the string stored in
			// data[]
			if (index == input.length() - 1)
				System.out.println(String.valueOf(output));
			else // Recur for higher indexes
				allLexicographicRec(input, index+1, output);
		}
	}

}
