package Java;

public class IncrementAndDecrement5 {
	
	public static void main(String[] args) {
		
		//1. Pre Increment
		int a= 0;
		int b = ++a;//1
		System.out.println("Pre Increment: "+b);
		
		//2. Post Increment
		int c = 0;
		int d = c++;//0
		System.out.println("Post Increment: "+d);
		
		//3. Pre Decrement
		int e = 2;
		int f = --e;//1
		System.out.println("Pre Decrement: "+f);
		
		//4. Post Decrement
	    int g = 2;
	    int h = g--;//2
	    System.out.println("Pre Decerement: "+h);
	}

}
