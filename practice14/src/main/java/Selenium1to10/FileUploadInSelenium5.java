package Selenium1to10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelenium5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		WebElement scrollLink = driver.findElement(By.xpath("//a[contains(text(),'All attributes of input')]"));
		scrollPert(scrollLink, driver);

		driver.findElement(By.name("fileupload")).sendKeys(new CharSequence[] {"C:\\Users\\ANKIT\\Downloads\\1mb-test_csv.csv"});
	}
	public static void scrollPert(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
