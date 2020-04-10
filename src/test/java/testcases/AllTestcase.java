package testcases;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import com.java.munni.Calculate;
import com.java.munni.Factorial;

import Hemanchal.CalculateArmstrong;
import Hemanchal.CalculateSimplInterest;
import com.java.munni.FindSimpleInterest;
import com.java.munni.Pelindrom;

import Hemanchal.FactorialClass;

public class AllTestcase {
	Scanner sc=new Scanner(System.in);
	
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
	public void munni_addition() {
		int actualres=Calculate.addition(2, 9);
		Assert.assertEquals(11, actualres);
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
		
		System.err.println("Enter principal");
		int p=sc.nextInt();
		System.err.println("Enter Rate");
		int r=sc.nextInt();
		System.err.println("Enter time");
		int t=sc.nextInt();
		double result=CalculateSimplInterest.findingSimpleInterest(p,r,t);
		System.err.println("Simple Interest ="+result);
		
		
	}

	@Test
	public void munni_calulateInterest() {
		float actuallResult=FindSimpleInterest.calculateInteres(2000, 3, 2);
		System.out.println("actual result="+actuallResult);
		Assert.assertEquals(120, actuallResult,2);
	
	}
//7/04/2020
	@Test
	public void munni_findPelindrom() {
		float actuallResult=Pelindrom.findPelindrom(121);
		System.out.println("actual result="+actuallResult);
		Assert.assertEquals(121, actuallResult);
	}


	//7/4/2020
	
	@Test
	public void Harish_findingPrincipal() {
		System.err.println("Enter Simple Interest");
		int si=sc.nextInt();
		System.err.println("Enter Rate");
		int r=sc.nextInt();
		System.err.println("Enter time");
		int t=sc.nextInt();
		System.err.println("Enter Result");
		double result=sc.nextDouble();
		double principalResult=CalculateSimplInterest.findingPrincipal(si, r, t);
		System.err.println("Principal = "+principalResult);
		Assert.assertEquals(result, principalResult);
	}
	public void munni_subtraction() {
		int actualRes=Calculate.subtraction(8, 4);
		Assert.assertEquals(4, actualRes);

	}
	//9/04/20
	@Test
	public void Haris_findingArmstrong() {
		System.err.println("Enter a no for armstrong");
		int num=sc.nextInt();
		System.err.println("Enter resutl");
		int result=sc.nextInt();
		int actual=CalculateArmstrong.findingArmstron(num);
		System.err.println("resutl ="+actual);
		Assert.assertEquals(result, actual);
	}
	
	//10/04/20
		@Test
		public void Haris_findingPelindrom() {
			System.err.println("Enter a no for armstrong");
			int num=sc.nextInt();
			System.err.println("Enter resutl");
			int result=sc.nextInt();
			int actual=CalculateArmstrong.findingArmstron(num);
			System.err.println("resutl ="+actual);
			Assert.assertEquals(result, actual);
		}
	
}
