package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class googleTest1 {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");

		//Create screen class object-sikuli
		Screen s = new Screen();

		Pattern feelingLuckyClick = new Pattern("lucky.png");
		s.wait(feelingLuckyClick, 2000);
		s.click(feelingLuckyClick);

	}

}
