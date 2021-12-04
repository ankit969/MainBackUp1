package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.BaseTest;

public class Login extends BaseTest{
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui stacked segment']/child::div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	//Initialize the page objects:
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	//Action:
	public String verifyLoginTitle() {
		return driver.getTitle();
	}
	public Home verifyLogin(String un, String pass) {
		email.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		return new Home();
	}

}
