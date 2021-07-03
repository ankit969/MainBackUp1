package selenium2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handleWindowPopupInSelenium15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		explctWaitAndClick(driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook')]")), driver, 20);

        //hanleWindowpopup:
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		driver.switchTo().window(childWindowId);
		System.out.println("ChildWindowTitle: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowTitle: "+driver.getTitle());
		driver.close();
		
	}
	public static void explctWaitAndClick(WebElement element, WebDriver driver, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
