/**
 * 
 */
package com.gati.dsalgo.algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sort the elements of an array by number of times they repeated in ascending
 * order.
 * 
 * Input :5 4 3 2 1 0 5 3 2 4 1 2 3 5
 * 
 * Before Sorting 5 4 3 2 1 0 5 3 2 4 1 2 3 5
 * 
 * After Sorting 0 1 1 4 4 2 2 2 3 3 3 5 5
 * 
 * @author sahug
 *
 */
public class SortByFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1, 0, 5, 3, 2, 4, 1, 2, 3, 5 };

		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		sortByFreqUsingHashMap(a);
	}

	@SuppressWarnings("unchecked")
	private static void sortByFreqUsingHashMap(int[] numArray) {

		Map<Integer, Integer> frequencyCountMap = new HashMap<Integer, Integer>();
		for (int number : numArray) {
			if (!frequencyCountMap.containsKey(number)) {
				frequencyCountMap.put(number, 0);
			}
			int frequency = frequencyCountMap.get(number);
			frequencyCountMap.put(number, frequency + 1);
		}
		List<Integer> list = new LinkedList(frequencyCountMap.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object obj1, Object obj2) {
				return ((Comparable) ((Map.Entry) (obj2)).getValue()).compareTo(((Map.Entry) (obj1)).getValue());
			}
		});
		int count = 0;

		/* Place the elements in to the array based on frequency */
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();

			int key = (int) entry.getKey();
			int val = (int) entry.getValue();

			for (int i = 0; i < val; i++) {
				numArray[count] = key;
				count++;
			}
		}
		 System.out.println("\nAfter Sorting");
	        for(int i=0; i<numArray.length; i++){
	            System.out.print(numArray[i] +" ");
	        }
	}

}
