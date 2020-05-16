package com.windowhandle;
import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSuggestionList {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("automation testing");
		//element.sendKeys(Keys.ENTER);
		//Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ESCAPE);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='sbl1']/span"));
		for(int i=0;i<=list.size()-1;i++) {
			WebElement options = list.get(i);
			String text = options.getText();
			if(text.contains("automation testing framework")) {
				list.get(i).click();
				break;
			}
		}
	}
}
