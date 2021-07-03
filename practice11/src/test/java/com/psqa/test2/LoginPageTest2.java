package com.psqa.test2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.psqa.Base.TestBase2;
import com.psqa.Pages.LoginPage2;

public class LoginPageTest2 extends TestBase2{
	LoginPage2 loginPage;

	public LoginPageTest2() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		loginPage = new LoginPage2();
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String titleLogin = loginPage.validateLoginPageTitle();
		Assert.assertEquals(titleLogin, "Cogmento CRM");
	}
	@Test(priority=2)
	public void loginToHomePageTest() {
		loginPage.login("emailid", "password");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
