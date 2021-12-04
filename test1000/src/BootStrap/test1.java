package BootStrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		WebElement ele = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		srollPerticular(ele, driver);
		
		driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);
			
			if(listText.equals("Action")) {
				list.get(i).click();
			}
		}
		
	}
	
	public static void srollPerticular(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

}
