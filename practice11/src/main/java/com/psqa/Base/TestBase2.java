package com.psqa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.psqa.util.testUtil2;




public class TestBase2 {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase2() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\practice11\\src\\main\\java\\com\\psqa\\config\\psqa.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//Initializing the browser:
	public static void init() {
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckoDriver\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testUtil2.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testUtil2.implicit_wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

}
