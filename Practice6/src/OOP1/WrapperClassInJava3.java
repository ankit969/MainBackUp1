package OOP1;

public class WrapperClassInJava3 {
	
	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		//DataConversion from string to int:
		int a = Integer.parseInt(x);
		System.out.println(a+20);
		
		//int to string:
		int i = 10;
		System.out.println(i+40);
		String s = String.valueOf(i);
		System.out.println(s+40);
	}

}
