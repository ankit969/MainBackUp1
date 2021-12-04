package testJava1;

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

public class Broken3 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		//1. get all the links containing a and img tag:
		List<WebElement> totalLinkList = driver.findElements(By.tagName("a"));
		System.out.println("Total a tag links: "+totalLinkList.size());
		totalLinkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Links containing a and img tags: "+totalLinkList.size());
		
		//2. Create a active Links object using ArraList:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0; i<totalLinkList.size(); i++) {
			String allHrefLinks = totalLinkList.get(i).getAttribute("href");
			System.out.println("All the links containing href attribute: "+allHrefLinks);
			
			if(totalLinkList.get(i).getAttribute("href") !=null && (!totalLinkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(totalLinkList.get(i));
			}
		}
		System.out.println("Get the size of all the active links: "+activeLinks.size());
		//3. Create a https api response 
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection)new URL(totalLinkList.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(totalLinkList.get(j).getAttribute("href")+ "-->" +response);
		}
		

	}

}
