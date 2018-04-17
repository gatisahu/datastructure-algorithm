/**
 * 
 */
package com.gati.dsalgo.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sahug Matrix= [1, 3, 5] [2, 6, 9] [3, 6, 9] A = [1, 2, 3, 3, 5, 6, 6,
 *         9, 9]
 *
 *         Median is 5. So, we return 5.
 */
public class FindMedianOfAMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		List<Integer> rowList = new ArrayList<>();
		rowList.add(1);
		rowList.add(3);
		rowList.add(5);
		matrix.add(rowList);
		rowList = new ArrayList<>();
		rowList.add(2);
		rowList.add(6);
		rowList.add(9);
		matrix.add(rowList);
		rowList = new ArrayList<>();
		rowList.add(3);
		rowList.add(6);
		rowList.add(9);
		matrix.add(rowList);
		FindMedianOfAMatrix aMatrix = new FindMedianOfAMatrix();
		System.out.println(aMatrix.findMedianOfAMatrix(matrix));
	}

	public int findMedianOfAMatrix(List<List<Integer>> matrix) {
		List<Integer> valueList = new ArrayList<>();
		for (List<Integer> tempList : matrix) {
			for (Integer number : tempList) {
				valueList.add(number);
			}
		}
		Collections.sort(valueList);
		int size = valueList.size() / 2;
		return valueList.get(size);

	}
}
