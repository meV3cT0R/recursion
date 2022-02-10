package com.recursion;
/*
 * Write a recursive mathematical definition for computing xn
	 for a positive integer n
	and a real number x.
 */
public class XpowN {
	private static double def(double x,double n) {
		boolean isPositive = false;
		if(n ==0)
			return 1;
		if(n>0)
			isPositive =true;
		
		if(isPositive)
			return x* def(x,n-1);
		
		return 1/(x*def(x,Math.abs(n)-1));
	}
	
	public static void main(String[] args) {
		double x = 3;
		for(int n =0; n>=-20;n--) {
			System.out.printf("%.2f pow %d == %.20f%n", x,n,def(x,n));
		}
	}
}
