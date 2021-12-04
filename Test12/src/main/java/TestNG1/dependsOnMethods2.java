package TestNG1;

import org.testng.annotations.Test;

public class dependsOnMethods2 {
	
	@Test
	public void test1() {
		System.out.println("Test1 method");
		int i=1/0;
		System.out.println(i);
	}
	@Test(dependsOnMethods="test1")
	public void test2() {
		System.out.println("Test2 method");
	}

}
