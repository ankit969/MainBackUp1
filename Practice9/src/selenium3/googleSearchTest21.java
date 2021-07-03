package selenium3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchTest21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descendant::div[@class='pcTkSc']"));
		System.out.println(list.size());

		for(int i=1; i<list.size(); i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);
			
			if(listText.contains("testing techniques")) {
				list.get(i).click();
				break;
			}
		}
	}

}
