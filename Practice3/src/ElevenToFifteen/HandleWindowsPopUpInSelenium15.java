package ElevenToFifteen;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsPopUpInSelenium15 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]")).click();
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window Id:" +parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window Id:" +childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("Child window title is:" +driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent window title is:" +driver.getTitle());
	}

}
