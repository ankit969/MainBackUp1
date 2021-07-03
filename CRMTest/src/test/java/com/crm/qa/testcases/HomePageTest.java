package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	//In the hybrid framework, all the test cases are independent to each other

	LoginPage loginPage;
	HomePage homePage;
	CalenderPage calenderpage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		calenderpage = new CalenderPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	//test cases should be separated -- independant with each other
	//before each test case -- launch the browser and login
	//@Test -- execute test cases
	//after each test case -- close the browser
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not matched: ");
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		boolean HomePageuserName = homePage.verifyCorrectUserName();
		Assert.assertEquals(HomePageuserName, true);		
	}
	@Test(priority=3)
	public void verifyCalenderLinkTest() {
		calenderpage = homePage.clickOnCalenderLink();
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
