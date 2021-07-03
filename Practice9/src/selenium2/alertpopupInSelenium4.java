package selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopupInSelenium4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		alertPopup(driver, "alert popup by JS");
		
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		
		alrt.accept();
		
	}
	public static void alertPopup(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}

}
