package javaBasics;

public class LoopsConcept4 {

	public static void main(String[] args) {
		//j++ --> j=j+1
		//k-- --> k=k-1

		//1. while loop:
		System.out.println("while loop state");
		//print 1 to 10
		int i=1;//initialization
		while(i<=10) {//conditional
			System.out.println(i);
			i = i+1;//Incremental/decremental
		}

		//2. for loop:
		System.out.println("for loop state");
		//print 1 to 10
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}
		System.out.println("********************");
		//print 10 to 1
		for(int k=10; k>=1; k--) {
			System.out.println(k);
		}
	}

}
