package selenium2;

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

public class BrokenLinkText1 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\ChromeDriver_95\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		//1. Get list of all the elements which containing a tag:
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println(linkList.size());
		
		//2. Create a list to store activeLinks:
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//3. Get all the links which contains href attribute:
		for(int i=0; i<linkList.size(); i++) {
			String allHrefLinks = linkList.get(i).getAttribute("href");
			System.out.println(allHrefLinks);
			
			if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linkList.get(i));
			}
		}
		System.out.println("Active Links size: "+activeLinks.size());
		
		//Get the httpd api response for all the active Links:
		for(int j=0; j<activeLinks.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-->"+response);
		}
	}

}
