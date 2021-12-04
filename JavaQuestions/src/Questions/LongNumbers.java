package Questions;

public class LongNumbers {
	
	/*
	 * What will be the output when you use a long number wiht L and without L suffix?
	 */
	
	public static void main(String[] args) {
		 
		long longNmberWithoutL = 1000*60*60*24*365;
		long longNmberWithL = 1000*60*60*24*365L;
		
		System.out.println(longNmberWithoutL);//1471228928
		System.out.println(longNmberWithL);//31536000000
		
		//31536000000- 36 bits
		//11101010111101100010010110000000000
		//max limit of 32 bit int: 2147483647
		//1010111101100010010110000000000-->1471228928: Here last 4 bits will remove because this will not consider as long 36 bits
	}

}
