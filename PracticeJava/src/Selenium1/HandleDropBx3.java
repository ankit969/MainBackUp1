package Selenium1;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBx3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromeDriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/Register.aspx");
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']")));
		sel.selectByVisibleText("MR");
	}

}
