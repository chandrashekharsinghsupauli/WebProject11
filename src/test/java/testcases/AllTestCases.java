package testcases;

import org.junit.Assert;
import org.junit.Test;

import Hemanchal.FactorialClass;

public class AllTestCases {
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
	public void Harish_findFactorial4() {
		
	int actuallResult4=FactorialClass.findFactorial(0);
	System.err.println("factorial of 0 = "+actuallResult4 );
	Assert.assertEquals(120, actuallResult4);
	

	}
	
}
