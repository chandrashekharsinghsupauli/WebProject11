package com.java.munni;

public class FindSimpleInterest {

	public static void main(String[] args) {
		float si,t=3,p=2000,r=4;
		si=calculateInteres(p, r, t);
		System.out.println("Simple Interest"+si);

	}
	public static float calculateInteres(float p,float r,float t)
	{
		float si=(p*r*t)/100;
		return si;
	}
}
