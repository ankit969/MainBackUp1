package javaBasics;

import java.util.Hashtable;

public class HashTableConcept9 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		h.put(3, "Tom");
		System.out.println(h.get(3));
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 1000);
		//h1.put("A1", 200);//Only Integer DataType is allowed
		System.out.println(h1.get(1));
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "Selenium");
		System.out.println(h2.get(1));
	}

}
