package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// generic method:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		System.out.println(ar1.size());
		System.out.println(ar1.get(0));
		
		//Employeee class objects:
		Employee e1 = new Employee("Itachi", 25, "Akatsuki");
				
		//Create ArrayList to store Employee class objects:
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		
		//Iterator:
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	}

}
