package BasicJava;

public class StringConcatenationInJava2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		double d1 = 30.11;
		double d2 = 40.22;
		String a = "Hello";
		String b = "World";
		
		System.out.println(x+y);
		System.out.println(d1+d2);
		System.out.println(a+b);
		System.out.println(a+b+d1+d2);
		System.out.println(x+y+d1+d2);
		System.out.println(a+b+((x+y)+(d1+d2)));
	}

}
