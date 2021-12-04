package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.BaseTest;

public class Home extends BaseTest{
	public Actions action;
	@FindBy(xpath="//span[contains(text(),'ankit test')]")
	WebElement headingHomePage;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calender;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companies;
	
	public Home() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public boolean verifyPageHeader() {
		return headingHomePage.isDisplayed();
	}
	public Calender clickOnCalender() {
		action.moveToElement(calender).build().perform();
		calender.click();
		return new Calender();
	}
	public Contact clickOnContact() {
		action.moveToElement(contacts).build().perform();
		contacts.click();
		return new Contact();
	}

}
