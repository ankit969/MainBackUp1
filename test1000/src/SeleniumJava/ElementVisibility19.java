package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility19 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://store.cpanel.net/login/register");
		
		boolean b1 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b1);//false
		
		boolean b2 = driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();
		System.out.println(b2);//true
		
		boolean b3 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println(b3);//false
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(ele, driver);
		boolean b4 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b4);//true
		
		boolean b5 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println(b5);//true
	
	}
	
	public static void click(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

}
