package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements11 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//get the total number of links:
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		//print all the links:
		for(int i=0; i<linkList.size(); i++) {
			String texts = linkList.get(i).getText();
			System.out.println(texts);
		}
	}

}
