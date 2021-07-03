package oopConceptPart1;

public class WrapperClassConcept6 {
	
	public static void main(String[] args) {
		//No Parsing from String to char
		
		String x = "100";//Now 100 is a String value, not Integer
		System.out.println(x+20);//10020
		
		//Data Conversion from: String to int
		int i = Integer.parseInt(x);//Now x String value is converted into Integer
		System.out.println(i+20);//120
		
		//Data Conversion from: String to double
		String y = "10.11";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//Data Conversion from: String to boolean
		String k = "True";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Data Conevrsion from: int to String
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j);//"200"
		System.out.println(s+20);
		
		//AlphaNumeric conversion is not allowed:
		//String u = "100A";
		//Integer.parseInt(u);//java.lang.NumberFormatException: For input string: "100A"
	}

}
