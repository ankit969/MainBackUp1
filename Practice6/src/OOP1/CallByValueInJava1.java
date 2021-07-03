package OOP1;

public class CallByValueInJava1 {
	
	public static void main(String[] args) {
		CallByValueInJava1 obj = new CallByValueInJava1();
		
		int x = 10;
		int y = 20;
		obj.testSum(x, y);
	}
	public int testSum(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}

}
