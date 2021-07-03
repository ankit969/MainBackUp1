package Java2;

public class WrapperClassInJava7 {
	
	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		//1. String to int:
		int a = Integer.parseInt(x);
		System.out.println(a+20);
		
		//2. int to String:
		int c = 50;
		System.out.println(c+50);
		String f = String.valueOf(c);
		System.out.println(f+20);
	}

}
