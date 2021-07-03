package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashTheButton1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
        flash(loginbtn, driver);
	}
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgColor, element, driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" +color+ "'", element);
		try{
			Thread.sleep(20);
		}catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}


