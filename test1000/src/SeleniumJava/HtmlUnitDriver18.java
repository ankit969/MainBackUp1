package SeleniumJava;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriver18 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Automation Engineer");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
	}
	

}
