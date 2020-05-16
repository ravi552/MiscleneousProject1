package com.staleelementreference;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DtaleElementReferenceException2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.id("email")); 
		email.sendKeys("ravi9873@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("xyz");
		driver.navigate().refresh();
		try {
			email.sendKeys("ravi9873@gmail.com");
		}catch(StaleElementReferenceException e) {
			email=driver.findElement(By.id("email"));
			password=driver.findElement(By.id("pass"));
		}
	}

}
