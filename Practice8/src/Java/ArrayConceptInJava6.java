package Java;

public class ArrayConceptInJava6 {

	public static void main(String[] args) {

		/*//1. one dimensional array:
		int x[] = new int[3];

		x[0] = 10;
		x[1] = 20;
		x[2] = 30;

        System.out.println(x.length);
        System.out.println(x[0]);

        for(int i=0; i<x.length; i++) {
        	System.out.println(i);
        }*/

		//2. Two dimensional array:
		int y[][] = new int [2][3];

		//1st row:
		y[0][0] = 100;
		y[0][1] = 200;
		y[0][2] = 300;

		//2nd row:
		y[1][0] = 400;
		y[1][1] = 500;
		y[1][2] = 600;

		System.out.println(y.length);
		System.out.println(y[0].length);

		System.out.println(y[1][0]);

		for(int row=0; row<y.length; row++) {
			for(int col=0; col<y[0].length; col++) {
				System.out.println(y[row][col]);
			}
		}
	}

}
