package SeleniumJava;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties17 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\test1000\\src\\SeleniumJava\\test1.properties");
		prop.load(ip);
		
		String brows = prop.getProperty("browser");
		String ur = prop.getProperty("url");
		String sendK = prop.getProperty("sendleys");
		
		if(brows.equals("browser")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}else{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckoDriver\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		driver.get(ur);
		driver.findElement(By.name("q")).sendKeys(sendK);
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}

}
