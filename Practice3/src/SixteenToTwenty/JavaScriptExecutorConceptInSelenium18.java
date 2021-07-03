package SixteenToTwenty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class JavaScriptExecutorConceptInSelenium18 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Itachi");
		driver.findElement(By.id("pass")).sendKeys("Uchiha");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));

		//By using JavaScript we will highlight the "Login" button:
		flash(loginBtn, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element, driver);//1
			changeColor(bgcolor, element, driver);//2
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+ "'", element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}


}
