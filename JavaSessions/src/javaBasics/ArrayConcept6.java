package javaBasics;

public class ArrayConcept6 {

	public static void main(String[] args) {
		//array: to store similar data types in a array variable
		//lowest bound/index = 0
		//upper bound/index = n-1(n is size of array)

		//one dimensional array

		//1. int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		System.out.println(i.length);//size/length of array

		//print all the values of array: use for loop
		for(int j=0; j<=3; j++) {
			System.out.println(i[j]);
		}
		System.out.println("******************************");

		//2. double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		System.out.println(d[2]);
		System.out.println("***************************");

		//3. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = '$';
		System.out.println(c[2]);
		System.out.println("********************************");

		//4. boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		System.out.println("*********************************");

		//5. String array:
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "World";
		System.out.println(s.length);
		System.out.println(s[1]);
		System.out.println("***************************");

		//Object array(Object is a class}
		//Object array is used to store different data types values

		Object obj[] = new Object[6];
		obj[0] = "Itachi";
		obj[1] = 25;
		obj[2] = 12.33;
		obj[3] = "1/1/1990";
		obj[4] = 'M';
		obj[5] = "India";
		System.out.println(obj[3]);
		System.out.println(obj.length);
	}

}
