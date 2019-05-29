package org.sample.cts.in;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleBase {
	WebDriver driver;

	@BeforeClass
	private void beforeclass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Assert.assertTrue(driver.getTitle().contains("Create your"));
	}

	@BeforeMethod
	private void beforemethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	private void test() {
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("ramya");
		Assert.assertEquals("ramya",firstname.getAttribute("value"));

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("venkat");
		Assert.assertEquals("venkat", lastname.getAttribute("value"));
		
		WebElement mail = driver.findElement(By.xpath("//input[@name='Username']"));
		mail.sendKeys("abc");
		SoftAssert al=new SoftAssert();
		al.assertTrue(true, "verify username");
		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("aaa123454");
		al.assertTrue(false, "verify password");
		
		WebElement confrm = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		confrm.sendKeys("aaa123454");
		WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		next.click();

	}

	@AfterMethod
	private void aftermethod() {
		Date s = new Date();
		System.out.println(s);

	}

	@AfterClass
	private void afterclass() {
		driver.quit();
	}

}
