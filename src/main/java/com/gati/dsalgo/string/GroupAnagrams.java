package com.gati.dsalgo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {

	public static void main(String[] args) {
		GroupAnagrams anagrams =new GroupAnagrams();
		String[] input ={"eat", "tea", "tan", "ate", "nat", "bat"};
		//String[] input ={""};
		List<List<String>> resultList=anagrams.groupAnagrams(input);
		System.out.println(resultList);
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> resultList = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] chArray = str.toCharArray();
			Arrays.sort(chArray);
			String tempString = String.valueOf(chArray);
			if (!map.containsKey(tempString)) {
				List<String> newList = new ArrayList<>();
				map.put(tempString, newList);
			}
			map.get(tempString).add(str);
		}
		for(String key:map.keySet()){
			resultList.add(map.get(key));
		}
		return resultList;

	}
}
