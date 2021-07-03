package Java2;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("Welcome");//2
		ar.add(300);//3
		
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		ar.remove(3);
		System.out.println(ar.size());
		//System.out.println(ar.get(3));//IndexOutOfBoundException
	}

}
