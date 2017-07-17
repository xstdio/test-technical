package com.senseinfosys.technical.test.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * G L Aruna Sameera
 */
public class Qn1Sameera {

	static void characterCount(String inputString) {
		Map<Character, Integer> charCountMap = new TreeMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> set = charCountMap.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		char[] result = new char[list.size()];
		int i = 0;
		for (Map.Entry<Character, Integer> entry : list) {
			result[i] = entry.getKey();
			i++;
		}
		System.out.println("result:"+new String(result));
	}
	

}