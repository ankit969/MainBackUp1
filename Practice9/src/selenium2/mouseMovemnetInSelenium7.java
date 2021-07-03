package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovemnetInSelenium7 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("LOGIN / SIGNUP"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Travel Agent Login")).click();
	}

}
