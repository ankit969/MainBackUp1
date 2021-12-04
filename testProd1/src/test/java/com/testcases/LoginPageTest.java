package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.base.BaseTest;
import com.test.page.Home;
import com.test.page.Login;

public class LoginPageTest extends BaseTest{
	Login log;
	Home hom;
	//Constructor
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		log = new Login();
		hom = new Home();
	}
	@Test
	public void loginPageTitle() {
		String title = log.verifyLoginTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	@Test
	public void verifyLogin() {
		hom = log.verifyLogin(prop.getProperty("email"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
