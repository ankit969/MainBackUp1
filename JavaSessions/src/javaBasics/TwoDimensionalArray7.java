package javaBasics;

public class TwoDimensionalArray7 {

	public static void main(String[] args) {
		String x[][] = new String[3][6];
		System.out.println(x.length);//total number of rows=3
		System.out.println(x[0].length);//total number of columns=5

		//1st row:
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";				
		x[0][3] = "D";		
		x[0][4] = "E";
		x[0][5] = "F";

		//1st row:
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";				
		x[1][3] = "D1";		
		x[1][4] = "E1";
		x[1][5] = "F1";

		//2nd row:
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";				
		x[2][3] = "D2";		
		x[2][4] = "E2";
		x[2][5] = "F2";

		System.out.println(x[0][2]);
		System.out.println(x[1][5]);
		System.out.println(x[2][0]);
	
	//print all the values of 2nd array: use for loop
	//row = 0, col = 0 to 5
	//row = 1, col = 0 to 5
	//row = 2, col = 0 to 5
	for(int row=0; row<3; row++) {
		for(int col=0; col<x[0].length; col++) {
			System.out.println(x[row][col]);
		}
	}
	

}
}