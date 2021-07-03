package JavascriptExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleByJS6 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		System.out.println(getTitle(driver));
	}
	public static String getTitle(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String ttle = js.executeScript("return document.title").toString();
		return ttle;
	}

}
