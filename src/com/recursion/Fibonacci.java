package com.recursion;

import java.util.Scanner;
public class Fibonacci {
	public static long fib(long index) {
		if(index == 0)
			return 0;
		else if(index == 1)
			return 1;
		else
			return fib(index-1) + fib(index-2);
	}
	
	public static void main(String[] args) {
		while(true) {
			try (Scanner input = new Scanner(System.in)) {
				System.out.println();
				
				System.out.println("ctrl +c to quit");
				System.out.print("Enter a index : ");
				long index = input.nextLong();
				
				System.out.printf("fibnacci number : %d%n", fib(index));
			}
		}
	}
}
