package com.java.munni;

public class Pelindrom {

	public static void main(String[] args) {
		int n=121,s=0;
		s=Pelindrom.findPelindrom(n);
		if(s==n)
			System.out.println(s +" is pelindrom");
		else
			System.out.println(s +"is not pelindrom");
		
	}
	public static int findPelindrom(int n) {
		int r,s=0;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		return s;
		
	}

}
