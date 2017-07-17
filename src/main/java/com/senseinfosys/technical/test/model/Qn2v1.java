package com.senseinfosys.technical.test.model;
import java.util.Scanner;

/**
 * A random number generator is governed by the following formula:
 * X(n+1) = (A * X(n) + B) % M
 *
 * Write a method that will return an integer array of
 * elements X(k) to X(k + i)
 *
 * For example, given:
 * X(1) = 5, A = 3, B = 2, M = 7, k = 3, i = 1
 *
 * X(2) = (3 * 5 + 2) % 7 = 3
 * X(3) = (3 * 3 + 2) % 7 = 4
 * X(4) = (3 * 4 + 2) % 7 = 0
 *
 * Result = {X(3), X(4)}
 *        = {4, 0}
 *
 * You may assume the following limits:
 * Integer A:  0 <= A <= M
 * Integer B:  0 <= B <= M
 * Integer X1: 0 <= X1 <= M
 * Integer M:  2 <= M <= 10^4
 * Integer k:  0 <= k <= 10^9
 * Integer i:  0 <= i <= 10
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
 * public int[] rng(int A, int B, int M, int X1, int k, int i) {
 * 	return new int[0];
 * }
 */
public class Qn2v1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        Qn2v1 q=new Qn2v1();
        q.rng(a,b,x,k,m);
    }
    public void rng(int a, int b, int x, int k, int m) {
    	for (int i = 1; i < k; i++) {
            x = getNextValue(a, x, b, m, k);
        }
        for (int i = k; i <= k + 4; i++) {
            System.out.print(x+", ");
            x = getNextValue(a, x, b, m, k);
        }
    }
    private static int getNextValue(int a, int x, int c, int m, int k) {
        return ((a * x) + c) % m;
    }

}