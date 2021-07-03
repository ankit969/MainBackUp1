package ElevenToFifteen;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConceptInSelenium11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        
        List<WebElement> linktexts = driver.findElements(By.tagName("a"));
        System.out.println(linktexts.size());
        
        for(int i=0; i<linktexts.size(); i++) {
        	String list = linktexts.get(i).getText();
        	System.out.println(list);
        }
	}

}
