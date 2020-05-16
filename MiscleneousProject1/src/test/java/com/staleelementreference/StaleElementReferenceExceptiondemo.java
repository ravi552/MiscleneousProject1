package com.staleelementreference;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptiondemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='close']//a")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//li//a[text()='Training']"));
		link.click();
		driver.navigate().back();
		Thread.sleep(3000);
		try {
			link.click();
		}catch(StaleElementReferenceException e) {
			link = driver.findElement(By.xpath("//li//a[text()='Training']"));
			link.click();

		}
		//driver.quit();
	}

}
