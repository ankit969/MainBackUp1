package Test_Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[contains(text(),'HTML, CSS')]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='btn-group open']/descendant::ul[@class='multiselect-container dropdown-menu']//li"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String Texts = list.get(i).getText();
			System.out.println(Texts);
		}
	}

}
