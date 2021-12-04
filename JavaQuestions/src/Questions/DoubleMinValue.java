package Questions;

public class DoubleMinValue {
	
	public static void main(String[] args) {
		
		/*
		 * what is the value of double MIN_VALUE?
		 * Which one is bigger -> Double MIN_VALUE or 0.0d?
		 * Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
		 */
		
		System.out.println(Double.MIN_VALUE);//is a +ve value
		
		System.out.println(Long.MIN_VALUE);//is a -ve value
		System.out.println(Integer.MIN_VALUE);//is a -ve value
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		
		System.out.println(Float.MIN_VALUE);//is a +ve value
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
	}

}
