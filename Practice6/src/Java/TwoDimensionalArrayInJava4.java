package Java;

public class TwoDimensionalArrayInJava4 {
	
	public static void main(String[] args) {
		
		String x[][] = new String[2][3];
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		
		System.out.println("Print rows: "+x.length);
		System.out.println("Print columns: "+x[0].length);
		
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);
			}
		}
		
		Object obj[][] = new Object[2][3];
	}

}
