package mainsourcepackage;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	@AfterMethod
	public void beforeMethod(ITestResult testResult) {
		System.out.println(testResult.getTestClass().getClass().getSimpleName());
	}


}
