package SeleniumJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest21 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		List<WebElement>  list = driver.findElements(By.xpath("//div[@class='aajZCb']/descendant::ul[@class='erkvQe']/li[@role='presentation']"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);
			
			if(listText.equals("automation testing jobs in pune")) {
				list.get(i).click();
			}
		}
	}

}
