package OneToFive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is Incorrect");
		}
	}
	

}
