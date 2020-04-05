package testcases;

import org.junit.Assert;
import org.junit.Test;

import com.java.munni.Calculate;
import com.java.munni.Factorial;

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
	public void new111() {
		System.err.println("new metho");
	}
}
