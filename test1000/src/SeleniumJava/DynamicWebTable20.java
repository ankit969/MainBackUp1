package SeleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTable20 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("testankit60@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Automate@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//body"))).build().perform();
		
		String first = "//tbody/tr[";
		String last = "]/td[2]";
		
		for(int i=1; i<=10; i++) {
			String allText = driver.findElement(By.xpath(first + i + last)).getText();
			System.out.println(allText);
			
			if(allText.equals("test8 test8")) {
				driver.findElement(By.xpath(first + i + last)).click();
				break;
			}
			
		}
		driver.findElement(By.xpath("//button[@class='ui basic button item']/following-sibling::div[@role='listbox']")).click();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

}
