package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrapDropBoxInSelenium26 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		//bootstrap
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String listText = list.get(i).getText();
			list.get(i).click();
            System.out.println(listText);
            
           
		}
	}
	

}
