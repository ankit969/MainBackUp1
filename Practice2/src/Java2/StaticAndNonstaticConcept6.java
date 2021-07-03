package Java2;

public class StaticAndNonstaticConcept6 {
	static int age = 25;
	String name = "Hello";
	
	public static void main(String[] args) {
		System.out.println(age);
		test();
		
		StaticAndNonstaticConcept6 obj = new StaticAndNonstaticConcept6();
		System.out.println(obj.name);
		obj.test2();
	}
	public static void test() {
		System.out.println("static method");
	}
	public void test2() {
		System.out.println("Non-static method");
	}

}
