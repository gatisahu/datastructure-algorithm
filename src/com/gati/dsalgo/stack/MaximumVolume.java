/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sahug
 *
 */
public class MaximumVolume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int[] input1 ={0,1,0,2,1,0,1,3,2,1,2,1};
        MaximumVolume maximumVolume =new MaximumVolume();
        maximumVolume.trap(populateList(input1));
	}
	public int trap(final List<Integer> a) {
		return 0;
	}
	
	private static ArrayList<Integer> populateList(int[] input) {
		ArrayList<Integer> resList = new ArrayList<>();
		for (Integer num : input) {
			resList.add(num);
		}
		return resList;
	}
}
