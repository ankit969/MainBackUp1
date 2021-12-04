import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox4 {
	
	public static void main(String[] args) {
		//To handle Drop box I will use Select class method or bootstrap
		
		//1. Select class method:
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\ChromeDriver_95\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("https://book.spicejet.com/Register.aspx");
		
		//Create a Select class method and pass the element param into it.
		Select select = new Select(driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']")));
		select.selectByVisibleText("MR");
		*/
		
		//2. Bootstrap method:
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/descendant::a"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			String listTexts = list.get(i).getText();
			System.out.println(listTexts);
			
			if(listTexts.equals("Another action")) {
				list.get(i).click();
			}
			
		}
	}

}
