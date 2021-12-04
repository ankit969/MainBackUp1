package SeleniumJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\New ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//1.driver.findElement(By.name("q")).sendKeys("Automation testing");
		//2.driver.findElement(By.className("gLFyf gsfi")).sendKeys("Automation Engineer");
		//3.driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		//4.driver.findElement(By.linkText("Gmail")).click();
		//5.driver.findElement(By.partialLinkText("Gmail")).click();
		//6.By.id
		//7. tagName:
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String texts = list.get(i).getText();
			System.out.println(texts);
		}
	}

}
