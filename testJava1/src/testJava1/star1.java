package testJava1;

public class star1 {

	public static void main(String[] args) {

		isArm(153);
	}
	public static void isArm(int num) {
		int cube = 0;
		int r;
		int t;
		
		t=num;
		while(num>0) {
			r=num%10;
			System.out.println(r);
		}
	}

}
