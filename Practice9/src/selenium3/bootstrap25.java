package selenium3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap25 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		WebElement scroll = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		scrollPerticular(scroll, driver);
		click(scroll, driver);
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(list.size());

		for(int i=1; i<list.size(); i++) {
			String listText = list.get(i).getText();
			System.out.println(listText);

			if(listText.contains("Another action")) {
				list.get(i).click();
			}
		}
	}
	public static void scrollPerticular(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void click(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}

}
