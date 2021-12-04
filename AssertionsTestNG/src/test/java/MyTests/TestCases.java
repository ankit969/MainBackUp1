package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
	
	//hard assertion: hard validation: If a hard assertion is getting failed--> immediately test case will be marked as failed and test case will be terminated.
	//soft assertion: soft validation: if a soft assertion is getting failed--> test case will be marked as passed as well as next line will be executed.
	//assertAll(): to mark the test case failed, if any soft assertion is getting failed.
	
	SoftAssert softAssert = new SoftAssert();//Create object to use softAssertion
	
	@Test
	public void test1() {
		
		System.out.println("Open browser");
		Assert.assertEquals(true, true);//hard assertion->if this case will fail then below lines will not execute and test case will terminate
		
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("click on login button");
		Assert.assertEquals(true, true);//hard assertion
		
		System.out.println("validate home page");
		softAssert.assertEquals(true, false, "home page title is not correct");//soft assertion
		
		System.out.println("Go to deals page");
		System.out.println("create a deal");
		softAssert.assertEquals(true, false,"deal is not created");//soft assertion
		
		System.out.println("go to contact page");
		System.out.println("create a contact");
		softAssert.assertEquals(true, false);//soft assertion
		
		softAssert.assertAll();//by doing this failed test cases also executed but test case will  mark as failed
	}

}
