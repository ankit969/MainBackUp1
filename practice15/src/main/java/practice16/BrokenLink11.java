package practice16;

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

public class BrokenLink11 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("List of a and img tag links: "+list.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int i=0; i<list.size(); i++) {
			String allHrefLinks = list.get(i).getAttribute("href");
			System.out.println("All href attribute links: "+allHrefLinks);
			
			if(list.get(i).getAttribute("href")!=null && (!list.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(list.get(i));
			}
			System.out.println("List of activeLinks: "+activeLinks.size());
		}
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}
	}

}
