package com.java.munni;

public class Calculate {

	public static void main(String[] args) {
		int add=Calculate.addition(2,4);
		System.out.println("Addition of two no="+add);
		int sub=Calculate.subtraction(5,3);
		System.out.println("Subtration of two no="+sub);
		int mult=Calculate.multiplication(20,6);
		System.out.println("Multiplication="+mult);
	}
	public static int addition(int a,int b) {
		return a+b;
	}
	public static int subtraction(int a,int b) {
		return a-b;
	}
	public static int multiplication(int a,int b) {
		return a*b;
	}

}
