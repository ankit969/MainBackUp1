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

public class BrokenLinkTest2 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		//1. Get all the links which containing a and img tags:
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Links containing a and img tags: "+linkList.size());
		
		//2. Create a arrayList to store activeLinks:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//3. Get all the links containing href attribute:
		for(int i=0; i<linkList.size(); i++) {
			String allHrefLinks = linkList.get(i).getAttribute("href");
			System.out.println("Href links: "+allHrefLinks);
			
			if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkList.get(i));
			}
		}
		System.out.println("ActiveLinks are: "+activeLinks.size());
		
		//4. Get the HttpsURLConection api response on the activeLinks:
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}
	}

}
