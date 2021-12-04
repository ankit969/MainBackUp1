import org.testng.annotations.Test;

public class InvocationCount3 {
	
	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("test1");
	}

}
