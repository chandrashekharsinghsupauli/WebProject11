package testcases;

import org.junit.Assert;
import org.junit.Test;

import com.java.munni.Calculate;
import com.java.munni.Factorial;

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
}
