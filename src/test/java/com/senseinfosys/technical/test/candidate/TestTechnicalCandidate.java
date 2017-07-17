package com.senseinfosys.technical.test.candidate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

public class TestTechnicalCandidate {

	@Ignore
	@Test
	public void testQn1() {
		String method = "testQn1";
		System.out.println("===|" + method + "|BEG|===");

		String teststr = "dcbadcbadcbadde";
		Qn1 q = new Qn1();
		Qn1.characterCount(teststr);
		System.out.println("===|" + method + "|END|===");
	}
//	@Ignore
	@Test
	public void testQn2() {
		String method = "testQn2";
		System.out.println("===|" + method + "|BEG|===");
		int a = 3;
		int b = 2;
		int x = 5;
		int k = 3;
		int m = 7;
		Qn2 q = new Qn2();
		// q.rng(a, b, x, k, m);
		System.out.println(" ");
		System.out.println("===|" + method + "|END|===");
	}
	@Ignore
	@Test
	public void testQn3() {
		String method = "testQn3";
		System.out.println("===|" + method + "|BEG|===");
		int[] a = { 1, 1, -1, 4, 6, 10 };
		int[] b = { 6, 1, 10 };
		Qn3 q = new Qn3();
		int[] x = q.missingElements(a, b);
		System.out.println(Arrays.toString(x));
		System.out.println("===|" + method + "|END|===");
	}
	@Ignore
	@Test
	public void testQn4() {
		String method = "testQn4";
		System.out.println("===|" + method + "|BEG|===");

		String in = "xatypqrsbatmansw";
		Set<String> dictionary = new HashSet<>();
		dictionary.add("at");
		dictionary.add("bat");
		dictionary.add("atm");
		dictionary.add("man");
		dictionary.add("batman");
		dictionary.add("mans");

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8))));
		StringWriter sw = new StringWriter();
		BufferedWriter writer = new BufferedWriter(sw);
		try {
			Qn4.emitMatches(dictionary, reader, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sw.getBuffer());
		System.out.println("===|" + method + "|END|===");
	}
}
