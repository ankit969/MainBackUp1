package OneToFive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//id, name, className, tagName, xpath, linkText, partailLinkText
		
		driver.findElement(By.id("email")).sendKeys("Test");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.name("login")).click();
		
		
	}

}
