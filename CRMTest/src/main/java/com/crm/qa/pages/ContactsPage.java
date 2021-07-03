package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	Actions action;


	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactLabel;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']/child::i[@class='edit icon']")
	WebElement createBtn;
	
	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveBtn;

	//Initialization the page objects:
	public ContactsPage() {//constructor
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	//Actions:
	public boolean verifyContactsLabel() {
		return contactLabel.isDisplayed();
	}
	public void selectContactByName(String name) {
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]"
				+ "/parent::td/preceding-sibling::td/child::div[@class='ui fitted read-only checkbox']")).click();
	}
	
	public void createNewContact(String ftName, String ltName) {
		createBtn.click();
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveBtn.click();
	}


}
