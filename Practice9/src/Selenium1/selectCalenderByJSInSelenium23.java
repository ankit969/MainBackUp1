package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectCalenderByJSInSelenium23 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

		WebElement dat = driver.findElement(By.name("ctl00$mainContent$view_date1"));
		calenderByJS(dat, driver, "27-05-2021");
	}
	public static void calenderByJS(WebElement element, WebDriver driver, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dateValue+"');", element);
	}

}
