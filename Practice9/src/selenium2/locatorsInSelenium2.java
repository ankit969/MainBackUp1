package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsInSelenium2 {

	public static void main(String[] args) {
		//Types of Locaotrs:
		//1. By.id
		//2. By.className
		//3. By.name
		//4. By.xpath
		//5. By.tagName
		//6. By.linkText
		//7. By.partialLinkText

		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Itachi");
		driver.findElement(By.id("pass")).sendKeys("Uchiha");
		driver.findElement(By.name("login")).click();
	}

}
