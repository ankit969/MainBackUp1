package FifteenToTwentyFive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVisibilityInSelenium19 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://store.cpanel.net/login/register");
		scrollDown(driver);
		
		//isDisplayed() method: "Register Account" button is displayed
		boolean b1 = driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();
		System.out.println("Register Account button is diplayed: " +b1);
		
		//isEnabled() method:
		boolean b2 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println("Register Account button is Enabled: "+b2);
		
		//Select I have read box:
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b3 = driver.findElement(By.xpath("//button[@id='submit']")).isEnabled();
		System.out.println("Register Account button is Enabled: "+b3);
		
		//isSelected() method:
		boolean b4 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("Is checkBox selected: " +b4);
		
		//De-select the checkBox:
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b5 = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("Is checkBox selected: " +b5);
	}
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
