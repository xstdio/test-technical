package com.senseinfosys.technical.test.js;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class TestTechnicalJs {
	
	@Test 
	public void testJsStream() {
		String method = "testJs";
		System.out.println("===|" + method + "|BEG|===");
		
		Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");

        //Map -> Stream -> Filter -> Map
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println(collect); //output : {2=heroku.com}
		System.out.println("===|" + method + "|END|===");
	}
	
	@Test
	public void testJsQn3() {
		String method = "testJsQn3";
		System.out.println("===|" + method + "|BEG|===");
		
//		int[] a = { 1, 1, -1, 4, 6, 10 };
//		int[] b = { 6, 1, 10 };
//		Set<T> setA = new HashSet<T>(Arrays.asList(a));
//		Set<T> setB = new HashSet<T>(Arrays.asList(b));
		
		Integer[] a = new Integer[]{ 1, 1, -1, 4, 6, 10 };
		List<Integer> aList = Arrays.asList(a);
		Set<Integer> aSet = new HashSet<Integer>(aList);
		
		Integer[] b = new Integer[]{ 6, 1, 10 };
		List<Integer> bList = Arrays.asList(b);
		Set<Integer> bSet = new HashSet<Integer>(bList);
		
		aSet.removeAll(bSet);
		System.out.println(Arrays.toString(aSet.toArray()));
		System.out.println(Arrays.toString(bSet.toArray()));
		System.out.println("===|" + method + "|END|===");
	}
	
}
