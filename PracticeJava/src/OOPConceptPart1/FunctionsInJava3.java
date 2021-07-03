package OOPConceptPart1;

public class FunctionsInJava3 {
	
	public static void main(String[] args) {
		FunctionsInJava3 obj = new FunctionsInJava3();
		obj.test1();
		obj.test2();
		obj.test3();
		
		int a = 50;
		int b = 5;
		obj.test4(a, b);
	}
	public void test1() {//no input, no output
		System.out.println("Void method");
		
	}
	public int test2() {//No input, some output
		int a = 20;
		int b = 10;
		int c = a/b;
		System.out.println(c);
		return c;
		
	}
	public String test3() {//no input, some output
		String s = "Hello";
		System.out.println(s);
		return s;
	}
	public int test4(int x, int y) {
		int f = x/y;
		System.out.println(f);
		return f;
	}

}
