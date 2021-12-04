package Selenium1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest1 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		//1. Get all the links which contains a and img  tags:
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("a tag links: "+linkList.size());
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("a and img tag links: "+linkList.size());
		
		//2. Store activeLinks in the arrayList:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//3. Get all the links containing href attribute:
		for(int i=0; i<linkList.size(); i++) {
			String hrefLinks = linkList.get(i).getAttribute("href");
			System.out.println(hrefLinks);
			
			//4. remove null and javascript attribute from the links:
			if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkList.get(i));
			}

		}
		System.out.println("Active links: "+activeLinks.size());
		
		//5. Get the response if the active links by using httpsURLConnection api:
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}
	}

}
