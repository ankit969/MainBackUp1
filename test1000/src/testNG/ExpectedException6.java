package testNG;

import org.testng.annotations.Test;

public class ExpectedException6 {
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
