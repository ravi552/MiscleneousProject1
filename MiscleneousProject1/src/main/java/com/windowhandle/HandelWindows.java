package com.windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindows {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it =windowids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		driver.findElement(By.linkText("Why actiTIME")).click();
		driver.switchTo().window(pid);
		
	}

}
