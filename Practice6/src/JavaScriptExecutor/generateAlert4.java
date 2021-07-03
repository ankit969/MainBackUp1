package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generateAlert4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		generateAlerts(driver, "This is an alert message");
		
		
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
		
	}
	public static void generateAlerts(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}

}
