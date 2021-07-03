package Selenium1to10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("memberId")).sendKeys("9999999999");//2.id
		driver.findElement(By.name("memberLogin.Password")).sendKeys("12345");//3.name
		driver.findElement(By.xpath("//a[contains(text(),'Show')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		System.out.println("Test is completed");
	}
}