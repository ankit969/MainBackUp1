package Java2;

public class MethodOverLoadingInJava5 {
	
	public static void main(String[] args) {
		main();
		main(10);
		
		MethodOverLoadingInJava5 obj = new MethodOverLoadingInJava5();
		obj.test();
		obj.test(20);
		obj.test(40, 50);
	}
	public static void main() {
		System.out.println("Main method Overloading1");
	}
	public static void main(int x) {
		System.out.println("Main method Overloading2");
	}
	public void test() {
		System.out.println("Non-static method with zero input");
	}
	public void test(int x) {
		System.out.println("Non-static methos with one input");
	}
	public void test(int x, int y) {
		System.out.println("Non-static method with two input");
	}

}
