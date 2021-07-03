package OOPConceptPart1;

public class WrapperClassInJava6 {
	
	public static void main(String[] args) {
		String s = "100";
		System.out.println(s+20);
		
		//Convert string to int:
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		//Convert string to double:
		String y = "12.22";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//Convert Integer to string
		int g = 1000;
		System.out.println(g+20);
		String s2 = String.valueOf(g);
		System.out.println(s2+20);
	}

}
