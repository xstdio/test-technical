package com.senseinfosys.technical.test.candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * G L Aruna Sameera
 */
public class Qn2 {

	public int[] rng(int A, int B, int M, int X1, int k, int i) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int j = k; j <= k + i; j++) {
			arr.add(factorial(A, B, M, X1, k, i));
		}
		return convertIntegers(arr);
	}

	public static int factorial(int A, int B, int M, int X1, int k, int i) {
		if (X1 <= M) {
			if (X1 == 0) {
				return B % M;
			} else {
				X1 = (3 * factorial(A, B, M, X1 - 1, k, i) + B) % M;
				return X1;
			}
		} else {
			return X1;
		}
	}

	public static int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}

}