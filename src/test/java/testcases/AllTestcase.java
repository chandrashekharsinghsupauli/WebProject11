package testcases;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import com.java.munni.Factorial;
import Hemanchal.CalculateSimplInterest;
import Hemanchal.FactorialClass;

public class AllTestcase {
	@Test
	public void method() {
		System.out.println("start............");
	}
	@Test
	public void munni_findFactorial5() {
		int actualres=Factorial.findFactorial(5);
		Assert.assertEquals(120, actualres);
		
	}
	@Test
	public void munni_findFactorial4() {
		int actualres=Factorial.findFactorial(4);
		Assert.assertEquals(24, actualres);
		
	}
	@Test
	public void munni_findFactorial3() {
		int actualres=Factorial.findFactorial(3);
		Assert.assertEquals(6, actualres);
		
	}
	@Test
	public void munni_findFactorial0() {
		int actualres=Factorial.findFactorial(0);
		Assert.assertEquals(1, actualres);
		
	}
	
	@Test
	public void Harish_findFactorial() {
		
	int actuallResult=FactorialClass.findFactorial(5);
	System.err.println("factorial of 5 = "+actuallResult );
	Assert.assertEquals(120, actuallResult);
	
	
	}
	@Test
	public void Harish_findFactorial2() {
		
	int actuallResult4=FactorialClass.findFactorial(4);
	System.err.println("factorial of 4 = "+actuallResult4 );
	Assert.assertEquals(24, actuallResult4);
	
	}
	@Test
	public void Harish_findFactorial3() {
		
	int actuallResult3=FactorialClass.findFactorial(3);
	System.err.println("factorial of 3 = "+actuallResult3 );
	Assert.assertEquals(6, actuallResult3);
	}
	
	@Test
	public void Harish_findSimpleInterest() {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter principal");
		int p=sc.nextInt();
		System.err.println("Enter Rate");
		int r=sc.nextInt();
		System.err.println("Enter time");
		int t=sc.nextInt();
		double result=CalculateSimplInterest.findingSimpleInterest(p,r,t);
		System.err.println("Simple Interest ="+result);
		
		
	}
	
	
}
