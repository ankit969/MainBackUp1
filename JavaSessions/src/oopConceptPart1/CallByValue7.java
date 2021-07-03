package oopConceptPart1;

public class CallByValue7 {
	
	public static void main(String[] args) {
		//testSum method is not static, hence creating object for the reference
		CallByValue7 obj = new CallByValue7();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);//Call by Value or Pass by value
	}
	public int testSum(int a, int b) {
		a = 30;//We can use call by value or give int data type here
		b = 40;//We can use call by value or give int data type here
		
		int c = a+b;
		System.out.println(c);
		return c;
	}

}
