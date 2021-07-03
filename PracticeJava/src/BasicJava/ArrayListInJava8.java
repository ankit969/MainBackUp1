package BasicJava;

import java.util.ArrayList;

public class ArrayListInJava8 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		ar.add("Hello");//3
		ar.add('A');//4
		System.out.println(ar.get(4));
		ar.add(400);//5
		System.out.println(ar.size());
		ar.remove(5);
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		
		//Only Integer value should accept:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);
		
		//Only character values should accept:
		ArrayList<Character> ar2 = new ArrayList<Character>();
		ar2.add('A');//0
		System.out.println(ar2.get(0));
	}

}
