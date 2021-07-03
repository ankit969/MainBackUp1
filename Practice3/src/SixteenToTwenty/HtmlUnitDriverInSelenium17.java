package SixteenToTwenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverInSelenium17 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
