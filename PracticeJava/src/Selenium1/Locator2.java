package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Locators
		//driver.findElement(By.id("email")).sendKeys("Test");//id
		//driver.findElement(By.name("email")).sendKeys("Test1");//name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test2");//xPath
		driver.findElement(By.id("pass")).sendKeys("gmail.com");
		driver.findElement(By.name("login")).click();
	}

}
