import org.testng.annotations.Test;

public class timeOut4 {
	
	@Test(timeOut = 2)
	public void test2() {
		for(int i=0; i>=0; i++) {
			System.out.println(i);
			
		}
		System.out.println("Test completed");
	}

}
