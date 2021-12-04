package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("content of linkedList: "+ll);
		//addFirst:
		ll.addFirst("Itachi");
		//addLast:
		ll.addLast("Automation");
		System.out.println("content of linkedList: "+ll);
		
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0, "Nagato");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedList: "+ll);
		
		//how to print all the values of linkedList:
		//1.for loop
		//2.advance loop
		//3.iterator
		//4.while loop
		
		//1.for loop
		System.out.println("**** using for loop");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		//2.advance for loop:
		System.out.println("**** using advance for loop");
		for(String str: ll) {
			System.out.println(str);
		}
		//3.iterator
		System.out.println("**** using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//4.while loop:
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
