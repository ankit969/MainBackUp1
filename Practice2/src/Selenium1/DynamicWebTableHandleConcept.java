package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class DynamicWebTableHandleConcept {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testankit60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automate@123");
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//body"))).build().perform();
		
		//tbody/tr[1]/td[2]
		//tbody/tr[2]/td[2]
		//tbody/tr[3]/td[2]
		
		String before_xpath = "//tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int row=1; row<=3; row++) {
			String text = driver.findElement(By.xpath(before_xpath +row+ after_xpath)).getText();
			System.out.println(text);
			
			if(text.contains("test2 test2")) {
				driver.findElement(By.xpath("//tbody/tr[" + row + "]/td[2]")).click();
			}
		}
		
		
	}

}
