package com.java.munni;

public class Factorial {

	public static void main(String[] args) {
		int res=findFactorial(5);
		System.out.println("Factorial="+res);
		int res1=findFactorial(4);
		System.out.println("Factorial="+res1);
	}
	public static int findFactorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

}
