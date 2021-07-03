package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandlingInSelenium5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Test");
	}

}
