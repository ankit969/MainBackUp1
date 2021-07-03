package javaBasics;

public class StringConcatenation2 {

	public static void main(String[] args) {
		//+: is concatenation operator
		//println: is used to print on the console with a new line
		//print: is just used to print on the console

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		double c = 12.33;
		double d = 10.33;

		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(c+d);
		System.out.println(a);
		System.out.println("The value of a is: "+a);
		System.out.println("The addition of a and b is: "+(a+b));
		System.out.println("Hello Selenium");
		System.out.println("Hello Testing");

	}

}
