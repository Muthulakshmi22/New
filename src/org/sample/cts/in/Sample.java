package org.sample.cts.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
//right click
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement btngmail = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
		Actions acc=new Actions(driver);
		acc.contextClick(btngmail).perform();
		
	}
	
	
	
	
}
