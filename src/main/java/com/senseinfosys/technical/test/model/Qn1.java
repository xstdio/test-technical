package com.senseinfosys.technical.test.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Given a string of lowercase characters, write a method that will
 * return an array of characters in descending order of frequency.
 * If multiple characters have the same the number of occurrences, output
 * them in alphabetical order.
 *
 * For example, given:
 * S = dcbadcbadcbadde
 *
 * Result = {'d', 'a', 'b', 'c', 'e'}
 * 'd' occurs 5 times,
 * 'a', 'b', 'c' occurs 3 times, so they are ordered alphabetically,
 * 'e' occurs 1 time
 *
 * You may assume the following limits:
 * String S: 0 <= |S| <= 1000
 * For each c in S: 'a' <= c <= 'z'
 *
 * Time Limit: 2sec
 * Memory Limit: 256MB
 *
 * The method should be compilable on OpenJDK 1.8.0_92 without
 * any additional libraries.
 *
 * You are allowed to create additional methods to structure your code.
 * You may use the below method signature.
 *
 * You are advised not to spend more than 30 minutes on this question.
 * 
 * public char[] charFrequency(String s) {
 * 	return new char[0];
 * }
 */
public class Qn1 {

	public void charFrequency(String str) {
		String method = "charFrequency";
		Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, 0);
        }

        for (char c : str.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(
                map.entrySet());
        Collections.sort(list, Collections
                .reverseOrder(new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1,
                            Map.Entry<Character, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }));

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() > 0) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println(" ");
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey()+" occurs "+entry.getValue());
            }
        }
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        Qn1 q=new Qn1();
        q.charFrequency(str);
    }

}