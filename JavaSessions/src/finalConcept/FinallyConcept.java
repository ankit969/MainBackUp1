package finalConcept;

public class FinallyConcept {
	//Doesn't matter any exception is present inside a try catch block, finally will be executed.

	public static void main(String[] args) {
		test1();
		test2();
		division();
	}
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}finally {
			System.out.println("inside finally block");
		}
	}
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
	}
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}catch(NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this finally block code even after any exception");
		}
	}


}
