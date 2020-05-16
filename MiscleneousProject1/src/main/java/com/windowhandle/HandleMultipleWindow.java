package com.windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//driver.get("https://www.google.com");
		Set<String> windowids = driver.getWindowHandles();
		String expTitle = "actiTIME - Time Tracking Software for Boosting Your Business";
		for (String str : windowids) {
			String title = driver.switchTo().window(str).getTitle();
			if(title.contains(expTitle)) {
				driver.findElement(By.linkText("Why actiTIME")).click();
				//driver.close();
				//driver.switchTo().defaultContent();
				break;
			}
		}
		
	}
}


