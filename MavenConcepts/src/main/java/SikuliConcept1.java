import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SikuliConcept1 {
//	Integration of Sikuli with Selenium WebDriver:
//
//		Now, no need to take the headache of XPath, CSS, ID and Name. 
//
//		+Sikuli is an image-based open source tool to automate the GUI and can be used on any platform like Windows/Linux/Mac/Mobile. 
//
//		+Sikuli uses a technique called image recognition to identify and control GUI components.
//
//		====================================================
//		• Automate using images
//		• No API to launch Browser and URL – need to use selenium
//		• Can automate flash objects – YouTube video
//		• Desktop application automation
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=UqK7w8Ftjcw");
		
		//Create the Object of screen class- sikuli
		Screen s = new Screen();
		
	}

}
