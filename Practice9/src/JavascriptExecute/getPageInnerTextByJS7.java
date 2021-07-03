package JavascriptExecute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageInnerTextByJS7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		System.out.println(pageText(driver));
	}
	public static String pageText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String allText = js.executeScript("return document.documentElement.innerText").toString();
		return allText;
	}


}
