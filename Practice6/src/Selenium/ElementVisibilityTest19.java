package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ElementVisibilityTest19 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://store.cpanel.net/login/register");
		//scrollDown(driver);
		WebElement scrollPert = driver.findElement(By.xpath("//a[contains(text(),'cPanel & WHM Features')]"));
		scrollPerticular(scrollPert, driver);
		
		//isDisplayed() method:
		boolean b1 = driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();
		System.out.println(b1);
		//isEnabled() method:
		boolean b2 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println(b2);
	    //isSelected()
		boolean b3 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("CheckBox should be false: "+b3);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b4 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("CheckBox should be true: "+b4);
		
		//isEnabled() method
		boolean b5 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println(b5);
	}
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public static void scrollPerticular(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
