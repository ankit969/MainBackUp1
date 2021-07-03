package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{

	//In the hybrid framework, all the test cases are independent to each other

	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactPage;
	
	String sheetName = "contacts";

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		contactPage = homePage.clickOnContactLink();
	}

	@Test(priority=1)
	public void verifyConatctsPageLabelTest() {
		Assert.assertTrue(contactPage.verifyContactsLabel());
	}
	@Test(priority=2)
	public void SelectSingleContactsTest() {
		contactPage.selectContactByName("test2 test2");
	}
	@Test(priority=3)
	public void SelectMultipleContactsTest() {
		contactPage.selectContactByName("test2 test2");
		contactPage.selectContactByName("test1 test1");
	}
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	//Page Object Model with data driven approach
	@Test(priority=4, dataProvider = "getCRMTestData")
	public void validateCreateNewContact(String firstName, String lastName) {
		//contactPage.createNewContact("test6", "test6");
		contactPage.createNewContact(firstName, lastName);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
