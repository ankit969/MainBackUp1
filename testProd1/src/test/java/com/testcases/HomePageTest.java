package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.base.BaseTest;
import com.test.page.Calender;
import com.test.page.Contact;
import com.test.page.Home;
import com.test.page.Login;

public class HomePageTest extends BaseTest{
	Calender cal;
	Contact con;
	Login log;
	Home hom;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		cal = new Calender();
		con = new Contact();
		hom = log.verifyLogin(prop.getProperty("email"), prop.getProperty("password"));
	}
	@Test
	public void TestHomePageHeader() {
		boolean homeHeader = hom.verifyPageHeader();
		Assert.assertEquals(homeHeader, true);
	}
	@Test
	public void TestCalnder() {
		cal = hom.clickOnCalender();
	}
	@Test
	public void TestContact() {
		con = hom.clickOnContact();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
