package seleniumJava1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendarTest28 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\New ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ui-datepicker-div")));

		selectDate("7", "August", "2022");
	}
	public static String[] getMonthYearSplit(String monthyearValue) {
		return monthyearValue.split(" ");
	}
	public static void selectDate(String day, String month, String year) {

		String monthyearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearValue);

		while(!(getMonthYearSplit(monthyearValue)[0].equals(month) && getMonthYearSplit(monthyearValue)[1].equals(year))) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			monthyearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearValue);
		}
		try {
			driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}
		catch(Exception e) {
			System.out.println("wrong date: "+month+ ":"+day);

		}
	}

}
