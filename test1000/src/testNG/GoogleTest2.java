package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	@Test(priority=2,groups="Title")
	public void test1() {
		String title = driver.getTitle();
		System.out.println("Title of the google search page: "+title);
	}
	@Test(priority=1,groups="Logo")
	public void test2() {
		boolean b1 = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println("Is google logo is visible: "+b1);
	}
	@Test(priority=3,groups="test3")
	public void test3() {
		System.out.println("test3 method");
	}
	@Test(priority=4,groups="test4")
	public void test4() {
		System.out.println("test4 method");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
