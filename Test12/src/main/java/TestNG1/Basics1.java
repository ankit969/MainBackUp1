package TestNG1;

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
	
	//Annotations:
	@BeforeSuite
	public void suite1() {
		
	}
	@BeforeTest
	public void Test1() {
		
	}
	@BeforeClass
	public void class1() {
		
	}
	@BeforeMethod
	public void method1() {
		
	}
	@Test
	public void test() {
		
	}
	@AfterMethod
	public void method2() {
		
	}
	@AfterClass
	public void class2() {
		
	}
	@AfterTest
	public void test2() {
		
	}
	@AfterSuite
	public void suite2() {
		
	}

}
