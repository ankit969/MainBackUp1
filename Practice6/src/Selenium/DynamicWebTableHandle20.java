package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle20 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("testankit60@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Automate@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Campaigns')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Campaigns')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//body"))).build().perform();
		Thread.sleep(2000);
		//tbody/tr[1]/td[2]
		//tbody/tr[2]/td[2]
		//tbody/tr[3]/td[2]
		
		String before_xpath = "//tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1; i<=3; i++) {
			String listText = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(listText);
			
		if(listText.contains("test2")) {
			driver.findElement(By.xpath(before_xpath + i + after_xpath)).click();
		}
		}
	}

}
