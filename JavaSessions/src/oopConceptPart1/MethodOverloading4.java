package oopConceptPart1;

public class MethodOverloading4 {
	
	public static void main(String[] args) {
		MethodOverloading4 obj = new MethodOverloading4();
		
		main(1000);
		main(1000, 2000);
		obj.test();
		obj.test(100.00);
		obj.test(200);
		obj.test(10, 20);
	}
	//We can Overload main method:
	//You can not create method inside a method
	public static void main(int x) {//one input parameter
		System.out.println("Main method with one input param");
	}
	public static void main(int p, int q) {////two input parameters
		System.out.println("Main method withtwo input param");
	}
	//Method Overloading: When the method name is same with different arguments or different datatypes within the same class
	// Duplicate methods not allowed: Same method name with same number of arguments and with same data types are not allowed
	public void test() {//Zero input param
		System.out.println("Zero input param");
	}
	public void test(double d) {//one input param
		System.out.println("One input param");
		System.out.println(d);
	}
	public void test(int a) {//one input param with different data type
		System.out.println("one input param with different data type");
    	System.out.println(a);
	}
	public void test(int a, int b) {//two input param
		System.out.println("two input param");
		System.out.println(a+b);
	}
		

}
