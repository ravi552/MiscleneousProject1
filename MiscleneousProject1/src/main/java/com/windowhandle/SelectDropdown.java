package com.windowhandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element =driver.findElement(By.xpath("//select[@id='countriesSingle']"));
		Select se = new Select(element);
		//se.selectByVisibleText("England");
		List<WebElement> countryList =se.getOptions();
		for(int i=0;i<=countryList.size();i++) {
			String text=countryList.get(i).getText();
			System.out.println(text);
			if(text.equals("England")) {
				countryList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
