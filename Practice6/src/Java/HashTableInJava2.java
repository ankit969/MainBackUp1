package Java;

import java.util.Hashtable;

public class HashTableInJava2 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, "Hello");
		h.put('A', 100);
		h.put("String", 12.55);
		
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get('A'));
		System.out.println(h.get("String"));
		
		//We can provide spacific DataType with combination of String or vice versa
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();
		
	}

}
