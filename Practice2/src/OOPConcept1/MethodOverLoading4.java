package OOPConcept1;

public class MethodOverLoading4 {
	
	public static void main(String[] args) {
		MethodOverLoading4 obj = new MethodOverLoading4();
		
		main();
		main(10);
		obj.test(20);
		obj.test("Hello");
		obj.test(50, 10);
	}
	public static void main() {
		System.out.println("Method Ovserloading1");
	}
	public static void main(int x) {
		System.out.println("Method Ovserloading2");
		System.out.println(x);
	}
	public void test(int x) {
		System.out.println("Method overloading11");
		System.out.println(x);
	}
	public void test(String s) {
		System.out.println("Method overloading22");
		System.out.println(s);
	}
	public void test(int x, int y) {
		System.out.println("Method overloading");
		int c = x/y;
		System.out.println(c);
	}

}
