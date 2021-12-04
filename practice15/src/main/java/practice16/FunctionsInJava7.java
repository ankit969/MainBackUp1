package practice16;

public class FunctionsInJava7 {
	
	//Functions and methods are same.
	//for non-static method we have to create object to call non-static method
	//Once the object is created, all the non-static method and variables are given to this object
	public static void main(String[] args) {
		FunctionsInJava7 f = new FunctionsInJava7();
		
		System.out.println(f.test4(500,100));
	}
	public void test1() {//zero parameter
		System.out.println("Return type is void");
	}
	public int test2() {//zero parameter
		System.out.println("**************");
		System.out.println("return type is int with 0 parameters");
		int i=10;
		int j=20;
		int k=i+j;
		System.out.println(k);
		return k;
	}
	public String test3(String x) {//one parameter
		System.out.println(x);
		System.out.println("return type is string with one parameter");
		return x;
	}
	public int test4(int a, int b) {//two parameters
		int c = a+b;
		System.out.println("return type is int with two parameter");
		return c;
	}
}
