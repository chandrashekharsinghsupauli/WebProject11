package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import mainsourcepackage.BaseClass;

public class TestClass2 extends BaseClass{
	@Test
	public void testMethod() throws InterruptedException {
		System.out.println("Start.2..");
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/Power-your-Subconscious-Mind/dp/8192910962/ref=zg_bs_books_1?_encoding=UTF8&psc=1&refRID=S35EATV9C637F067T4SM");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@aria-label='No, thanks']")).click();
	}
	
}
