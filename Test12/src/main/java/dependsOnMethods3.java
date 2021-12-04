import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods3 {
	
	@Test
	public void test1() {
		String expct_result = "Hello Itachi";
		String actl_result = "Hello Itachi";
		Assert.assertEquals(actl_result, expct_result);
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("depends on method");
	}

}
