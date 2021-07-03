import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		//mandatory:
		//1. chrome version should be greater than 59 on mac and greater than 60 on winodws
		//2. window-size=1400,800
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
