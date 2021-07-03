package com.psqa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psqa.Base.TestBase2;

public class HomePage2 extends TestBase2{
	public static Actions action;
	
	//Page Factory or Object Repository
	@FindBy(xpath = "//span[contains(text(),'ankit test')]")
	WebElement homePageUserName;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calenderElement;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsElement;
	
	@FindBy(xpath = "//Body")
	WebElement body;
	
	//Initializing page object
	public HomePage2() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	//Actions
	public String verifyHomePageUserName() {
		 return homePageUserName.getText();
	}
	public CalenderPage2 clickOnCalendersLink() {
		action.moveToElement(calenderElement).build().perform();
		calenderElement.click();
		action.moveToElement(body);
		return new CalenderPage2();
	}
}
