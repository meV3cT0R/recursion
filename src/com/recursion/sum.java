package com.recursion;

public class sum {
	private static long sum(long n) {
		if(n <=0)
			return 0;
		else
			return n + sum(n-1);
	}
	public static void main(String[] args) {
		for(int n=0; n <= 20;n++) {
			System.out.printf("sum(%d) == %d%n", n,sum(n));
		}
	}
}
