package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase1;

public class LoginPage1 extends TestBase1{
	
	//Page Factory or Object Repository:
	@FindBy(name = "email")
	WebElement emailId;
	
	@FindBy(name = "password")
	WebElement password;
	
	

}
