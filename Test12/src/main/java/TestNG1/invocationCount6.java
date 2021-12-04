package TestNG1;

import org.testng.annotations.Test;

public class invocationCount6 {
	
	@Test(invocationCount=3)
	public void test6() {
		System.out.println("test6");
	}

}
