package JavaBase1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest100 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']/descendant::ul[@class='erkvQe']/li"));
		System.out.println("total searches: "+list.size());

		for(int i=0;i<list.size();i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);
			
			if(listText.equals("testing life cycle")) {
				list.get(i).click();
			}
		}
	}

}
