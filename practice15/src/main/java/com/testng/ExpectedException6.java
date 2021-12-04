package com.testng;

import org.testng.annotations.Test;

public class ExpectedException6 {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		int i=1/0;
		System.out.println(i);
	}

}
