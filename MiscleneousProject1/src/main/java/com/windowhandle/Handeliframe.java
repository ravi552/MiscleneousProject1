package com.windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handeliframe {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:/Users/ravi/Desktop/iFrame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("w3School");
	//	WebElement my_frame=driver.findElement(By.xpath("jshj"));
	//	driver.switchTo().frame(my_frame);
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("search")).sendKeys("css");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("")).click();
		
	}

}
