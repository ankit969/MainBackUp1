package SixteenToTwenty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFileInSelenium16 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream Ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\Practice3\\src\\SixteenToTwenty\\prop.properties");
		prop.load(Ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		//Put condition for multiple browsers:
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Selenium\\\\\\\\chromeDriver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\\\\\\\Selenium\\\\\\\\geckoDriver\\\\\\\\geckodriver-v0.29.0-win64\\\\\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("URL");
	}

}
