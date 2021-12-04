package Questions;

public class PrimeNumber {
	// 2 is the lowest prime number

	public static boolean isPrimeNumber(int num) {
		// prime number: this number can be divided by itself(ex. 13 is divided by only
		// by 13)

		// edge/corner case:
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("2 is the prime number: " + isPrimeNumber(2));
		System.out.println("9 is the prime number: " + isPrimeNumber(9));
		System.out.println("-2 is the prime number: " + isPrimeNumber(-2));
		System.out.println("3 is the prime number: " + isPrimeNumber(3));
		System.out.println("11 is the prime number: " + isPrimeNumber(11));
		
		getPrimeNumbers(20);
	}

}
