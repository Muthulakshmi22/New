package org.sample.cts.in;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Apple {
public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys("Haripriyaa");
	Robot rr=new Robot();
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement sname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	sname.sendKeys("ramya");
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);	
	WebElement mobno = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	mobno.sendKeys("1234567890");
	Actions acc=new Actions(driver);
	acc.doubleClick(mobno).perform();
		mobno.sendKeys("0987654321");	
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	password.sendKeys("hari@123");
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("22");
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select s1=new Select(month);
	s1.selectByValue("7");
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByValue("1997");
	rr.keyPress(KeyEvent.VK_TAB);
	rr.keyRelease(KeyEvent.VK_TAB);
	WebElement sex = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	sex.click();


	
	
	
	
	
	
	
	
	
	
	
	
	



}
}
