package testNG;

import org.testng.annotations.Test;

public class TestNGFeature3 {
	
	@Test
	public void loginTest() {
		System.out.println("Login page test");
		int i = 9/0;//this test will fail but other will execute and gets passed. If I provide param despendsOnMethods then other test cases will get failed
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("Home page test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("Search Page Test");
	}
	@Test
	public void regPageTest() {
		System.out.println("Reg page test");
	}

}
