package TestNG1;

import org.testng.annotations.Test;

public class timeOut4 {
	
	@Test(timeOut=2)
	public void test3() {
		int i=0;
		while(i>=0) {
			System.out.println(i);
		}
		i++;
	}

}
