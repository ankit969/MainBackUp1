package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver9 {
	
	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
