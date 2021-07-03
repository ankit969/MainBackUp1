package Selenium11to20;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotInSelenium13 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");

		//Take screenshot and store as a file format:
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the file to desired location using copyFile/method
		FileUtils.copyFile(src, new File("E:\\Selenium\\Eclipseworkspace2\\practice14\\src\\main\\java\\Selenium11to20\\google1.png"));
	}

}
