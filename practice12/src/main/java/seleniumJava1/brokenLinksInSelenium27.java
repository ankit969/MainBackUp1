package seleniumJava1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinksInSelenium27 {
	
	//Collect all the links with a and img tags
	//send http/https request to link and read http/https response
	//Find out link is broken on the basis of http/https response code
	//Repeat this for all the links capture
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Links containing a tag: "+linkList.size());
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Links containing a and img tag: "+linkList.size());
		
		//Store all the active links:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. Iterate linkList: execlude all the a and img links
		for(int i=0; i<linkList.size(); i++) {
			String allHrefLinks = linkList.get(i).getAttribute("href");
			System.out.println("Total href links: "+allHrefLinks);
			
			//Some links are null are some links which are having Javascript attribute, To avoid this we will use below condition:
			
		}
	}

}
