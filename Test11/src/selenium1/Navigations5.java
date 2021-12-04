package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\ChromeDriver_95\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());//Google
		driver.navigate().to("http://facebook.com");//facebook
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();//Google
		System.out.println(driver.getTitle());
		driver.navigate().forward();//facebook
		System.out.println(driver.getTitle());
	}

}
