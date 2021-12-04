package testNG;

import org.testng.annotations.Test;

public class TimeOut5 {
	
	@Test(timeOut = 1000)
	public void infinityLoopTest() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
		}
	}

}
