package Questions;

public class NotANumber {
	
	/*
	 * what is NaN - Not A Number?
	 * How is NaN defined in different languages?
	 * Java, c, c++, Ruby, Python, JavaScript
	 * 
	 */
	
	public static void main(String[] args) {
		
		//System.out.println(2/0);
		System.out.println(2.0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
		
		double nan = 2.1 % 0;//NaN
		System.out.println((2.1 % 0) == nan);
		System.out.println(nan == nan);
	}

}
