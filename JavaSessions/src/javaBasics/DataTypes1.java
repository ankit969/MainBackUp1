package javaBasics;

public class DataTypes1 {

	public static void main(String[] args) {
		//main() method or function: Starting/execution point of the program

		System.out.println("Data Type is int");
		//1. DataType(int):
		int i = 10;
		i = 20;
		int j = 30;
		int k = -1;
		int l = 0;
		System.out.println(i);
		System.out.println(i+k);
		System.out.println(i-l);

		System.out.println("Data Type is double");
		//2. DataType(double):
		double d1 = 12.33;
		double d2 = 34.22;
		double d3 = 100;//100.00
		System.out.println(d1+d2);
		System.out.println(d3);

		System.out.println("Data Type is char");
		//3. DataType(char):
		char c1 = 'a';
		//Only single digit value should be written within single quotes
		char c2 = 'A';
		char c3 = 1;
		char c4 = '$';
		System.out.println(c4);

		System.out.println("Data Type is boolean");
		//4. DataType(boolean):
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("Class String");
		//5. String is a class, not a DataType:
		String s1 = "Hello World";
		String s2 = "1000";
		String s3 = "12.33";
		System.out.println(s3);
	}

}
