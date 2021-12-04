package selenium1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperitesFile8 {
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;
	public static void main(String[] args) {
		
		try {
			prop = new Properties();
			ip = new FileInputStream("E:\\Selenium\\Eclipseworkspace2\\Test11\\conf.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("name"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrom")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\ChromeDriver_95\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckoDriver\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
