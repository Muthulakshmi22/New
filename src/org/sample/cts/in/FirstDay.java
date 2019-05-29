package org.sample.cts.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
	//login
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\GreensTech\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/?stype=lo&jlou=AfcPn4KHuGJNKLzvqd_wwHZktQfYm0A5JV3avO0AhtfaagtyvenRqToY1Dg-bcMveKyvrKVSPWcCIdDyQrYy8cHej1ux3Uf-rqufS-4FfWzqBg&smuh=32213&lh=Ac9JldvFaLGEtn42");
driver.manage().window().maximize();
WebElement username = driver.findElement(By.name("email"));
username.sendKeys("ramya221997@gmail.com");
WebElement password = driver.findElement(By.xpath("//input[@type='password'][1]"));
password.sendKeys("ramyavenkat.");
WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
login.click();
WebElement downarrow = driver.findElement(By.id("userNavigationLabel"));
downarrow.click();
WebElement logout = driver.findElement(By.xpath("(//span[@class='_54nh'])[6]"));
Thread.sleep(2000);
logout.click();



}

}


