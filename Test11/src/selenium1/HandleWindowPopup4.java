package selenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\ChromeDriver_95\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='Tabbed']/descendant::button[contains(text(),'click')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		//Get the window handles Id and move to the windows:
		String parentWindowId = it.next();
		String childWindowId = it.next();
		System.out.println("parentWindowId: "+parentWindowId);
		System.out.println("childWindowId: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
	}

}
