package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	public static Actions action;

	@FindBy(xpath="//span[contains(text(),'ankit test')]")
	@CacheLookup//this stores the element into the cache memory, so the execution is faster. Drawback is if the page got refreshed then
	//it will give staleElementExecption because the page got refreshed or DOM got changed.
	WebElement userNameLabel;

	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	@CacheLookup//Individual we have use this for element. 
	WebElement calenderLink;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactLink;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;

	@FindBy(xpath = "//Body")
	WebElement body;

	//Initialization the page objects:
	public HomePage() {//constructor
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	//Actions:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	public CalenderPage clickOnCalenderLink() {

		action.moveToElement(calenderLink).build().perform();
		calenderLink.click();
		action.moveToElement(body).build().perform();
		return new CalenderPage();
	}
	public ContactsPage clickOnContactLink() {
		action.moveToElement(contactLink).build().perform();
		contactLink.click();
		action.moveToElement(body).build().perform();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink() {
		action.moveToElement(dealsLink).build().perform();
		dealsLink.click();
		action.moveToElement(body).build().perform();
		return new DealsPage();
	}
	public TasksPage clickOnTaskLink() {
		action.moveToElement(tasksLink).build().perform();
		tasksLink.click();
		action.moveToElement(body).build().perform();
		return new TasksPage();
	}

}
