import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest1 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=iIEp6o0LiTs");

		//Create the object pf screen class- sikuli
		Screen s = new Screen();
		
		//1. Click on setting Icon:
		Pattern settingImg = new Pattern("Setting_btn.png");
		s.wait(settingImg, 2000);
		s.click(settingImg);
		
		//2. click on auto Resolution Icon:
		Pattern autoImg = new Pattern("Auto1.png");
		s.wait(autoImg, 2000);
		s.click(autoImg);
		
		//3. click on 144p resolution Icon:
		Pattern Img144p = new Pattern("144p.png");
		s.wait(Img144p, 2000);
		s.click(Img144p);

		//Play Icon:
		Pattern playImg = new Pattern("Play_btn.png");
		s.wait(playImg, 2000);//wait for that image(Play_btn.png) to be visible
		Thread.sleep(2000);
		s.click(playImg);
		Thread.sleep(2000);
		s.click();
		
		//Pause Icon:
		Pattern pauseImg = new Pattern("Pause_btn.png");
		s.wait(pauseImg, 2000);//wait for that image(Pause_btn.png) to be visible
		s.click(pauseImg);
	}

}
