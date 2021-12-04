 package Questions;

public class FactorialNumber {
	// factorial of 3 = 3*2*1=6
	// factorial of 4 = 4*3*2*1=24
	// 10 = 10*9*8*7*6*5*4*3*2*1= 725760
	// 1 = 1
	// factorial of 0 = 1

	// 1. without recursive -- use for loop
	public static int factorial(int num) {
		int fact = 1;
		
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;// 1*2*3*4
		}
		return fact;
	}
	
	//2. with Recursive function: a function is calling itself
	public static int factorial1(int num) {
		if(num==0)
			return 1;
		
		else
			return(num * factorial1(num-1));
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		
		System.out.println(factorial1(10));
		System.out.println(factorial(1));
	}

}
