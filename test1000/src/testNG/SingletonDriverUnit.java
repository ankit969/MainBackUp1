package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriverUnit {
	private WebDriver driver;
	private static SingletonDriverUnit instanceDriver = null;
	
	private SingletonDriverUnit() {//constructor
		
	}
	public WebDriver opeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\chromeDriver_93\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static SingletonDriverUnit getInstance() {
		if(instanceDriver == null)
			instanceDriver = new SingletonDriverUnit();
		return instanceDriver;
	}

}
