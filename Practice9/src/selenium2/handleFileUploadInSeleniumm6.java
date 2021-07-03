package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFileUploadInSeleniumm6 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file/");
		WebElement elmnt = driver.findElement(By.xpath("//a[contains(text(),'hide')]"));
		scrollPerticular(elmnt, driver);
		
		driver.findElement(By.name("fileupload")).sendKeys(new CharSequence[] {"C:\\Users\\ANKIT\\Downloads\\download.jpg"});
	}
	public static void scrollPerticular(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
