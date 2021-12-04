package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class method");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test method");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Aftre suite method");
	}

}
