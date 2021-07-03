package BasicsInJava;

import java.util.ArrayList;

public class ArrayListInJava8 {
	
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("Hello");//2
		ar.add('A');//3
		ar.add(300);//4
		System.out.println(ar.get(2));
		System.out.println("Before remiving 4th Index");
		System.out.println(ar.size());
		
		System.out.println("After removing 4th Index");
		ar.remove(4);
		System.out.println(ar.size());
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<String> ar2 = new ArrayList<String>();
		ArrayList<Double> ar3 = new ArrayList<Double>();
	}

}
