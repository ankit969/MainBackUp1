package OneToFive;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandleInSelenium4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct pop-up");
		}else {
			System.out.println("Incorrect pop-up");
		}
		alert.accept();
	}

}
