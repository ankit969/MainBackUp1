package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethod3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
	}
	@Test
	public void test1() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "tl");
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
		driver.findElement(By.name("q")).sendKeys("Hello");;
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
