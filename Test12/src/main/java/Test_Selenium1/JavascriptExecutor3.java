package Test_Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		
		//1. Click Method:
		//jsClick(ele, driver);
		//2. GetTitle:
		//System.out.println(jsGetTitle(driver));
		//3. GetTexts:
		System.out.println(jsGetInnerText(driver));
	}
	//1. Click Method
	public static void jsClick(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	//2. GetTitle method
	public static String jsGetTitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	//3. Get the innerText
	public static String jsGetInnerText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String texts = js.executeScript("return document.documentElement.innerText").toString();
		return texts;
	}
	//4. 

}
