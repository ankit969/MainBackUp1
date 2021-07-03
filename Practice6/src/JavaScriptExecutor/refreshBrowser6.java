package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshBrowser6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		refresh(driver);
	}
	public static void refresh(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0);");
	}

}
