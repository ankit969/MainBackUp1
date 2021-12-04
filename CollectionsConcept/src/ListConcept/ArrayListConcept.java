package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		int a[] = new int[3];//static array--size is fixed

		//Dynamic array--ArrayList:

		//1.non-generic method
		ArrayList ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		System.out.println(ar.size());
		ar.add(40);//3
		ar.add("Test");//4
		ar.add('A');//5
		ar.add(true);//6
		System.out.println(ar.size());//size of arrayList
		System.out.println(ar.get(4));//to get the value from the index

		//to print all the values from arrayList
		//1.for loop
		//2.using iterator

		//I.for loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		//2.generic method:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Selenium");

		ArrayList<E> ar3 = new ArrayList<E>();
		//<E>:To call any data type we use <E> in arrayList object.

		//Employee class objects:
		Employee e1 = new Employee("Itachi", 25, "Akatsuki");
		Employee e2 = new Employee("Pain", 27, "Akatsuki");
		Employee e3 = new Employee("Nagato", 25, "Akatsuki");

		//Create arrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		//2.Iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			//it.next()-> takes to the first index where "e1" is present
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("************");

		//addAll():
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");

		ar5.addAll(ar6);

		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i)); 
		}
		System.out.println("**********");

		//removeAll():
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		//retainAll():
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");

		ar7.retainAll(ar8);

		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));

		}
	}

}
