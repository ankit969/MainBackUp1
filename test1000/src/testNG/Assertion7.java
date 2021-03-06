package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Assertion7 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		Assert.assertEquals(title, "Google");
	}
	@Test
	public void googleLogoTest() {
		boolean b1 = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertEquals(b1, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
