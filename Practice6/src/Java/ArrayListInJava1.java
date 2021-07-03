package Java;

import java.util.ArrayList;

public class ArrayListInJava1 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add("Hello");//0
		ar.add(10);//1
		ar.add('A');//2
		ar.add(20);//3
		System.out.println("Total number of Index: "+ar.size());
		
		for(int i=0; i<=3; i++) {
			System.out.println(ar.get(i));
		}
		ar.add(30);//4
		System.out.println("Before removing Index: "+ar.size());
		ar.remove(4);
		System.out.println("After removing Index: "+ar.size());
		
		//Specific DataTypes:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<String> ar2 = new ArrayList<String>();
	}
//In ArrayList, we don't create separate Indexes.
//In Array, to define all the DataTypes or string we have provide object separately.
//In ArrayList, we can define any DataType or String.
	
}
