package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandlingInSelenium6 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).sendKeys("Itachi");
		driver.switchTo().parentFrame();
		driver.close();
	}

}
