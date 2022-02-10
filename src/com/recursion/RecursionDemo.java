package com.recursion;

/*
 * Write a recursive mathematical definition for computing
 *  2 to the power n
	 for a positive integer n.
 */
public class RecursionDemo {
	private static long def(long n) {
		if(n==0)
			return 1;
		else
			return 2*def(n-1);
	}
	public static void main(String[] args) {
		for(int n = 0;n <=20; n++) {
			System.out.printf("2 pow %d == %d%n", n,def(n));
		}
	}
}
