package com.recursion;

public class Factorial {
	public static long factorial(long number) {
		if(number <= 1)
			return 1;
		else
			return (number * factorial(number-1));
	}
	public static void main(String[] args) {
		for(int i = 0; i <=200;i++) {
			System.out.printf("%d! = %d%n", i,factorial(i));
		}
	}
}
