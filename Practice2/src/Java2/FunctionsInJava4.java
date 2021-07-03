package Java2;

public class FunctionsInJava4 {

	public static void main(String[] args) {
		FunctionsInJava4 obj = new FunctionsInJava4();
		
		obj.test1();
		obj.test2();
		obj.test3(10);
		obj.test4();

	}
	//1. return type is void
	public void test1() {
		System.out.println("Return type is void");
	}
	//2. return type is int:
	public int test2() {
		int x = 10;
		System.out.println("Return type is int");
		System.out.println(x);
		return x;
	}
	//3. return type is int with some input:
	public int test3(int x) {
		int y = 20;
		int c = x+y;
		System.out.println("Return type is int with some input");
		System.out.println(c);
		return c;
	}
	//4. return type is String:
	public void test4() {
		String s1 = "Hello";
		System.out.println("Return type is String");
		System.out.println(s1);
	}

}
