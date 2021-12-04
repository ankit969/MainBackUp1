import org.testng.annotations.Test;

public class ExpectedException5 {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		int i=1;
		int j=1/0;
		System.out.println(j);
	}
}
