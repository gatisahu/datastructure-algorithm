/**
*Majority Element: A majority element in an array A[] of size n is an element that
* appears more than n/2 times (and hence there is at most one such element).
* Write a function which takes an array and emits the majority element (if it exists), 
* otherwise prints NONE as follows:
* I/P : 3 3 4 2 4 4 2 4 4
* O/P : 4 
* I/P : 3 3 4 2 4 4 2 4
* O/P : NONE
* 
*/
package com.gati.dsalgo.array;

import java.util.Arrays;

/**
 * @author sahug
 *
 */
public class MajorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] inputArray={3,3,4,2,4,4,2,4,4};
		int[] inputArray = { 3, 3, 4, 2, 4, 4, 2, 4 };
		MajorityElement element = new MajorityElement();
		// int result = element.findMajorityElement(inputArray);
		//int result = element.findMajorityElementUsingSort(inputArray);
		int result = element.findCandidate(inputArray);
		if (result == -1) {
			System.out.println("No element present");
		} else {
			System.out.println("Majority  element present " + result);
		}

	}

	public int findMajorityElement(int[] inputArray) {
		int curreuntMax = 0;
		for (int i = 0; i < inputArray.length; i++) {
			curreuntMax = 0;
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					curreuntMax++;
					if (curreuntMax > inputArray.length / 2)
						return inputArray[j];
				}
			}
		}
		return -1;
	}

	public int findMajorityElementUsingSort(int[] inputArray) {
		Arrays.sort(inputArray);
		int currentElement = inputArray[0];
		int currentMax = 1;
		for (int i = 1; i < inputArray.length; i++) {
			if (currentElement == inputArray[i]) {
				currentMax++;
			} else {
				if (currentMax > inputArray.length / 2) {
					return currentElement;
				}
				currentMax = 1;
				currentElement = inputArray[i];
			}
		}
		if (currentMax > inputArray.length / 2) {
			return currentElement;
		}
		return -1;

	}

	/* Function to find the candidate for Majority Using Moore’s Voting Algorithm*/
	public int findCandidate(int inputArray[]) {
		int maj_index = 0, count = 1;
		int totalCount=0;
		int i;
		for (i = 1; i < inputArray.length; i++) {
			if (inputArray[maj_index] == inputArray[i])
				count++;
			else
				count--;
			if (count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		for (i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == inputArray[maj_index])
				totalCount++;
		}
		if (count > inputArray.length / 2)
			return inputArray[maj_index];
		return -1;
	}

}
