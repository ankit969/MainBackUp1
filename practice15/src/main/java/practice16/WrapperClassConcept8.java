package practice16;

public class WrapperClassConcept8 {
	
	public static void main(String[] args) {
		String x = "10";
		int a = 20;
		System.out.println(x+a);
		
		//1. Parsing string to int:
		int x1 = Integer.parseInt(x);
		System.out.println(x1+a);
		//2. Parsing String to double:
		double d = 11.11;
		double x2 = Double.parseDouble(x);
		System.out.println(x2+d);
		
		//int to String parsing
		String x3 = String.valueOf(a);
		System.out.println(x3+a);
	}

}
