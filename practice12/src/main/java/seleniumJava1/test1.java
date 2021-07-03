package seleniumJava1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("testankit60@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Automate@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//Body"))).build().perform();

		driver.findElement(By.xpath("//button[@class='ui linkedin button']/child::i[@class='edit icon']")).click();
		driver.findElement(By.name("first_name")).sendKeys("test11");
		driver.findElement(By.name("last_name")).sendKeys("test11");
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}

}
