package OOPConcept1;

public class FunctionsInJava3 {
	//Non static method with return type
	
	public static void main(String[] args) {
		FunctionsInJava3 obj = new FunctionsInJava3();
		obj.test();
		
		obj.test1();
		obj.test2();
		
		obj.test3(5, 5);
	}
	public void test() {//no input
		System.out.println("Return type is void");
	}
	public int test1() {//no input, some output
		System.out.println("Return type is int");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	public String test2() {//no input, some output
		System.out.println("Return type is int");
		String s = "Hello";
		System.out.println(s);
		return s;
	}
	public int test3(int x, int y) {//some input, some output
		System.out.println("Return type is int");
		int d = x*y;
		System.out.println(d);
		return d;
	}

}
