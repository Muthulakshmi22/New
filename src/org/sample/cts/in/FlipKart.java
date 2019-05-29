package org.sample.cts.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	//mouseover-actions class
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
	WebDriver link=new ChromeDriver();
	link.get("https://www.flipkart.com/");
	WebElement cross = link.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	cross.click();
	WebElement women = link.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
	Actions acc=new Actions(link);
	acc.moveToElement(women).perform();
	
}
}
