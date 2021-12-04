package Java1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static <E> void main(String[] args) {
		//1. Static array:
		int a[] = new int[3];
		//2. Dynamic array:
		ArrayList ar = new ArrayList();//non-generic method
		//generic method
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		//To call any type of data varaible:
		ArrayList<E> ar2 = new ArrayList<E>();
		
		//Employee class object:
		Employee e1 = new Employee("Itachi", 30, "Akatsuki");
		Employee e2 = new Employee("Madara", 40, "Akatsuki");
		Employee e3 = new Employee("Obito", 35, "Akatsuki");
		
		//Create a arrayList:
		ArrayList<Employee> ar3 = new ArrayList<Employee>();1
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//Iterator to traverse the value:
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("****************");
		
		
	}

}
