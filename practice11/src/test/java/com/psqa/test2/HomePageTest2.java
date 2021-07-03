package com.psqa.test2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.psqa.Base.TestBase2;
import com.psqa.Pages.HomePage2;
import com.psqa.Pages.LoginPage2;

public class HomePageTest2 extends TestBase2{
	HomePage2 homePage;
	LoginPage2 loginPage;

	//Create constructor to initiate the properties file
	public HomePageTest2() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		init();
		loginPage = new LoginPage2();
		homePage = loginPage.login(prop.getProperty("emailid"), prop.getProperty("password"));
	}
	@Test(priority = 2)
	public void verifyHomePageUserNameTest() {
		String userNameHomePage = homePage.verifyHomePageUserName();
		Assert.assertEquals(userNameHomePage, "ankit test");
	}
	@Test(priority = 1)
	public void clickOnCalendersLinkTest() {
		homePage.clickOnCalendersLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
