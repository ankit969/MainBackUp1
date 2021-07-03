package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUp4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String ale = alert.getText();
		
		if(ale.equals("Please enter a valid user name")) {
			System.out.println("Correct alert mesage");
		}else {
			System.out.println("In=correct alert message");
		}
	}

}
