package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandleInSelenium4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		String s = alrt.getText();
		if(s.equals("Please enter a valid user name")) {
			System.out.println("Correct Pop-up");
		}else {
			System.out.println("In-correct popup");
		}
		alrt.accept();
		driver.quit();
	}

}
