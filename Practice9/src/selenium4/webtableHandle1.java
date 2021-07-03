package selenium4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webtableHandle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("practice");//following-sibling
		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']/parent::div[@class='container']")).sendKeys("parent");
	    ////div[@class='container']/child::input[@type='text']

		driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input[@type='checkbox']")).click();*/

		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("testankit60@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Automate@123");
		driver.findElement(By.xpath("//div[@class='field']/following-sibling::div[text()='Login']")).click();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//Body"))).build().perform();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//a[text()='test2 test2']/parent::td/preceding-sibling::td/child::div[@class='ui fitted read-only checkbox']/descendant::input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'test1 test1')]/parent::td/preceding-sibling::td/child::div[@class='ui fitted read-only checkbox']")).click();
		
		
		
		
	}

}
