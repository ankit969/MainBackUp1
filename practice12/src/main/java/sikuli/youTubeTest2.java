package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class youTubeTest2 {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=iIEp6o0LiTs");

		//Create the object the screen class- sikuli
		Screen s = new Screen();

		//1. click on setting Icon:
		Pattern settingImg = new Pattern("Setting_btn");
		s.wait(settingImg, 2000);
		s.click(settingImg);

		//2. click on setting Icon:
		Pattern settingImg1 = new Pattern("Setting_btn");
		s.wait(settingImg1, 2000);
		s.click(settingImg1);

		//play the video:
		Pattern settingImg2 = new Pattern("Play_btn");
		s.wait(settingImg2, 3000);
		s.click(settingImg2);
		
		

	}

}
