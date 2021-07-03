package Java;

import java.util.ArrayList;

public class ArrayListInJava8 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add("Hello");//1
		ar.add('A');//2
		ar.add(true);//3
		ar.add(10.55);//4
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("200");//0
		ar1.add("Hello");//1
		System.out.println(ar1.get(0));
		ar1.remove(0);
		System.out.println(ar1.get(0));
	}

}
