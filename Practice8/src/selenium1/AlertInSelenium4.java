package selenium1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AlertInSelenium4 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		generateAlert(driver, "Handle DropBox alert");
		
		//Handle drop box:
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}

}
