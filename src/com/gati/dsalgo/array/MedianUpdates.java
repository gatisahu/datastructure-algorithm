/**
 * 
 */
package com.gati.dsalgo.array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sahug
 *
 */
public class MedianUpdates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a = { "r", "a", "a", "a", "r", "r", "r" };
		int[] x = { 1, 1, 2, 1, 1, 2, 1 };
		median(a, x);

	}

	static void median(String a[], int x[]) {
		int length = a.length;
		DecimalFormat df = new DecimalFormat("###.#");
		List<Integer> inputList = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			if (a[i] == "r") {
				Integer obj = x[i];
				boolean flag = inputList.remove(obj);
			} else {
				inputList.add(x[i]);
			}
			if (inputList.size() == 0) {
				System.out.println("wrong!");

			} else {
				Collections.sort(inputList);
				int length1 = inputList.size();
				if (length1 == 0) {
					System.out.println(inputList.get(0));
				}
				double result = 0;
				if (inputList.size() % 2 == 0) {
					result =(double) (inputList.get((length1 / 2) - 1) + inputList.get((length1 / 2))) / 2;
					System.out.println(df.format(result));

				} else {
					result = inputList.get((length1 / 2));
					System.out.println(df.format(result));
				}

			}
		}

	}
}
