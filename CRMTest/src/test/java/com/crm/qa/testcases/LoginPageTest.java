package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	//In the hybrid framework, all the test cases are independent to each other
	
	LoginPage loginPage;
	HomePage homePage;
	
	//Constructor
	public LoginPageTest() {
		super();//super keyword is used to call the TestBase class constructor
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();//import from com.crm.qa.base.TestBase;
		loginPage = new LoginPage();//import from com.crm.qa.pages.LoginPage;
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
