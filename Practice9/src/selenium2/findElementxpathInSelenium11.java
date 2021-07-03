package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementxpathInSelenium11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		for(int i=0; i<list.size(); i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);
		}
	}

}
