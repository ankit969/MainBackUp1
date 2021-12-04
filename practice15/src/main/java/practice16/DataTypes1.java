package practice16;

public class DataTypes1 {
	
	/*
	 * 1. Two types of Data Types:
	 * I. Primitive data types: int, char, boolean, long, double
	 * II. Non-Primitive data types: String, class, Interface
	 */
	
	public static void main(String[] args) {
		//1. int data type:
		int i=10;
		i=20;
		System.out.println(i);
		//2. char data type:
		char c1 = 'A';
		char c2 ='a';
		System.out.println(c1);
		System.out.println(c2);
		//3. boolean:
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		//4. double
		double d1 = 11.22;
		double d2 = 22.11;
		double d3 = d1+d2;
		System.out.println(d3);
		//5. String:
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1+s2;
		System.out.println(s3);
	}

}
