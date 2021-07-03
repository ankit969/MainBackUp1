package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopupInSelenium5 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys(new CharSequence[] {"C:\\Users\\ANKIT\\Downloads\\1mb-test_csv.csv"});
	}

}
