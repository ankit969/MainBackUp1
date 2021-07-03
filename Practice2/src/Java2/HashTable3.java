package Java2;

import java.util.Hashtable;

public class HashTable3 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, "Welcome");
		h.put("Hello", 100);
		
		System.out.println(h.get("Hello"));
		
		Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();
		Hashtable<String, String> h3 = new Hashtable<String, String>();
	}

}
