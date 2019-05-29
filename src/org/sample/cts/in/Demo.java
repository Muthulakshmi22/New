package org.sample.cts.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	//drag&drop-actions class
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions acc=new Actions(driver);
	acc.dragAndDrop(s, d).perform();
	acc.dragAndDrop(s1, d1).perform();
	
}
}
