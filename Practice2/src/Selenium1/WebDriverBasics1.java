package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
			System.out.println("Ttile is correct");
		}
		else {
			System.out.println("Title is In-correct");
		}
	}

}
