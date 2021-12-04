package practice16;


public class TwoDimensionalArray5 {
	
	public static void main(String[] args) {
		String x[][] = new String[2][3];
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		
		
		System.out.println(x[1][0]);
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[0].length; j++) {
				System.out.println(x[i][j]);
			}
		}
	}

}
