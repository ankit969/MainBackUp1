import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		//String[] args is a command line argument
		//main method is used to call the function or the method
		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		driver = new SafariDriver();
		
		//Here WebDriver is an interface and all the browser drivers are the class.
		//All the browser drivers objects are referred by an Interface WebDriver.
		//This is called Dynamic Polymorphism
	}

}
