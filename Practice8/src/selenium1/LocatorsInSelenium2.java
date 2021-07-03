package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium2 {
	
	public static void main(String[] args) {
		//Types of locators in Selenium:
		//1. By.id
		//2. By.name
		//3. By.className
		//4. By.xpath
		//5. By.linkText
		//6. By.tagName
		//7. By.partialLinkText
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("Test Automation scripts");//By.id
		//driver.findElement(By.name("email")).sendKeys("Automation");//By.name
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Auto");//By.xpath
		//driver.findElement(By.linkText("Forgotten password?")).click();//By.linkText
		driver.findElement(By.partialLinkText("Forgotten password?")).click();//By.partialLinkText
	}

}
