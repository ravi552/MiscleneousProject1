package com.windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleOtwani {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String parent=driver.getWindowHandle();
		System.out.println("Patent window id-->"+parent);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwindowsId=driver.getWindowHandles();
		for (String child : allwindowsId) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is: "+child);
				driver.findElement(By.linkText("Why actiTIME")).click();
				Thread.sleep(3000);
				driver.close();//we will not use quit because it will close the whole window
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window"+parent);

	}

}
