package oopConceptPart1;

public class FunctionsInJava3 {

	public static void main(String[] args) {
		FunctionsInJava3 obj = new FunctionsInJava3();

		obj.test();

		int l = obj.pqr();
		System.out.println(l);

		String s1 = obj.abc();
		System.out.println(s1);

		int div = obj.division(30, 10);
		System.out.println(div);
	}
	//non-static method

	//1. return type: void
	//void: does not return any value
	public void test() {//no input, no output
		System.out.println("test method");

	}
	//2. return type: int
	public int pqr() {//no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	//3. return type: String
	public String abc() {//no input, some ouput
		System.out.println("abc method");
		String s1 = "Selenium";
		return s1;
	}
	//return type: int
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
	}

}
