package SeleniumJava;

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

public class BrokenLinks22 {

	public static void main(String[] args) throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		//1. Get all a tag links:
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total a tag links: "+totalLinks.size());
		//2. Get img and a tag links together:
		totalLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total a and img links: "+totalLinks.size());
		//4. Get all the active links:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		//3. Get all the href links
		for(int i=0; i<totalLinks.size(); i++) {
			String allHrefLinks = totalLinks.get(i).getAttribute("href");
			System.out.println("All the href links: "+allHrefLinks);
			
			if(totalLinks.get(i).getAttribute("href")!=null && (!totalLinks.get(i).getAttribute("href").contains("javascrpt"))) {
				activeLinks.add(totalLinks.get(i));
			}
		}
		//5. Print all active links:
		System.out.println("All the active links: "+activeLinks.size());
		
		//6. check all herf url with httpsConnection api:
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}

	}

}
