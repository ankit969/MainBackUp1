package BasicJava;

import java.util.Hashtable;

public class HashTableConcept9 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, "Hello");
		h.put('A', 100);
		h.put("str", 'B');
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get('A'));
		System.out.println(h.get("str"));
		
		//Integer and String:
		Hashtable<Integer, String> ar2 = new Hashtable<Integer, String>();
		ar2.put(2, "String");
	}

}
