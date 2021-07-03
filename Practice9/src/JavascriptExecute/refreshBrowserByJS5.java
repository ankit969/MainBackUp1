package JavascriptExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshBrowserByJS5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		refresh(driver);
	}
	public static void refresh(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}

}
