package TestNG1;

import org.testng.annotations.Test;

public class expectedExceptions5 {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test5() {
		int i=1;
		int j=i/0;
		System.out.println(j);
	}

}
