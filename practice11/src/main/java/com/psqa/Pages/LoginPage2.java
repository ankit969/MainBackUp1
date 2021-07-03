package com.psqa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psqa.Base.TestBase2;

public class LoginPage2 extends TestBase2{

	//Page factory or Object Repository
	@FindBy(name = "email")
	WebElement enterEmailId;

	@FindBy(name = "password")
	WebElement enterPassword;

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement clickLoginBtn;

	//Initialize the page object:
	public LoginPage2() {//Constructor
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public HomePage2 login(String un, String pwd) {
		enterEmailId.sendKeys(un);
		enterPassword.sendKeys(pwd);
		clickLoginBtn.click();

		return new HomePage2();
	}



}
