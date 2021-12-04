package Questions;

public class PalindromeNumber {
	// 151 34543 161 78987: reverse of the number is similar as original is called
	// palindrome number
	// teet try for string

	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is: " + num);

		int r = 0;
		int sum = 0;
		int t;

		
		t = num;

		while (num > 0) {
			r = num % 10;// get the remainder
			sum = (sum * 10) + r;
			num = num / 10;// get the division in int
		}

		if (t == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome numbet");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(27272);
		isPalindromeNumber(1);
		isPalindromeNumber(1512);
	}

}
