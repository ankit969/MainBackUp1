package testNG;

import org.testng.annotations.Test;

public class InvocationCount4 {
	
	@Test(invocationCount = 10)//this will invoke same method n number of times
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is: "+c);
	}

}
