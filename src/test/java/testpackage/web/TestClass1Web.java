package testpackage.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import mainsourcepackage.BaseClass;

public class TestClass1Web extends BaseClass{
	@Test(groups = "Sanity")
	public void testMethod1() throws InterruptedException {
		System.out.println("TestClass1Web-TestMethod1-Sanity.....");
	}
	
	@Test(groups = "Regression")
	public void testMethod2() throws InterruptedException {
		System.out.println("TestClass1Web-TestMethod2-Regression.....");
	}
	
	@Test(groups = {"Sanity", "Regression"})
	public void testMethod3() throws InterruptedException {
		System.out.println("TestClass1Web-TestMethod3-Sanity-Regression.....");
	}
	
}
