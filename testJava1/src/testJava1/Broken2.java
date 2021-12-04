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

public class Broken2 {
	
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   //WebDriver is an Interface, ChromeDriver is a class, driver is an object reference name, new ChromeDriver is used to create object of the class
		   //ChromeDriver. Here ChromeDriver class can be referred by Parent class or Interface. Hence it is called as Dynamic Polymorphism.
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   //Dynamic Wait:
		   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("https://www.google.com/");
		   
		   //1. Get all the links of "a" tag:
		   List<WebElement> totalLinkList = driver.findElements(By.tagName("a"));
		   System.out.println("Total a tag link list: "+totalLinkList.size());
		   //2. Get all the links of "img" and "a" tag link:
		   totalLinkList.addAll(driver.findElements(By.tagName("img")));
		   System.out.println("Total a tag link list: "+totalLinkList.size());
		   
	}

}
