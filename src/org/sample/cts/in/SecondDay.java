package org.sample.cts.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//mouseoveraction
public class SecondDay {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
	WebDriver greens=new ChromeDriver();
	greens.get("http://www.greenstechnologys.com/");
	greens.manage().window().maximize();
	WebElement gcourse = greens.findElement(By.xpath("//a[@href='careers.html']"));
Actions acc=new Actions(greens);
acc.moveToElement(gcourse).perform();
WebElement gbigdata = greens.findElement(By.xpath("//a[@href='courses.html']"));
gbigdata.click();

Thread.sleep(2000);


}
}
